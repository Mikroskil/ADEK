package pkti.adek.budi.layer;

import android.content.Intent;
import android.os.Bundle;
import info.androidhive.tabsswipe.R;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class music_daerah extends Fragment {
	int[] MsJudul={
			R.string.aceh_judul_bunggongjeumpa
	};
	int[] MsLirik={
			R.string.aceh_lirik_bunggongjeumpa
	};
	private String[] listProv = {
			"NAD","Sumatera Utara","Sumatera Barat", "Riau", "Lampung",
			"Bengkulu","Jambi","Sumatera Selatan","Gorontalo","Bali","Bangka Belitung","Banten",
			"DKI Jakarta","Jawa Barat","Jawa Tengah","Jawa Timur","Kepulauan Riau",
			"DI Yogyakarta"
	};
	int[] Mslagunya={
			R.raw.sound2
	};
	int x;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.music, container, false);
		Bundle data = getActivity().getIntent().getExtras();
		final String kirim = data.getString("kirim");
		TextView jdl = (TextView)rootView.findViewById(R.id.txtJudul);
		TextView lirik = (TextView)rootView.findViewById(R.id.txtlrk);
		Button btnplay = (Button)rootView.findViewById(R.id.btnplay);
		Button btnstop = (Button)rootView.findViewById(R.id.btnpause);
		
		for(int i=0;i<listProv.length;i++){  
	    
		if(kirim.equals(listProv[i])) //Check juga share intent itu sama ddengan yang di 
	    	
	     	{
			jdl.setText(MsJudul[i]);
			lirik.setText(MsLirik[i]);
			x= Mslagunya[i];
			
			 break;
	     	}
		
	     }
		  btnplay.setOnClickListener(new OnClickListener(){
	        	@Override
	        	public void onClick(View view){
	        		for(int i=0;i<listProv.length;i++){  
	        		    
	        			if(kirim.equals(listProv[i])) //Check juga share intent itu sama ddengan yang di 
	        		    	
	        		     	{
	        				if(musicplayer.isplayingAudio){
	        					
	        					musicplayer.stopAudio();
        					}
	        				musicplayer.setAudioLoop(false);
	        				musicplayer.playAudio(getActivity(), x);
	        				 break;
	        		     	}
	        			
	        		     }
	        	}});
		  btnstop.setOnClickListener(new OnClickListener(){
			  @Override
			  public void onClick(View v){
				  if(musicplayer.isplayingAudio){
					  musicplayer.PauseAudi();
				  }
			  }
		  });
		return rootView;
	}


}
