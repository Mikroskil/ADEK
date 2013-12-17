package pkti.adek.budi.layer;

import info.androidhive.tabsswipe.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class splash_sc extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.sc);
		Thread logoTimer = new Thread(){
			public void run(){
				try{
					sleep(2000);
					Intent menuIntent = new Intent("pkti.adek.budi.layer.AWAL");
					startActivity (menuIntent);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				finally{
					finish();
				}
			}
		};
		logoTimer.start();

	}

}

