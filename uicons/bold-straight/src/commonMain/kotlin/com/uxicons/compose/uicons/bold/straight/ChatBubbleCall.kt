package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChatBubbleCall: ImageVector? = null

val Icons.Bs.ChatBubbleCall: ImageVector
    get() = _ChatBubbleCall ?: UXIcon(name = "ChatBubbleCall") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14.33f, 14.89f)
                curveToRelative(-2.33f, -1.1f, -4.04f, -2.82f, -5.21f, -5.23f)
                lineToRelative(2.96f, -2.96f)
                lineTo(5.44f, 0.06f)
                lineTo(1.8f, 3.7f)
                curveTo(0.66f, 4.84f, 0.03f, 6.37f, 0.03f, 8.03f)
                curveTo(0.03f, 15.18f, 8.82f, 23.97f, 15.97f, 23.97f)
                curveToRelative(1.65f, 0f, 3.19f, -0.63f, 4.32f, -1.76f)
                lineToRelative(3.65f, -3.65f)
                lineToRelative(-6.64f, -6.64f)
                lineToRelative(-2.97f, 2.97f)
                close()
                moveTo(18.18f, 20.08f)
                curveToRelative(-0.57f, 0.57f, -1.35f, 0.89f, -2.2f, 0.89f)
                curveToRelative(-4.99f, 0f, -12.94f, -7.07f, -12.94f, -12.94f)
                curveToRelative(0f, -0.85f, 0.31f, -1.63f, 0.89f, -2.2f)
                lineToRelative(1.52f, -1.52f)
                lineToRelative(2.4f, 2.4f)
                lineToRelative(-2.27f, 2.27f)
                lineToRelative(0.37f, 0.92f)
                curveToRelative(1.59f, 3.96f, 4.35f, 6.71f, 8.2f, 8.18f)
                lineToRelative(0.91f, 0.35f)
                lineToRelative(2.25f, -2.25f)
                lineToRelative(2.4f, 2.4f)
                lineToRelative(-1.52f, 1.52f)
                close()
                moveTo(22f, 0f)
                horizontalLineToRelative(0f)
                lineToRelative(-6f, 0.0f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2.0f, 2.0f)
                lineToRelative(0.0f, 7.77f)
                curveToRelative(0f, 0.64f, 0.52f, 1.09f, 1.09f, 1.09f)
                curveToRelative(0.2f, 0f, 0.4f, -0.05f, 0.58f, -0.17f)
                lineToRelative(2.45f, -1.69f)
                horizontalLineToRelative(5.87f)
                lineTo(24.0f, 2f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                close()
                moveTo(21f, 6f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-3.0f)
                reflectiveCurveToRelative(4.0f, -0.0f, 4.0f, -0.0f)
                verticalLineToRelative(3.0f)
                close()
            }
        }.also { _ChatBubbleCall = it}
