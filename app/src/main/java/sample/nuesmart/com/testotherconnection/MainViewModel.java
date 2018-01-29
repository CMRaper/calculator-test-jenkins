package sample.nuesmart.com.testotherconnection;

import android.databinding.ObservableField;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;

/**
 * Created by ROG on 29/01/2018.
 */

public class MainViewModel {
    public final ObservableField<String> firstNumber = new ObservableField<>();
    public final ObservableField<String> secondNumber = new ObservableField<>();
    public final ObservableField<String> result = new ObservableField<>();

    private Calculator calculator = new Calculator();

    public TextWatcher onFirstNumberTextChanged(){
        return new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                firstNumber.set(s.toString());
            }
        };
    }

    public TextWatcher onSecondNumberTextChanged(){
        return new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                secondNumber.set(s.toString());
            }
        };
    }

    public View.OnClickListener onCalculateButtonTapped(){
        return (v) -> calculate();
    }

    private void calculate(){
        int first = Integer.parseInt(firstNumber.get());
        int second = Integer.parseInt(secondNumber.get());

        int res = calculator.add(first, second);
        result.set(String.valueOf(res));
    }
}
