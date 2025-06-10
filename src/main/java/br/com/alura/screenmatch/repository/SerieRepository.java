package br.com.alura.screenmatch.repository;

import br.com.alura.screenmatch.model.Serie;
import org.springframework.data.jpa.repository.JpaRepository;

//Só com essa linha já é possível salvar e recuparar dados do banco
public interface SerieRepository extends JpaRepository<Serie, Long> {
}
