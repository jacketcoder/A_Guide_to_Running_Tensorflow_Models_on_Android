package mariannelinhares.mnistandroid;

import android.content.Intent;
import android.graphics.Bitmap;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.ByteArrayOutputStream;

public class MainActivity extends AppCompatActivity {

    private TextView btnCapture;
    public void btnClick(View view){
        Intent changeIntent=new Intent(MainActivity.this,cameraActivity.class);
        MainActivity.this.startActivity(changeIntent);
    }

//    static final int REQUEST_IMAGE_CAPTURE = 1;

//    private void dispatchTakePictureIntent() {
//        Intent takePictureIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
//        if (takePictureIntent.resolveActivity(getPackageManager()) != null) {
//            startActivityForResult(takePictureIntent, REQUEST_IMAGE_CAPTURE);
//        }
//    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnCapture=(TextView) findViewById(R.id.scanBtn);


        //viewButton=(Button)findViewById(R.id.viewBtn);
//       scanButton=(Button)findViewById(R.id.scanBtn);
//       // mImageView=(ImageView)findViewById(R.id.resultImageView);
//       /* viewButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//            }
//        });*/
//        scanButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                dispatchTakePictureIntent();
//
//
//            }
//        });
    }
//    @Override
//    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
//        if (requestCode == REQUEST_IMAGE_CAPTURE && resultCode == RESULT_OK) {
//            Bundle extras = data.getExtras();
//            Bitmap imageBitmap = (Bitmap) extras.get("data");
//           // mImageView.setImageBitmap(imageBitmap);
//            ByteArrayOutputStream bStream = new ByteArrayOutputStream();
//            imageBitmap.compress(Bitmap.CompressFormat.PNG, 100, bStream);
//            byte[] byteArray = bStream.toByteArray();
//            Intent imageIntent=new Intent(MainActivity.this,scanned.class);
//            imageIntent.putExtra("image",byteArray);
//            MainActivity.this.startActivity(imageIntent);
//
//        }
//    }



}
