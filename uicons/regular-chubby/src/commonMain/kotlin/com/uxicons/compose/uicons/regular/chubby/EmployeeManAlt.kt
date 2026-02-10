package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EmployeeManAlt: ImageVector? = null

val Icons.Rc.EmployeeManAlt: ImageVector
    get() = _EmployeeManAlt ?: UXIcon(name = "EmployeeManAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 13f)
                curveToRelative(4.15f, 0f, 6f, -1.85f, 6f, -6f)
                reflectiveCurveToRelative(-1.85f, -6f, -6f, -6f)
                reflectiveCurveToRelative(-6f, 1.85f, -6f, 6f)
                reflectiveCurveToRelative(1.85f, 6f, 6f, 6f)
                close()
                moveTo(12f, 3f)
                curveToRelative(3.03f, 0f, 4f, 0.97f, 4f, 4f)
                reflectiveCurveToRelative(-0.97f, 4f, -4f, 4f)
                reflectiveCurveToRelative(-4f, -0.97f, -4f, -4f)
                reflectiveCurveToRelative(0.97f, -4f, 4f, -4f)
                close()
                moveTo(21.0f, 21.95f)
                curveToRelative(0.03f, 0.55f, -0.4f, 1.02f, -0.95f, 1.05f)
                curveToRelative(-0.55f, 0.03f, -1.02f, -0.39f, -1.05f, -0.95f)
                curveToRelative(-0.2f, -3.73f, -1.59f, -5.48f, -4.97f, -5.93f)
                curveToRelative(-0.33f, 0.56f, -0.7f, 1.11f, -1.09f, 1.65f)
                curveToRelative(0.41f, 1.34f, 0.75f, 2.68f, 1.0f, 4.05f)
                curveToRelative(0.13f, 0.6f, -0.32f, 1.17f, -0.94f, 1.17f)
                horizontalLineToRelative(-2f)
                curveToRelative(-0.62f, 0f, -1.07f, -0.57f, -0.94f, -1.17f)
                curveToRelative(0.21f, -1.29f, 0.56f, -2.62f, 0.98f, -3.99f)
                curveToRelative(-0.41f, -0.54f, -0.79f, -1.11f, -1.12f, -1.71f)
                curveToRelative(-3.34f, 0.46f, -4.73f, 2.2f, -4.92f, 5.92f)
                curveToRelative(-0.03f, 0.55f, -0.51f, 0.97f, -1.05f, 0.95f)
                curveToRelative(-0.55f, -0.03f, -0.97f, -0.5f, -0.95f, -1.05f)
                curveToRelative(0.29f, -5.5f, 3.07f, -7.95f, 9.0f, -7.95f)
                reflectiveCurveToRelative(8.71f, 2.45f, 9.0f, 7.95f)
                close()
            }
        }.also { _EmployeeManAlt = it}
