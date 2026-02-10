package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChartPieAlt: ImageVector? = null

val Icons.Ts.ChartPieAlt: ImageVector
    get() = _ChartPieAlt ?: UXIcon(name = "ChartPieAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.95f, 9.47f)
                curveTo(23.69f, 4.37f, 19.63f, 0.31f, 14.53f, 0.04f)
                lineToRelative(-0.53f, -0.03f)
                verticalLineToRelative(9.98f)
                horizontalLineToRelative(9.98f)
                reflectiveCurveToRelative(-0.03f, -0.52f, -0.03f, -0.52f)
                close()
                moveTo(15f, 9.0f)
                lineTo(15f, 1.09f)
                curveToRelative(4.17f, 0.46f, 7.45f, 3.74f, 7.91f, 7.91f)
                horizontalLineToRelative(-7.91f)
                close()
                moveTo(21.95f, 12.0f)
                horizontalLineToRelative(-9.95f)
                lineTo(12f, 2.05f)
                reflectiveCurveToRelative(-0.88f, -0.05f, -1f, -0.05f)
                curveTo(4.93f, 2f, 0f, 6.93f, 0f, 13f)
                reflectiveCurveToRelative(4.93f, 11f, 11f, 11f)
                reflectiveCurveToRelative(11f, -4.93f, 11f, -11f)
                curveToRelative(0f, -0.12f, -0.05f, -1f, -0.05f, -1f)
                close()
                moveTo(11f, 23.0f)
                curveToRelative(-5.51f, 0f, -10f, -4.49f, -10f, -10f)
                reflectiveCurveTo(5.49f, 3f, 11f, 3f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(10f)
                curveToRelative(0f, 5.51f, -4.49f, 10f, -10f, 10f)
                close()
            }
        }.also { _ChartPieAlt = it}
