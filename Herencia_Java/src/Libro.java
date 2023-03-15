
public class Libro {
	private double ISBN;
	private String titulo;
	private String autor;
	private int numPag;
	
	public Libro()
	{
		this.ISBN=1340901217;
		this.titulo=null;
		this.autor=null;
		this.numPag=30;
	}
	public Libro(double ISBN_new)
	{
		this.ISBN=ISBN_new;
	}
	public Libro(String title,String author,int nuPag)
	{
		this.titulo=title;
		this.autor=author;
		this.numPag=nuPag;
	}
}

