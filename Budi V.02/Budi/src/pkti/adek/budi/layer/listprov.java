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
 
       
        
        String pulau[] = {"NAD","Sumatera Utara","Sumatera Barat", "Riau", "Lampung",
        						"Bengkulu","Jambi","Sumatera Selatan"
        						};
    	String suku0[] ={ "Suku Gayo","Suku Melayu","Suku Aceh","Lagu Daerah","Back" };
    	String suku1[] ={"Suku Batak","Suku Karo","Lagu Daerah","Back"};
    	String suku2[] ={"Suku Sukuan","Back"};
        
        list = (ListView) findViewById(R.id.listview1);
        input = (EditText) findViewById(R.id.InputSearch);
         
        final ArrayAdapter sukus0 = new ArrayAdapter(this, R.layout.list_item, R.id.NameList, suku0);
        final ArrayAdapter sukus1 = new ArrayAdapter(this, R.layout.list_item, R.id.NameList, suku1);
        final ArrayAdapter sukus2 = new ArrayAdapter(this, R.layout.list_item, R.id.NameList, suku2);
        adapter = new ArrayAdapter(this, R.layout.list_item, R.id.NameList, pulau);
        list.setAdapter(adapter);
        
        list.setOnItemClickListener(new OnItemClickListener() {
        	  @Override
        	  public void onItemClick(AdapterView<?> parent, View view,
        	    int position, long id) {
        		  Object o = list.getItemAtPosition(position);
        		  String pilihan = o.toString();
        		  EditText ayam = (EditText)findViewById(R.id.InputSearch);
        		 ayam.setVisibility(View.INVISIBLE);// Membuat Search box menghilang
        		 setTitle("Pilih Suku");
        		  if (pilihan.equals("Back")){
        			  ayam.setVisibility(View.VISIBLE);// Membuat Search box tampil kembali
        			  list.setAdapter(adapter);
        			  setTitle("Pilih Provinsi");
        		  }
        		  else if (pilihan.equals("NAD")) {
        			  list.setAdapter(sukus0);   
        			  
        			}
        		  else if(pilihan.equals("Sumatera Utara")){
        			   
        			  list.setAdapter(sukus1);
        			  
        		  }
        		  else if(pilihan.startsWith("Suku")){
                   Intent intent = new Intent("pkti.adek.budi.layer.TAB_MAIN");
                   intent.putExtra("kirim", pilihan);
                   startActivity(intent);   

        		  }
        		  else {
        			  list.setAdapter(sukus2);
        		  }
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