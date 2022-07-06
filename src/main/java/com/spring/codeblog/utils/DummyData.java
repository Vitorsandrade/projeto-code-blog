package com.spring.codeblog.utils;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.spring.codeblog.model.Post;
import com.spring.codeblog.repository.CodeblogRepository;

@Component
public class DummyData {

	@Autowired
	CodeblogRepository CodeblogRepository;

//	@PostConstruct
	public void savePosts() {

		List<Post> postList = new ArrayList<>();
		Post post1 = new Post();
		post1.setAutor("Layza Gabriela");
		post1.setData(LocalDate.now());
		post1.setTitulo("O Acompanhante Terapêutico na Psicologia");
		post1.setTexto(
				"O acompanhamento terapêutico como trabalho surgiu na Argentina na década de 1960, como uma alternativa às práticas terapêuticas clássicas. Essa atividade foi endossada pelos movimentos antimanicomiais que ganharam força na Europa nas décadas de 1950 e 1960 (Londero & Pacheco, 2006), e que tinham como objetivo reestruturar a atenção à saúde mental (diminuindo o papel da internação psiquiátrica como principal forma de intervenção, e focando em procedimentos que visassem à integração do paciente à comunidade)."
				+ "Considerando as premissas da Reforma Psiquiátrica, o acompanhante terapêutico apareceu como uma forma de promover a inclusão social, e prevenir a piora gradual da doença, diminuindo a autonomia do paciente (processo conhecido como cronificação) e a institucionalização (a permanência continuada em instituições de saúde mental) (Carniel & Pedrão, 2010). No Brasil, o início desse tipo de atuação começou nas comunidades terapêuticas, nas quais os ATs - geralmente jovens universitários do curso de enfermagem - promoviam atividades cotidianas e recreativas, e posteriormente, com a diminuição das comunidades terapêuticas, passaram a atuar no contexto residencial dos pacientes, entrando em contato com o cotidiano e universos familiares (Londero & Pacheco, 2006)."
				+ "A definição de Acompanhante Terapêutico encontra diversas propostas na literatura da saúde mental e da psicologia clínica. Dentro da Análise do Comportamento, o AT é definido “ora como o profissional que trabalha no ambiente onde as contingências mantenedoras dos comportamentos a serem alterados operam, ora como o auxiliar de um terapeuta comportamental ou de um psiquiatra ou, ainda, de uma equipe multidisciplinar” (Guerrelas, 2007, p. 34). Ou seja, o AT pode ser:"
				+ "o profissional cuja atuação está diretamente e unicamente relacionada com o contexto natural do cliente (em casa, no trabalho, na escola, etc);"
				+ "uma parte de um processo clínico que é baseado em consultório, como na obtenção de dados por meio de observação direta a serem utilizados na terapia em consultório;"
				+ "uma extensão da intervenção.");

		postList.add(post1);

		for (Post post : postList) {
			Post postSaved = CodeblogRepository.save(post);
			System.out.println(postSaved.getId());
		}
	}
}
