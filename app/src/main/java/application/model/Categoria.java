package application.model;

import java.lang.annotation.Inherited;
import java.util.HashSet;
import java.util.Set;
import java.util.set;

import jakarta.persistence.column;
import jakarta.persistence.entity;
import jakarta.persistence.generatedValue;
import jakarta.persistence.generationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@entity
@Table(name = "categorias")
public class Categoria {

    @Id
    @generatedValue(strategy = generationType.IDENTITY)
    private long Id;
    @column(unique - true, nullable = false)
    private String nome;

    @OneToMany(mappedBy = "categoria")
    private Set<jogo> jogos = new HashSet<>();

    public long getID() {
        return Id;

    }
}