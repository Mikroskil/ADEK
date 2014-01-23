package pkti.adek.budi.layer;

import info.androidhive.tabsswipe.R;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class rumah_adat extends Fragment {
	int[] RaImg={
			R.raw.ra_rumoh_aceh
			
	};
	int[] Ratxt={
			R.string.ket_ra_aceh
			
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

		View rootView = inflater.inflate(R.layout.rumahadat, container, false);
		Bundle data = getActivity().getIntent().getExtras();
		 String kirim = data.getString("kirim");
		
		 TextView txt = (TextView)rootView.findViewById(R.id.txtra);
		 TextView txtp = (TextView)rootView.findViewById(R.id.txtra_k);
		 ImageView img = (ImageView)rootView.findViewById(R.id.imgra);
		for(int i=0;i<listProv.length;i++){  
			    
				if(kirim.equals(listProv[i])) //Check juga share intent itu sama ddengan yang di 
			    	
			     	{
					txt.setText("Rumah Adat "+listProv[i]);
					txtp.setText(Ratxt[i]);
					img.setImageResource(RaImg[i]);
					break;
			     	}
					
			     }
		return rootView;
	}
}
