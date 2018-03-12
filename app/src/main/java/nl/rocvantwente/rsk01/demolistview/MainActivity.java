package nl.rocvantwente.rsk01.demolistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    // Definieer een array van 10000 posities voor het opslaan
    // van integers
    int arrayGetallen[] = new int[10000];

    // Definieer een arraylist
    ArrayList<Integer> alGetallen = new ArrayList<Integer>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Vul de array met random getallen tussen 1000 en 10000
        // Voeg 10000 random getallen toe aan de arraylist
        for(int i = 0 ; i < 10000 ; i++){
            Random random = new Random();
            int randomNumber = random.nextInt(9000) + 1000;
            arrayGetallen[i] = randomNumber;
            alGetallen.add(randomNumber);
        }
        Log.d("rsk01" , "" + arrayGetallen[5000]);

        ListView lvGetallen =  findViewById(R.id.lvGetallen);

        ArrayAdapter<Integer> adap = new GetalAdapter(getApplicationContext() ,
                alGetallen);

        lvGetallen.setAdapter(adap);
    }
}
