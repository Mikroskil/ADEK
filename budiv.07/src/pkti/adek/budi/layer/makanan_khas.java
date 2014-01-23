package pkti.adek.budi.layer;


import info.androidhive.tabsswipe.R;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class makanan_khas extends Fragment {
	int[] MkImg={
			R.raw.mk_ayam_tangkap
			
	};
	int[] Mktxt={
			R.string.ket_mk_aceh
			
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

		View rootView = inflater.inflate(R.layout.makanankhas, container, false);
		//----------COpy
		Bundle data = getActivity().getIntent().getExtras();
		String kirim = data.getString("kirim");
		 TextView txt = (TextView)rootView.findViewById(R.id.txtmk);
		 TextView txtp = (TextView)rootView.findViewById(R.id.txtmk_k);
		 ImageView img = (ImageView)rootView.findViewById(R.id.imgmk);
		  for(int i=0;i<listProv.length;i++){  
			    
				if(kirim.equals(listProv[i])) //Check juga share intent itu sama ddengan yang di 
			    	
			     	{
					txt.setText("Makanan Khas "+listProv[i]);
					txtp.setText(Mktxt[i]);
					img.setImageResource(MkImg[i]);
			    	 break;
			     	}
					
			     }
	
		return rootView;
	}
}
