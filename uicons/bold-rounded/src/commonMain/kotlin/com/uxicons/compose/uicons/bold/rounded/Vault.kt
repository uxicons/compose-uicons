package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Vault: ImageVector? = null

val Icons.Br.Vault: ImageVector
    get() = _Vault ?: UXIcon(name = "Vault") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(18.5f, 2f)
            lineTo(5.5f, 2f)
            curveTo(2.47f, 2f, 0f, 4.47f, 0f, 7.5f)
            verticalLineToRelative(9f)
            curveToRelative(0f, 2.13f, 1.22f, 3.99f, 3f, 4.9f)
            verticalLineToRelative(1.1f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            verticalLineToRelative(-0.5f)
            horizontalLineToRelative(12f)
            verticalLineToRelative(0.5f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            verticalLineToRelative(-1.1f)
            curveToRelative(1.78f, -0.91f, 3f, -2.77f, 3f, -4.9f)
            lineTo(24f, 7.5f)
            curveToRelative(0f, -3.03f, -2.47f, -5.5f, -5.5f, -5.5f)
            close()
            moveTo(21f, 16.5f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            lineTo(5.5f, 19f)
            curveToRelative(-1.21f, 0f, -2.22f, -0.86f, -2.45f, -2f)
            horizontalLineToRelative(0.45f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            horizontalLineToRelative(-0.5f)
            verticalLineToRelative(-4f)
            horizontalLineToRelative(0.5f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            horizontalLineToRelative(-0.45f)
            curveToRelative(0.23f, -1.14f, 1.24f, -2f, 2.45f, -2f)
            horizontalLineToRelative(13f)
            curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
            verticalLineToRelative(9f)
            close()
            moveTo(13f, 12f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(3.25f)
            curveToRelative(-0.64f, 2.02f, -2.51f, 3.5f, -4.75f, 3.5f)
            curveToRelative(-3.12f, 0f, -5.57f, -2.85f, -4.88f, -6.09f)
            curveToRelative(0.41f, -1.92f, 1.98f, -3.45f, 3.91f, -3.82f)
            curveToRelative(2.65f, -0.5f, 4.99f, 1.1f, 5.72f, 3.41f)
            horizontalLineToRelative(-3.25f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            close()
        }
    }.also { _Vault = it }
