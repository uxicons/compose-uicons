package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SignalStreamSlash: ImageVector? = null

val Icons.Rs.SignalStreamSlash: ImageVector
    get() = _SignalStreamSlash ?: UXIcon(name = "SignalStreamSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4.93f, 19.07f)
                lineToRelative(-1.41f, 1.41f)
                curveTo(-0.43f, 16.54f, -1.03f, 10.53f, 1.66f, 5.93f)
                lineToRelative(1.46f, 1.46f)
                curveToRelative(-1.95f, 3.77f, -1.35f, 8.52f, 1.8f, 11.68f)
                close()
                moveTo(7.07f, 11.33f)
                lineToRelative(-1.66f, -1.66f)
                curveToRelative(-0.86f, 2.46f, -0.32f, 5.31f, 1.64f, 7.27f)
                lineToRelative(1.41f, -1.41f)
                curveToRelative(-1.14f, -1.14f, -1.6f, -2.71f, -1.4f, -4.2f)
                close()
                moveTo(20.49f, 3.51f)
                lineToRelative(-1.41f, 1.41f)
                curveToRelative(3.66f, 3.66f, 3.88f, 9.49f, 0.66f, 13.41f)
                lineToRelative(-2.14f, -2.14f)
                curveToRelative(2.06f, -2.74f, 1.85f, -6.66f, -0.65f, -9.16f)
                lineToRelative(-1.41f, 1.41f)
                curveToRelative(1.71f, 1.71f, 1.92f, 4.37f, 0.63f, 6.31f)
                lineToRelative(-2.23f, -2.23f)
                curveToRelative(0.19f, -0.67f, 0.02f, -1.42f, -0.51f, -1.95f)
                reflectiveCurveToRelative(-1.28f, -0.7f, -1.95f, -0.51f)
                lineTo(1.48f, 0.09f)
                lineTo(0.06f, 1.5f)
                lineTo(22.56f, 24f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(-2.83f, -2.83f)
                curveToRelative(4f, -4.71f, 3.78f, -11.8f, -0.67f, -16.25f)
                close()
            }
        }.also { _SignalStreamSlash = it}
