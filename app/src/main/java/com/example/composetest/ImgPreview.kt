package com.example.composetest

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.BlendMode
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)
@Composable
fun 图片() {
    Image(painter = painterResource(R.drawable.img_example), contentDescription = "")
}

@Preview(showBackground = true)
@Composable
fun 居中位置() {
    Image(
        painter = painterResource(R.drawable.img_example),
        contentDescription = "",
        modifier = Modifier
            .width(200.dp)
            .height(100.dp),
        alignment = Alignment.Center
    )
}

@Preview(showBackground = true)
@Composable
fun 纵横比() {
    Column(
        modifier = Modifier
            .width(300.dp)
            .height(300.dp)
    ) {
        Row(
            modifier = Modifier
                .width(300.dp)
                .height(100.dp)
        ) {
            Image(
                painter = painterResource(R.drawable.img_example),
                contentDescription = "",
                modifier = Modifier
                    .width(100.dp)
                    .height(100.dp)
                    .background(Color.Red),
                contentScale = ContentScale.None
            )
            Image(
                painter = painterResource(R.drawable.img_example),
                contentDescription = "",
                modifier = Modifier
                    .width(100.dp)
                    .height(100.dp)
                    .background(Color.Cyan),
                contentScale = ContentScale.FillWidth
            )
            Image(
                painter = painterResource(R.drawable.img_example),
                contentDescription = "",
                modifier = Modifier
                    .width(100.dp)
                    .height(100.dp)
                    .background(Color.Blue),
                contentScale = ContentScale.FillHeight
            )

        }
        Row(
            modifier = Modifier
                .width(300.dp)
                .height(100.dp)
        ) {
            Image(
                painter = painterResource(R.drawable.img_example),
                contentDescription = "",
                modifier = Modifier
                    .width(100.dp)
                    .height(100.dp)
                    .background(Color.Cyan),
                contentScale = ContentScale.FillBounds
            )
            Image(
                painter = painterResource(R.drawable.img_example),
                contentDescription = "",
                modifier = Modifier
                    .width(100.dp)
                    .height(100.dp)
                    .background(Color.Blue),
                contentScale = ContentScale.Fit
            )
            Image(
                painter = painterResource(R.drawable.img_example),
                contentDescription = "",
                modifier = Modifier
                    .width(100.dp)
                    .height(100.dp)
                    .background(Color.Green),
                contentScale = ContentScale.Inside
            )

        }
        Row(
            modifier = Modifier
                .width(300.dp)
                .height(100.dp)
        ) {
            Image(
                painter = painterResource(R.drawable.img_example),
                contentDescription = "",
                modifier = Modifier
                    .width(100.dp)
                    .height(100.dp)
                    .background(Color.Yellow),
                contentScale = ContentScale.Crop
            )
        }

    }

}


@Preview(showBackground = true)
@Composable
fun 透明度() {
    Image(
        painter = painterResource(R.drawable.img_example),
        contentDescription = "",
        modifier = Modifier
            .width(100.dp)
            .height(100.dp),
        alpha = 0.6f
    )
}

@Preview(showBackground = true)
@Composable
fun 颜色筛选() {
    Image(
        painter = painterResource(R.drawable.icon_clear_n),
        contentDescription = "",
        modifier = Modifier
            .width(100.dp)
            .height(100.dp),
        colorFilter = ColorFilter.tint(Color.Magenta, blendMode = BlendMode.SrcAtop)
    )
}
