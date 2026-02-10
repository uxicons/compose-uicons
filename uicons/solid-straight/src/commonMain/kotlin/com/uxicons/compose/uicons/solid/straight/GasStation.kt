package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GasStation: ImageVector? = null

val Icons.Ss.GasStation: ImageVector
    get() = _GasStation ?: UXIcon(name = "GasStation") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 9f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-4f)
                close()
                moveTo(22.0f, 10.01f)
                curveToRelative(0f, 2.67f, -1.04f, 5.19f, -2.93f, 7.08f)
                lineToRelative(-7.07f, 6.92f)
                lineToRelative(-7.07f, -6.91f)
                curveToRelative(-3.91f, -3.91f, -3.91f, -10.26f, -0.01f, -14.16f)
                curveToRelative(1.89f, -1.89f, 4.4f, -2.93f, 7.07f, -2.93f)
                reflectiveCurveToRelative(5.18f, 1.04f, 7.07f, 2.93f)
                curveToRelative(1.89f, 1.89f, 2.93f, 4.4f, 2.93f, 7.08f)
                close()
                moveTo(18.98f, 6.8f)
                lineTo(17.57f, 5.39f)
                lineTo(16.39f, 6.57f)
                curveToRelative(-0.24f, 0.24f, -0.39f, 0.58f, -0.39f, 0.93f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-4.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-4f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(8.5f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineToRelative(-3.22f)
                lineToRelative(0.98f, -0.98f)
                close()
            }
        }.also { _GasStation = it}
