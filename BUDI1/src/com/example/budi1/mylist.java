package com.example.budi1;
import java.util.HashMap;
 
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
 
public class mylist extends Activity {
    private ListView list;
    ArrayAdapter adapter;
    EditText input;
     
    
    
    
    
    
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);
         
        String NamePlayer[] = {"NAD","Sumatera Utara","Sumatera Barat", "Riau", "Lampung","Bengkulu","Jambi","Sumatera Selatan","DKI Jakarta",
        						"Jawa Barat","Jawa Timur","Jawa Tengah","Bali"}
                ;
        
        list = (ListView) findViewById(R.id.listview1);
        input = (EditText) findViewById(R.id.InputSearch);
         
        adapter = new ArrayAdapter(this, R.layout.list_item, R.id.NameList, NamePlayer);
        list.setAdapter(adapter);
         
        
        
        input.addTextChangedListener(new TextWatcher() {
             
            public void onTextChanged(CharSequence s, int arg1, int arg2, int arg3) {
                // TODO Auto-generated method stub
            mylist.this.adapter.getFilter().filter(s);
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

	

	

 