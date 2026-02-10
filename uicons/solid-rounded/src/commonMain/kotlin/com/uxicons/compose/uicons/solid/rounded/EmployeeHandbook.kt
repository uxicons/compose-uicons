package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EmployeeHandbook: ImageVector? = null

val Icons.Sr.EmployeeHandbook: ImageVector
    get() = _EmployeeHandbook ?: UXIcon(name = "EmployeeHandbook") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.2f, 2.16f)
                curveToRelative(-1.14f, -0.95f, -2.63f, -1.35f, -4.16f, -1.07f)
                lineToRelative(-1.76f, 0.43f)
                curveToRelative(-1.9f, 0.35f, -3.28f, 2.0f, -3.28f, 3.94f)
                verticalLineToRelative(15.47f)
                curveToRelative(-0.66f, 0.1f, -1.34f, 0.1f, -2f, 0f)
                lineTo(11f, 5.46f)
                curveToRelative(0f, -1.93f, -1.38f, -3.59f, -3.23f, -3.92f)
                lineToRelative(-1.88f, -0.46f)
                curveToRelative(-1.46f, -0.26f, -2.96f, 0.13f, -4.1f, 1.08f)
                curveToRelative(-1.14f, 0.95f, -1.8f, 2.35f, -1.8f, 3.84f)
                verticalLineToRelative(10.79f)
                curveToRelative(0f, 2.42f, 1.73f, 4.49f, 4.11f, 4.92f)
                lineToRelative(6.29f, 1.14f)
                curveToRelative(0.53f, 0.1f, 1.07f, 0.15f, 1.61f, 0.15f)
                reflectiveCurveToRelative(1.07f, -0.05f, 1.61f, -0.15f)
                lineToRelative(6.29f, -1.14f)
                curveToRelative(2.38f, -0.43f, 4.11f, -2.5f, 4.11f, -4.92f)
                lineTo(24.0f, 6f)
                curveToRelative(0f, -1.49f, -0.65f, -2.89f, -1.8f, -3.84f)
                close()
                moveTo(4.5f, 6f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-6f)
                close()
                moveTo(5.5f, 18f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }.also { _EmployeeHandbook = it}
