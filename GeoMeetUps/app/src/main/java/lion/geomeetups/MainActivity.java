package lion.geomeetups;

import android.app.Activity;
import android.location.Location;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((Button)findViewById(R.id.btn_profile)).setOnClickListener(this);
        ((Button)findViewById(R.id.btn_location)).setOnClickListener(this);
        ((Button)findViewById(R.id.btn_meetup)).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.btn_profile:
                break;

            case R.id.btn_location:
/*
                Location posLocation = positionActuelle.getLocation(positionActuelle.getSource());

                if (posLocation != null)
                {
                    latitude = posLocation.getLatitude();
                    longitude = posLocation.getLongitude();
                    Toast.makeText(
                            getApplicationContext(),
                            "Mobile Location : \nLatitude: " + latitude
                                    + "\nLongitude: " + longitude,
                            Toast.LENGTH_LONG).show();
                }

                afficherAdresseSurCarte();
*/
                break;
            case R.id.btn_meetup:
                break;

            default:
                break;
        }
    }
}
