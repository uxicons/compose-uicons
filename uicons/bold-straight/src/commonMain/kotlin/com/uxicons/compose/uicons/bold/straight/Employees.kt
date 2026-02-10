package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Employees: ImageVector? = null

val Icons.Bs.Employees: ImageVector
    get() = _Employees ?: UXIcon(name = "Employees") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17.5f, 8f)
                curveToRelative(2.21f, 0f, 4f, 1.79f, 4f, 4f)
                reflectiveCurveToRelative(-1.79f, 4f, -4f, 4f)
                reflectiveCurveToRelative(-4f, -1.79f, -4f, -4f)
                reflectiveCurveToRelative(1.79f, -4f, 4f, -4f)
                close()
                moveTo(12f, 8f)
                curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
                reflectiveCurveTo(14.21f, 0f, 12f, 0f)
                reflectiveCurveToRelative(-4f, 1.79f, -4f, 4f)
                reflectiveCurveToRelative(1.79f, 4f, 4f, 4f)
                close()
                moveTo(6.5f, 16f)
                curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
                reflectiveCurveToRelative(-1.79f, -4f, -4f, -4f)
                reflectiveCurveToRelative(-4f, 1.79f, -4f, 4f)
                reflectiveCurveToRelative(1.79f, 4f, 4f, 4f)
                close()
                moveTo(19.5f, 17f)
                horizontalLineToRelative(-4.5f)
                curveToRelative(-1.16f, 0f, -2.2f, 0.45f, -3f, 1.17f)
                curveToRelative(-0.8f, -0.72f, -1.84f, -1.17f, -3f, -1.17f)
                horizontalLineToRelative(-4.5f)
                curveToRelative(-2.48f, 0f, -4.5f, 2.02f, -4.5f, 4.5f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0f, -0.78f, 0.6f, -1.42f, 1.37f, -1.49f)
                lineToRelative(2.39f, 2.99f)
                lineToRelative(2.39f, -2.98f)
                curveToRelative(0.76f, 0.07f, 1.35f, 0.71f, 1.35f, 1.49f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0f, -0.78f, 0.6f, -1.42f, 1.37f, -1.49f)
                lineToRelative(2.39f, 2.99f)
                lineToRelative(2.39f, -2.98f)
                curveToRelative(0.76f, 0.07f, 1.35f, 0.71f, 1.35f, 1.49f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
                close()
            }
        }.also { _Employees = it}
