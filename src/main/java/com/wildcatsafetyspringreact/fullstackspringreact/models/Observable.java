package com.wildcatsafetyspringreact.fullstackspringreact.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.HashSet;
import java.util.Set;



@Document(collection = "observables")
public class Observable {

    @Id
    private String _id;

    @NotBlank
    @Size(max = 20)
    private String submittedBy;

    @NotBlank
    @Size(max = 20)
    private String locationOrArea;

    @NotBlank
    @Size(max = 20)
    private String observationDate;

    @NotBlank
    @Size(max = 20)
    @Email
    private String department;

    @NotBlank
    @Size(max = 120)
    private String responsibleSupervisor;

    @DBRef
    private Set<Role> roles = new HashSet<>();

    public Observable(String _id, String submittedBy, String locationOrArea, String observationDate, String department, String responsibleSupervisor) {
        this._id = _id;
        this.submittedBy = submittedBy;
        this.locationOrArea = locationOrArea;
        this.observationDate = observationDate;
        this.department = department;
        this.responsibleSupervisor = responsibleSupervisor;
    }
    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getSubmittedBy() {
        return submittedBy;
    }

    public void setSubmittedBy(String submittedBy) {
        this.submittedBy = submittedBy;
    }

    public String getLocationOrArea() {
        return locationOrArea;
    }

    public void setLocationOrArea(String locationOrArea) {
        this.locationOrArea = locationOrArea;
    }

    public String getObservationDate() {
        return observationDate;
    }

    public void setObservationDate(String observationDate) {
        this.observationDate = observationDate;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getResponsibleSupervisor() {
        return responsibleSupervisor;
    }

    public void setResponsibleSupervisor(String responsibleSupervisor) {
        this.responsibleSupervisor = responsibleSupervisor;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }
}

