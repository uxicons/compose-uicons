package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EmployeeMan: ImageVector? = null

val Icons.Sr.EmployeeMan: ImageVector
    get() = _EmployeeMan ?: UXIcon(name = "EmployeeMan") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 17.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(-12f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0f, -1.76f, 1.31f, -3.2f, 3f, -3.45f)
                curveToRelative(0f, -1.1f, 0.9f, -2.05f, 2f, -2.05f)
                horizontalLineToRelative(2f)
                curveToRelative(1.1f, 0f, 2f, 0.95f, 2f, 2.05f)
                curveToRelative(1.69f, 0.24f, 3f, 1.69f, 3f, 3.45f)
                close()
                moveTo(10f, 17.5f)
                curveToRelative(0f, -1.2f, 0.41f, -2.33f, 1.09f, -3.24f)
                curveToRelative(-0.67f, -0.16f, -1.37f, -0.26f, -2.09f, -0.26f)
                curveTo(4.04f, 14f, 0.01f, 18.03f, 0f, 22.98f)
                curveToRelative(-0.0f, 0.56f, 0.44f, 1.02f, 1f, 1.02f)
                horizontalLineToRelative(10.26f)
                curveToRelative(-0.79f, -0.95f, -1.26f, -2.17f, -1.26f, -3.5f)
                verticalLineToRelative(-3f)
                close()
                moveTo(9f, 12f)
                curveToRelative(3.31f, 0f, 6f, -2.69f, 6f, -6f)
                reflectiveCurveTo(12.31f, 0f, 9f, 0f)
                reflectiveCurveTo(3f, 2.69f, 3f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                close()
                moveTo(18f, 21f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(0.5f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(5f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(-5f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                close()
            }
        }.also { _EmployeeMan = it}
