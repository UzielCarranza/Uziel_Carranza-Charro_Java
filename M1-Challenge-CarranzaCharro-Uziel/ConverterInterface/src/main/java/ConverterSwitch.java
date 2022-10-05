public class ConverterSwitch implements Converter {
    @Override
    public String convertMonth(int monthNumber) {
//        Team Activity with Munkhnaran Davaasuren and Sydney Mercier
        String monthToReturn;
        switch (monthNumber) {
            case 1:
                monthToReturn = "January";
                break;
            case 2:
                monthToReturn = "February";
                break;
            case 3:
                monthToReturn = "March";
                break;
            case 4:
                monthToReturn = "April";
                break;
            case 5:
                monthToReturn = "May";
                break;
            case 6:
                monthToReturn = "June";
                break;
            case 7:
                monthToReturn = "July";
                break;
            case 8:
                monthToReturn = "August";
                break;
            case 9:
                monthToReturn = "September";
                break;
            case 10:
                monthToReturn = "October";
                break;
            case 11:
                monthToReturn = "November";
                break;
            case 12:
                monthToReturn = "December";
                break;
            default:

                monthToReturn = "No month available for that number";
        }
        return monthToReturn;
    }

    @Override
    public String convertDay(int dayNumber) {
//        Team Activity with Munkhnaran Davaasuren and Sydney Mercier
        String dayToReturn;
        switch (dayNumber) {
            case 1:
                dayToReturn = "Monday";
                break;
            case 2:
                dayToReturn = "Tuesday";
                break;
            case 3:
                dayToReturn = "Wednesday";
                break;
            case 4:
                dayToReturn = "Thursday";
                break;
            case 5:
                dayToReturn = "Friday";
                break;
            case 6:
                dayToReturn = "Saturday";
                break;
            case 7:
                dayToReturn = "Sunday";
                break;
            default:

                dayToReturn = "No day available for that number";
        }
        return dayToReturn;
    }
}
