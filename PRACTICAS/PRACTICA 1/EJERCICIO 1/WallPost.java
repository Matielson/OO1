package ar.edu.unlp.oo1.ejercicio1;

public class WallPost {
	
	String texto;
	int cantLikes;
	boolean destacado;
	
	public WallPost () {
		this.texto = "Undefined post";
		this.cantLikes = 0;
		this.destacado = false;
	}

	public String getText() {
		return this.texto;
	};

	public void setText(String text) {
		this.texto = text;
	};

	public int getLikes() {
		return this.cantLikes;
	};

	public void like() {
		this.cantLikes++;
	};

	public void dislike() {
		if (this.cantLikes > 0) {
			this.cantLikes--;
		}
	};

	public boolean isFeatured() {
		return this.destacado;
	};

	public void toggleFeatured() {
		if (this.destacado) {
			this.destacado = false;
		}
		else {
			this.destacado = true;
		}
	};

	@Override
	public String toString() {
		return "WallPost {" +
			"text: " + getText() +
			", likes: '" + getLikes() + "'" +
			", featured: '" + isFeatured() + "'" +
			"}";
	}

}