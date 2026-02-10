package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EmployeeManAlt: ImageVector? = null

val Icons.Sr.EmployeeManAlt: ImageVector
    get() = _EmployeeManAlt ?: UXIcon(name = "EmployeeManAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 12f)
                curveToRelative(-3.31f, 0f, -6f, -2.69f, -6f, -6f)
                reflectiveCurveTo(8.69f, 0f, 12f, 0f)
                reflectiveCurveToRelative(6f, 2.69f, 6f, 6f)
                reflectiveCurveToRelative(-2.69f, 6f, -6f, 6f)
                close()
                moveTo(14.71f, 14.42f)
                lineToRelative(-1.84f, 2.77f)
                lineToRelative(1.86f, 6.81f)
                horizontalLineToRelative(5.27f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                curveToRelative(0f, -4.02f, -2.65f, -7.43f, -6.29f, -8.58f)
                close()
                moveTo(11.13f, 17.19f)
                lineToRelative(-1.84f, -2.77f)
                curveToRelative(-3.64f, 1.15f, -6.29f, 4.56f, -6.29f, 8.58f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(5.27f)
                lineToRelative(1.86f, -6.81f)
                close()
            }
        }.also { _EmployeeManAlt = it}
