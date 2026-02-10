package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChartPie: ImageVector? = null

val Icons.Ts.ChartPie: ImageVector
    get() = _ChartPie ?: UXIcon(name = "ChartPie") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(22.98f, 11.5f)
                horizontalLineToRelative(-10.47f)
                lineTo(12.5f, 1.02f)
                curveToRelative(5.67f, 0.26f, 10.22f, 4.81f, 10.47f, 10.47f)
                close()
                moveTo(13.21f, 12.5f)
                horizontalLineToRelative(9.77f)
                curveToRelative(-0.12f, 2.65f, -1.18f, 5.06f, -2.86f, 6.9f)
                lineToRelative(-6.9f, -6.9f)
                close()
                moveTo(1f, 12f)
                curveTo(1f, 6.1f, 5.67f, 1.29f, 11.5f, 1.02f)
                verticalLineToRelative(11.18f)
                lineToRelative(7.9f, 7.9f)
                curveToRelative(-1.96f, 1.79f, -4.55f, 2.89f, -7.4f, 2.89f)
                curveToRelative(-6.07f, 0f, -11f, -4.93f, -11f, -11f)
                close()
            }
        }.also { _ChartPie = it}
