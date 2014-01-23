package pkti.adek.budi.layer;

import info.androidhive.tabsswipe.R;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class tari_daerah extends Fragment {
	int[] TdImg={
			R.raw.td_tari_saman
			
	};
	int[] Tdtxt={
			R.string.td_aceh
			
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
		View rootView = inflater.inflate(R.layout.taridaerah, container, false);
		Bundle data = getActivity().getIntent().getExtras();
		String kirim = data.getString("kirim");
		 TextView txt = (TextView)rootView.findViewById(R.id.txttd);
		 TextView txtp = (TextView)rootView.findViewById(R.id.txttd_k);
		 ImageView img = (ImageView)rootView.findViewById(R.id.imgtd);
		  for(int i=0;i<listProv.length;i++){  
			    
				if(kirim.equals(listProv[i])) //Check juga share intent itu sama ddengan yang di 
			    	
			     	{
					txt.setText("Tari Daerah "+listProv[i]);
					txtp.setText(Tdtxt[i]);
					img.setImageResource(TdImg[i]);
			    	 break;
			     	}
					
			     }

		 return rootView;

	}
}
