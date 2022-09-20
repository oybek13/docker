package com.example.licenseserivce.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.hateoas.RepresentationModel;

/**
 * Created by Oybek Karimjanov
 * Date : 9.16.2022
 * Project Name : licenseserivce
 */
@Getter
@Setter
@ToString
public class License extends RepresentationModel<License> {
    private int id;
    private String licenseId;
    private String description;
    private String organizationId;
    private String productName;
    private String licenseType;
}
