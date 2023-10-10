import com.eazybytes.enuns.Cargo;
import com.eazybytes.model.Funcionario;
import com.eazybytes.model.Venda;

/**
 * @author pedro.neri
 * @project springsecsection3
 * @email pedro.neri@
 * @createat 09/10/2023
 */
public class TesteApplication {


    public static void main(String[] args) {
        Venda v = new Venda();
        Funcionario funcionario = new Funcionario();
        funcionario.setCargo(Cargo.ATENDENTE);
        funcionario.setName("Mario");

        v.setFuncionario(funcionario);
        v.setValorVenda(300.90);
        v.save();

    }
}
