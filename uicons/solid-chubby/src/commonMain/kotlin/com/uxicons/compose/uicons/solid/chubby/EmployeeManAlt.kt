package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EmployeeManAlt: ImageVector? = null

val Icons.Sc.EmployeeManAlt: ImageVector
    get() = _EmployeeManAlt ?: UXIcon(name = "EmployeeManAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 12f)
                curveToRelative(-3.8f, 0f, -5.5f, -1.7f, -5.5f, -5.5f)
                reflectiveCurveToRelative(1.7f, -5.5f, 5.5f, -5.5f)
                reflectiveCurveToRelative(5.5f, 1.7f, 5.5f, 5.5f)
                reflectiveCurveToRelative(-1.7f, 5.5f, -5.5f, 5.5f)
                close()
                moveTo(14.04f, 14.11f)
                curveToRelative(-0.34f, 0.56f, -0.71f, 1.12f, -1.1f, 1.67f)
                curveToRelative(0.41f, 1.34f, 0.75f, 2.68f, 1.0f, 4.05f)
                curveToRelative(0.13f, 0.6f, -0.32f, 1.17f, -0.94f, 1.17f)
                horizontalLineToRelative(-2f)
                curveToRelative(-0.62f, 0f, -1.07f, -0.57f, -0.94f, -1.17f)
                curveToRelative(0.21f, -1.29f, 0.56f, -2.62f, 0.98f, -3.99f)
                curveToRelative(-0.41f, -0.55f, -0.79f, -1.12f, -1.13f, -1.72f)
                curveToRelative(-4.5f, 0.55f, -6.66f, 3.02f, -6.91f, 7.83f)
                curveToRelative(-0.01f, 0.27f, 0.09f, 0.54f, 0.27f, 0.74f)
                reflectiveCurveToRelative(0.45f, 0.31f, 0.73f, 0.31f)
                horizontalLineToRelative(16f)
                curveToRelative(0.27f, 0f, 0.54f, -0.11f, 0.73f, -0.31f)
                curveToRelative(0.19f, -0.2f, 0.29f, -0.47f, 0.27f, -0.74f)
                curveToRelative(-0.26f, -4.82f, -2.42f, -7.3f, -6.96f, -7.83f)
                close()
            }
        }.also { _EmployeeManAlt = it}
