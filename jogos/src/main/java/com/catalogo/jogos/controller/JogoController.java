// Arquivo: JogoController.java
package com.catalogo.jogos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import com.catalogo.jogos.model.Jogo;
import com.catalogo.jogos.repository.JogoRepository;

@Controller
public class JogoController {

	@Autowired
	private JogoRepository jogoRepository;

	@GetMapping("/menu")
	public String menu() {
		return "menu";
	}

	@GetMapping("/cadastro")
	public String mostrarFormularioCadastro(Model model) {
		model.addAttribute("jogo", new Jogo());
		return "cadastro";
	}

	@PostMapping("/cadastro")
	public String cadastrarJogo(Jogo jogo) {
		jogoRepository.save(jogo);
		return "redirect:/catalogo";
	}

	@GetMapping("/catalogo")
	public String listarJogos(Model model) {
		model.addAttribute("jogos", jogoRepository.findAll());
		return "catalogo";
	}

	@GetMapping("/editar/{id}")
	public String mostrarFormularioEdicao(@PathVariable Long id, Model model) {
		Jogo jogo = jogoRepository.findById(id).orElse(null);
		model.addAttribute("jogo", jogo);
		return "editar";
	}

	@PostMapping("/editar/{id}")
	public String editarJogo(@PathVariable Long id, Jogo jogo) {
		jogo.setId(id);
		jogoRepository.save(jogo);
		return "redirect:/catalogo";
	}

	@GetMapping("/deletar/{id}")
	public String deletarJogo(@PathVariable Long id) {
		jogoRepository.deleteById(id);
		return "redirect:/catalogo";
	}

}