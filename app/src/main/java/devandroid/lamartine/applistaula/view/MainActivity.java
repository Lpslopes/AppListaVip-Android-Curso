package devandroid.lamartine.applistaula.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import devandroid.lamartine.applistaula.R;
import devandroid.lamartine.applistaula.model.Pessoa;

public class MainActivity extends AppCompatActivity {

    Pessoa pessoa;

    Pessoa outraPessoa;

    String dadosPessoa;
    String dadosOutraPessoa;

    EditText edit_PrimeiroNome;
    EditText editSobreNome;
    EditText editCursoDesejado;
    EditText edit_TelefonedeContato;

    Button btn_Limpar;
    Button btn_Salvar;
    Button btn_Finalizar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pessoa = new Pessoa();
        //Atribuir conteudo, dados.
//        pessoa.setPrimeiroNome("Lamartine");
//        pessoa.setSobreNome("Lopes");
//        pessoa.setCursoDesejado("Android");
//        pessoa.setTelefoneContato("11-88889999");

        outraPessoa = new Pessoa();
        outraPessoa.setPrimeiroNome("Lamartine");
        outraPessoa.setSobreNome("Lopes");
        outraPessoa.setCursoDesejado("Android");
        outraPessoa.setTelefoneContato("11-88889999");

        edit_PrimeiroNome = findViewById(R.id.edit_PrimeiroNome);
        editSobreNome = findViewById(R.id.editSobreNome);
        editCursoDesejado = findViewById(R.id.editCursoDesejado);
        edit_TelefonedeContato = findViewById(R.id.edit_TelefonedeContato);

        btn_Limpar = findViewById(R.id.btn_Limpar);
        btn_Salvar = findViewById(R.id.btn_Salvar);
        btn_Finalizar = findViewById(R.id.btn_Finalizar);


        edit_PrimeiroNome.setText(pessoa.getPrimeiroNome());
        editSobreNome.setText(pessoa.getSobreNome());
        editCursoDesejado.setText(pessoa.getCursoDesejado());
        edit_TelefonedeContato.setText(pessoa.getTelefoneContato());

        btn_Limpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit_PrimeiroNome.setText("");
                editSobreNome.setText("");
                editCursoDesejado.setText("");
                edit_TelefonedeContato.setText("");
            }
        });

        btn_Finalizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Volte sempre",Toast.LENGTH_LONG).show();
                finish();

            }
        });

        btn_Salvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pessoa.setPrimeiroNome(edit_PrimeiroNome.getText().toString());
                pessoa.setSobreNome(editSobreNome.getText().toString());
                pessoa.setCursoDesejado(editCursoDesejado.getText().toString());
                pessoa.setTelefoneContato(edit_TelefonedeContato.getText().toString());

                Toast.makeText(MainActivity.this, "Salvo" +pessoa.toString(),Toast.LENGTH_LONG).show();
            }
        });
//
//        dadosPessoa = " Primeiro nome: ";
//        dadosPessoa += pessoa.getPrimeiroNome();
//        dadosPessoa += " Sobrenome: ";
//        dadosPessoa += pessoa.getSobreNome();
//        dadosPessoa += " Curso Desejado: ";
//        dadosPessoa += pessoa.getCursoDesejado();
//        dadosPessoa += " Telefone de contato: ";
//        dadosPessoa += pessoa.getTelefoneContato();
//
//        dadosOutraPessoa = " Primeiro nome: ";
//        dadosOutraPessoa += outraPessoa.getPrimeiroNome();
//        dadosOutraPessoa += " Sobrenome: ";
//        dadosOutraPessoa += outraPessoa.getSobreNome();
//        dadosOutraPessoa += " Curso Desejado: ";
//        dadosOutraPessoa += outraPessoa.getCursoDesejado();
//        dadosOutraPessoa += " Telefone de contato: ";
//        dadosOutraPessoa += outraPessoa.getTelefoneContato();
//


        Log.i("POOAndroid",pessoa.toString());
        Log.i("POOAndroid",outraPessoa.toString());




    }
}