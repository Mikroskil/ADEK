package pkti.adek.budi.layer;

import info.androidhive.tabsswipe.R;
import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;
import android.widget.ToggleButton;

public class pengaturan extends Activity {
	public int temp ;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.atur);
		
		// Array of choices
		String colors[] = {"Music 1", "Music 2"};
		final int musiclist[] ={R.raw.sound1,R.raw.sound2};
		// Selection of the spinner
		final Spinner spinner = (Spinner) findViewById(R.id.openMusic);

		// Application of the Array to the Spinner
		ArrayAdapter<String> spinnerArrayAdapter = new ArrayAdapter<String>(this,   android.R.layout.simple_spinner_item, colors);
		spinnerArrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item); // The drop down view
		spinner.setAdapter(spinnerArrayAdapter);
		
		
		final ToggleButton onoff = (ToggleButton)findViewById(R.id.toggleButton1);	
		Button btnch = (Button)findViewById(R.id.btnch);
		SharedPreferences settings = getSharedPreferences("UserInfo", 0);
		final SharedPreferences.Editor editor = settings.edit();
		final String Musicfile =(settings.getString("musicdata","").toString());
		final String MusicStatus= (settings.getString("data", "").toString());
		//.......................................
btnch.setOnClickListener(new OnClickListener(){
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
		     int position = spinner.getSelectedItemPosition();
		     if(onoff.isChecked()){
		    	 editor.putString("musicdata",  Integer.toString(position));
		 		editor.commit();
		 		temp = position;
		 		musicplayer.stopAudio();
		 		musicplayer.playAudio(pengaturan.this,musiclist[temp]);
				musicplayer.setAudioLoop(true);
		     }
		 		else{
		 			
		 			 editor.putString("musicdata",  Integer.toString(position));
				 		editor.commit();
				 		temp = position;
		 		}
		}
		
		
	});
		 
		if(MusicStatus.equals("ON") || MusicStatus.equals("")){

			onoff.setChecked(true);
		}
		else{

			onoff.setChecked(false);
			
		}
		
		
		onoff.setOnClickListener(new OnClickListener(){
		    @Override
		    public void onClick(View view){
		    	
		        if(onoff.isChecked()){
		        	editor.putString("data","ON");
		        	editor.commit();
		        	musicplayer.playAudio(pengaturan.this,musiclist[temp]);
		    		musicplayer.setAudioLoop(true);
	            }
	            else
	            {
	            	editor.putString("data","OFF");
	            	 editor.commit();
	            	musicplayer.stopAudio();
	            } 
		       
		    }
		});
}
}