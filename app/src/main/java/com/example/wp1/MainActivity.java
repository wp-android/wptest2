package com.example.wp1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    private String[] name={"张三","李四","王五"};
    private  String[] des={"我是","猪","你是"};
    private int[] image={R.drawable.t41,R.drawable.t42,R.drawable.t43};
private ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List<Map<String,Object>> lists=new ArrayList<Map<String,Object>>();
        for (int i=0;i<name.length;i++){
            Map<String,Object> list=new HashMap<String,Object>();
            list.put("head",image[i]);
            list.put("name",name[i]);
            list.put("des",des[i]);
            lists.add(list);
        }
        SimpleAdapter simpleAdapter=new SimpleAdapter(this,lists,R.layout.layout1,new String[]{"head","name","des"
        },new int[]{R.id.image,R.id.text,R.id.text2});
        listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(simpleAdapter);
    }


//    public boolean onCreateOptionsMenu(Menu menu) {
//        getMenuInflater().inflate(R.menu.main,);
//    }
}
