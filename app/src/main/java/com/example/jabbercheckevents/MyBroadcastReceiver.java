public class MyBroadcastReceiver extends BroadcastReceiver
{
    @Override
    public void onReceive(Context context, Intent intent)
    {
        String data = intent.getStringExtra("data");
        Log.i("BR" ,"Data received:  " + data);
    }
}