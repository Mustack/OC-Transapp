package com.anal.oc;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TableLayout;

public class FavoritesActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.favourites);
        
        final Button remove = (Button) findViewById(R.id.remove);
        remove.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	
            	TableLayout favourite = (TableLayout) findViewById(R.id.entireFavourite);
            	favourite.setVisibility(View.GONE);
            }
        });
    }
    
}