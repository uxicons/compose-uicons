package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleC: ImageVector? = null

val Icons.Ts.CircleC: ImageVector
    get() = _CircleC ?: UXIcon(name = "CircleC") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(7.5f, 10.96f)
                verticalLineToRelative(2.09f)
                curveToRelative(0f, 2.32f, 1.86f, 4.21f, 4.16f, 4.21f)
                horizontalLineToRelative(0.52f)
                curveToRelative(1.58f, 0f, 3.01f, -0.87f, 3.74f, -2.28f)
                lineToRelative(0.89f, 0.46f)
                curveToRelative(-0.9f, 1.74f, -2.67f, 2.82f, -4.63f, 2.82f)
                horizontalLineToRelative(-0.52f)
                curveToRelative(-2.84f, 0f, -5.16f, -2.33f, -5.16f, -5.21f)
                verticalLineToRelative(-2.09f)
                curveToRelative(0f, -2.87f, 2.31f, -5.21f, 5.16f, -5.21f)
                horizontalLineToRelative(0.52f)
                curveToRelative(1.99f, 0f, 3.78f, 1.11f, 4.66f, 2.89f)
                lineToRelative(-0.9f, 0.45f)
                curveToRelative(-0.72f, -1.44f, -2.16f, -2.34f, -3.77f, -2.34f)
                horizontalLineToRelative(-0.52f)
                curveToRelative(-2.29f, 0f, -4.16f, 1.89f, -4.16f, 4.21f)
                close()
                moveTo(24f, 12f)
                curveToRelative(0f, 6.62f, -5.38f, 12f, -12f, 12f)
                reflectiveCurveTo(0f, 18.62f, 0f, 12f)
                reflectiveCurveTo(5.38f, 0f, 12f, 0f)
                reflectiveCurveToRelative(12f, 5.38f, 12f, 12f)
                close()
                moveTo(23f, 12f)
                curveToRelative(0f, -6.07f, -4.93f, -11f, -11f, -11f)
                reflectiveCurveTo(1f, 5.93f, 1f, 12f)
                reflectiveCurveToRelative(4.93f, 11f, 11f, 11f)
                reflectiveCurveToRelative(11f, -4.93f, 11f, -11f)
                close()
            }
        }.also { _CircleC = it}
