package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserAlien: ImageVector? = null

val Icons.Ss.UserAlien: ImageVector
    get() = _UserAlien ?: UXIcon(name = "UserAlien") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(11.34f, 20.41f)
                lineToRelative(0.66f, 0.59f)
                lineToRelative(0.66f, -0.59f)
                curveToRelative(0.3f, -0.27f, 7.34f, -6.59f, 7.34f, -12.41f)
                curveTo(20f, 3.59f, 16.41f, 0f, 12f, 0f)
                reflectiveCurveTo(4f, 3.59f, 4f, 8f)
                curveToRelative(0f, 5.83f, 7.04f, 12.15f, 7.34f, 12.41f)
                close()
                moveTo(13.81f, 6.81f)
                curveToRelative(0.99f, -0.99f, 3.17f, -0.79f, 3.17f, -0.79f)
                curveToRelative(0f, 0f, 0.2f, 2.18f, -0.79f, 3.17f)
                reflectiveCurveToRelative(-3.17f, 0.79f, -3.17f, 0.79f)
                curveToRelative(0f, 0f, -0.2f, -2.18f, 0.79f, -3.17f)
                close()
                moveTo(7.02f, 6.02f)
                reflectiveCurveToRelative(2.19f, -0.2f, 3.19f, 0.8f)
                reflectiveCurveToRelative(0.8f, 3.19f, 0.8f, 3.19f)
                curveToRelative(0f, 0f, -2.19f, 0.2f, -3.19f, -0.8f)
                curveToRelative(-0.99f, -0.99f, -0.8f, -3.19f, -0.8f, -3.19f)
                close()
                moveTo(21.0f, 18.0f)
                verticalLineToRelative(6f)
                lineTo(3f, 24.0f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -1.16f, 0.5f, -2.19f, 1.29f, -2.93f)
                curveToRelative(2.18f, 3.62f, 5.2f, 6.38f, 5.71f, 6.83f)
                lineToRelative(1.99f, 1.77f)
                lineToRelative(1.99f, -1.77f)
                curveToRelative(0.52f, -0.46f, 3.54f, -3.21f, 5.72f, -6.84f)
                curveToRelative(0.79f, 0.73f, 1.29f, 1.77f, 1.29f, 2.93f)
                close()
            }
        }.also { _UserAlien = it}
