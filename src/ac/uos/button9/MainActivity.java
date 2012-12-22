package ac.uos.button9;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

	TextView textView;
	boolean isStarted = false;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		textView = (TextView) findViewById(R.id.Edit1);

		Button button1 = (Button) findViewById(R.id.button1);
		Button button2 = (Button) findViewById(R.id.button2);
		Button button3 = (Button) findViewById(R.id.button3);
		Button button4 = (Button) findViewById(R.id.button4);
		Button button5 = (Button) findViewById(R.id.button5);
		Button button6 = (Button) findViewById(R.id.button6);
		Button button7 = (Button) findViewById(R.id.button7);
		Button button8 = (Button) findViewById(R.id.button8);
		Button button9 = (Button) findViewById(R.id.button9);
		Button button0 = (Button) findViewById(R.id.button0);
		Button buttonPlus = (Button) findViewById(R.id.buttonPlus);
		Button buttonEqual = (Button) findViewById(R.id.buttonEqual);

		button1.setOnClickListener(listener);
		button2.setOnClickListener(listener);
		button3.setOnClickListener(listener);
		button4.setOnClickListener(listener);
		button5.setOnClickListener(listener);
		button6.setOnClickListener(listener);
		button7.setOnClickListener(listener);
		button8.setOnClickListener(listener);
		button9.setOnClickListener(listener);
		button0.setOnClickListener(listener);
		buttonPlus.setOnClickListener(listener);
		buttonEqual.setOnClickListener(listener);
	}

	Button.OnClickListener listener = new Button.OnClickListener() {
		// 이 리스너를 등록한 버튼이 눌려졌을때 실행되는 콜백 메소드
		public void onClick(View v) {

			switch (v.getId()) {

			case R.id.button1:
				checkMode();
				textView.setText(textView.getText() + "1");
				break;
			case R.id.button2:
				checkMode();
				textView.setText(textView.getText() + "2");
				break;
			case R.id.button3:
				checkMode();
				textView.setText(textView.getText() + "3");
				break;
			case R.id.button4:
				checkMode();
				textView.setText(textView.getText() + "4");
				break;
			case R.id.button5:
				checkMode();
				textView.setText(textView.getText() + "5");
				break;
			case R.id.button6:
				checkMode();
				textView.setText(textView.getText() + "6");
				break;
			case R.id.button7:
				checkMode();
				textView.setText(textView.getText() + "7");
				break;
			case R.id.button8:
				checkMode();
				textView.setText(textView.getText() + "8");
				break;
			case R.id.button9:
				checkMode();
				textView.setText(textView.getText() + "9");
				break;
			case R.id.button0:
				checkMode();
				textView.setText(textView.getText() + "0");
				break;
			case R.id.buttonPlus:
				checkMode();
				textView.setText(textView.getText() + "+");
				break;

			case R.id.buttonEqual:
				textView.setText(getResult());
				isStarted = false;
				break;

			}
		}
	};

	protected CharSequence getResult() {
		String text = textView.getText().toString();
		String[] array = text.split("\\+");
		int result = 0;
		for (int i = 0; i < array.length; i++) {
			result += Integer.parseInt(array[i]);
		}
		return String.valueOf(result);
	}

	public void checkMode() {
		if (!isStarted) {
			textView.setText("");
			isStarted = true;
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

}
