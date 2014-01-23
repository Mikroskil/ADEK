package pkti.adek.budi.layer;

import pkti.adek.budi.layer.awal;

import info.androidhive.tabsswipe.R;
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

public class splash_sc extends Activity {
	
	MediaPlayer logomusic;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		final int musiclist[] ={R.raw.sound1,R.raw.sound2};
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.sc);
		//..............Load Data..................
				SharedPreferences settings = getSharedPreferences("UserInfo", 0);
				String MusicStatus= (settings.getString("data", "").toString());
				String Musicfile =(settings.getString("musicdata","").toString());
		//.......................................
		if(MusicStatus.equals("ON") || MusicStatus.equals("")){
			if(Musicfile.equals(""))

				musicplayer.playAudio(splash_sc.this, musiclist[0]);
			else{
				musicplayer.playAudio(splash_sc.this, musiclist[Integer.parseInt(Musicfile)]);
				
			}
			musicplayer.setAudioLoop(true);
		}
		
		
		Thread logoTimer = new Thread(){
			public void run(){
				try{
					sleep(4000);
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

