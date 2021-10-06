package br.com.fiap.challenge.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
@Entity
public class Comerciante {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "{comerciante.title.blank}")
	private String title;
	
	@Size(min=15, message = "A descrição deve ter pelo menos 15 caracteres")
	private String description;
	
	@Min(value=10, message = "A pontuação mínima é 10")
	@Max(value=500, message = "A pontuação máxima é 500")
	private int points;
	

}
