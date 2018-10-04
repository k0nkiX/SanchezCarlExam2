package k.ilagan.sanchezcarlexam1;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SanchezCarlExam1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.relative_layout);
        Intent i = new Intent(this, MyCustomService.class);
        startService(i);
    }

    public void process(View v){
        Intent i=null, chooser=null;
        if(v.getId() == R.id.button2){
            i = new Intent(this,MainActivity2.class);
            startActivity(i);
        }
        else if(v.getId()==R.id.button){
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("geo://14.6307° N, 121.0165° E"));
            chooser = Intent.createChooser(i, "Choose a Map App");
            startActivity(chooser);
        }
    }
}
