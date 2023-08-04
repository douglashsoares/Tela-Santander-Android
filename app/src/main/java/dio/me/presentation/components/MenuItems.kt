package dio.me.presentation.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import dio.me.data.mock.Mocks.featureList
import dio.me.data.model.Feature
import dio.me.presentation.theme.SantanderDevWeekTheme
import dio.me.presentation.theme.Spacing_1
import dio.me.presentation.theme.Spacing_2

@Composable
fun MenuItems(
    modifier: Modifier = Modifier,
    features: List<Feature> = emptyList()
) {
    LazyRow(
        modifier = Modifier,
        horizontalArrangement = Arrangement.spacedBy(Spacing_2)
    ) {
        items(features) { features ->
            AppCard(
                modifier.size(width = 110.dp, height = 96.dp)
            ) {
                Column(
                    modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    SvgImage(
                        url = features.icon
                    )
                    Text(
                        text = features.description,
                        modifier.padding(top = Spacing_1)
                    )
                }
            }

        }
    }
}


@Preview
@Composable
fun MenuItemsPreview() {
    SantanderDevWeekTheme {
        MenuItems(features = featureList)
    }
}