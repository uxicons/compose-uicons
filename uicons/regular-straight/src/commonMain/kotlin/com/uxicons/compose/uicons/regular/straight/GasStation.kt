package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GasStation: ImageVector? = null

val Icons.Rs.GasStation: ImageVector
    get() = _GasStation ?: UXIcon(name = "GasStation") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19.07f, 2.93f)
                curveToRelative(-1.89f, -1.89f, -4.4f, -2.93f, -7.07f, -2.93f)
                reflectiveCurveToRelative(-5.18f, 1.04f, -7.07f, 2.93f)
                curveToRelative(-3.9f, 3.9f, -3.9f, 10.25f, 0.01f, 14.16f)
                lineToRelative(7.07f, 6.91f)
                lineToRelative(7.07f, -6.92f)
                curveToRelative(1.89f, -1.89f, 2.93f, -4.4f, 2.93f, -7.08f)
                reflectiveCurveToRelative(-1.04f, -5.19f, -2.93f, -7.08f)
                close()
                moveTo(17.66f, 15.65f)
                lineTo(12f, 21.19f)
                lineTo(6.34f, 15.66f)
                curveToRelative(-3.12f, -3.12f, -3.12f, -8.2f, 0f, -11.31f)
                curveToRelative(1.51f, -1.51f, 3.52f, -2.34f, 5.66f, -2.34f)
                reflectiveCurveToRelative(4.15f, 0.83f, 5.66f, 2.34f)
                curveToRelative(1.51f, 1.51f, 2.34f, 3.52f, 2.34f, 5.66f)
                reflectiveCurveToRelative(-0.83f, 4.15f, -2.34f, 5.65f)
                close()
                moveTo(16.57f, 6.39f)
                lineTo(15.38f, 7.57f)
                curveToRelative(-0.24f, 0.24f, -0.39f, 0.58f, -0.39f, 0.93f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-3f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(6.5f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(1f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineToRelative(-2.22f)
                lineToRelative(0.98f, -0.98f)
                lineToRelative(-1.41f, -1.41f)
                close()
                moveTo(10f, 12f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                close()
            }
        }.also { _GasStation = it}
