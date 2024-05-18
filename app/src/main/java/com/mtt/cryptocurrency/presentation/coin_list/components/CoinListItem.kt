package com.mtt.cryptocurrency.presentation.coin_list.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import com.mtt.cryptocurrency.domain.models.Coin
import com.mtt.cryptocurrency.presentation.ui.theme.onPrimaryLight

@Composable
fun CoinListItem(
    coin: Coin,
    onItemClick: (Coin) -> Unit
) {
    Card(
        modifier = Modifier.padding(start = 10.dp, end = 10.dp, top = 5.dp, bottom = 5.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 5.dp),
        colors = CardDefaults.cardColors(containerColor = onPrimaryLight),
        shape = RoundedCornerShape(2.dp)
    ) {
        Row(modifier = Modifier
            .fillMaxWidth()
            .clickable {
                onItemClick(coin)
            }
            .padding(20.dp)) {
            Text(
                text = "${coin.rank}. ${coin.name}  (${coin.symbol})",
                style = MaterialTheme.typography.bodyMedium,
                overflow = TextOverflow.Ellipsis, modifier = Modifier.weight(0.7f),
                fontFamily = FontFamily.Serif
            )
            Text(
                text = if (coin.isActive) "Active" else "Inactive",
                color = if (coin.isActive) Color.Green else Color.Red,
                fontStyle = FontStyle.Italic,
                textAlign = TextAlign.End,
                style = MaterialTheme.typography.bodySmall,
                overflow = TextOverflow.Ellipsis,
                modifier = Modifier
                    .align(Alignment.CenterVertically)
                    .weight(0.3f)
            )
        }
    }

}