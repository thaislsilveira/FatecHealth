package fatechealth.com.br.fatechealth;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.QuickContactBadge;
import android.widget.Toast;

import controller.PerfilController;

public class CadastrarPerfil extends Fragment {

    EditText edtNome, edtEmail, edtCidade, edtEstado, edtIdade;
    ImageButton btnSalvar;
    View telaPerfil;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        telaPerfil = inflater.inflate(R.layout.activity_perfil, container, false);

        edtNome = (EditText) telaPerfil.findViewById(R.id.edtNome);
        edtEmail = (EditText) telaPerfil.findViewById(R.id.edtEmail);
        edtCidade = (EditText) telaPerfil.findViewById(R.id.edtCidade);
        edtEstado = (EditText) telaPerfil.findViewById(R.id.edtEstado);

        btnSalvar = (ImageButton) telaPerfil.findViewById(R.id.btnSalvar);

        btnSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edtNome.getText().length() <= 0 ||
                        edtEmail.getText().length() <= 0 ||
                        edtCidade.getText().length() <= 0 ||
                        edtEstado.getText().length() <= 0 ||
                        edtIdade.getText().length() <= 0) {
                    Toast.makeText(getContext(), "Faltam Dados a Serem Informados - Verifique!", Toast.LENGTH_SHORT).show();
                    edtNome.requestFocus();
                } else {
                    String nome = edtNome.getText().toString();
                    String email = edtEmail.getText().toString();
                    String cidade = edtCidade.getText().toString();
                    String estado = edtEstado.getText().toString();
                    Integer idade = Integer.parseInt(edtIdade.getText().toString());

                    PerfilController controller = new
                            PerfilController(getContext());

                }
            }
        });

        return telaPerfil;
    }
}
