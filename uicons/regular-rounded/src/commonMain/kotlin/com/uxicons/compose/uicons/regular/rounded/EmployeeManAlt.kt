package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EmployeeManAlt: ImageVector? = null

val Icons.Rr.EmployeeManAlt: ImageVector
    get() = _EmployeeManAlt ?: UXIcon(name = "EmployeeManAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 12f)
                curveToRelative(3.31f, 0f, 6f, -2.69f, 6f, -6f)
                reflectiveCurveTo(15.31f, 0f, 12f, 0f)
                reflectiveCurveToRelative(-6f, 2.69f, -6f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                close()
                moveTo(12f, 2f)
                curveToRelative(2.21f, 0f, 4f, 1.79f, 4f, 4f)
                reflectiveCurveToRelative(-1.79f, 4f, -4f, 4f)
                reflectiveCurveToRelative(-4f, -1.79f, -4f, -4f)
                reflectiveCurveToRelative(1.79f, -4f, 4f, -4f)
                close()
                moveTo(21f, 23f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                curveToRelative(0f, -3.02f, -1.93f, -5.59f, -4.61f, -6.57f)
                lineToRelative(-1.52f, 2.28f)
                lineToRelative(1.09f, 3.99f)
                curveToRelative(0.18f, 0.67f, -0.41f, 1.3f, -1.2f, 1.3f)
                horizontalLineToRelative(-1.53f)
                curveToRelative(-0.8f, 0f, -1.38f, -0.64f, -1.2f, -1.3f)
                lineToRelative(1.09f, -3.99f)
                lineToRelative(-1.52f, -2.28f)
                curveToRelative(-2.68f, 0.98f, -4.61f, 3.55f, -4.61f, 6.57f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                curveToRelative(0f, -4.96f, 4.04f, -9f, 9f, -9f)
                reflectiveCurveToRelative(9f, 4.04f, 9f, 9f)
                close()
            }
        }.also { _EmployeeManAlt = it}
