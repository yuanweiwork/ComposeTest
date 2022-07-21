Text属性详解

```kotlin
@Composable
fun Text(
    text: String,
    modifier: Modifier = Modifier,
    color: Color = Color.Unspecified,
    fontSize: TextUnit = TextUnit.Unspecified,
    fontStyle: FontStyle? = null,
    fontWeight: FontWeight? = null,
    fontFamily: FontFamily? = null,
    letterSpacing: TextUnit = TextUnit.Unspecified,
    textDecoration: TextDecoration? = null,
    textAlign: TextAlign? = null,
    lineHeight: TextUnit = TextUnit.Unspecified,
    overflow: TextOverflow = TextOverflow.Clip,
    softWrap: Boolean = true,
    maxLines: Int = Int.MAX_VALUE,
    onTextLayout: (TextLayoutResult) -> Unit = {},
    style: TextStyle = LocalTextStyle.current
) 

```




| 参数                             | 默认值                 |                                      |
| -------------------------------- | ---------------------- | ------------------------------------ |
| text: String                     | 无                     | 显示text文字                         |
| modifier: Modifier = Modifier    |                        |                                      |
| color: Color                     | Color.Unspecified      | 文字颜色                             |
| fontSize: TextUnit =             | TextUnit.Unspecified   | 文字大小                             |
| fontStyle: FontStyle?            | null                   | 斜体或正常                           |
| fontWeight: FontWeight?          | null                   | 字体变细或者加粗                     |
| fontFamily: FontFamily?          | null                   | 字体样式(内置了几种样式)             |
| letterSpacing: TextUnit          | TextUnit.Unspecified   | 字体间距                             |
| textDecoration: TextDecoration?  | null                   | 下划线或者字体中横线                 |
| textAlign: TextAlign?            | null                   | gravity类似 控制内部                 |
| lineHeight: TextUnit             | TextUnit.Unspecified   | 行高                                 |
| overflow: TextOverflow           | TextOverflow.Clip      | 行末尾省略号 配合maxlin,softWrap使用 |
| softWrap: Boolean                | true                   | 允许换行                             |
| maxLines: Int                    | Int.MAX_VALUE          | 最大行数                             |
| onTextLayout: (TextLayoutResult) |                        | 文本的 高度 行数等等                 |
| style: TextStyle                 | LocalTextStyle.current | 上面的配置一次性设置                 |

[链接](https://github.com/yuanweiwork/ComposeTest/blob/master/app/src/main/java/com/example/composetest/TextPreview.kt)每条属性都用预览可以看一下

