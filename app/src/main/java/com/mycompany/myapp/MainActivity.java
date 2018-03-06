package com.mycompany.myapp;

import android.app.*;
import android.os.*;
import android.view.*;
import android.widget.*;

public class MainActivity extends Activity 
{
	//ui
	
	ImageView pro;
	Button up;
	Button down;
	Button left;
	Button right;
	
	
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		setTitle("Demo");
		
		//实例化
		pro = (ImageView)findViewById(R.id.mainImageView1);
		up = (Button)findViewById(R.id.mainButton1);
		left = (Button)findViewById(R.id.mainButton2);
		right = (Button)findViewById(R.id.mainButton3);
		down = (Button)findViewById(R.id.mainButton4);	
    }
	
	
	
	//上
	public void up(View view){
		pro.setY(pro.getY()-50);
	}
	//下
	public void down(View view){
		pro.setY(pro.getY()+50);
	}
	//左
	public void left(View view){
		pro.setX(pro.getX()-50);
	}
	//右
	public void right(View view){
		pro.setX(pro.getX()+50);
	}
	
	
	
}
