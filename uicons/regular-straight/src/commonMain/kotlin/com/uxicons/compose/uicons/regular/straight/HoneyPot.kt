package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HoneyPot: ImageVector? = null

val Icons.Rs.HoneyPot: ImageVector
    get() = _HoneyPot ?: UXIcon(name = "HoneyPot") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.63f, 2f)
                horizontalLineToRelative(1.37f)
                lineTo(23f, 0f)
                lineTo(1f, 0f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(1.37f)
                curveTo(0.9f, 4.28f, 0f, 7.19f, 0f, 9.9f)
                curveToRelative(0f, 4.15f, 2.7f, 9.86f, 5.37f, 13.67f)
                lineToRelative(0.3f, 0.43f)
                horizontalLineToRelative(12.65f)
                lineToRelative(0.3f, -0.43f)
                curveToRelative(2.67f, -3.81f, 5.37f, -9.52f, 5.37f, -13.67f)
                curveToRelative(0f, -2.72f, -0.9f, -5.63f, -2.37f, -7.91f)
                close()
                moveTo(17.28f, 22f)
                lineTo(6.72f, 22f)
                curveToRelative(-2.4f, -3.54f, -4.72f, -8.52f, -4.72f, -12.1f)
                curveToRelative(0f, -2.77f, 1.13f, -5.89f, 2.85f, -7.91f)
                horizontalLineToRelative(0.65f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(8.5f)
                horizontalLineToRelative(2f)
                lineTo(9f, 3.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(4.5f)
                horizontalLineToRelative(2f)
                lineTo(14f, 3.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(3.65f)
                curveToRelative(1.72f, 2.02f, 2.85f, 5.13f, 2.85f, 7.91f)
                curveToRelative(0f, 3.57f, -2.32f, 8.56f, -4.72f, 12.1f)
                close()
            }
        }.also { _HoneyPot = it}
