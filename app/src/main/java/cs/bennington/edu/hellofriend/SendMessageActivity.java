package cs.bennington.edu.hellofriend;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothManager;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.bluetooth.BluetoothGatt;


public class SendMessageActivity extends ActionBarActivity {

    //final static String Message = "Hello Friend";
    //private field for commuting the message to UUID
    //private BluetoothGatt btGatt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_message);

    }

    /*
    public void onFindingDevice(){
        //connecting
    }

    public void onReceivingMessage(){
        //receiving a message
    }
    */




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_bluetooth_enabled, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }


    public void sendMessage(View view) {
        //send message via BLE
        return;

    }
}
