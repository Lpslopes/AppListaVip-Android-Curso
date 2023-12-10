package devandroid.lamartine.applistaula.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import devandroid.lamartine.applistaula.R;
import devandroid.lamartine.applistaula.model.Pessoa;

public class MainActivity extends AppCompatActivity {

    Pessoa pessoa;

    Pessoa outraPessoa;

    String dadosPessoa;
    String dadosOutraPessoa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pessoa = new Pessoa();
        //Atribuir conteudo, dados.
        pessoa.setPrimeiroNome("Lamartine");
        pessoa.setSobreNome("Lopes");
        pessoa.setCursoDesejado("Android");
        pessoa.setTelefoneContato("11-88889999");

        outraPessoa = new Pessoa();
        outraPessoa.setPrimeiroNome("Lamartine");
        outraPessoa.setSobreNome("Lopes");
        outraPessoa.setCursoDesejado("Android");
        outraPessoa.setTelefoneContato("11-88889999");

        dadosPessoa = " Primeiro nome: ";
        dadosPessoa += pessoa.getPrimeiroNome();
        dadosPessoa += " Sobrenome: ";
        dadosPessoa += pessoa.getSobreNome();
        dadosPessoa += " Curso Desejado: ";
        dadosPessoa += pessoa.getCursoDesejado();
        dadosPessoa += " Telefone de contato: ";
        dadosPessoa += pessoa.getTelefoneContato();

        dadosOutraPessoa = " Primeiro nome: ";
        dadosOutraPessoa += outraPessoa.getPrimeiroNome();
        dadosOutraPessoa += " Sobrenome: ";
        dadosOutraPessoa += outraPessoa.getSobreNome();
        dadosOutraPessoa += " Curso Desejado: ";
        dadosOutraPessoa += outraPessoa.getCursoDesejado();
        dadosOutraPessoa += " Telefone de contato: ";
        dadosOutraPessoa += outraPessoa.getTelefoneContato();




    }
}