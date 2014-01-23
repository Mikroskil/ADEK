package pkti.adek.budi.layer;

import android.os.Bundle;
import info.androidhive.tabsswipe.R;
import android.support.v4.app.Fragment;
import android.support.v4.view.MenuItemCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ShareActionProvider;
import android.widget.TextView;

public class baju_adat extends Fragment {
	private int[][] imgPAs = {
				{R.raw.gambar_sukuaceh_pa //NAD
				},
				{R.raw.pa_sumut,
					R.raw.gambar_sukubatakmandailing_pa,
					R.raw.gambar_sukurejang_pa}, //Sumatra Utara
				{R.raw.gambar_sukubatakmandailing_pa},//Sumatra barat
				{R.raw.pa_riau1},
				{R.raw.pa_lampung},
				{R.raw.pa_bengkulu,R.raw.pa_bengkulu_copy},
				{R.raw.eg1},//jambi
				{R.raw.pa_sumsel},
				{R.raw.eg1},//Gorontalo	
				{R.raw.pa_bali},
				{R.raw.pa_bangka_belitung},
				{R.raw.eg1},//Banten
				{R.raw.pa_dki_jakarta},
				{R.raw.eg1},//jawa barat
				{R.raw.eg1},//jawa tengah
				{R.raw.eg1 },//jawa timur
				{R.raw.eg1},//kepri				
				{R.raw.pa_yogyakarta}	
	};
	private int[][] txtPAs = {
			{R.string.ba_aceh},//NAD
			{R.string.ket_pa_sumut,
				R.string.ba_mandailing,
				R.string.ba_rejang},
			{R.string.ket_pa_sumbar},			
			{R.string.ket_pa_riau},			
			{R.string.ket_pa_lampung},
			{R.string.ket_pa_bengkulu, R.string.ket_pa_bengkulu},
			{R.string.about},//jambi
			{R.string.ket_pa_sumsel},
			{R.string.ket_pa_gorontalo},//gorontalo
			{R.string.ket_pa_bali},
			{R.string.ket_pa_babel},
			{R.string.about},//Banten
			{R.string.ket_pa_dki_jakarta},
			{R.string.ket_pa_jabar},
			{R.string.about},//Jawa tengah
			{R.string.about},//Jawa timur
			{R.string.about},//kepri			
			{R.string.ket_pa_yogyakarta}
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
		
		View rootView = inflater.inflate(R.layout.bajuadat, container, false);
		//----------COpy
		Bundle data = getActivity().getIntent().getExtras();
		String kirim = data.getString("kirim");
	   ImageView[] imgList={
			   (ImageView)rootView.findViewById(R.id.imgba1), // gambar ke 1
			   (ImageView)rootView.findViewById(R.id.imgba2), // gambar ke 2
			   (ImageView)rootView.findViewById(R.id.imgba3), // gambar ke 3
			   (ImageView)rootView.findViewById(R.id.imgba4), // gambar ke 4
			   (ImageView)rootView.findViewById(R.id.imgba5)  // gambar ke 5
	   };
	   TextView[] txt1List={
			   (TextView)rootView.findViewById(R.id.txtba1),  // Nama Pakaian ke 1
			   (TextView)rootView.findViewById(R.id.txtba2),  // Nama Pakaian ke 2
			   (TextView)rootView.findViewById(R.id.txtba3),  // Nama Pakaian ke 3
			   (TextView)rootView.findViewById(R.id.txtba4),  // Nama Pakaian ke 4
			   (TextView)rootView.findViewById(R.id.txtba5)   // Nama Pakaian ke 5
			   
	   };
	   TextView[] txt2List={
			   (TextView)rootView.findViewById(R.id.txtba_k1),  // Nama Pakaian ke 1
			   (TextView)rootView.findViewById(R.id.txtba_k2),  // Nama Pakaian ke 2
			   (TextView)rootView.findViewById(R.id.txtba_k3),  // Nama Pakaian ke 3
			   (TextView)rootView.findViewById(R.id.txtba_k4),  // Nama Pakaian ke 4
			   (TextView)rootView.findViewById(R.id.txtba_k5)   // Nama Pakaian ke 5
	   }
	   ;
	   for(int i=0;i<listProv.length;i++){  
	    
		if(kirim.equals(listProv[i])) //Check juga share intent itu sama ddengan yang di 
	    	
	     	{
			 int simpan = imgPAs[i].length; //Nilai Banyak Pakaian adat di suatu prov diambil dari ImgPas yang ke-i
	    	 	for(int j=0;j<imgPAs[i].length;j++){
	    	 		imgList[j].setImageResource(imgPAs[i][j]);	
	    	 		txt2List[j].setText(txtPAs[i][j]);
	    	 	}
	    	 if (simpan<5)
	    		 for(int x=simpan;x<5;x++){
	    	 		txt1List[x].setVisibility(View.GONE);
	    	 		txt2List[x].setVisibility(View.GONE);
	    	 	}
	    	 break;
	     	}
			
	     }
		return rootView;
	}
}
