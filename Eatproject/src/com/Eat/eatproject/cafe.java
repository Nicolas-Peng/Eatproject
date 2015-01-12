package com.Eat.eatproject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

public class cafe extends Activity {
	private List<Map<String, Object>> zhujiao = new ArrayList<Map<String, Object>>();
	ListView zhujiao_list;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.laoshulongjiang);
		
		zhujiao_list=(ListView) findViewById(R.id.view_laoshu);
		setData();
		
		SimpleAdapter laoshu_adapter = new SimpleAdapter(this, zhujiao, 
				R.layout.laoshu_item, 
				new String[]{"image","name","price","count"},
				new int[]{R.id.image,R.id.name,R.id.price,R.id.count});
		zhujiao_list.setAdapter(laoshu_adapter);
	}
	
	private void setData(){
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("image", R.drawable.zhujiaofan);
		map.put("name","������ŷ�");
		map.put("price","�ۼۣ�10Ԫ");
		map.put("count", "����333��");
		zhujiao.add(map);
		
		map = new HashMap<String,Object>();
		map.put("image", R.drawable.xiangguo);
		map.put("name","�������");
		map.put("price","�ۼۣ�20Ԫ");
		map.put("count", "����23��");
		zhujiao.add(map);
		
		map = new HashMap<String,Object>();
		map.put("image", R.drawable.yugan);
		map.put("name","��ζ���Ƭ");
		map.put("price","�ۼۣ�15Ԫ");
		map.put("count", "����13��");
		zhujiao.add(map);
		
		map = new HashMap<String,Object>();
		map.put("image", R.drawable.tangguo);
		map.put("name","��ʽ��֥�ǹ�");
		map.put("price","�ۼۣ�25Ԫ");
		map.put("count", "����53��");
		zhujiao.add(map);
	}
	
}
