package com.example.composetest

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Preview(showBackground = true)
@Composable
fun 文本内容() {
    Text(text = "邮箱 yuanweiwork@126.com")
}

@Preview(showBackground = true)
@Composable
fun 文本颜色() {
    Text(text = "邮箱 yuanweiwork@126.com", color = Color.Cyan)
}

@Preview(showBackground = true)
@Composable
fun 字体大小() {
    Text(text = "邮箱 yuanweiwork@126.com", fontSize = 12.sp)
}

@Preview(showBackground = true)
@Composable
fun 斜体正常() {
    Column {
        Text(text = "邮箱 yuanweiwork@126.com", fontStyle = FontStyle.Italic)
        Text(text = "邮箱 yuanweiwork@126.com", fontStyle = FontStyle.Normal)
    }
}

@Preview(showBackground = true)
@Composable
fun 字体粗细() {
    Column {
        Text(text = "邮箱 yuanweiwork@126.com", fontWeight = FontWeight.Normal)
        Text(text = "邮箱 yuanweiwork@126.com", fontWeight = FontWeight.Light)
        Text(text = "邮箱 yuanweiwork@126.com", fontWeight = FontWeight.Black)
        Text(text = "邮箱 yuanweiwork@126.com", fontWeight = FontWeight.Bold)
        Text(text = "邮箱 yuanweiwork@126.com", fontWeight = FontWeight.ExtraBold)
        Text(text = "邮箱 yuanweiwork@126.com", fontWeight = FontWeight.ExtraLight)
        Text(text = "邮箱 yuanweiwork@126.com", fontWeight = FontWeight.SemiBold)
        Text(text = "邮箱 yuanweiwork@126.com", fontWeight = FontWeight.Medium)
        Text(text = "邮箱 yuanweiwork@126.com", fontWeight = FontWeight.Thin)
    }
}

@Preview(showBackground = true)
@Composable
fun 字体样式() {
    Column {
        Text(text = "邮箱 yuanweiwork@126.com", fontFamily = FontFamily.Cursive)
        Text(text = "邮箱 yuanweiwork@126.com", fontFamily = FontFamily.Default)
        Text(text = "邮箱 yuanweiwork@126.com", fontFamily = FontFamily.Monospace)
        Text(text = "邮箱 yuanweiwork@126.com", fontFamily = FontFamily.SansSerif)
        Text(text = "邮箱 yuanweiwork@126.com", fontFamily = FontFamily.Serif)
    }
}

@Preview(showBackground = true)
@Composable
fun 字体间距() {
    Column {
        Text(text = "邮箱 yuanweiwork@126.com", letterSpacing = 8.sp)
    }
}

@Preview(showBackground = true)
@Composable
fun 下划线_中划线() {
    Column {
        Text(text = "邮箱 yuanweiwork@126.com", textDecoration = TextDecoration.None)
        Text(text = "邮箱 yuanweiwork@126.com", textDecoration = TextDecoration.Underline)
        Text(text = "邮箱 yuanweiwork@126.com", textDecoration = TextDecoration.LineThrough)
    }
}

@Preview(showBackground = true)
@Composable
fun 内部位置() {
    Column {
        Text(
            text = "邮箱",
            modifier = Modifier
                .height(30.dp)
                .width(100.dp)
                .background(Color.Blue),
            textAlign = TextAlign.Left
        )
        Text(
            text = "邮箱",
            modifier = Modifier
                .height(30.dp)
                .width(100.dp)
                .background(Color.Cyan),
            textAlign = TextAlign.Right
        )
        Text(
            text = "邮箱",
            modifier = Modifier
                .height(30.dp)
                .width(100.dp)
                .background(Color.Blue),
            textAlign = TextAlign.Start
        )
        Text(
            text = "邮箱",
            modifier = Modifier
                .height(30.dp)
                .width(100.dp)
                .background(Color.Cyan),
            textAlign = TextAlign.End
        )
        Text(
            text = "邮箱",
            modifier = Modifier
                .height(30.dp)
                .width(100.dp)
                .background(Color.Blue),
            textAlign = TextAlign.Center
        )
        Text(
            text = "邮箱",
            modifier = Modifier
                .height(30.dp)
                .width(100.dp)
                .background(Color.Cyan),
            textAlign = TextAlign.Justify
        )
    }

}

@Preview(showBackground = true)
@Composable
fun 行高() {
    Column {
        Text(text = "邮箱 \nyuanweiwork@126.com", lineHeight = 20.sp)
        Text(text = "邮箱 yuanweiwork@126.com", lineHeight = 10.sp)
    }
}

@Preview(showBackground = true)
@Composable
fun 行尾处理() {
    Column {
        Text(
            text = "邮箱yuan",
            modifier = Modifier
                .width(60.dp)
                .background(Color.Cyan),
            overflow = TextOverflow.Clip
        )
        Text(
            text = "邮箱 yuanweiwork@126.com",
            modifier = Modifier
                .width(60.dp)
                .background(Color.Blue),
            overflow = TextOverflow.Ellipsis,
            maxLines = 1
        )
        Text(
            text = "邮箱 yuanweiwork@126.com",
            modifier = Modifier
                .width(60.dp)
                .background(Color.Cyan),
            overflow = TextOverflow.Ellipsis,
            softWrap = false
        )
        Text(
            text = "邮箱 yuanweiwork@126.com",
            modifier = Modifier
                .width(60.dp)
                .background(Color.Blue),
            overflow = TextOverflow.Ellipsis,
            maxLines = 1
        )
        Text(
            text = "邮箱yuanweiwork@126.com",
            modifier = Modifier
                .width(60.dp)
                .background(Color.Cyan),
            overflow = TextOverflow.Visible,
            maxLines = 1
        )
    }
}


@Preview(showBackground = true)
@Composable
fun 文本信息() {
    Column {
        Text(text = "邮箱 yuanweiwork@126.com", onTextLayout = {
            it.layoutInput.toString()
        })
    }
}