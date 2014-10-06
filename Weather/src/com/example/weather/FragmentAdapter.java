package com.example.weather;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.util.Log;

public class FragmentAdapter extends FragmentPagerAdapter {

	int[] Layouts;
	String[] Titles;
	
	public FragmentAdapter(FragmentManager fm, int[] Layout_Id,	String[] Layout_Title) {
		super(fm);
		
		Layouts=Layout_Id;
		Titles=Layout_Title;
		
	}

	@Override
	public Fragment getItem(int index) {
		
		int layoutID=Layouts[index];
		Fragment fm=null;
		switch (layoutID) {
			case R.layout.page1:
			{
				Fragment1 fm1=new Fragment1();
				Log.d("TAG","FRAGMENT 1 Called");
				fm=fm1;
				break;
			}
			case R.layout.page2:
			{
				Fragment2 fm2=new Fragment2();
				Log.d("TAG","FRAGMENT 2 Called");
				fm=fm2;
				break;
			}
			case R.layout.page3:
			{
				Fragment3 fm3=new Fragment3();
				Log.d("TAG","FRAGMENT 3 Called");
				fm=fm3;
				break;
			}	
			
			
		}
		return fm;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return Layouts.length;
	}

	@Override
	public CharSequence getPageTitle(int position) {
		return Titles[position];
	}
}
