package pe.edu.upc.aaw.lawdingo_g4.dtos;


import pe.edu.upc.aaw.lawdingo_g4.entities.Consultation;

import java.time.LocalDate;

public class CategoryDTO {
<<<<<<< HEAD
    private int idCategory;
    private String name;

    public int getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(int idCategory) {
        this.idCategory = idCategory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
=======
    private int idConsultation;
    private String title;
    private LocalDate date;
    private String description;
    private Consultation consultation;

    public int getIdConsultation() {
        return idConsultation;
    }

    public void setIdConsultation(int idConsultation) {
        this.idConsultation = idConsultation;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Consultation getConsultation() {
        return consultation;
    }

    public void setConsultation(Consultation consultation) {
        this.consultation = consultation;
>>>>>>> parent of eade7df (intento de Web Deployment)
    }
}
