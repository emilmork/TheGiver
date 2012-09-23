package com.thegiver;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MenuActivity extends SuperActivity {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.menu_activity);
		
		initFont();
		setFontOnButtons();
	}
	
	public void onWindowFocusChanged(boolean hasFocus) {
		startSkyAnimation();
		startAnimationGivver();
	}
	
    /**
     * Set font on button
     * @param button
     */
	public void setFontOnButtons() {
		Button newCard = (Button) findViewById(R.id.meny_newcard_button);
		Button archive = (Button) findViewById(R.id.meny_archive);
		newCard.setTypeface(mainFont);
		archive.setTypeface(mainFont);
	}
	
	public void onClick(View view){
		
	}
	
	/**
	 * Start Animation TheGivver figure
	 */
	private void startAnimationGivver() {
		ImageView img = (ImageView) findViewById(R.id.meny_givver_id);
		img.setBackgroundResource(R.anim.meny_givver_animation);
		AnimationDrawable frameAnimation = (AnimationDrawable) img.getBackground();
		frameAnimation.start();
	}
}
