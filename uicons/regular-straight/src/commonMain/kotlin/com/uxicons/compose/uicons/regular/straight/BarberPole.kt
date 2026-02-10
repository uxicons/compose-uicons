package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BarberPole: ImageVector? = null

val Icons.Rs.BarberPole: ImageVector
    get() = _BarberPole ?: UXIcon(name = "BarberPole") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19f, 6f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-1.35f)
                curveToRelative(-0.83f, -2.33f, -3.04f, -4f, -5.65f, -4f)
                reflectiveCurveToRelative(-4.82f, 1.67f, -5.65f, 4f)
                horizontalLineToRelative(-1.35f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(1.35f)
                curveToRelative(0.83f, 2.33f, 3.04f, 4f, 5.65f, 4f)
                reflectiveCurveToRelative(4.82f, -1.67f, 5.65f, -4f)
                horizontalLineToRelative(1.35f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-1f)
                lineTo(18f, 6f)
                horizontalLineToRelative(1f)
                close()
                moveTo(12f, 2f)
                curveToRelative(1.47f, 0f, 2.75f, 0.81f, 3.44f, 2f)
                horizontalLineToRelative(-6.89f)
                curveToRelative(0.69f, -1.19f, 1.97f, -2f, 3.44f, -2f)
                close()
                moveTo(10.09f, 6f)
                lineToRelative(5.91f, 5.91f)
                verticalLineToRelative(2.67f)
                lineTo(8f, 6.59f)
                verticalLineToRelative(-0.59f)
                horizontalLineToRelative(2.09f)
                close()
                moveTo(8f, 14.91f)
                lineToRelative(3.09f, 3.09f)
                horizontalLineToRelative(-3.09f)
                verticalLineToRelative(-3.09f)
                close()
                moveTo(12f, 22f)
                curveToRelative(-1.47f, 0f, -2.75f, -0.81f, -3.44f, -2f)
                horizontalLineToRelative(6.89f)
                curveToRelative(-0.69f, 1.19f, -1.97f, 2f, -3.44f, 2f)
                close()
                moveTo(13.91f, 18f)
                lineToRelative(-5.91f, -5.91f)
                verticalLineToRelative(-2.67f)
                lineToRelative(8f, 8f)
                verticalLineToRelative(0.59f)
                horizontalLineToRelative(-2.09f)
                close()
                moveTo(16f, 9.09f)
                lineToRelative(-3.09f, -3.09f)
                horizontalLineToRelative(3.09f)
                verticalLineToRelative(3.09f)
                close()
            }
        }.also { _BarberPole = it}
