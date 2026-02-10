package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MarsStrokeUp: ImageVector? = null

val Icons.Tc.MarsStrokeUp: ImageVector
    get() = _MarsStrokeUp ?: UXIcon(name = "MarsStrokeUp") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12.5f, 11.03f)
                verticalLineToRelative(-2.03f)
                horizontalLineToRelative(3f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-5.45f)
                curveToRelative(1.15f, 0.96f, 2.2f, 2.05f, 3.1f, 3.25f)
                curveToRelative(0.17f, 0.22f, 0.48f, 0.27f, 0.7f, 0.1f)
                curveToRelative(0.22f, -0.17f, 0.27f, -0.48f, 0.1f, -0.7f)
                curveToRelative(-1.17f, -1.55f, -2.54f, -2.93f, -4.1f, -4.1f)
                curveToRelative(-0.18f, -0.13f, -0.42f, -0.13f, -0.6f, 0f)
                curveToRelative(-1.56f, 1.17f, -2.94f, 2.54f, -4.1f, 4.1f)
                curveToRelative(-0.17f, 0.22f, -0.12f, 0.53f, 0.1f, 0.7f)
                reflectiveCurveToRelative(0.53f, 0.12f, 0.7f, -0.1f)
                curveToRelative(0.9f, -1.2f, 1.95f, -2.29f, 3.1f, -3.25f)
                verticalLineToRelative(5.45f)
                horizontalLineToRelative(-3f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(2.03f)
                curveToRelative(-3.83f, 0.15f, -5.5f, 1.95f, -5.5f, 5.97f)
                curveToRelative(0f, 4.21f, 1.79f, 6f, 6f, 6f)
                reflectiveCurveToRelative(6f, -1.79f, 6f, -6f)
                curveToRelative(0f, -4.03f, -1.67f, -5.82f, -5.5f, -5.97f)
                close()
                moveTo(12f, 22f)
                curveToRelative(-3.65f, 0f, -5f, -1.35f, -5f, -5f)
                reflectiveCurveToRelative(1.35f, -5f, 5f, -5f)
                reflectiveCurveToRelative(5f, 1.35f, 5f, 5f)
                reflectiveCurveToRelative(-1.35f, 5f, -5f, 5f)
                close()
            }
        }.also { _MarsStrokeUp = it}
