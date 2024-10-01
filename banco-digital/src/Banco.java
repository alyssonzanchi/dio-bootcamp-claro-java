import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Banco {
    public String nome;
    private List<Conta> contas;

    public Banco(String nome) {
        this.nome = nome;
    }
}
