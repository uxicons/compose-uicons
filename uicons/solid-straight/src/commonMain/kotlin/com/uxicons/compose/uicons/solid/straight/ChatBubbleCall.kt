package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChatBubbleCall: ImageVector? = null

val Icons.Ss.ChatBubbleCall: ImageVector
    get() = _ChatBubbleCall ?: UXIcon(name = "ChatBubbleCall") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15.4f, 10.86f)
                horizontalLineToRelative(-0.31f)
                curveToRelative(-0.6f, 0f, -1.09f, -0.49f, -1.09f, -1.09f)
                lineToRelative(-0.0f, -7.77f)
                curveTo(14f, 0.9f, 14.9f, 0.0f, 16.0f, 0.0f)
                lineToRelative(6.0f, -0.0f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(-5.87f)
                lineToRelative(-2.73f, 1.86f)
                close()
                moveTo(17.61f, 12.72f)
                lineToRelative(6.26f, 6.27f)
                lineToRelative(-3.17f, 3.17f)
                curveToRelative(-1.1f, 1.11f, -2.6f, 1.72f, -4.21f, 1.72f)
                curveTo(9.25f, 23.88f, 0f, 14.63f, 0f, 7.38f)
                curveToRelative(0f, -1.61f, 0.61f, -3.1f, 1.72f, -4.21f)
                lineTo(4.89f, 0f)
                lineToRelative(6.26f, 6.26f)
                lineToRelative(-4.12f, 4.12f)
                curveToRelative(1.37f, 3.06f, 3.49f, 5.19f, 6.45f, 6.47f)
                lineToRelative(4.13f, -4.13f)
                close()
            }
        }.also { _ChatBubbleCall = it}
