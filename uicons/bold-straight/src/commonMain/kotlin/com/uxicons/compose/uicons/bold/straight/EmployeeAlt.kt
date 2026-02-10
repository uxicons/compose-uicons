package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EmployeeAlt: ImageVector? = null

val Icons.Bs.EmployeeAlt: ImageVector
    get() = _EmployeeAlt ?: UXIcon(name = "EmployeeAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 14f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                horizontalLineToRelative(-3f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(13f)
                verticalLineToRelative(-7f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(21f, 21f)
                horizontalLineToRelative(-7f)
                verticalLineToRelative(-4f)
                reflectiveCurveToRelative(2f, 0f, 2f, 0f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(4f)
                close()
                moveTo(10.03f, 14f)
                curveToRelative(-0.64f, 0.84f, -1.03f, 1.87f, -1.03f, 3f)
                horizontalLineToRelative(-4f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(5f)
                lineTo(0f, 24f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -2.76f, 2.24f, -5f, 5f, -5f)
                horizontalLineToRelative(5.03f)
                close()
                moveTo(4.63f, 12f)
                curveToRelative(-1.23f, 0.18f, -2.38f, 0.66f, -3.36f, 1.38f)
                curveToRelative(0.01f, -0.03f, 0.0f, -0.05f, 0.01f, -0.08f)
                lineToRelative(1.37f, -7.57f)
                curveTo(3.15f, 2.46f, 5.92f, 0f, 9.13f, 0f)
                reflectiveCurveToRelative(5.98f, 2.46f, 6.48f, 5.73f)
                lineToRelative(0.77f, 4.27f)
                horizontalLineToRelative(-0.38f)
                curveToRelative(-0.97f, 0f, -1.86f, 0.36f, -2.55f, 0.95f)
                lineToRelative(-0.81f, -4.73f)
                curveToRelative(-0.16f, -1.1f, -0.8f, -2.06f, -1.67f, -2.63f)
                curveToRelative(-1.23f, 1.14f, -3.7f, 2.42f, -4.85f, 2.42f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                curveToRelative(0.57f, 0f, 1.33f, -0.18f, 1.83f, -0.58f)
                lineToRelative(0.53f, 3.08f)
                curveToRelative(-0.72f, 0.31f, -1.51f, 0.49f, -2.35f, 0.49f)
                horizontalLineToRelative(-4.5f)
                close()
            }
        }.also { _EmployeeAlt = it}
