package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Patient: ImageVector? = null

val Icons.Ts.Patient: ImageVector
    get() = _Patient ?: UXIcon(name = "Patient") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9f, 12f)
                curveToRelative(3.31f, 0f, 6f, -2.69f, 6f, -6f)
                reflectiveCurveToRelative(-2.69f, -6f, -6f, -6f)
                reflectiveCurveToRelative(-6f, 2.69f, -6f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                close()
                moveTo(9f, 1f)
                curveToRelative(2.76f, 0f, 5f, 2.24f, 5f, 5f)
                reflectiveCurveToRelative(-2.24f, 5f, -5f, 5f)
                reflectiveCurveToRelative(-5f, -2.24f, -5f, -5f)
                reflectiveCurveToRelative(2.24f, -5f, 5f, -5f)
                close()
                moveTo(24f, 19f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-2.71f)
                lineToRelative(-2.35f, 3.96f)
                lineToRelative(-2.99f, -6.85f)
                lineToRelative(-1.65f, 2.89f)
                horizontalLineToRelative(-3.29f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(2.71f)
                lineToRelative(2.35f, -4.11f)
                lineToRelative(3.01f, 6.88f)
                lineToRelative(1.65f, -2.77f)
                close()
                moveTo(4.5f, 15f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(5.5f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-5.5f)
                curveToRelative(0f, -2.48f, 2.02f, -4.5f, 4.5f, -4.5f)
                horizontalLineToRelative(9f)
                curveToRelative(0.25f, 0f, 0.48f, 0.03f, 0.72f, 0.07f)
                lineToRelative(-0.54f, 0.94f)
                curveToRelative(-0.06f, -0.0f, -0.12f, -0.02f, -0.18f, -0.02f)
                close()
            }
        }.also { _Patient = it}
