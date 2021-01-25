package org.launchcode.java.demos.lsn4classes2;

public class Student {


    private static int nextStudentId = 1;
    private String name;
    private int studentId;
    private int numberOfCredits = 0;
    protected double gpa = 0.0;

    public Student(String name, int studentId, int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    public Student(String name, int studentId) {
        this(name, studentId, 0, 0);
    }

    public Student(String name) {
        this(name, nextStudentId);
        nextStudentId++;
    }

    public String studentInfo() {
        return (this.name + " has a GPA of: " + this.gpa);
    }

    @Override
    public String toString() {
        return this.name+": " +this.gpa;
    }

    @Override
    public boolean equals(Object obj) {
        if ((obj instanceof Student) == false){
            return false;
        }
        Student myStudentObj = (Student) obj;
        if(myStudentObj.name.equals(this.name)){
            return true;
        }else{
            return false;
        }

    }

    //Getters and setters
    public String getName () {
        return name;
    }

    public int getStudentId () {
        return studentId;
    }

    public int getNumberOfCredits () {
        return numberOfCredits;
    }

    public double getGpa () {
        return gpa;
    }

    public void setName (String name){
        this.name = name;
    }

    public void setStudentId ( int studentId){
        this.studentId = studentId;
    }

    public void setGpa (double gpa){
        this.gpa = gpa;
    }

    private void setNumberOfCredits (int numberOfCredits){
        this.numberOfCredits = numberOfCredits;
    }


    //TODO: Uncomment and complete the getGradeLevel method here:
    public String getGradeLevel() {
        // Determine the grade level of the student based on numberOfCredits
        // Freshman (0-29 credits), Sophomore (30-59 credits), Junior (60-89 credits), or Senior (90+ credits)
        //returns the student’s level based on the number of credits they have earned
        if (this.numberOfCredits >= 0 && this.numberOfCredits <= 29) {
            return "Freshman";
        } else if (this.numberOfCredits >= 30 && this.numberOfCredits <= 59) {
            return "Sophomore ";
        } else if (this.numberOfCredits >= 60 && this.numberOfCredits <= 89) {
            return "Junior ";
        } else if (this.numberOfCredits >= 90) {
            return "Senior ";
        } else {
            return null;
        }
    }

        // TODO: Complete the addGrade method.
        public void addGrade( int courseCredits, double grade){
            // Update the appropriate fields: numberOfCredits, gpa

            //CURRENT total quality score by using the formula gpa * numberOfCredits
            double currentTotalQualityScore = this.gpa * this.numberOfCredits;

           // quality score = letter grade score (0.0-4.0) * the number of credits.
            double newQualityScore = grade * courseCredits;

           // Use the new course grade and course credits to update their total quality score
            double newTotalQualityScore =  currentTotalQualityScore + newQualityScore;

            //Update the student’s total numberOfCredits
            int newTotalNUmberOfCredits = this.numberOfCredits + courseCredits;
            this.numberOfCredits = newTotalNUmberOfCredits;

            //gpa = (total quality score) / (total number of credits)
            double newGpa = newQualityScore / newTotalNUmberOfCredits;
            this.gpa = newGpa;
        }

        // TODO: Add your custom 'toString' method here. Make sure it returns a well-formatted String rather
        //  than just the class fields.

        // TODO: Add your custom 'equals' method here. Consider which fields should match in order to call two
        //  Student objects equal.

    }

