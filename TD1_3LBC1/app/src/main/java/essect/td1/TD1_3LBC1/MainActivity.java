package essect.td1.TD1_3LBC1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button BPI;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BPI = (Button) findViewById(R.id.cpi);
        BPI.setOnClickListener(
                new View.OnClickListener(){
                    public void onClick(View v){
                        EditText texte = (EditText) findViewById(R.id.Taille);

                        int Taille = Integer.parseInt(texte.getText().toString());

                        int poids = ((3*Taille)-250)/4;

                        Toast.makeText(MainActivity.this,"Votre poids ideale est : "+poids,Toast.LENGTH_SHORT).show();
                    }});
    }
}