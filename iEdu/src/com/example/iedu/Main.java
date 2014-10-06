package com.example.iedu;

import java.util.ArrayList;
import java.util.List;


import Controlador.Carrera;
import Modelo.CarreraFacade;
import android.content.Context;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;



public class Main extends ActionBarActivity{
	
	public LinearLayout mainLayout;
	public ListView listView;
    public Context context;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		mainLayout = new LinearLayout(this);
		mainLayout.setOrientation(LinearLayout.VERTICAL);
		mainLayout.addView(new ToolButon(this));
		
		Button button1 = new Button(this);
		mainLayout.addView(button1);
		button1.setText("Boton1");

		button1.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				mainLayout.removeViewAt(1);
			      //listView=new ListView(context);
			        
//			        new AsyncTask <Void,Void,Void>(){
//			        	List<Carrera> carrera;
//			        	ArrayAdapter<Carrera> arrayAdapter;
//						@Override
//						protected Void doInBackground(Void... params) {
//							carrera=new CarreraFacade().findAll();
//							return null;
//						}
//						@Override
//						protected void onPostExecute(Void result) {
//							if(carrera!=null){
//								 arrayAdapter=new ArrayAdapter<Carrera>(context,android.R.layout.simple_list_item_1,carrera);
//								 listView.setAdapter(arrayAdapter);
//							}
//							super.onPostExecute(result);
//						}
//						@Override
//						protected void onPreExecute() {
//							carrera=null;
//							arrayAdapter=null;
//							super.onPreExecute();
//						}
//			        	
//			        	
//			        }.execute();
//			        
			        
			    }
				
		

		 
		});
		
		this.setContentView(mainLayout);
	}
	
 
	

	
     
	
}
