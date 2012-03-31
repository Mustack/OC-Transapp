package com.anal.oc;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;

public class TabWidget extends TabActivity {
	
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.main);

	    TabHost tabHost = getTabHost();  // The activity TabHost
	    TabHost.TabSpec spec;  // Resusable TabSpec for each tab
	    Intent intent;  // Reusable Intent for each tab

	    // Create an Intent to launch an Activity for the tab (to be reused)
	    intent = new Intent().setClass(this, BusStopActivity.class);

	    // Initialize a TabSpec for each tab and add it to the TabHost
	    spec = tabHost.newTabSpec("busstop")
	    				.setIndicator("Bus Stop")
	    				.setContent(intent);
	    tabHost.addTab(spec);

	    // Do the same for the other tabs
	    intent = new Intent().setClass(this, BusRouteActivity.class);
	    spec = tabHost.newTabSpec("busroute")
	    				.setIndicator("Bus Route")
	    				.setContent(intent);
	    tabHost.addTab(spec);

	    intent = new Intent().setClass(this, FavoritesActivity.class);
	    spec = tabHost.newTabSpec("favorites")
	    				.setIndicator("Favourites")
	    				.setContent(intent);
	    tabHost.addTab(spec);
	    
	    intent = new Intent().setClass(this, HistoryActivity.class);
	    spec = tabHost.newTabSpec("history")
	    				.setIndicator("History")
	    				.setContent(intent);	
	    tabHost.addTab(spec);

	    tabHost.setCurrentTab(2);
	}
}
