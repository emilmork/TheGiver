package com.thegiver.data;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.URI;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;

import android.util.Log;

import com.google.gson.*;
import com.thegiver.models.basic.PathContainer;
import com.thegiver.utils.UtilRef;

public class Network {
	
	private static Network network;
	private  Gson gson;
	private  InputStream is;
	private String json;
	
	private Network(){
		gson = new Gson();
	}
	
	public static Network getInstance(){
		if(network==null){
			network = new Network();
			return network;
		}else{
			return network;
		}
		
	}
	/**
	 * Get PathContainer from web
	 * @return
	 */
	public PathContainer getPathContainer(){
		json = getJsonFromUrl(UtilRef.JSON_URL);
		PathContainer p = getPathContainerFromJson(json);
		return p;
	}
	
	/**
	 * Get JSON from web request
	 * @param url
	 * @return
	 */
	  public String getJsonFromUrl(String url) {
		    StringBuilder builder = new StringBuilder();
		    HttpClient client = new DefaultHttpClient();
		    HttpGet httpGet = new HttpGet(url);
		    try {
		      HttpResponse response = client.execute(httpGet);
		      StatusLine statusLine = response.getStatusLine();
		      int statusCode = statusLine.getStatusCode();
		      if (statusCode == 200) {
		        HttpEntity entity = response.getEntity();
		        InputStream content = entity.getContent();
		        BufferedReader reader = new BufferedReader(new InputStreamReader(content));
		        String line;
		        while ((line = reader.readLine()) != null) {
		          builder.append(line);
		        }
		      } else {
		        Log.i("hei","else dono network");
		      }
		    } catch (ClientProtocolException e) {
		      e.printStackTrace();
		    } catch (IOException e) {
		      e.printStackTrace();
		    }
		    return builder.toString();
		  }
	/**
	 * Get PathContainer Object from JSON
	 * @param json
	 * @return
	 */
	private PathContainer getPathContainerFromJson(String json){
		PathContainer container = gson.fromJson(json, PathContainer.class);
		return container;
	}
	
	

}
