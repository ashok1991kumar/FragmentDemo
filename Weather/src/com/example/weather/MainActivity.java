package com.example.weather;

import android.os.Bundle;
import android.app.Activity;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {

	ViewPager viewpager;
	FragmentAdapter adapter;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	
		
		//getting actionbar back button
		
		ActionBar actionbar=getSupportActionBar();
		actionbar.setDisplayHomeAsUpEnabled(true);
		
		actionbar.setTitle("Bangalore,India");
		
		int[] Layout_Id={R.layout.page1,R.layout.page2,R.layout.page3};
		String[] Layout_Title={"Locations","Now","Weekly"};
		
		viewpager=(ViewPager) findViewById(R.id.pager);
		
		FragmentManager fmg=getSupportFragmentManager();
		
		adapter=new FragmentAdapter(fmg, Layout_Id, Layout_Title);
		
		viewpager.setAdapter(adapter);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return super.onCreateOptionsMenu(menu);
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch(item.getItemId()){
			case R.id.add_location:
				Toast.makeText(getApplicationContext(),
						"You Clicked Add Location", Toast.LENGTH_SHORT).show();
				break;
			case R.id.manage_location:
				Toast.makeText(getApplicationContext(),
						"Manage Location", Toast.LENGTH_SHORT).show();

				break;
			case R.id.share:
				Toast.makeText(getApplicationContext(),
						"You Clicked Share", Toast.LENGTH_SHORT).show();

				break;
			case R.id.setting:
				Toast.makeText(getApplicationContext(),
						"Setting", Toast.LENGTH_SHORT).show();

				break;
		}
		return super.onOptionsItemSelected(item);
	}

}
