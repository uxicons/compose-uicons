package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SkiBootSki: ImageVector? = null

val Icons.Ss.SkiBootSki: ImageVector
    get() = _SkiBootSki ?: UXIcon(name = "SkiBootSki") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19f, 24f)
                lineTo(0f, 24f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(19f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                horizontalLineToRelative(2f)
                curveToRelative(0f, 2.76f, -2.24f, 5f, -5f, 5f)
                close()
                moveTo(19f, 16.5f)
                verticalLineToRelative(3.5f)
                lineTo(0f, 20f)
                lineToRelative(0.02f, -2.89f)
                lineTo(3.56f, -0.0f)
                lineToRelative(10.27f, 0.03f)
                lineToRelative(0.43f, -0.09f)
                lineToRelative(0.46f, 0.41f)
                curveToRelative(0.26f, 0.26f, 0.37f, 0.64f, 0.29f, 1.0f)
                lineToRelative(-0.62f, 2.65f)
                horizontalLineToRelative(-5.39f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(4.93f)
                lineToRelative(-0.47f, 2f)
                horizontalLineToRelative(-4.46f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(4f)
                lineToRelative(0.96f, 0.29f)
                curveToRelative(2.92f, 0.61f, 5.04f, 3.21f, 5.04f, 6.21f)
                close()
                moveTo(7f, 14.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                close()
            }
        }.also { _SkiBootSki = it}
