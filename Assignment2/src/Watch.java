import java.io.*;
import java.util.*;

public class Watch {
    ArrayList<String> statesSequence = new ArrayList<String>();
    String buttonsPressed;

    public String getButtonsPressed() {
        return buttonsPressed;
    }

    public void setButtonsPressed(String myInput) {
        this.buttonsPressed = myInput;
    }

    public void watchOperations() throws IOException {
        String myInput = getButtonsPressed();


        if (myInput.length() == 0) {
            File file = new File("ResultingStates.txt");
            FileOutputStream fos = new FileOutputStream(file);
            PrintWriter writer = new PrintWriter(fos);
            statesSequence.add("Your Input is empty");
            writer.write(String.valueOf(statesSequence));
            writer.flush();
            fos.close();
            writer.close();
        }

        else {
            File file = new File("ResultingStates.txt");
            FileOutputStream fos = new FileOutputStream(file);
            PrintWriter writer = new PrintWriter(fos);

            String state = "Normal Display";
            String innerState = "Time";
            int minutes = 0, hours = 0, days = 1, months = 1, years = 2000;
            myInput.toLowerCase();
            for (int i = 0; i < myInput.length(); i++) {
                char currentChar = myInput.charAt(i);
                switch (state) {
                    case "Normal Display":
                        if (currentChar == 'c') {
                            state = "Update";
                            innerState = "min";
                        }

                        if (currentChar == 'b') {
                            state = "Alarm";
                            innerState = "Alarm";
                        }

                        if (currentChar == 'a') {
                            if (innerState == "Time") {
                                innerState = "Date";
                            } else {
                                innerState = "Time";
                            }
                        }

                        if (currentChar == 'd') {
                            statesSequence.add("No action in this state with input d");
                        }
                        break;

                    case "Alarm":
                        if (currentChar == 'a') {
                            if (innerState == "Alarm") {
                                innerState = "Chime";
                            }
                        }

                        if (currentChar == 'b') {
                            statesSequence.add("No action in this state with input b");
                        }

                        if (currentChar == 'c') {
                            statesSequence.add("No action in this state with input c");
                        }

                        if (currentChar == 'd') {
                            state = "Normal Display";
                            innerState = "Time";
                        }
                        break;

                    case "Update":

                        if (currentChar == 'a') {
                            switch (innerState) {
                                case "min":
                                    innerState = "hour";
                                    break;
                                case "hour":
                                    innerState = "day";
                                    break;
                                case "day":
                                    innerState = "month";
                                    break;
                                case "month":
                                    innerState = "year";
                                    break;
                                case "year":
                                    state = "Normal Display";
                                    innerState = "Time";
                                    break;
                            }
                        }

                        if (currentChar == 'b') {
                            switch (innerState) {
                                case "min":
                                    minutes++;
                                    if (minutes == 60) {
                                        minutes = 0;
                                        hours++;
                                        if (hours == 24) {
                                            hours = 0;
                                            days++;
                                            if (days == 31) {
                                                days = 1;
                                                months++;
                                                if (months == 13) {
                                                    months = 1;
                                                    years++;
                                                }
                                            }

                                        }
                                    }
                                case "hour":
                                    hours++;
                                    if (hours == 24) {
                                        hours = 0;
                                        days++;
                                        if (days == 31) {
                                            days = 1;
                                            months++;
                                            if (months == 13) {
                                                months = 1;
                                                years++;
                                            }
                                        }

                                    }
                                case "day":
                                    days++;
                                    if (days == 31) {
                                        days = 1;
                                        months++;
                                        if (months == 13) {
                                            months = 1;
                                            years++;
                                        }
                                    }
                                case "month":
                                    months++;
                                    if (months == 13) {
                                        months = 1;
                                        years++;
                                    }
                                case "year":
                                    years++;

                            }
                        }

                        if (currentChar == 'c') {
                            statesSequence.add("No action in this state with input c");

                        }

                        if (currentChar == 'd') {
                            state = "Normal Display";
                            innerState = "Time";
                        }
                        break;

                }

                statesSequence.add("Current State is : " + state);
                statesSequence.add("Current innerState is : " + innerState);
                statesSequence.add("DATE: " + years + " - " + months + " - " + days);
                statesSequence.add("TIME: " + hours + " : " + minutes);


            }

            System.out.println(statesSequence);
            writer.write(String.valueOf(statesSequence));
            writer.flush();
            writer.close();
            writer.close();
        }
    }

}