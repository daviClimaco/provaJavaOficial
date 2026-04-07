package daviClimaco.provaJava.Entity;

import daviClimaco.provaJava.Enums.StatusProduto;
import jakarta.persistence.*;
import lombok.Data;

@Entity(name = "Produto")
@Data
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String descricao;

    private Double preco;

    @Enumerated(EnumType.STRING)
    private StatusProduto status;
}