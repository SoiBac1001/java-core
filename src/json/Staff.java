package json;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

public class Staff {
    @JsonView(CompanyViews.Normal.class)
    private String name;

    @JsonView(CompanyViews.Normal.class)
    private int age;

    // two views
    @JsonView({CompanyViews.HR.class, CompanyViews.Manager.class})
    private String[] position;

    @JsonView(CompanyViews.Manager.class)
    private List<String> skills;

    @JsonView(CompanyViews.HR.class)
    private Map<String, BigDecimal> salary;

    // getters , setters , boring stuff
}
