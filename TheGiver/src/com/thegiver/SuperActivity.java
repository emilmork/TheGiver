package com.thegiver;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

public class SuperActivity extends Activity {
	public ApplicationObject app;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        app = (ApplicationObject)getApplicationContext();
    }
    
    public void onResume(){
    	super.onResume();
    	if(app==null){
    		app = (ApplicationObject)getApplicationContext();
    	}
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }

}
