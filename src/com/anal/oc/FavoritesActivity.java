package com.anal.oc;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.TableLayout;

public class FavoritesActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.favourites);
        
        final Button remove1 = (Button) findViewById(R.id.remove1);
        final Button remove2 = (Button) findViewById(R.id.remove2);
        final Button remove3 = (Button) findViewById(R.id.remove3);
        remove1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	
            	TableRow row1 = (TableRow) findViewById(R.id.tableRow1);
            	row1.setVisibility(View.GONE);
            	TableRow row2 = (TableRow) findViewById(R.id.tableRow2);
            	row2.setVisibility(View.GONE);
            	TableRow row3 = (TableRow) findViewById(R.id.tableRow3);
            	row3.setVisibility(View.GONE);
            }
        });
        
        remove2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	
            	TableRow row4 = (TableRow) findViewById(R.id.tableRow4);
            	row4.setVisibility(View.GONE);
            	TableRow row5 = (TableRow) findViewById(R.id.tableRow5);
            	row5.setVisibility(View.GONE);
            	TableRow row6 = (TableRow) findViewById(R.id.tableRow6);
            	row6.setVisibility(View.GONE);
            }
        });
        
        remove3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	
            	TableRow row7 = (TableRow) findViewById(R.id.tableRow7);
            	row7.setVisibility(View.GONE);
            	TableRow row8 = (TableRow) findViewById(R.id.tableRow8);
            	row8.setVisibility(View.GONE);
            	TableRow row9 = (TableRow) findViewById(R.id.tableRow9);
            	row9.setVisibility(View.GONE);
            }
        });
    }
    
}