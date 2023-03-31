package com.example.myapplication;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
public class MainActivity extends AppCompatActivity {
    FragmentManager n;

    private void buttonListener(String a, String b, String c) {
        // njn

        n.beginTransaction()
                .replace(R.id.frag1, new Fragment1(a, b, c))
                .addToBackStack(null)
                .commit();
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn=findViewById(R.id.one);
        n=getSupportFragmentManager();
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               buttonListener("пельга", "попро", "ппрь");
            }
        });
        Button btn2=findViewById(R.id.two);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonListener("лена","апиа","апр");
            }
        });
        Button btn3=findViewById(R.id.three);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonListener("маша","павп","апап");

            }
        });
        Button btn4=findViewById(R.id.four);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               buttonListener("катя","апиапр","ы5некгек");
            }
        });

    }
    @Override
    public void onBackPressed() {
        FragmentManager fm = n;
        if (fm.getBackStackEntryCount() > 0)
            fm.popBackStack();
        else
            finish();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                onBackPressed();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}