/*
 * DO NOT MAKE ANY CHANGES UNLESS SPECIFIED OTHERWISE
 */

package Problem4;

public class MillionDollarMaker {
    static final int MONTHS_PER_YEAR = 12;   // what does "static" and "final" do?

    // Do not change signature (function name, parameter variable type, and return type)
    // OK to change parameter variable names. In fact, are the parameter names bad and why?
    public static CompoundingResult calculate(float initDeposit,
                                              float monthlyContribution,
                                              int lengthInYear,
                                              float interestRate) {

        CompoundingResult result = new CompoundingResult(); // which constructor does this call?

        float monthlyRate = interestRate / 100 / MONTHS_PER_YEAR;

        // Total number of compounding periods
        int totalPeriods = lengthInYear * MONTHS_PER_YEAR;

        float accumulated = initDeposit;
        float monthlyInterest;

        for (int i = 0; i < totalPeriods; i++) {
            // Calculate monthly interest
            monthlyInterest = accumulated * monthlyRate;

            // Add monthly contribution
            accumulated += monthlyContribution;

            // Add interest to accumulated amount
            accumulated += monthlyInterest;
        }

        result.setInvested(initDeposit + monthlyContribution * totalPeriods);
        result.setAccumulated(accumulated);

        return result;
    }
}