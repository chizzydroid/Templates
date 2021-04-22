package com.chizzy.toimplemmentlistvie;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Intent;
import android.icu.util.ULocale;
import android.os.Bundle;
import android.os.Handler;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Arrays;
import java.util.Locale;
public class MainActivity extends AppCompatActivity {
    String[] thingsIwiillGet = {"I wish you good luck dear", "Please i need a job", "I got a job for you", "Can we see tomorrow", "I miss you more",
            "Babe are you coming over today", "How was your studies", "When are you coming", "I hope every one is fine",
            "Please hold on i will chat you later am busy right now",
            "am just coming back from work now", "please can you come tomorrow", "Peaceful night rest ok bye for now", "How can i help you", "please call me back", " I can't see it",
            "How is work today", "Ok that is cool", "I just send it now", "Please help me  Please help",
            "How was your studies", "How is Your family", "I hope every one is fine", "what do you want to eat",
            "Am inside the bus please let me call you when i get down",
            "Am at home feeling very sleepy now let's chat later", "Am very tired now i will call you back later", "Very well thank you, and you?",
            "please who is this ", "what's up", "please call me back", "What kind of job", "How was today", "I miss you too dear",
            "How are you", "Did you go to church today?", "how was the service today?", "Did you go to school today?", "Did you go to work today?", "Are you back from work now", "Long time no see what's up", "Am good and you", "Where are you now"};

    ArrayAdapter adapter;
    ListView listView;
    EditText editText;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, thingsIwiillGet);
        editText = findViewById(R.id.editText);
        listView = (ListView) findViewById(R.id.listView);
        button = findViewById(R.id.button);
        listView.setAdapter(adapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id){

                switch (position) {
                    case 0:
                        editText.setText("I wish you good luck dear");
                        listView.setVisibility(View.INVISIBLE);
                        editText.setVisibility(View.VISIBLE);
                        button.setVisibility(View.VISIBLE);
                        break;
                    case 1:
                        editText.setText("Please i need a job");
                        listView.setVisibility(View.INVISIBLE);
                        editText.setVisibility(View.VISIBLE);
                        button.setVisibility(View.VISIBLE);
                        break;
                    case 2:
                        editText.setText("I got a job for you");
                        listView.setVisibility(View.INVISIBLE);
                        editText.setVisibility(View.VISIBLE);
                        button.setVisibility(View.VISIBLE);
                        break;

                    case 3:
                        editText.setText("Can we see tomorrow");
                        listView.setVisibility(View.INVISIBLE);
                        editText.setVisibility(View.VISIBLE);
                        button.setVisibility(View.VISIBLE);
                        break;
                    case 4:

                        editText.setText("I miss you more");
                        listView.setVisibility(View.INVISIBLE);
                        editText.setVisibility(View.VISIBLE);
                        button.setVisibility(View.VISIBLE);
                        break;

                    case 5:
                        editText.setText("Babe are you coming over today");
                        listView.setVisibility(View.INVISIBLE);
                        editText.setVisibility(View.VISIBLE);
                        button.setVisibility(View.VISIBLE);
                        break;

                    case 6:

                        editText.setText("How was your studies");
                        listView.setVisibility(View.INVISIBLE);
                        editText.setVisibility(View.VISIBLE);
                        button.setVisibility(View.VISIBLE);
                        break;
                    case 7:

                        editText.setText("When are you coming");
                        listView.setVisibility(View.INVISIBLE);
                        editText.setVisibility(View.VISIBLE);
                        button.setVisibility(View.VISIBLE);
                        break;

                    case 8:
                        editText.setText("I hope every one is fine");
                        listView.setVisibility(View.INVISIBLE);
                        editText.setVisibility(View.VISIBLE);
                        button.setVisibility(View.VISIBLE);
                        break;
                    case 9:
                        editText.setText("Please hold on i will chat you later am busy right now");
                        listView.setVisibility(View.INVISIBLE);
                        editText.setVisibility(View.VISIBLE);
                        button.setVisibility(View.VISIBLE);
                        break;
                    case 10:
                        editText.setText("am just coming back from work now");
                        listView.setVisibility(View.INVISIBLE);
                        editText.setVisibility(View.VISIBLE);
                        button.setVisibility(View.VISIBLE);
                        break;

                    case 11:
                        editText.setText("please can you come tomorrow");
                        listView.setVisibility(View.INVISIBLE);
                        editText.setVisibility(View.VISIBLE);
                        button.setVisibility(View.VISIBLE);
                        break;
                    case 12:

                        editText.setText("Peaceful night rest ok bye for now");
                        listView.setVisibility(View.INVISIBLE);
                        editText.setVisibility(View.VISIBLE);
                        button.setVisibility(View.VISIBLE);
                        break;

                    case 13:
                        editText.setText("How can i help you");
                        listView.setVisibility(View.INVISIBLE);
                        editText.setVisibility(View.VISIBLE);
                        button.setVisibility(View.VISIBLE);
                        break;

                    case 14:

                        editText.setText("please call me back");
                        listView.setVisibility(View.INVISIBLE);
                        editText.setVisibility(View.VISIBLE);
                        button.setVisibility(View.VISIBLE);
                        break;
                    case 15:

                        editText.setText(" I can't see it");
                        listView.setVisibility(View.INVISIBLE);
                        editText.setVisibility(View.VISIBLE);
                        button.setVisibility(View.VISIBLE);
                        break;

                    case 16:

                        editText.setText("How is work today");
                        listView.setVisibility(View.INVISIBLE);
                        editText.setVisibility(View.VISIBLE);
                        button.setVisibility(View.VISIBLE);
                        break;

                    case 17:
                        editText.setText("Ok that is cool");
                        listView.setVisibility(View.INVISIBLE);
                        editText.setVisibility(View.VISIBLE);
                        button.setVisibility(View.VISIBLE);
                        break;
                    case 18:
                        editText.setText("I just send it now");
                        listView.setVisibility(View.INVISIBLE);
                        editText.setVisibility(View.VISIBLE);
                        button.setVisibility(View.VISIBLE);
                        break;

                    case 19:
                        editText.setText("Please help me  Please help");
                        listView.setVisibility(View.INVISIBLE);
                        editText.setVisibility(View.VISIBLE);
                        button.setVisibility(View.VISIBLE);
                        break;
                    case 20:
                        editText.setText("How was your Studies");
                        listView.setVisibility(View.INVISIBLE);
                        editText.setVisibility(View.VISIBLE);
                        button.setVisibility(View.VISIBLE);
                        break;

                    case 21:
                        editText.setText("How is your family");
                        listView.setVisibility(View.INVISIBLE);
                        editText.setVisibility(View.VISIBLE);
                        button.setVisibility(View.VISIBLE);
                        break;
                    case 22:

                        editText.setText("I hope every one is fine");
                        listView.setVisibility(View.INVISIBLE);
                        editText.setVisibility(View.VISIBLE);
                        button.setVisibility(View.VISIBLE);
                        break;

                    case 23:
                        editText.setText("what do you want to eat");
                        listView.setVisibility(View.INVISIBLE);
                        editText.setVisibility(View.VISIBLE);
                        button.setVisibility(View.VISIBLE);
                        break;

                    case 24:

                        editText.setText("Am inside the bus please let me call you when i get down");
                        listView.setVisibility(View.INVISIBLE);
                        editText.setVisibility(View.VISIBLE);
                        button.setVisibility(View.VISIBLE);
                        break;
                    case 25:

                        editText.setText(" Am at home feeling very sleepy now let's chat later");
                        listView.setVisibility(View.INVISIBLE);
                        editText.setVisibility(View.VISIBLE);
                        button.setVisibility(View.VISIBLE);
                        break;

                    case 26:

                        editText.setText("Am very tired now i will call you back later");
                        listView.setVisibility(View.INVISIBLE);
                        editText.setVisibility(View.VISIBLE);
                        button.setVisibility(View.VISIBLE);
                        break;
                    case 27:
                        editText.setText("Very well thank you, and you?");
                        listView.setVisibility(View.INVISIBLE);
                        editText.setVisibility(View.VISIBLE);
                        button.setVisibility(View.VISIBLE);
                        break;
                    case 28:
                        editText.setText("please who is this");
                        listView.setVisibility(View.INVISIBLE);
                        editText.setVisibility(View.VISIBLE);
                        button.setVisibility(View.VISIBLE);
                        break;

                    case 29:
                        editText.setText("what's up");
                        listView.setVisibility(View.INVISIBLE);
                        editText.setVisibility(View.VISIBLE);
                        button.setVisibility(View.VISIBLE);
                        break;
                    case 30:
                        editText.setText("Please call me back");
                        listView.setVisibility(View.INVISIBLE);
                        editText.setVisibility(View.VISIBLE);
                        button.setVisibility(View.VISIBLE);
                        break;
                    case 31:
                        editText.setText("What kind of job");
                        listView.setVisibility(View.INVISIBLE);
                        editText.setVisibility(View.VISIBLE);
                        button.setVisibility(View.VISIBLE);
                        break;
                    case 32:

                        editText.setText("How was today");
                        listView.setVisibility(View.INVISIBLE);
                        editText.setVisibility(View.VISIBLE);
                        button.setVisibility(View.VISIBLE);
                        break;

                    case 33:
                        editText.setText("I miss you too dear");
                        listView.setVisibility(View.INVISIBLE);
                        editText.setVisibility(View.VISIBLE);
                        button.setVisibility(View.VISIBLE);
                        break;

                    case 34:

                        editText.setText("How are you");
                        listView.setVisibility(View.INVISIBLE);
                        editText.setVisibility(View.VISIBLE);
                        button.setVisibility(View.VISIBLE);
                        break;
                    case 35:

                        editText.setText("Did you go to church today?");
                        listView.setVisibility(View.INVISIBLE);
                        editText.setVisibility(View.VISIBLE);
                        button.setVisibility(View.VISIBLE);
                        break;

                    case 36:

                        editText.setText("How was the service today?");
                        listView.setVisibility(View.INVISIBLE);
                        editText.setVisibility(View.VISIBLE);
                        button.setVisibility(View.VISIBLE);
                        break;
                    case 37:
                        editText.setText("Did you go to school today?");
                        listView.setVisibility(View.INVISIBLE);
                        editText.setVisibility(View.VISIBLE);
                        button.setVisibility(View.VISIBLE);
                        break;
                    case 38:
                        editText.setText("Did you go to work today?");
                        listView.setVisibility(View.INVISIBLE);
                        editText.setVisibility(View.VISIBLE);
                        button.setVisibility(View.VISIBLE);
                        break;
                    case 39:
                        editText.setText("Are you back from work now?");
                        listView.setVisibility(View.INVISIBLE);
                        editText.setVisibility(View.VISIBLE);
                        button.setVisibility(View.VISIBLE);
                        break;
                    case 40:
                        editText.setText("Long time no see, what's up?");
                        listView.setVisibility(View.INVISIBLE);
                        editText.setVisibility(View.VISIBLE);
                        button.setVisibility(View.VISIBLE);
                        break;
                    case 41:
                        editText.setText("Am good and you");
                        listView.setVisibility(View.INVISIBLE);
                        editText.setVisibility(View.VISIBLE);
                        button.setVisibility(View.VISIBLE);
                        break;
                    case 42:
                        editText.setText("Where are you now");
                        listView.setVisibility(View.INVISIBLE);
                        editText.setVisibility(View.VISIBLE);
                        button.setVisibility(View.VISIBLE);
                        break;


                }
            }
        });
    }

    public  void send(View view){
    Intent shareIntent = new Intent(Intent.ACTION_SEND);
        shareIntent.setType("text/plain");
        shareIntent.putExtra(Intent.EXTRA_SUBJECT,"");
    String message = editText.getText().toString().trim();
        shareIntent.putExtra(Intent.EXTRA_TEXT,message);

    startActivity(Intent.createChooser(shareIntent, ""));

        if(listView !=null){

        listView.setVisibility(View.VISIBLE);
        button.setVisibility(View.INVISIBLE);
        editText.setVisibility(View.INVISIBLE);
    } else {


            editText.setVisibility(View.INVISIBLE);
            button.setVisibility(View.INVISIBLE);

        }
    }
}
