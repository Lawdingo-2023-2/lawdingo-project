package pe.edu.upc.aaw.lawdingo_g4.dtos;

import pe.edu.upc.aaw.lawdingo_g4.entities.rUsers;

import java.time.LocalDate;

public class ConsultationDTO {
    private int idConsultation;
    private String title;
    private LocalDate date;
    private String description;


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


}
