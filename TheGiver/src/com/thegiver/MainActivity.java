package com.thegiver;

import com.thegiver.models.PathContainer;

import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.app.Activity;
import android.view.Menu;
import android.widget.Toast;

public class MainActivity extends SuperActivity {
	Handler h;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        new AsyncTask<String,Void,PathContainer>() {
        	 protected void onPreExecute() {
        	 // do something before the hard work, like tell the user what you are going to do

        	}

        	protected PathContainer doInBackground(String... aParams) {
        	 // do some expensive work
        		PathContainer p = app.pm.getPathcontainer();
        		return p;
        	 }

        	protected void onPostExecute() {
        	 // background work is finished,
        	 // so update the UI here
        		String brekk = "hei";
        		brekk.toString();
        	 }
        	}.execute();
 
    }
    
    
 
    
    
    
   
}
