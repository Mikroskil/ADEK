package pkti.adek.budi.layer;

import info.androidhive.tabsswipe.R;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
//import android.widget.TextView;

public class senjata_tradisional extends Fragment {

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.senjatatradisional, container, false);
		Bundle data = getActivity().getIntent().getExtras();
		String a = data.getString("kirim");
		 TextView pdate = (TextView)rootView.findViewById(R.id.txtst);
		 String x = (String) pdate.getText();
	       pdate.setText(x+" "+a);
		
		return rootView;
	}
	

}
