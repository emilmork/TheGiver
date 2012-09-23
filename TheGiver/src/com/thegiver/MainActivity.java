package com.thegiver;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;

public class MainActivity extends SuperActivity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.splash_activity);

	}
	@Override
	public void onResume(){
		super.onResume();
		splashTask.execute();
	}
	
	public void onPause(){
		super.onPause();
		if(!splashTask.isCancelled()){
			splashTask.cancel(true);
		}
	}

	private AsyncTask<Void, Void, Void> splashTask = new AsyncTask<Void, Void, Void>() {
		protected void onPreExecute() {
		}

		protected Void doInBackground(Void... params) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			app.pm.getPathcontainer();
			this.onPostExecute();
			return null;
		}

		protected void onPostExecute() {
			if(!this.isCancelled()){
				this.cancel(true);
				startActivity(new Intent(getApplicationContext(), MenuActivity.class));
				MainActivity.this.finish();
			}
		}
	};

}
