package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Employees: ImageVector? = null

val Icons.Ss.Employees: ImageVector
    get() = _Employees ?: UXIcon(name = "Employees") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18.5f, 16f)
                curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
                reflectiveCurveToRelative(1.79f, -4f, 4f, -4f)
                reflectiveCurveToRelative(4f, 1.79f, 4f, 4f)
                reflectiveCurveToRelative(-1.79f, 4f, -4f, 4f)
                close()
                moveTo(12f, 8f)
                curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
                reflectiveCurveTo(9.79f, 0f, 12f, 0f)
                reflectiveCurveToRelative(4f, 1.79f, 4f, 4f)
                reflectiveCurveToRelative(-1.79f, 4f, -4f, 4f)
                close()
                moveTo(5.5f, 16f)
                curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
                reflectiveCurveToRelative(1.79f, -4f, 4f, -4f)
                reflectiveCurveToRelative(4f, 1.79f, 4f, 4f)
                reflectiveCurveToRelative(-1.79f, 4f, -4f, 4f)
                close()
                moveTo(11f, 24f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -1.63f, -1.3f, -2.95f, -2.92f, -2.99f)
                lineToRelative(-2.58f, 2.99f)
                lineToRelative(-2.62f, -2.99f)
                curveToRelative(-1.6f, 0.07f, -2.88f, 1.37f, -2.88f, 2.99f)
                verticalLineToRelative(3f)
                moveToRelative(24f, 0f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -1.63f, -1.3f, -2.95f, -2.92f, -2.99f)
                lineToRelative(-2.58f, 2.99f)
                lineToRelative(-2.62f, -2.99f)
                curveToRelative(-1.6f, 0.07f, -2.88f, 1.37f, -2.88f, 2.99f)
                verticalLineToRelative(3f)
            }
        }.also { _Employees = it}
