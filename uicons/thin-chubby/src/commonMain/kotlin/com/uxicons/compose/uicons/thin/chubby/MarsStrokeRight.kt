package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MarsStrokeRight: ImageVector? = null

val Icons.Tc.MarsStrokeRight: ImageVector
    get() = _MarsStrokeRight ?: UXIcon(name = "MarsStrokeRight") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.9f, 11.7f)
                curveToRelative(-1.17f, -1.55f, -2.54f, -2.93f, -4.1f, -4.1f)
                curveToRelative(-0.22f, -0.16f, -0.53f, -0.12f, -0.7f, 0.1f)
                curveToRelative(-0.17f, 0.22f, -0.12f, 0.53f, 0.1f, 0.7f)
                curveToRelative(1.2f, 0.9f, 2.29f, 1.95f, 3.25f, 3.1f)
                horizontalLineToRelative(-5.45f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                reflectiveCurveToRelative(-0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-2.03f)
                curveToRelative(-0.15f, -3.83f, -1.94f, -5.5f, -5.97f, -5.5f)
                curveToRelative(-4.21f, 0f, -6f, 1.79f, -6f, 6f)
                reflectiveCurveToRelative(1.79f, 6f, 6f, 6f)
                curveToRelative(4.03f, 0f, 5.82f, -1.67f, 5.97f, -5.5f)
                horizontalLineToRelative(2.03f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(5.45f)
                curveToRelative(-0.96f, 1.15f, -2.05f, 2.2f, -3.25f, 3.1f)
                curveToRelative(-0.22f, 0.17f, -0.27f, 0.48f, -0.1f, 0.7f)
                curveToRelative(0.17f, 0.22f, 0.48f, 0.27f, 0.7f, 0.1f)
                curveToRelative(1.56f, -1.17f, 2.94f, -2.54f, 4.1f, -4.1f)
                curveToRelative(0.13f, -0.18f, 0.13f, -0.42f, 0f, -0.6f)
                close()
                moveTo(7f, 17f)
                curveToRelative(-3.65f, 0f, -5f, -1.35f, -5f, -5f)
                reflectiveCurveToRelative(1.35f, -5f, 5f, -5f)
                reflectiveCurveToRelative(5f, 1.35f, 5f, 5f)
                reflectiveCurveToRelative(-1.35f, 5f, -5f, 5f)
                close()
            }
        }.also { _MarsStrokeRight = it}
