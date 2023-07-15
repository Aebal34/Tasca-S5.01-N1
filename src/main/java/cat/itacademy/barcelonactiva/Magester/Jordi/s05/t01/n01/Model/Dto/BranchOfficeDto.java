package cat.itacademy.barcelonactiva.Magester.Jordi.s05.t01.n01.Model.Dto;

import java.util.Arrays;
import java.util.List;

public class BranchOfficeDto {

    private List<String> euCountries = Arrays.asList(
            "Germany", "Austria", "Belgium", "Bulgaria", "Cyprus", "Croatia", "Denmark",
            "Slovakia", "Slovenia", "Spain", "Estonia", "Finland", "France", "Greece",
            "Hungary", "Ireland", "Italy", "Latvia", "Lithuania", "Luxembourg", "Malta",
            "Netherlands", "Poland", "Portugal", "Czech Republic", "Romania", "Sweden");

    private Integer pk_ID;

    private String name;

    private String country;

    private String type;

}
