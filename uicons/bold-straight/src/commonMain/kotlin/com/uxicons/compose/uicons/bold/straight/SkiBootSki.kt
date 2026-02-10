package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SkiBootSki: ImageVector? = null

val Icons.Bs.SkiBootSki: ImageVector
    get() = _SkiBootSki ?: UXIcon(name = "SkiBootSki") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 19f)
                curveToRelative(0f, 2.76f, -2.24f, 5f, -5f, 5f)
                lineTo(0f, 24f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(19f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                horizontalLineToRelative(3f)
                close()
                moveTo(19f, 19f)
                lineTo(0f, 19f)
                lineToRelative(0.03f, -3.3f)
                lineTo(3.28f, -0.0f)
                reflectiveCurveToRelative(9.51f, 0.03f, 10.46f, 0.03f)
                reflectiveCurveToRelative(1.28f, 0.47f, 1.28f, 0.47f)
                curveToRelative(0.37f, 0.38f, 0.53f, 0.91f, 0.42f, 1.43f)
                lineToRelative(-1.43f, 6.79f)
                lineToRelative(0.05f, 0.02f)
                curveToRelative(2.86f, 0.62f, 4.93f, 3.17f, 4.93f, 6.11f)
                verticalLineToRelative(4.16f)
                close()
                moveTo(16f, 14.84f)
                curveToRelative(0f, -1.54f, -1.1f, -2.88f, -2.61f, -3.19f)
                lineToRelative(-2.86f, -0.91f)
                lineToRelative(0.58f, -2.74f)
                horizontalLineToRelative(-3.1f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(3.73f)
                lineToRelative(0.42f, -1.98f)
                lineToRelative(-6.43f, -0.02f)
                lineToRelative(-2.69f, 13.0f)
                horizontalLineToRelative(12.97f)
                verticalLineToRelative(-1.16f)
                close()
                moveTo(6.5f, 11f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                close()
            }
        }.also { _SkiBootSki = it}
