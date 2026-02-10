package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleStar: ImageVector? = null

val Icons.Ts.CircleStar: ImageVector
    get() = _CircleStar ?: UXIcon(name = "CircleStar") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(12f, 23f)
                curveToRelative(-6.07f, 0f, -11f, -4.93f, -11f, -11f)
                reflectiveCurveTo(5.93f, 1f, 12f, 1f)
                reflectiveCurveToRelative(11f, 4.93f, 11f, 11f)
                reflectiveCurveToRelative(-4.93f, 11f, -11f, 11f)
                close()
                moveTo(12.42f, 5.66f)
                horizontalLineToRelative(-0.85f)
                lineToRelative(-1.52f, 4.34f)
                lineTo(5.71f, 10f)
                verticalLineToRelative(0.83f)
                lineToRelative(3.13f, 2.52f)
                lineToRelative(-1.17f, 3.9f)
                lineToRelative(0.67f, 0.52f)
                lineToRelative(3.66f, -2.37f)
                lineToRelative(3.66f, 2.37f)
                lineToRelative(0.67f, -0.52f)
                lineToRelative(-1.17f, -3.9f)
                lineToRelative(3.13f, -2.52f)
                verticalLineToRelative(-0.83f)
                horizontalLineToRelative(-4.34f)
                lineToRelative(-1.52f, -4.34f)
                close()
                moveTo(14f, 12.99f)
                lineToRelative(0.93f, 3.12f)
                lineToRelative(-2.94f, -1.91f)
                lineToRelative(-2.94f, 1.91f)
                lineToRelative(0.93f, -3.12f)
                lineToRelative(-2.47f, -1.99f)
                horizontalLineToRelative(3.25f)
                lineToRelative(1.24f, -3.53f)
                lineToRelative(1.24f, 3.53f)
                horizontalLineToRelative(3.25f)
                lineToRelative(-2.47f, 1.99f)
                close()
            }
        }.also { _CircleStar = it}
