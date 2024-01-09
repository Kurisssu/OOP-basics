public abstract class Projects {
    private String name;
    private String purpose; // Goal
    private Integer numberOfWorkers; // number of workers responsible for the project budget, etc.
    private Integer workedHours; // number of hours worked by person
    public Projects(String name, String purpose, Integer numberOfWorkers, Integer workedHours) {
        this.name = name;
        this.purpose = purpose;
        this.numberOfWorkers = numberOfWorkers;
        this.workedHours = workedHours;
    }

    public abstract Integer totalWorkedHours();

    public String getName() {
        return name;
    }

    public String getPurpose() {
        return purpose;
    }

    public Integer getNumberOfWorkers() {
        return numberOfWorkers;
    }

    public Integer getWorkedHours() {
        return workedHours;
    }
}