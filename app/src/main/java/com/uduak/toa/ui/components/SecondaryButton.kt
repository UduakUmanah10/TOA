package com.uduak.toa.ui.components



import android.content.res.Configuration
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.ButtonDefaults.buttonColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.text.intl.Locale
import androidx.compose.ui.text.toUpperCase
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.uduak.toa.R
import com.uduak.toa.ui.theme.ButtonShape
import com.uduak.toa.ui.theme.TOATheme



@Composable
fun SecondaryButton(
    modifier: Modifier = Modifier,
    text:String,
    onClick:()->Unit,
){
    TextButton(
        onClick = onClick,
        shape = ButtonShape,
        modifier = modifier
            .height(dimensionResource(id = R.dimen.button_height))
            .fillMaxWidth(),
    ) {
        Text(text= text.toUpperCase(Locale.current),

        )
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
        Surface {
            SecondaryButton(
                text = "Secondary Button",
                onClick = {}
            )
        }


    }

}
