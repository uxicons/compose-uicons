package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PlateEating: ImageVector? = null

val Icons.Sr.PlateEating: ImageVector
    get() = _PlateEating ?: UXIcon(name = "PlateEating") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                curveTo(5.37f, 0f, 0f, 5.37f, 0f, 12f)
                curveToRelative(0f, 5.22f, 3.34f, 9.65f, 8f, 11.3f)
                verticalLineToRelative(-7.95f)
                curveToRelative(-1.72f, -0.45f, -3f, -2f, -3f, -3.86f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(3.5f)
                curveToRelative(0f, 0.74f, 0.41f, 1.38f, 1f, 1.72f)
                verticalLineToRelative(-5.22f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(5.22f)
                curveToRelative(0.59f, -0.35f, 1f, -0.98f, 1f, -1.72f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(3.5f)
                curveToRelative(0f, 1.86f, -1.28f, 3.41f, -3f, 3.86f)
                verticalLineToRelative(8.46f)
                curveToRelative(0.65f, 0.11f, 1.32f, 0.18f, 2f, 0.18f)
                curveToRelative(1.41f, 0f, 2.75f, -0.25f, 4f, -0.7f)
                verticalLineToRelative(-4.51f)
                curveToRelative(-1.53f, -1.86f, -2.04f, -3.76f, -2.0f, -5.46f)
                curveToRelative(0.12f, -3.08f, 1.67f, -5.25f, 2.61f, -6.1f)
                curveToRelative(0.54f, -0.5f, 1.39f, -0.12f, 1.39f, 0.51f)
                verticalLineToRelative(14.64f)
                curveToRelative(3.58f, -2.08f, 6f, -5.94f, 6f, -10.38f)
                curveTo(24f, 5.37f, 18.63f, 0f, 12f, 0f)
                close()
            }
        }.also { _PlateEating = it}
