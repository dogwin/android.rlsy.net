package dogwin.net.app;
import dogwin.net.publics.Menus;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class App extends Activity {
	
	Menus menus = new Menus();
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.app);
	}
	/*
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.app, menu);
		return true;
	}*/
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		MenuInflater inflater = new MenuInflater(this);
		/*if(DwClient.flag){
			inflater.inflate(R.menu.menu_logged, menu);
		}else{
			inflater.inflate(R.menu.menu_unlogin, menu);
		}*/
		inflater.inflate(R.menu.menu_logged, menu);
		return super.onCreateOptionsMenu(menu);
		
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		return super.onOptionsItemSelected(menus.select_menus(item, App.this));
	}
}
