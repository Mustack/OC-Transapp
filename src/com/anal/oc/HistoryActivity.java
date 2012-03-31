package com.anal.oc;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.TextView;

public class HistoryActivity extends Activity {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.history);

		final Button clearAll = (Button) findViewById(R.id.clearAll);
		clearAll.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {

				TableLayout favourite = (TableLayout) findViewById(R.id.historyTable);
				favourite.setVisibility(View.GONE);
			}

		});
	}
}