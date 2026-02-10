package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ShieldKeyhole: ImageVector? = null

val Icons.Br.ShieldKeyhole: ImageVector
    get() = _ShieldKeyhole ?: UXIcon(name = "ShieldKeyhole") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(14.5f, 9.5f)
            curveToRelative(0f, 0.82f, -0.39f, 1.54f, -1f, 2f)
            verticalLineToRelative(3f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            verticalLineToRelative(-3f)
            curveToRelative(-0.61f, -0.46f, -1f, -1.18f, -1f, -2f)
            curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
            reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
            close()
            moveTo(22f, 7.05f)
            verticalLineToRelative(5.11f)
            curveToRelative(0f, 7.37f, -6.92f, 10.73f, -9.04f, 11.58f)
            curveToRelative(0f, 0f, -0.58f, 0.27f, -0.95f, 0.27f)
            reflectiveCurveToRelative(-1.05f, -0.35f, -1.05f, -0.35f)
            curveToRelative(-2.1f, -1.05f, -8.95f, -4.98f, -8.95f, -11.5f)
            verticalLineToRelative(-5.11f)
            curveToRelative(0f, -2.28f, 1.45f, -4.29f, 3.62f, -5.01f)
            lineTo(11.53f, 0.08f)
            curveToRelative(0.31f, -0.1f, 0.64f, -0.1f, 0.94f, 0f)
            lineToRelative(5.91f, 1.96f)
            curveToRelative(2.16f, 0.72f, 3.62f, 2.73f, 3.62f, 5.01f)
            close()
            moveTo(19f, 7.05f)
            curveToRelative(0f, -0.98f, -0.63f, -1.85f, -1.56f, -2.16f)
            lineToRelative(-5.44f, -1.8f)
            lineToRelative(-5.44f, 1.8f)
            curveToRelative(-0.93f, 0.31f, -1.56f, 1.18f, -1.56f, 2.16f)
            verticalLineToRelative(5.11f)
            curveToRelative(0f, 4.61f, 5.14f, 7.7f, 7.07f, 8.7f)
            curveToRelative(1.9f, -0.81f, 6.93f, -3.44f, 6.93f, -8.7f)
            verticalLineToRelative(-5.11f)
            close()
        }
    }.also { _ShieldKeyhole = it }
