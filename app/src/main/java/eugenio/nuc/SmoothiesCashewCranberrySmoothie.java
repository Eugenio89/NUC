package eugenio.nuc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SmoothiesCashewCranberrySmoothie extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_smoothies_cashew_cranberry_smoothie);
    }

    public void button_ready (View view){
        Intent intent = new Intent(this, JuicerControl.class);
        startActivity(intent);
    }

}
