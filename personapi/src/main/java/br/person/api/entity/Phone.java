package br.person.api.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import br.person.api.enums.PhoneType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Phone {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private PhoneType type;
  private String number;

}
