package com.anal.oc;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TableRow;
import android.widget.TextView;

public class BusStopActivity extends Activity {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.busstopsearch);

		final Button search = (Button) findViewById(R.id.stopSearch);
		search.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {

				setContentView(R.layout.busstopschedule);
			}
		});        
	}
}