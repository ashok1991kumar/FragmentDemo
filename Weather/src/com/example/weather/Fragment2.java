package com.example.weather;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class Fragment2 extends Fragment  implements OnClickListener{
	int LAYOUT_ID = R.layout.page2;
	Button click;
	TextView tv;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
	}
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
	
		View view=inflater.inflate(LAYOUT_ID, container, false);
		click=(Button) view.findViewById(R.id.button1);
		tv=(TextView) view.findViewById(R.id.textView1);
		
		click.setOnClickListener(this);
		
		return view;
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
			case R.id.button1:
			{
				tv.setText("Hello Ashok!!");
				break;
			}
				

		}
		
	}
}
