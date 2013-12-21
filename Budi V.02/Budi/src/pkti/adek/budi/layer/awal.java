package pkti.adek.budi.layer;

import info.androidhive.tabsswipe.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class awal extends Activity{
	
	//Share Button di Action Bar
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// TODO Auto-generated method stub
		getMenuInflater().inflate(R.menu.menu, menu);
		
		MenuItem shareItem = (MenuItem) menu.findItem(R.id.action_share);
		
		ShareActionProvider mShare = (ShareActionProvider)shareItem.getActionProvider();
		
		Intent shareIntent = new Intent(Intent.ACTION_SEND);
		shareIntent.setAction(Intent.ACTION_SEND);
		shareIntent.setType("text/plain");
		shareIntent.putExtra(Intent.EXTRA_TEXT, "Text to Share");
		mShare.setShareIntent(shareIntent);
		
		return true;
	}
	//---------
	

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
