package moreno.cazalilla.jesusmaria.t2;

public class Personaje {
    String name;
    String description;
    String ability;
    int photoId;

    public Personaje(String name, String description, String ability, int photoId) {
        this.name = name;
        this.description = description;
        this.ability = ability;
        this.photoId = photoId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAbility() {
        return ability;
    }

    public void setAbility(String ability) {
        this.ability = ability;
    }

    public int getPhotoId() {
        return photoId;
    }

    public void setPhotoId(int photoId) {
        this.photoId = photoId;
    }
}
