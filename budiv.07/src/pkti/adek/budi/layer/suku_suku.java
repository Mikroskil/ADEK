package pkti.adek.budi.layer;

import android.os.Bundle;
import info.androidhive.tabsswipe.R;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class suku_suku extends Fragment {
private int[][] ketsuku={
		{}
};
int[][] suku={
		{
			R.string.judul_suku_aceh1,
			R.string.judul_suku_aceh2,
			R.string.judul_suku_aceh3,
			R.string.judul_suku_aceh4,
			R.string.judul_suku_aceh5
		}
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
		View rootView = inflater.inflate(R.layout.suku, container, false);
		Bundle data = getActivity().getIntent().getExtras();
		String kirim = data.getString("kirim");
		TextView[] jdlsuku ={
				(TextView)rootView.findViewById(R.id.nSk1),
				(TextView)rootView.findViewById(R.id.nSk2),
				(TextView)rootView.findViewById(R.id.nSk3),
				(TextView)rootView.findViewById(R.id.nSk4),
				(TextView)rootView.findViewById(R.id.nSk5),// Nama Pakaian ke 4

		};
		TextView[] ksuku ={
				(TextView)rootView.findViewById(R.id.kSk1),
				(TextView)rootView.findViewById(R.id.kSk2),
				(TextView)rootView.findViewById(R.id.kSk3),
				(TextView)rootView.findViewById(R.id.kSk4),
				(TextView)rootView.findViewById(R.id.kSk5),
				(TextView)rootView.findViewById(R.id.kSk6),
				
				
		};
		 for(int i=0;i<listProv.length;i++){  
			    
				if(kirim.equals(listProv[i])) //Check juga share intent itu sama ddengan yang di 
			    	
			     	{
					 int simpan = suku[i].length; //Nilai Banyak Pakaian adat di suatu prov diambil dari ImgPas yang ke-i
			    	 	for(int j=0;j<suku[i].length;j++){
			    	 		jdlsuku[j].setText(suku[i][j]);	
			    	 	//	ksuku[j].setText(ketsuku[i][j]);
			    	 		
			    	 	}
			     if (simpan<5)
			    		 for(int x=simpan;x<5;x++){
			    	 		//ksuku[x].setVisibility(View.GONE);
			    	 		jdlsuku[x].setVisibility(View.GONE);
			    	 	}
			    	 	
			    	 	
			    	 	break;
			     	}
					
			     }
		 for(int x=0;x<ksuku.length;x++){
 	 		ksuku[x].setVisibility(View.GONE);
 	 		
 	 	}
		return rootView;
	}
	

}
