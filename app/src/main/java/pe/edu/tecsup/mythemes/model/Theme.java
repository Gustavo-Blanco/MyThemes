package pe.edu.tecsup.mythemes.model;

public class Theme {
    private int image;
    private String theme;
    private String title;
    private String rating;
    private String description;

    public Theme(int image, String theme, String title, String rating, String description) {
        this.image = image;
        this.theme = theme;
        this.title = title;
        this.rating = rating;
        this.description = description;
    }

    public Theme() {
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


}
