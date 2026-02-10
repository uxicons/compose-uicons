package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HoneyPot: ImageVector? = null

val Icons.Ss.HoneyPot: ImageVector
    get() = _HoneyPot ?: UXIcon(name = "HoneyPot") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(1f, 2f)
                lineTo(1f, 0f)
                horizontalLineToRelative(22f)
                verticalLineToRelative(2f)
                lineTo(1f, 2f)
                close()
                moveTo(22.19f, 4f)
                horizontalLineToRelative(-6.69f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(4.5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-4.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(8.5f)
                horizontalLineToRelative(-2f)
                lineTo(7f, 5.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                lineTo(1.81f, 4f)
                curveToRelative(-1.0f, 1.86f, -1.81f, 3.93f, -1.81f, 5.91f)
                curveToRelative(0f, 4.15f, 2.7f, 9.86f, 5.37f, 13.67f)
                lineToRelative(0.3f, 0.43f)
                horizontalLineToRelative(12.65f)
                lineToRelative(0.3f, -0.43f)
                curveToRelative(2.67f, -3.81f, 5.37f, -9.52f, 5.37f, -13.67f)
                curveToRelative(0f, -1.97f, -0.81f, -4.04f, -1.81f, -5.91f)
                close()
            }
        }.also { _HoneyPot = it}
