package pkti.adek.budi.layer;

import info.androidhive.tabsswipe.R;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class rumah_adat extends Fragment {

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View rootView = inflater.inflate(R.layout.rumahadat, container, false);
		Bundle data = getActivity().getIntent().getExtras();
		String a = data.getString("kirim");
		 TextView pdate = (TextView)rootView.findViewById(R.id.txtra);
		 String x = (String) pdate.getText();
	       pdate.setText(x+" "+a);
		
		return rootView;
	}
}
