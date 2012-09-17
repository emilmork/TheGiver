package com.thegiver;
import com.thegiver.models.basic.PathContainer;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
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
        		return app.pm.getPathcontainer();
        	 }

        	protected void onPostExecute(PathContainer result) {
        		Toast.makeText(getApplicationContext(),"Categories downloaded: "+ result.getCategories().size(), Toast.LENGTH_LONG).show();
        	}
        	}.execute();
 
    }
    
    
 
    
    
    
   
}
