package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BarberPole: ImageVector? = null

val Icons.Bs.BarberPole: ImageVector
    get() = _BarberPole ?: UXIcon(name = "BarberPole") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19f, 6f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-1.81f)
                curveToRelative(-1.04f, -1.79f, -2.97f, -3f, -5.19f, -3f)
                reflectiveCurveToRelative(-4.15f, 1.21f, -5.19f, 3f)
                horizontalLineToRelative(-1.81f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(1.81f)
                curveToRelative(1.04f, 1.79f, 2.97f, 3f, 5.19f, 3f)
                reflectiveCurveToRelative(4.15f, -1.21f, 5.19f, -3f)
                horizontalLineToRelative(1.81f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-1f)
                lineTo(18f, 6f)
                horizontalLineToRelative(1f)
                close()
                moveTo(15f, 16.38f)
                lineToRelative(-6f, -6f)
                verticalLineToRelative(-2.76f)
                lineToRelative(6f, 6f)
                verticalLineToRelative(2.76f)
                close()
                moveTo(9f, 14.62f)
                lineToRelative(3.38f, 3.38f)
                horizontalLineToRelative(-3.38f)
                verticalLineToRelative(-3.38f)
                close()
                moveTo(15f, 9.38f)
                lineToRelative(-3.38f, -3.38f)
                horizontalLineToRelative(3.38f)
                verticalLineToRelative(3.38f)
                close()
            }
        }.also { _BarberPole = it}
