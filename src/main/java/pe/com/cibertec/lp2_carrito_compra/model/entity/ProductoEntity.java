package pe.com.cibertec.lp2_carrito_compra.model.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Table(name = "tb_producto")
public class ProductoEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer productoId;
	
	@Column(name = "Nombre Producto")
	private String nombre;
	
	@Column(name = "precio")
	private Double precio;
	
	@Column(name = "stock")
	private Integer stock;
	
	@Column(name = "Categoria")
	private String categoria ;
	
}
