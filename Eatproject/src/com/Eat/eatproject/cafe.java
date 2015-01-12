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
		map.put("name","正宗猪脚饭");
		map.put("price","售价：10元");
		map.put("count", "月售333份");
		zhujiao.add(map);
		
		map = new HashMap<String,Object>();
		map.put("image", R.drawable.xiangguo);
		map.put("name","麻辣香锅");
		map.put("price","售价：20元");
		map.put("count", "月售23份");
		zhujiao.add(map);
		
		map = new HashMap<String,Object>();
		map.put("image", R.drawable.yugan);
		map.put("name","川味鱼干片");
		map.put("price","售价：15元");
		map.put("count", "月售13份");
		zhujiao.add(map);
		
		map = new HashMap<String,Object>();
		map.put("image", R.drawable.tangguo);
		map.put("name","中式西芝糖裹");
		map.put("price","售价：25元");
		map.put("count", "月售53份");
		zhujiao.add(map);
	}
	
}
