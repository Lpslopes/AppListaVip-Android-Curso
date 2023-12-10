package devandroid.lamartine.applistaula.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import devandroid.lamartine.applistaula.R;
import devandroid.lamartine.applistaula.model.Pessoa;

public class MainActivity extends AppCompatActivity {

    Pessoa pessoa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pessoa = new Pessoa();
    }
}