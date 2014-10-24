package com.edu.cn.s07131020.intentfilter;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class SecondActivity extends Activity {
	EditText et1;
	Button bt1;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		 setContentView(R.layout.second);
		et1=(EditText) findViewById(R.id.editText1);
	        bt1=(Button) findViewById(R.id.button1);
	        
	        bt1.setOnClickListener(new OnClickListener(){

				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Uri myuri=Uri.parse(et1.getText().toString());
					Intent myit=new  Intent (Intent.ACTION_VIEW,myuri);
					startActivity(myit);
				}
	        }
	        );
	    }
	}


