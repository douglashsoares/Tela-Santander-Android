package dio.me.presentation.components

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import dio.me.presentation.theme.SantanderDevWeekTheme

@Composable
fun CreditCard(
    modifier: Modifier = Modifier,
    number: String = ""
) {
    AppCard(containerColor = MaterialTheme.colorScheme.primary) {

    }


}


@Preview
@Composable
fun CreditCardPreview() {
    SantanderDevWeekTheme {
        CreditCard( number = "0000")
    }
}