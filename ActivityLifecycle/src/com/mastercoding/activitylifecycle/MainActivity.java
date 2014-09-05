package com.mastercoding.activitylifecycle;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends ActionBarActivity {

	private static String ACTIVITY_LIFECYCLE = "ACTIVITY_LIFECYCLE";
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Log.d(ACTIVITY_LIFECYCLE, "Activity onCreate()");
	}

	@Override
	protected void onStart() {
		super.onStart();
		
		Log.d(ACTIVITY_LIFECYCLE, "Activity onStart()");
	}
	
	@Override
	protected void onResume() {
		super.onResume();
		Log.d(ACTIVITY_LIFECYCLE, "Activity onResume()");
	}
	
	@Override
	protected void onPause() {
		super.onPause();
		Log.d(ACTIVITY_LIFECYCLE, "Activity onPause()");
	}
	
	@Override
	protected void onStop() {
		super.onStop();
		Log.d(ACTIVITY_LIFECYCLE, "Activity onStop()");
	}
	
	@Override
	protected void onDestroy() {
		super.onDestroy();
		Log.d(ACTIVITY_LIFECYCLE, "Activity onDestroy()");
	}
	
	
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
