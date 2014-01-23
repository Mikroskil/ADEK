package pkti.adek.budi.layer;

import android.os.Bundle;
import info.androidhive.tabsswipe.R;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
//import android.widget.TextView;

public class senjata_tradisional extends Fragment {
	int[] StImg={
			R.raw.st_rencong
			
	};
	int[] Sttxt={
			R.string.ket_st_aceh
			
	};
	private String[] listProv = {
			"NAD","Sumatera Utara","Sumatera Barat", "Riau", "Lampung",
			"Bengkulu","Jambi","Sumatera Selatan","Gorontalo","Bali","Bangka Belitung","Banten",
			"DKI Jakarta","Jawa Barat","Jawa Tengah","Jawa Timur","Kepulauan Riau",
			"DI Yogyakarta"
	};
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.senjatatradisional, container, false);
		Bundle data = getActivity().getIntent().getExtras();
		String kirim = data.getString("kirim");
		 TextView txt = (TextView)rootView.findViewById(R.id.txtst);
		 TextView txtp = (TextView)rootView.findViewById(R.id.txtst_k);
		 ImageView img = (ImageView)rootView.findViewById(R.id.imgst);
		 for(int i=0;i<listProv.length;i++){  
			    
				if(kirim.equals(listProv[i])) //Check juga share intent itu sama ddengan yang di 
			    	
			     	{
					txt.setText("Senjata Tradisional "+listProv[i]);
					txtp.setText(Sttxt[i]);
					img.setImageResource(StImg[i]);
			    	 break;
			     	}
					
			     }
		return rootView;
	}
	

}
