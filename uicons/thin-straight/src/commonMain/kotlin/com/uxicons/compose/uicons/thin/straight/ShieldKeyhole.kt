package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ShieldKeyhole: ImageVector? = null

val Icons.Ts.ShieldKeyhole: ImageVector
    get() = _ShieldKeyhole ?: UXIcon(name = "ShieldKeyhole") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.21f, 2.8f)
                lineTo(12f, 0.08f)
                lineTo(3.79f, 2.8f)
                curveToRelative(-1.07f, 0.35f, -1.79f, 1.35f, -1.79f, 2.47f)
                verticalLineToRelative(6.66f)
                curveToRelative(0f, 6.61f, 7.16f, 10.7f, 9.35f, 11.8f)
                lineToRelative(0.63f, 0.31f)
                lineToRelative(0.65f, -0.26f)
                curveToRelative(2.82f, -1.13f, 9.37f, -4.54f, 9.37f, -11.74f)
                verticalLineToRelative(-6.77f)
                curveToRelative(0f, -1.12f, -0.72f, -2.12f, -1.79f, -2.47f)
                close()
                moveTo(21f, 12.04f)
                curveToRelative(0f, 6.59f, -6.35f, 9.85f, -8.98f, 10.91f)
                curveToRelative(-2.06f, -1.03f, -9.02f, -4.98f, -9.02f, -11.02f)
                verticalLineToRelative(-6.66f)
                curveToRelative(0f, -0.69f, 0.44f, -1.3f, 1.1f, -1.52f)
                lineToRelative(7.9f, -2.62f)
                lineToRelative(7.9f, 2.62f)
                curveToRelative(0.66f, 0.22f, 1.1f, 0.83f, 1.1f, 1.52f)
                verticalLineToRelative(6.77f)
                close()
                moveTo(12f, 7f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                curveToRelative(0f, 1.21f, 0.86f, 2.22f, 2f, 2.45f)
                verticalLineToRelative(4.05f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-4.05f)
                curveToRelative(1.14f, -0.23f, 2f, -1.24f, 2f, -2.45f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(12f, 11f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }.also { _ShieldKeyhole = it}
