package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChatBubbleCall: ImageVector? = null

val Icons.Sr.ChatBubbleCall: ImageVector
    get() = _ChatBubbleCall ?: UXIcon(name = "ChatBubbleCall") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 3f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                horizontalLineToRelative(-2.65f)
                lineToRelative(-2.13f, 1.71f)
                curveToRelative(-0.27f, 0.19f, -0.57f, 0.29f, -0.86f, 0.29f)
                curveToRelative(-0.21f, 0f, -0.43f, -0.05f, -0.62f, -0.15f)
                curveToRelative(-0.46f, -0.24f, -0.74f, -0.71f, -0.74f, -1.22f)
                lineTo(14.0f, 3.0f)
                curveTo(14f, 1.35f, 15.35f, 0.0f, 17f, 0.0f)
                horizontalLineToRelative(4.0f)
                reflectiveCurveToRelative(0f, 0f, 0f, 0f)
                curveToRelative(0.8f, 0f, 1.55f, 0.31f, 2.12f, 0.88f)
                curveToRelative(0.57f, 0.57f, 0.88f, 1.32f, 0.88f, 2.12f)
                close()
                moveTo(20.66f, 14.86f)
                curveToRelative(-1.19f, -1.14f, -3.09f, -1.14f, -4.28f, 0.01f)
                lineToRelative(-1.91f, 1.61f)
                curveToRelative(-3.2f, -1.36f, -5.47f, -3.64f, -6.93f, -6.95f)
                lineToRelative(1.6f, -1.9f)
                curveToRelative(0.56f, -0.58f, 0.86f, -1.34f, 0.86f, -2.15f)
                reflectiveCurveToRelative(-0.3f, -1.56f, -0.86f, -2.14f)
                curveToRelative(0f, 0f, -1.85f, -2.41f, -1.88f, -2.44f)
                curveToRelative(-1.21f, -1.21f, -3.17f, -1.21f, -4.33f, -0.05f)
                lineToRelative(-1.15f, 1.0f)
                curveTo(0.63f, 3.01f, 0f, 4.57f, 0f, 6.24f)
                curveToRelative(0f, 7.64f, 10.13f, 17.76f, 17.76f, 17.76f)
                curveToRelative(1.67f, 0f, 3.23f, -0.63f, 4.42f, -1.83f)
                lineToRelative(0.91f, -1.05f)
                curveToRelative(1.21f, -1.21f, 1.21f, -3.17f, 0f, -4.38f)
                curveToRelative(-0.03f, -0.03f, -2.44f, -1.88f, -2.44f, -1.88f)
                close()
            }
        }.also { _ChatBubbleCall = it}
