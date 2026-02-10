package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RouterWifi: ImageVector? = null

val Icons.Bs.RouterWifi: ImageVector
    get() = _RouterWifi ?: UXIcon(name = "RouterWifi") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.5f, 15f)
                horizontalLineToRelative(-0.7f)
                lineToRelative(4.16f, -7.25f)
                lineToRelative(-2.6f, -1.49f)
                lineToRelative(-5.01f, 8.74f)
                lineTo(7.66f, 15f)
                lineTo(2.65f, 6.25f)
                lineTo(0.04f, 7.75f)
                lineToRelative(4.16f, 7.25f)
                horizontalLineToRelative(-0.7f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(5.5f)
                lineTo(24f, 24f)
                verticalLineToRelative(-5.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(21f, 21f)
                lineTo(3f, 21f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0f, -0.28f, 0.23f, -0.5f, 0.5f, -0.5f)
                lineTo(20.5f, 18f)
                curveToRelative(0.28f, 0f, 0.5f, 0.23f, 0.5f, 0.5f)
                verticalLineToRelative(2.5f)
                close()
                moveTo(14.12f, 10.88f)
                lineToRelative(-2.12f, 2.12f)
                lineToRelative(-2.12f, -2.12f)
                curveToRelative(1.13f, -1.13f, 3.11f, -1.13f, 4.24f, 0f)
                close()
                moveTo(15.63f, 9.5f)
                curveToRelative(-0.97f, -0.97f, -2.26f, -1.5f, -3.63f, -1.5f)
                reflectiveCurveToRelative(-2.66f, 0.53f, -3.63f, 1.5f)
                lineToRelative(-2.12f, -2.12f)
                curveToRelative(1.54f, -1.54f, 3.58f, -2.38f, 5.75f, -2.38f)
                reflectiveCurveToRelative(4.21f, 0.85f, 5.75f, 2.38f)
                lineToRelative(-2.12f, 2.12f)
                close()
                moveTo(5.03f, 5.89f)
                lineTo(2.91f, 3.77f)
                curveTo(5.33f, 1.34f, 8.56f, 0f, 12f, 0f)
                reflectiveCurveToRelative(6.67f, 1.34f, 9.09f, 3.77f)
                lineToRelative(-2.12f, 2.12f)
                curveToRelative(-1.86f, -1.86f, -4.34f, -2.89f, -6.97f, -2.89f)
                reflectiveCurveToRelative(-5.11f, 1.02f, -6.97f, 2.89f)
                close()
            }
        }.also { _RouterWifi = it}
