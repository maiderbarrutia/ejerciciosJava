package ej03_proyectoJavaLibro;

public class Libro {
	private String isbn;
	private String autor;
	private String titulo;
	private int anioPublicacion;
	private String editorial;
	private int numeroPaginas;
	
	public Libro(String isbn, String autor, String titulo, int anioPublicacion, String editorial, int numeroPaginas) {
		this.isbn = isbn;
		this.autor = autor;
		this.titulo = titulo;
		this.anioPublicacion= anioPublicacion;
		this.editorial= editorial;
		this.numeroPaginas= numeroPaginas;
	
	
	}

	public String getIsbn() {
		return isbn;
	}

	public String getAutor() {
		return autor;
	}

	public String getTitulo() {
		return titulo;
	}

	public int getAnioPublicacion() {
		return anioPublicacion;
	}

	public String getEditorial() {
		return editorial;
	}

	public int getNumeroPaginas() {
		return numeroPaginas;
	}
	
	public void mostrarDatos() {
		System.out.println("ISBN: "+this.getIsbn());
		System.out.println("Autor: "+this.getAutor());
		System.out.println("Titulo: "+this.getTitulo());
		System.out.println("Año de publicación: "+this.getAnioPublicacion());
		System.out.println("Editorial: "+this.getEditorial());
		System.out.println("Número de páginas: "+this.getNumeroPaginas());
	}
}
