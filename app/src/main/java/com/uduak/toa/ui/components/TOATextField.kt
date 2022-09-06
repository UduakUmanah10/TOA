package com.uduak.toa.ui.components

import android.content.res.Configuration
import android.content.res.Resources
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.tooling.preview.Preview
import com.uduak.toa.R
import com.uduak.toa.ui.theme.ButtonShape
import com.uduak.toa.ui.theme.TOATheme
import com.uduak.toa.ui.theme.TextFieldShape

/*
* this is a custom implementation of a text field to ensure that it has the TOA
* branding and styling that we expect
* @param[text] the current text inside the input
* @param[onText changed] A call ack invoked whenever user modifies the text inside input
* @param[label Text ] the label that shows above the input
* @param [modifier] an optional [Modifier] to configure components
* */

@Composable
fun TOATEXTField(
    text: String,
    onTextChanged: (String)-> Unit,
    labelText:String,
    modifier: Modifier =Modifier,
){
    OutlinedTextField(
        value = text,
        onValueChange = onTextChanged,
        label ={ Text(text = labelText) },
        shape = TextFieldShape,
        modifier = modifier
            .heightIn(dimensionResource(id = R.dimen.button_height))
            .fillMaxWidth(),
    )

}


