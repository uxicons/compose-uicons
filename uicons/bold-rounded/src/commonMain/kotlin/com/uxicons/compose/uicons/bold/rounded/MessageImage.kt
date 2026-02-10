package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MessageImage: ImageVector? = null

val Icons.Br.MessageImage: ImageVector
    get() = _MessageImage ?: UXIcon(name = "MessageImage") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(18.5f, 0f)
            lineTo(5.5f, 0f)
            curveTo(2.47f, 0f, 0f, 2.47f, 0f, 5.5f)
            verticalLineToRelative(9f)
            curveToRelative(0f, 3.03f, 2.47f, 5.5f, 5.5f, 5.5f)
            horizontalLineToRelative(1.24f)
            lineToRelative(3.6f, 3.03f)
            curveToRelative(0.48f, 0.43f, 1.08f, 0.64f, 1.68f, 0.64f)
            curveToRelative(0.58f, 0f, 1.16f, -0.2f, 1.61f, -0.6f)
            lineToRelative(3.71f, -3.06f)
            horizontalLineToRelative(1.17f)
            curveToRelative(3.03f, 0f, 5.5f, -2.47f, 5.5f, -5.5f)
            lineTo(24f, 5.5f)
            curveToRelative(0f, -3.03f, -2.47f, -5.5f, -5.5f, -5.5f)
            close()
            moveTo(3f, 5.5f)
            curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
            horizontalLineToRelative(13f)
            curveToRelative(1.19f, 0f, 2.18f, 0.83f, 2.44f, 1.94f)
            lineToRelative(-5.32f, 5.32f)
            curveToRelative(-0.34f, 0.34f, -0.9f, 0.34f, -1.24f, 0f)
            lineToRelative(-0.64f, -0.64f)
            curveToRelative(-1.47f, -1.47f, -4.02f, -1.47f, -5.49f, 0f)
            lineToRelative(-5.23f, 5.23f)
            curveToRelative(-0.02f, -0.12f, -0.03f, -0.23f, -0.03f, -0.35f)
            lineTo(3.0f, 5.5f)
            close()
            moveTo(18.5f, 17f)
            horizontalLineToRelative(-1.71f)
            curveToRelative(-0.35f, 0f, -0.69f, 0.12f, -0.96f, 0.34f)
            lineToRelative(-3.83f, 3.17f)
            lineToRelative(-3.75f, -3.16f)
            curveToRelative(-0.27f, -0.23f, -0.61f, -0.35f, -0.97f, -0.35f)
            horizontalLineToRelative(-1.79f)
            curveToRelative(-0.12f, 0f, -0.24f, -0.01f, -0.35f, -0.03f)
            lineToRelative(5.23f, -5.23f)
            curveToRelative(0.33f, -0.33f, 0.91f, -0.33f, 1.24f, 0f)
            lineToRelative(0.64f, 0.64f)
            curveToRelative(1.47f, 1.47f, 4.02f, 1.47f, 5.49f, 0f)
            lineToRelative(3.26f, -3.26f)
            verticalLineToRelative(5.38f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            close()
            moveTo(5f, 6.5f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            close()
        }
    }.also { _MessageImage = it }
