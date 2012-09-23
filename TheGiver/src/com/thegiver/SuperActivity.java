package com.thegiver;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Menu;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class SuperActivity extends Activity {
	public ApplicationObject app;
	public Typeface mainFont;
	
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
    
    public void initFont(){
    	mainFont = Typeface.createFromAsset(getAssets(), "fonts/FFantast.ttf");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    
	/**
	 * Start sky animation
	 */
	public void startSkyAnimation() {

		Animation cloud_anim = AnimationUtils.loadAnimation(this,R.anim.cloud_move);
		cloud_anim.setRepeatCount(Animation.REVERSE);
		cloud_anim.setDuration(30000);
		
		((ImageView) findViewById(R.id.sky1)).startAnimation(cloud_anim);

		Animation cloud_anim2 = AnimationUtils.loadAnimation(this,R.anim.cloud_move);
		cloud_anim.setRepeatCount(Animation.REVERSE);
		cloud_anim2.setDuration(80000);
		
		((ImageView) findViewById(R.id.sky2)).startAnimation(cloud_anim2);

		Animation cloud_anim3 = AnimationUtils.loadAnimation(this,R.anim.cloud_move);
		cloud_anim.setRepeatCount(Animation.REVERSE);
		cloud_anim3.setDuration(100000);
		
		((ImageView) findViewById(R.id.sky3)).startAnimation(cloud_anim3);

	}

}
