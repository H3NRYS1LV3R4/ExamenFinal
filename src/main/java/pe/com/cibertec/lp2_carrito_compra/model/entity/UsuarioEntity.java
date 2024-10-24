package pe.com.cibertec.lp2_carrito_compra.model.entity;


import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "tb_usuario")
@Getter
@Setter
@NoArgsConstructor
public class UsuarioEntity {

	@Id
	@Column(name = "correo", nullable = false, length = 60)
	private String correo;
	
	@Column(name = "password", nullable = false)
	private String password;
	
	@Column(name = "nombres", nullable = false)
	private String nombre;
	
	@Column(name = "apellidos", nullable = false)
	private String apellido;
	
	@Column(name = "fecha_nacimiento", nullable = false)
    private LocalDate fechaNacimiento;
	
	@Column(name = "url_imagen")
	private String urlImagen;
}
