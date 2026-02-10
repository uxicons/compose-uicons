package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PenCircle: ImageVector? = null

val Icons.Ts.PenCircle: ImageVector
    get() = _PenCircle ?: UXIcon(name = "PenCircle") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 0f)
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
                moveTo(14.24f, 5.82f)
                lineTo(6f, 14.06f)
                verticalLineToRelative(3.94f)
                horizontalLineToRelative(3.94f)
                lineToRelative(8.24f, -8.24f)
                curveToRelative(0.53f, -0.53f, 0.82f, -1.23f, 0.82f, -1.97f)
                reflectiveCurveToRelative(-0.29f, -1.44f, -0.82f, -1.97f)
                curveToRelative(-1.05f, -1.05f, -2.89f, -1.05f, -3.94f, 0f)
                close()
                moveTo(9.53f, 17f)
                horizontalLineToRelative(-2.52f)
                verticalLineToRelative(-2.52f)
                lineToRelative(5.6f, -5.6f)
                lineToRelative(2.52f, 2.52f)
                lineToRelative(-5.6f, 5.6f)
                close()
                moveTo(17.48f, 9.05f)
                lineToRelative(-1.65f, 1.65f)
                lineToRelative(-2.52f, -2.52f)
                lineToRelative(1.65f, -1.65f)
                curveToRelative(0.68f, -0.68f, 1.85f, -0.68f, 2.52f, 0f)
                curveToRelative(0.34f, 0.34f, 0.52f, 0.79f, 0.52f, 1.26f)
                reflectiveCurveToRelative(-0.19f, 0.93f, -0.52f, 1.26f)
                close()
            }
        }.also { _PenCircle = it}
