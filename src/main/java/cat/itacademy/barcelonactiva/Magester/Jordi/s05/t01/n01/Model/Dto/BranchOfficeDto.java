package cat.itacademy.barcelonactiva.Magester.Jordi.s05.t01.n01.Model.Dto;

import lombok.*;

import java.util.Arrays;
import java.util.List;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class BranchOfficeDto {

    @ToString.Exclude
    private List<String> euCountries = Arrays.asList(
            "Germany", "Austria", "Belgium", "Bulgaria", "Cyprus", "Croatia", "Denmark",
            "Slovakia", "Slovenia", "Spain", "Estonia", "Finland", "France", "Greece",
            "Hungary", "Ireland", "Italy", "Latvia", "Lithuania", "Luxembourg", "Malta",
            "Netherlands", "Poland", "Portugal", "Czech Republic", "Romania", "Sweden");

    private Integer pk_ID;

    private String name;

    private String country;

    private String type;

    public BranchOfficeDto(String name, String country){
        this.name = name;
        this.country = country;

        if(euCountries.contains(country)){
            this.type = "EU";
        }else{
            this.type = "OUTSIDE_EU";
        }
    }
    public BranchOfficeDto(Integer pk_ID, String name, String country){
        this.pk_ID=pk_ID;
        this.name = name;
        this.country = country;

        if(euCountries.contains(country)){
            this.type = "EU";
        }else{
            this.type = "OUTSIDE_EU";
        }
    }

    public void setCountry(String country){
        this.country=country;
        if(euCountries.contains(country)){
            this.type = "EU";
        }else{
            this.type = "OUTSIDE_EU";
        }
    }

}
