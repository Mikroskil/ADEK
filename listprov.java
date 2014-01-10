package pkti.adek.budi.layer;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.text.Editable;
import android.text.TextWatcher;
import info.androidhive.tabsswipe.R;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Toast;

public class listprov extends Activity {
    private ListView list;
    ArrayAdapter adapter;
    EditText input;
    
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);        
        
        String prov[] = {"NAD","Sumatera Utara","Sumatera Barat", "Riau", "Lampung",
        						"Bengkulu","Jambi","Sumatera Selatan","Gorontalo","Bali","Bangka Belitung",
        						"Banten","DKI Jakarta","Jawa Barat","Jawa Tengah","Jawa Timur",
        						"Kepulauan Riau","DI Yogyakarta","Kalimantan Barat","Kalimantan Selatan","Kalimantan Utara","Kalimantan Tengah",
        						"Kalimantan Timur"       						
        						};
        
        list = (ListView) findViewById(R.id.listview1);
        input = (EditText) findViewById(R.id.InputSearch);
        adapter = new ArrayAdapter(this, R.layout.list_item, R.id.NameList, prov);
        list.setAdapter(adapter);
        
        list.setOnItemClickListener(new OnItemClickListener() {
        	  @Override
        	  public void onItemClick(AdapterView<?> parent, View view,
        	    int position, long id) {
        		  Object o = list.getItemAtPosition(position);
        		  String pilihan = o.toString();
                  Intent intent = new Intent("pkti.adek.budi.layer.TAB_MAIN");
                  intent.putExtra("kirim", pilihan);
                  startActivity(intent);   
        	  }
        	}); 
        
        input.addTextChangedListener(new TextWatcher() {
             
            public void onTextChanged(CharSequence s, int arg1, int arg2, int arg3) {
                // TODO Auto-generated method stub
           
            listprov.this.adapter.getFilter().filter(s);
            }
             
            public void beforeTextChanged(CharSequence arg0, int arg1, int arg2,
                    int arg3) {
                // TODO Auto-generated method stub                 
            }
             
            public void afterTextChanged(Editable arg0) {
                // TODO Auto-generated method stub                 
            }            
        });
    }
    }