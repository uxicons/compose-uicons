package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ShieldKeyhole: ImageVector? = null

val Icons.Tr.ShieldKeyhole: ImageVector
    get() = _ShieldKeyhole ?: UXIcon(name = "ShieldKeyhole") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 7f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                curveToRelative(0f, 1.21f, 0.86f, 2.22f, 2f, 2.45f)
                verticalLineToRelative(3.55f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                verticalLineToRelative(-3.55f)
                curveToRelative(1.14f, -0.23f, 2f, -1.24f, 2f, -2.45f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(12f, 11f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(18.76f, 2.22f)
                lineTo(12.16f, 0.03f)
                curveToRelative(-0.1f, -0.03f, -0.21f, -0.03f, -0.31f, 0f)
                lineToRelative(-6.61f, 2.19f)
                curveToRelative(-1.94f, 0.64f, -3.24f, 2.44f, -3.24f, 4.48f)
                verticalLineToRelative(5.24f)
                curveToRelative(0f, 6.61f, 7.16f, 10.7f, 9.35f, 11.8f)
                curveToRelative(0f, 0f, 0.32f, 0.27f, 0.65f, 0.27f)
                reflectiveCurveToRelative(0.63f, -0.21f, 0.63f, -0.21f)
                curveToRelative(2.2f, -0.88f, 9.37f, -4.35f, 9.37f, -11.85f)
                verticalLineToRelative(-5.24f)
                curveToRelative(0f, -2.04f, -1.3f, -3.84f, -3.24f, -4.48f)
                close()
                moveTo(21f, 11.94f)
                curveToRelative(0f, 6.87f, -6.69f, 10.1f, -8.74f, 10.92f)
                lineToRelative(-0.23f, 0.09f)
                lineToRelative(-0.22f, -0.11f)
                curveToRelative(-2.06f, -1.03f, -8.8f, -4.87f, -8.8f, -10.9f)
                verticalLineToRelative(-5.24f)
                curveToRelative(0f, -1.61f, 1.02f, -3.03f, 2.55f, -3.53f)
                lineToRelative(6.45f, -2.14f)
                lineToRelative(6.45f, 2.14f)
                curveToRelative(1.52f, 0.51f, 2.55f, 1.93f, 2.55f, 3.53f)
                verticalLineToRelative(5.24f)
                close()
            }
        }.also { _ShieldKeyhole = it}
