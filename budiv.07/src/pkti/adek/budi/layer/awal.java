package pkti.adek.budi.layer;

import info.androidhive.tabsswipe.R;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ShareActionProvider;
import pkti.adek.budi.layer.splash_sc;
public class awal extends Activity{
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.menuawal);
		Button[] btn={
				(Button) findViewById(R.id.btnlist),//OpenList
				(Button) findViewById(R.id.btnculture),//Tentang BUDI
				(Button) findViewById(R.id.btnabout),//Tentang Team Adek
				(Button) findViewById(R.id.btnSetting),//Pengaturan
				(Button) findViewById(R.id.btnexit)//exit
		};
       


      //--- Button List provinsi
        btn[0].setOnClickListener(new OnClickListener(){
        	@Override
        	public void onClick(View view)
        	{
        		Intent menuIntent = new Intent("pkti.adek.budi.layer.LISTPROV");
				startActivity (menuIntent);
				
        	}});
        //--- Button About BUDI
        btn[1].setOnClickListener(new OnClickListener(){
        	@Override
        	public void onClick(View view){
        		Intent intent = new Intent("pkti.adek.budi.layer.ABOUT");
                intent.putExtra("about", "BUDI");
                startActivity(intent);   
        	}});
        //--- Button About Adek
        btn[2].setOnClickListener(new OnClickListener(){
        	@Override
        	public void onClick(View view){
        		Intent intent = new Intent("pkti.adek.budi.layer.ABOUTA");
           
                startActivity(intent); 
        	}});
        btn[3].setOnClickListener(new OnClickListener(){
        	@Override
        	public void onClick(View view){
        		Intent intent = new Intent("pkti.adek.budi.layer.PENGATURAN");
                
                startActivity(intent); 
        	}});
        //--- Button Keluar
        btn[4].setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View view) { 
            	dialogkeluar(awal.this);
            }});

	}
	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
	     if (keyCode == KeyEvent.KEYCODE_BACK) {
	    	 dialogkeluar(awal.this);
	     }
	     return super.onKeyDown(keyCode, event);    
	}
	
	
	//...... Fungsi exit
	
	public static void dialogkeluar(awal context){
		AlertDialog.Builder b = new AlertDialog.Builder(context);
    	b.setMessage("Apakah anda ingin keluar dari aplikasi");
    	b.setTitle("Konfirmasi"); 
    	b.setPositiveButton("Keluar", new DialogInterface.OnClickListener(){
    	@Override
    	public void onClick(DialogInterface dialog, int which){
    	    //stuff you want the button to do
    		System.exit(0);
    	}
    	});
    	b.setNegativeButton("Batal", new DialogInterface.OnClickListener(){
    	@Override
    	public void onClick(DialogInterface dialog, int which){
    	    //stuff you want the button to do
    	
    	}
    	});
    	b.show();
    
	}
	
}
