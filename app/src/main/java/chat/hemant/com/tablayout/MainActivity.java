package chat.hemant.com.tablayout;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private ViewPager pager;
    private fragmentpageradaptet adapter;
    private TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar =(Toolbar)findViewById(R.id.mytoolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Demo App");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        pager =(ViewPager)findViewById(R.id.pager);
        adapter = new fragmentpageradaptet(getSupportFragmentManager());
        pager.setAdapter(adapter);
        tabLayout =(TabLayout)findViewById(R.id.tablayout1);
        tabLayout.setupWithViewPager(pager);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
         super.onCreateOptionsMenu(menu);
         getMenuInflater().inflate(R.menu.menu,menu);

         return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
         super.onOptionsItemSelected(item);

         if (item.getItemId()==R.id.setting_id) {
             Intent intent = new Intent(MainActivity.this, SettingAcitivity.class);
             startActivity(intent);
         }
             else if (item.getItemId()==R.id.setting_two){
             Toast.makeText(MainActivity.this,"Logout button clicked",Toast.LENGTH_SHORT).show();

             }


        return true;
    }
}
