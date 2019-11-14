package com.example.summachar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.ActionBar;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager manager;
    ArrayList<Newsdata> newsdata = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerview);
        recyclerView.setHasFixedSize(true);
        manager = new LinearLayoutManager(this);
        adapter = new NewsAdapter(newsdata);

        recyclerView.setLayoutManager(manager);
        recyclerView.setAdapter(adapter);
        newsdata.add(new Newsdata("The Seshan Effect has got Diluted over Time",
                R.drawable.news1,
                "Lalit Shastri (Newsroom 24×7)",
                " I was covering for The Hindu the 1993 Madhya Pradesh Assembly election that were being held after one year of President’s Rule that had been imposed in Madhya Pradesh following the dismissal of the Sunderlal Patwa led State BJP Government in the wake of the post Ayodhya riots.",
                "Posted Date: 09/09/2019"
        ));
        newsdata.add(new Newsdata("JNU Students Take to the Streets after Hostel Fee Hike",
                R.drawable.news2,
                "Mitesh Vaghela (Newsroom 24×7)",
                "JNU students are in uproar as their Hostel Fee has been increased from Rs 10 per month to Rs 300 per month.",
                "Posted Date: 19/09/2019"
        ));
        newsdata.add(new Newsdata("Delhi AQI Reaches Emergency Levels",
                R.drawable.news3,
                "Viren Pawar (Newsroom 24×7)",
                "Delhi, which was already having “severe” air quality since the last couple of weeks, has now crossed into “Emergency” level of Air Quality Index (AQI).",
                "Posted Date: 29/09/2019"
        ));
        newsdata.add(new Newsdata("New National Sports Code Draft Rejected by the IOA",
                R.drawable.news4,
                "Anand  (Newsroom 24×7)",
                "The Indian Olympic Association (IOA) has rejected the National Sports Code draft completely which suggests multiple administrative policy changes. IOA stated that India will face criticism from the International Olympic Committee if this draft is approved, and might even face suspension.",
                "Posted Date: 1/10/2019"
        ));
        newsdata.add(new Newsdata("PM Modi to Attend 11th BRICS Summit In Brazil",
                R.drawable.news5,
                "Kamlesh Shastri (Newsroom 24×7)",
                "Prime Minister Narendra Modi will depart on 12th November for the 11th BRICS summit in Brasilia, Brazil, to be held on 13th – 14th November. The theme of the BRICS summit this year is “Economic Growth for an Innovative Future.”",
                "Posted Date: 15/10/2019"
        ));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        switch (id){
            case R.id.item1:
                Toast.makeText(getApplicationContext(),"Item 1 Selected",Toast.LENGTH_LONG).show();
                return true;
            case R.id.item2:
                Toast.makeText(getApplicationContext(),"Item 2 Selected",Toast.LENGTH_LONG).show();
                return true;
            case R.id.item3:
                Toast.makeText(getApplicationContext(),"Item 3 Selected",Toast.LENGTH_LONG).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
