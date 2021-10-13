fun main(args: Array<String>) {

    // Input
    var CurrentSalary = 5000
    var EmployeeRating = 2

    // For Process
    var PercentRaise : Double
    var NewSalary : Int
    var Raise:  Double

    // Output
    if ( EmployeeRating == 1 ){
        PercentRaise = .06
        Raise = CurrentSalary * PercentRaise;
        NewSalary = (CurrentSalary + Raise).toInt()
        println("The Rating of employee is Excellent so the raise of salary will be $Raise and" +
                " the new salary will be $NewSalary ") }

    else if (EmployeeRating == 2 ) {
        PercentRaise = .04
        Raise = CurrentSalary * PercentRaise;
        NewSalary = (CurrentSalary + Raise).toInt()
        println("The Rating of employee is Good so the raise of salary will be $Raise and" +
                " the new salary will be $NewSalary ") }

    else if (EmployeeRating == 3 ) {
        PercentRaise = .02
        Raise = CurrentSalary * PercentRaise;
        NewSalary = (CurrentSalary + Raise).toInt()
        println("The Rating of employee is Poor so the raise of salary will be $Raise and" +
                " the new salary will be $NewSalary ") }
    }
