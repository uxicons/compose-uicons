package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MarkerTime: ImageVector? = null

val Icons.Ts.MarkerTime: ImageVector
    get() = _MarkerTime ?: UXIcon(name = "MarkerTime") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19.07f, 2.93f)
                curveToRelative(-1.89f, -1.89f, -4.4f, -2.93f, -7.07f, -2.93f)
                reflectiveCurveToRelative(-5.18f, 1.04f, -7.07f, 2.93f)
                curveToRelative(-3.9f, 3.9f, -3.9f, 10.24f, 0.0f, 14.15f)
                lineToRelative(7.07f, 6.91f)
                lineToRelative(7.07f, -6.92f)
                curveToRelative(3.9f, -3.9f, 3.9f, -10.24f, 0f, -14.14f)
                close()
                moveTo(18.37f, 16.36f)
                lineToRelative(-6.37f, 6.23f)
                lineToRelative(-6.36f, -6.22f)
                curveToRelative(-3.51f, -3.51f, -3.51f, -9.22f, 0f, -12.73f)
                curveToRelative(1.7f, -1.7f, 3.96f, -2.64f, 6.36f, -2.64f)
                reflectiveCurveToRelative(4.66f, 0.94f, 6.36f, 2.64f)
                curveToRelative(3.51f, 3.51f, 3.51f, 9.22f, 0.0f, 12.72f)
                close()
                moveTo(12f, 3.99f)
                curveToRelative(-3.31f, 0f, -6f, 2.69f, -6f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                reflectiveCurveToRelative(6f, -2.69f, 6f, -6f)
                reflectiveCurveToRelative(-2.69f, -6f, -6f, -6f)
                close()
                moveTo(12f, 14.99f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                reflectiveCurveToRelative(2.24f, -5f, 5f, -5f)
                reflectiveCurveToRelative(5f, 2.24f, 5f, 5f)
                reflectiveCurveToRelative(-2.24f, 5f, -5f, 5f)
                close()
                moveTo(12.5f, 9.79f)
                lineToRelative(1.54f, 1.54f)
                lineToRelative(-0.71f, 0.71f)
                lineToRelative(-1.83f, -1.83f)
                verticalLineToRelative(-3.2f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(2.79f)
                close()
            }
        }.also { _MarkerTime = it}
