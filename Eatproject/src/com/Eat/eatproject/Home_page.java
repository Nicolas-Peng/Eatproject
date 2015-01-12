package com.Eat.eatproject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.SimpleAdapter;
//应用的首页，排放店家

public class Home_page extends Activity {
	private List<Map<String, Object>> mDataList = new ArrayList<Map<String, Object>>();
	ListView cafelist;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.home_page);
		//System.out.println("### my app ###");
	cafelist = (ListView) findViewById(R.id.listView1);
	setData();
	//设置餐厅的listview
	SimpleAdapter listItemAdapter = new SimpleAdapter(this, mDataList,// 数据源
			R.layout.cafe_item,// listview中item的布局文件
			new String[] { "name", "image","price","count" },// list中数据的key
			new int[] { R.id.name, R.id.image ,R.id.price,R.id.count});// item.xml中各控件的id
	cafelist.setAdapter(listItemAdapter);
	
	cafelist.setOnItemClickListener(itemClick);
	}
	
	//设置每间餐厅的按钮响应
	OnItemClickListener itemClick = new OnItemClickListener() {
		@Override
		public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
				long arg3) {
			// TODO Auto-generated method stub
			String dongbei="东北人家";
			String bingge="兵哥";
			String shishen="食神旁边";
			String shibu="时步餐厅";
			System.out.println("### my app ###");
			if(dongbei==mDataList.get(arg2).get("name").toString()){
				//logcat
			Intent intent_longjiang =new Intent(Home_page.this,cafe.class);
			startActivity(intent_longjiang);			
			}
			else if(bingge==mDataList.get(arg2).get("name").toString()){
				Intent intent_longjiang =new Intent(Home_page.this,cafe.class);
				startActivity(intent_longjiang);	
			}
			else if(shishen==mDataList.get(arg2).get("name").toString()){
				Intent intent_longjiang =new Intent(Home_page.this,cafe.class);
				startActivity(intent_longjiang);	
			}
			else if(shibu==mDataList.get(arg2).get("name").toString()){
				Intent intent_longjiang =new Intent(Home_page.this,cafe.class);
				startActivity(intent_longjiang);	
			}
		}
	};
	
	private void setData() {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("name", "食神旁边");
		map.put("image", R.drawable.ic_launcher);
		map.put("count", "月售1233单 / 10元起送");
		mDataList.add(map);
		
		map = new HashMap<String, Object>();
		map.put("name", "兵哥");
		map.put("image", R.drawable.ic_launcher);
		map.put("count", "月售123单 / 10元起送");
		mDataList.add(map);
		
		map = new HashMap<String, Object>();
		map.put("name", "东北人家");
		map.put("image", R.drawable.ic_launcher);
		map.put("count", "月售233单 / 10元起送");
		mDataList.add(map);
		
		map = new HashMap<String, Object>();
		map.put("name", "时步餐厅");
		map.put("image", R.drawable.ic_launcher);
		map.put("count", "月售133单 / 10元起送");
		mDataList.add(map);
	}
}

