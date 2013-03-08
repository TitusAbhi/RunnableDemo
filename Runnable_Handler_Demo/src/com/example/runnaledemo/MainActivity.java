package com.example.runnaledemo;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {

    TextView dot1,dot2,dot3;
    
    Handler handler=new Handler();
    
    int count=0;
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        dot1=(TextView)findViewById(R.id.dot1);
        dot2=(TextView)findViewById(R.id.dot2);
        dot3=(TextView)findViewById(R.id.dot3);
        
        handler.postDelayed(r, 100);
    }
	
	Runnable r=new Runnable()
	{
		@Override
		public void run() 
		{
			if(count==0)
			{
				dot1.setVisibility(View.GONE);
				dot2.setVisibility(View.GONE);
				dot3.setVisibility(View.GONE);
				count=count+1;
			}
			else if(count==1)
			{
				dot1.setVisibility(View.VISIBLE);
				dot2.setVisibility(View.GONE);
				dot3.setVisibility(View.GONE);
				count=count+1;
			}
			else if(count==2)
			{
				dot1.setVisibility(View.VISIBLE);
				dot2.setVisibility(View.VISIBLE);
				dot3.setVisibility(View.GONE);
				count=count+1;
				
			}
			else 
			{
				dot1.setVisibility(View.VISIBLE);
				dot2.setVisibility(View.VISIBLE);
				dot3.setVisibility(View.VISIBLE);
				count=0;
				
			}
			
			handler.postDelayed(this, 500);
		}
		
	};
	

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }

    
}
