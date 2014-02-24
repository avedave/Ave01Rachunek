package pl.dawidostrowski.ave01rachunek;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class StatusActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_status);
		
		Button logButton = (Button)findViewById(R.id.log_button);
		if (logButton != null) {
			logButton.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent logIntent = new Intent(StatusActivity.this, LogActivity.class);
					startActivity(logIntent);
				}
			});
		}
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.status, menu);
		return true;
	}

}
