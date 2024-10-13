package com.example.quadrand

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.quadrand.ui.theme.QuadrandTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
          QuadrandTheme  {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                )
                {
                    exo()
                }

            }
        }
    }
}

@Composable
fun exo () {
    Column(
        modifier= Modifier
            .fillMaxSize()
            .padding(1.dp),

        )
    {
        Row (
            modifier = Modifier
                .weight(1f)
                .fillMaxWidth()
        )
        {


            Box(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .background(color = colorResource(R.color.white_purple)),
                contentAlignment = Alignment.Center
            ) {
                TextCompsable()
            }
            Box(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .background(color = colorResource(R.color.white_1)),
                contentAlignment = Alignment.Center
            ) {
                ImageCompsable()
            }
        }
        Row (
            modifier = Modifier
                .weight(1f)
                .fillMaxWidth()

        )
        {


            Box(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .background(color = colorResource(R.color.white_2)),
                contentAlignment = Alignment.Center
            ) {
                RowCompsable()
            }
            Box(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .background(color = colorResource(R.color.white_3)),
                contentAlignment = Alignment.Center
            ) {
                ColumnCompsable()
            }
        }


    }

}
@Composable
fun TextCompsable(){
    Column(horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text(text = stringResource(R.string.testcomp),
            textAlign = TextAlign.Justify,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .padding(16.dp),


            )
        Text(text = stringResource(R.string.textdisp)
            , textAlign = TextAlign.Justify)
    }
}
@Composable
fun ImageCompsable(){
    Column(horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text(text = stringResource(R.string.imacomp),
            textAlign = TextAlign.Justify,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .padding(16.dp),


            )
        Text(text = stringResource(R.string.imdisp)
            , textAlign = TextAlign.Justify)
    }
}
@Composable
fun RowCompsable(){
    Column(horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text(text = stringResource(R.string.rowcomp),
            textAlign = TextAlign.Justify,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .padding(16.dp)

        )
        Text(text = stringResource(R.string.rowdisp)
            , textAlign = TextAlign.Justify)
    }
}

@Composable
fun ColumnCompsable(){
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,

        ) {
        Text(text = stringResource(R.string.colcomp),
            textAlign = TextAlign.Justify,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .padding(16.dp)

        )

        Text(text = stringResource(R.string.coldisp)
            , textAlign = TextAlign.Justify
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    QuadrandTheme {
        exo()
    }
}