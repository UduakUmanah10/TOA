package com.uduak.toa.ui.components

import android.content.res.Configuration
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults.buttonColors
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
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

/*
* this is a custom [Button] tha provides the shape and styling expected
* in the TOA application
* @param [text] the text inside the button
* @param [onClick] A callBack invoked when the user clicks the button
* @param[modifier]  an optional [Modifier] to configure this component
* @param [backgroundColor] the color of the button in enabled state
* */

@Composable
fun PrimaryButton(
    modifier: Modifier = Modifier,
    text:String,
    onClick:()->Unit,
    BackgroundColor: Color = MaterialTheme.colors.primary,
){
    val buttonColors= buttonColors(
        backgroundColor = BackgroundColor,
        )

    Button(
        onClick = onClick,
        shape = ButtonShape,
        modifier = modifier
            .height(dimensionResource(id = R.dimen.button_height))
            .fillMaxWidth(),
        colors = buttonColors

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
        PrimaryButton(
            text = "primary Button",
            onClick = {}
        )

    }

}
