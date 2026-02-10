package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Payroll: ImageVector? = null

val Icons.Ss.Payroll: ImageVector
    get() = _Payroll ?: UXIcon(name = "Payroll") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20f, 2f)
                lineTo(4f, 2f)
                lineTo(4f, 0f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(2f)
                close()
                moveTo(12f, 13f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                close()
                moveTo(2f, 9.24f)
                verticalLineToRelative(-5.24f)
                horizontalLineToRelative(20f)
                verticalLineToRelative(5.24f)
                lineToRelative(-7.88f, 7.88f)
                curveToRelative(-1.13f, 1.13f, -3.11f, 1.13f, -4.24f, 0f)
                lineToRelative(-7.88f, -7.88f)
                close()
                moveTo(17f, 7.5f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                close()
                moveTo(8.5f, 11.5f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                reflectiveCurveToRelative(3.5f, -1.57f, 3.5f, -3.5f)
                reflectiveCurveToRelative(-1.57f, -3.5f, -3.5f, -3.5f)
                reflectiveCurveToRelative(-3.5f, 1.57f, -3.5f, 3.5f)
                close()
                moveTo(4f, 7.5f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                close()
                moveTo(15.54f, 18.54f)
                curveToRelative(-0.94f, 0.94f, -2.2f, 1.47f, -3.54f, 1.47f)
                reflectiveCurveToRelative(-2.59f, -0.52f, -3.54f, -1.47f)
                lineTo(0.42f, 10.49f)
                curveTo(0.16f, 11.03f, 0.0f, 11.62f, 0.0f, 12.23f)
                lineToRelative(-0.0f, 11.77f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-11.77f)
                curveToRelative(0f, -0.61f, -0.15f, -1.2f, -0.42f, -1.74f)
                lineToRelative(-8.05f, 8.05f)
                close()
            }
        }.also { _Payroll = it}
