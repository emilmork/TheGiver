package com.thegiver.data;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;

import com.google.gson.*;
import com.thegiver.models.PathContainer;
import com.thegiver.utils.UtilRef;

public class Network {
	
	private static Network network;
	private Gson gson;
	private InputStream is;
	
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
		String json = getJsonFromURL(UtilRef.JSON_URL);
		return getPathContainerFromJson(json);
	}
	
	/**
	 * Get JSON from web request
	 * @param url
	 * @return
	 */
	private String getJsonFromURL(String url){	 
	        // Making HTTP request
	        try {
	            // defaultHttpClient
	            DefaultHttpClient httpClient = new DefaultHttpClient();
	            HttpPost httpPost = new HttpPost(url);
	 
	            HttpResponse httpResponse = httpClient.execute(httpPost);
	            HttpEntity httpEntity = httpResponse.getEntity();
	            is = httpEntity.getContent();           
	 
	        } catch (UnsupportedEncodingException e) {
	            e.printStackTrace();
	        } catch (ClientProtocolException e) {
	            e.printStackTrace();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	 
	        try {
	            BufferedReader reader = new BufferedReader(new InputStreamReader(is, "iso-8859-1"), 8);
	            StringBuilder sb = new StringBuilder();
	            String line = null;
	            while ((line = reader.readLine()) != null) {
	                sb.append(line + "n");
	            }
	            is.close();
	            return sb.toString();
	        } catch (Exception e) {
	           e.printStackTrace();
	           return null;
	        }
	}
	/**
	 * Get PathContainer Object from JSON
	 * @param json
	 * @return
	 */
	public PathContainer getPathContainerFromJson(String json){
		PathContainer container = gson.fromJson(json, PathContainer.class);
		return container;
	}
	
	

}
