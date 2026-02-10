package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HardHat: ImageVector? = null

val Icons.Br.HardHat: ImageVector
    get() = _HardHat ?: UXIcon(name = "HardHat") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(23f, 15.09f)
            verticalLineToRelative(-2.14f)
            curveToRelative(0f, -4.74f, -3.18f, -8.91f, -7.77f, -10.29f)
            curveToRelative(-0.73f, -1.0f, -1.9f, -1.66f, -3.23f, -1.66f)
            reflectiveCurveToRelative(-2.5f, 0.66f, -3.23f, 1.66f)
            curveTo(4.18f, 4.04f, 1f, 8.21f, 1f, 12.95f)
            verticalLineToRelative(2.14f)
            curveToRelative(-0.58f, 0.21f, -1f, 0.76f, -1f, 1.41f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(0.27f)
            lineToRelative(0.39f, 0.5f)
            curveToRelative(2.35f, 3.03f, 5.57f, 4.5f, 9.84f, 4.5f)
            reflectiveCurveToRelative(7.48f, -1.47f, 9.83f, -4.5f)
            lineToRelative(0.4f, -0.51f)
            horizontalLineToRelative(0.27f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            curveToRelative(0f, -0.65f, -0.42f, -1.2f, -1f, -1.41f)
            close()
            moveTo(20f, 12.95f)
            verticalLineToRelative(2.05f)
            horizontalLineToRelative(-4f)
            lineTo(16f, 6.25f)
            curveToRelative(2.42f, 1.37f, 4f, 3.89f, 4f, 6.71f)
            close()
            moveTo(12f, 4f)
            curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 0.99f)
            verticalLineToRelative(10.01f)
            horizontalLineToRelative(-2f)
            lineTo(11f, 4.99f)
            curveToRelative(0f, -0.55f, 0.45f, -0.99f, 1f, -0.99f)
            close()
            moveTo(8f, 6.25f)
            verticalLineToRelative(8.76f)
            horizontalLineToRelative(-4f)
            verticalLineToRelative(-2.05f)
            curveToRelative(0f, -2.81f, 1.58f, -5.34f, 4f, -6.7f)
            close()
            moveTo(5.82f, 18f)
            horizontalLineToRelative(12.36f)
            curveToRelative(-1.6f, 1.35f, -3.6f, 2f, -6.18f, 2f)
            reflectiveCurveToRelative(-4.58f, -0.65f, -6.18f, -2f)
            close()
        }
    }.also { _HardHat = it }
