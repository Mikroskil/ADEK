package pkti.adek.budi.layer;

import info.androidhive.tabsswipe.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class awal extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.menuawal);

        Button keluar = (Button) findViewById(R.id.btnexit);
        Button OpList = (Button) findViewById(R.id.btnlist);
        keluar.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View view) {
               finish();
            }});
        OpList.setOnClickListener(new OnClickListener(){
        	@Override
        	public void onClick(View view)
        	{
        		Intent menuIntent = new Intent("pkti.adek.budi.layer.LISTPROV");
				startActivity (menuIntent);
        	}});
	}
	
}
