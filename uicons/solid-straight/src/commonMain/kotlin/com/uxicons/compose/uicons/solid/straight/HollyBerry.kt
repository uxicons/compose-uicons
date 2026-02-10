package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HollyBerry: ImageVector? = null

val Icons.Ss.HollyBerry: ImageVector
    get() = _HollyBerry ?: UXIcon(name = "HollyBerry") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(8.97f, 3f)
                curveTo(8.97f, 1.34f, 10.32f, 0f, 11.97f, 0f)
                reflectiveCurveToRelative(3f, 1.34f, 3f, 3f)
                reflectiveCurveToRelative(-1.34f, 3f, -3f, 3f)
                reflectiveCurveToRelative(-3f, -1.34f, -3f, -3f)
                close()
                moveTo(8f, 12f)
                curveToRelative(1.66f, 0f, 3f, -1.34f, 3f, -3f)
                reflectiveCurveToRelative(-1.34f, -3f, -3f, -3f)
                reflectiveCurveToRelative(-3f, 1.34f, -3f, 3f)
                reflectiveCurveToRelative(1.34f, 3f, 3f, 3f)
                close()
                moveTo(16f, 12f)
                curveToRelative(1.66f, 0f, 3f, -1.34f, 3f, -3f)
                reflectiveCurveToRelative(-1.34f, -3f, -3f, -3f)
                reflectiveCurveToRelative(-3f, 1.34f, -3f, 3f)
                reflectiveCurveToRelative(1.34f, 3f, 3f, 3f)
                close()
                moveTo(24f, 17.6f)
                reflectiveCurveToRelative(-1.84f, -0.4f, -3.04f, -1.6f)
                curveToRelative(-0.8f, -0.8f, -1.4f, -2.3f, -1.72f, -3.22f)
                curveToRelative(-0.88f, 0.75f, -2f, 1.23f, -3.25f, 1.23f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(5f)
                curveToRelative(1.4f, 0.37f, 2.73f, 0.94f, 3.38f, 1.6f)
                curveToRelative(1.2f, 1.2f, 1.63f, 3.17f, 1.63f, 3.17f)
                curveToRelative(0f, 0f, 1.35f, -0.8f, 2.85f, -0.8f)
                reflectiveCurveToRelative(2.99f, 0.53f, 2.99f, 0.53f)
                curveToRelative(0f, 0f, -0.85f, -1.5f, -0.85f, -3.0f)
                curveToRelative(0f, -1f, 1f, -2.9f, 1f, -2.9f)
                close()
                moveTo(1f, 20.5f)
                curveToRelative(0f, 1.5f, -0.85f, 3.0f, -0.85f, 3.0f)
                curveToRelative(0f, 0f, 1.49f, -0.53f, 2.99f, -0.53f)
                reflectiveCurveToRelative(2.85f, 0.8f, 2.85f, 0.8f)
                curveToRelative(0f, 0f, 0.43f, -1.97f, 1.63f, -3.17f)
                curveToRelative(0.65f, -0.66f, 1.98f, -1.23f, 3.38f, -1.6f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(-3f)
                curveToRelative(-1.25f, 0f, -2.37f, -0.47f, -3.25f, -1.23f)
                curveToRelative(-0.32f, 0.92f, -0.92f, 2.42f, -1.72f, 3.22f)
                curveToRelative(-1.2f, 1.2f, -3.04f, 1.6f, -3.04f, 1.6f)
                curveToRelative(0f, 0f, 1f, 1.9f, 1f, 2.9f)
                close()
            }
        }.also { _HollyBerry = it}
