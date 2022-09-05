package com.uduak.toa.ui.components

import android.content.res.Configuration
import androidx.compose.foundation.layout.height
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults.buttonColors
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.uduak.toa.ui.theme.TOATheme



@Composable
fun PrimaryButton(
    modifier: Modifier = Modifier,
    text:String,
    onClick:()->Unit,
    color: Color = MaterialTheme.colors.primary
){
    val buttonColors= buttonColors(
        backgroundColor = color,
        )

    Button(
        onClick = onClick,
        modifier = modifier
            .height(48.dp),
        colors =buttonColors

    ) {
        Text(text="Button")
    }

}





@Preview(
    name ="Night Mode",
    uiMode =  Configuration.UI_MODE_NIGHT_YES
)
@Preview(
    name ="Day Mode",
    uiMode =  Configuration.UI_MODE_NIGHT_NO
)

@Composable
private  fun PrimaryButtonPreview(){
    TOATheme{
        PrimaryButton(
            text= "primary Button",
            onClick = {}
        )

    }

}
