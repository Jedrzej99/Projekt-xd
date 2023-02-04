class Contractor {
    public int id;
    public String name;
    public double hourlyRate;
    public double accuracy;
    public double reliability;

    public Contractor(int id, String name, double hourlyRate, double accuracy, double reliability) {
        this.id = id;
        this.name = name;
        this.hourlyRate = hourlyRate;
        this.accuracy = accuracy;
        this.reliability = reliability;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public double getAccuracy() {
        return accuracy;
    }
}