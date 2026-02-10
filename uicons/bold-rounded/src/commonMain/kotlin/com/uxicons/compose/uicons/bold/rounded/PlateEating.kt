package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PlateEating: ImageVector? = null

val Icons.Br.PlateEating: ImageVector
    get() = _PlateEating ?: UXIcon(name = "PlateEating") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12f, 21f)
            curveToRelative(0.69f, 0f, 1.36f, -0.09f, 2f, -0.23f)
            verticalLineToRelative(3.05f)
            curveToRelative(-0.65f, 0.11f, -1.32f, 0.18f, -2f, 0.18f)
            verticalLineToRelative(-3f)
            close()
            moveTo(12f, 0f)
            curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
            curveToRelative(0f, 4.43f, 2.42f, 8.3f, 6f, 10.38f)
            verticalLineToRelative(-3.69f)
            curveToRelative(-1.84f, -1.65f, -3f, -4.03f, -3f, -6.69f)
            curveTo(3f, 7.04f, 7.04f, 3f, 12f, 3f)
            reflectiveCurveToRelative(9f, 4.04f, 9f, 9f)
            curveToRelative(0f, 1.48f, -0.36f, 2.87f, -1f, 4.1f)
            verticalLineToRelative(4.82f)
            curveToRelative(2.45f, -2.2f, 4f, -5.38f, 4f, -8.92f)
            curveTo(24f, 5.38f, 18.62f, 0f, 12f, 0f)
            close()
            moveTo(16.61f, 8.23f)
            curveToRelative(-0.94f, 0.85f, -2.49f, 3.03f, -2.61f, 6.1f)
            curveToRelative(-0.04f, 1.71f, 0.47f, 3.6f, 2.0f, 5.46f)
            verticalLineToRelative(3.21f)
            curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
            reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
            lineTo(18f, 8.74f)
            curveToRelative(-0.0f, -0.63f, -0.86f, -1.0f, -1.39f, -0.51f)
            close()
            moveTo(13f, 12.5f)
            verticalLineToRelative(-3.5f)
            curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
            reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
            verticalLineToRelative(3.5f)
            curveToRelative(0f, 0.74f, -0.41f, 1.38f, -1f, 1.72f)
            verticalLineToRelative(-5.22f)
            curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
            reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
            verticalLineToRelative(5.22f)
            curveToRelative(-0.59f, -0.35f, -1f, -0.98f, -1f, -1.72f)
            verticalLineToRelative(-3.5f)
            curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
            reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
            verticalLineToRelative(3.5f)
            curveToRelative(0f, 1.86f, 1.28f, 3.41f, 3f, 3.86f)
            verticalLineToRelative(6.64f)
            curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
            reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
            verticalLineToRelative(-6.64f)
            curveToRelative(1.72f, -0.45f, 3f, -2f, 3f, -3.86f)
            close()
        }
    }.also { _PlateEating = it }
