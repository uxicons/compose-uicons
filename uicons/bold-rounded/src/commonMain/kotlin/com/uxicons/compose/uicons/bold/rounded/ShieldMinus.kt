package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ShieldMinus: ImageVector? = null

val Icons.Br.ShieldMinus: ImageVector
    get() = _ShieldMinus ?: UXIcon(name = "ShieldMinus") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(18.38f, 2.04f)
            lineTo(12.47f, 0.08f)
            curveToRelative(-0.31f, -0.1f, -0.64f, -0.1f, -0.94f, 0f)
            lineToRelative(-5.91f, 1.96f)
            curveToRelative(-2.16f, 0.72f, -3.62f, 2.73f, -3.62f, 5.01f)
            verticalLineToRelative(5.11f)
            curveToRelative(0f, 6.52f, 6.85f, 10.45f, 8.95f, 11.5f)
            curveToRelative(0f, 0f, 0.64f, 0.35f, 1.05f, 0.35f)
            reflectiveCurveToRelative(0.95f, -0.27f, 0.95f, -0.27f)
            curveToRelative(2.12f, -0.85f, 9.04f, -4.21f, 9.04f, -11.58f)
            verticalLineToRelative(-5.11f)
            curveToRelative(0f, -2.28f, -1.45f, -4.29f, -3.62f, -5.01f)
            close()
            moveTo(19f, 12.15f)
            curveToRelative(0f, 5.26f, -5.03f, 7.89f, -6.93f, 8.7f)
            curveToRelative(-1.93f, -1.0f, -7.07f, -4.1f, -7.07f, -8.7f)
            verticalLineToRelative(-5.11f)
            curveToRelative(0f, -0.98f, 0.63f, -1.85f, 1.56f, -2.16f)
            lineToRelative(5.44f, -1.8f)
            lineToRelative(5.44f, 1.8f)
            curveToRelative(0.93f, 0.31f, 1.56f, 1.18f, 1.56f, 2.16f)
            verticalLineToRelative(5.11f)
            close()
            moveTo(16f, 11.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-5f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
            horizontalLineToRelative(5f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            close()
        }
    }.also { _ShieldMinus = it }
