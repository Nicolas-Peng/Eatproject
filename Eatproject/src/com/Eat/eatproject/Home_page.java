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
//Ӧ�õ���ҳ���ŷŵ��

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
	//���ò�����listview
	SimpleAdapter listItemAdapter = new SimpleAdapter(this, mDataList,// ����Դ
			R.layout.cafe_item,// listview��item�Ĳ����ļ�
			new String[] { "name", "image","price","count" },// list�����ݵ�key
			new int[] { R.id.name, R.id.image ,R.id.price,R.id.count});// item.xml�и��ؼ���id
	cafelist.setAdapter(listItemAdapter);
	
	cafelist.setOnItemClickListener(itemClick);
	}
	
	//����ÿ������İ�ť��Ӧ
	OnItemClickListener itemClick = new OnItemClickListener() {
		@Override
		public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
				long arg3) {
			// TODO Auto-generated method stub
			String dongbei="�����˼�";
			String bingge="����";
			String shishen="ʳ���Ա�";
			String shibu="ʱ������";
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
		map.put("name", "ʳ���Ա�");
		map.put("image", R.drawable.ic_launcher);
		map.put("count", "����1233�� / 10Ԫ����");
		mDataList.add(map);
		
		map = new HashMap<String, Object>();
		map.put("name", "����");
		map.put("image", R.drawable.ic_launcher);
		map.put("count", "����123�� / 10Ԫ����");
		mDataList.add(map);
		
		map = new HashMap<String, Object>();
		map.put("name", "�����˼�");
		map.put("image", R.drawable.ic_launcher);
		map.put("count", "����233�� / 10Ԫ����");
		mDataList.add(map);
		
		map = new HashMap<String, Object>();
		map.put("name", "ʱ������");
		map.put("image", R.drawable.ic_launcher);
		map.put("count", "����133�� / 10Ԫ����");
		mDataList.add(map);
	}
}

