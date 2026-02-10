package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EmployeeManAlt: ImageVector? = null

val Icons.Ts.EmployeeManAlt: ImageVector
    get() = _EmployeeManAlt ?: UXIcon(name = "EmployeeManAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 12f)
                curveToRelative(3.31f, 0f, 6f, -2.69f, 6f, -6f)
                reflectiveCurveTo(15.31f, 0f, 12f, 0f)
                reflectiveCurveToRelative(-6f, 2.69f, -6f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                close()
                moveTo(12f, 1f)
                curveToRelative(2.76f, 0f, 5f, 2.24f, 5f, 5f)
                reflectiveCurveToRelative(-2.24f, 5f, -5f, 5f)
                reflectiveCurveToRelative(-5f, -2.24f, -5f, -5f)
                reflectiveCurveTo(9.24f, 1f, 12f, 1f)
                close()
                moveTo(16.5f, 14f)
                lineTo(7.5f, 14f)
                curveToRelative(-2.48f, 0f, -4.5f, 2.02f, -4.5f, 4.5f)
                verticalLineToRelative(5.5f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-5.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(1.58f)
                lineToRelative(1.88f, 2.61f)
                lineToRelative(-1.5f, 6.39f)
                horizontalLineToRelative(1.03f)
                lineToRelative(1.52f, -6.44f)
                lineToRelative(1.52f, 6.44f)
                horizontalLineToRelative(1.03f)
                lineToRelative(-1.5f, -6.39f)
                lineToRelative(1.88f, -2.61f)
                horizontalLineToRelative(1.58f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(5.5f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-5.5f)
                curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
                close()
                moveTo(12f, 17.34f)
                lineToRelative(-1.69f, -2.34f)
                horizontalLineToRelative(3.38f)
                lineToRelative(-1.69f, 2.34f)
                close()
            }
        }.also { _EmployeeManAlt = it}
