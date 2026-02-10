package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WineGlassCrack: ImageVector? = null

val Icons.Rr.WineGlassCrack: ImageVector
    get() = _WineGlassCrack ?: UXIcon(name = "WineGlassCrack") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 9f)
                lineTo(19f, 3f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                lineTo(8f, 0f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 3.52f, 2.61f, 6.44f, 6f, 6.93f)
                verticalLineToRelative(6.07f)
                horizontalLineToRelative(-3f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(8f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-6.07f)
                curveToRelative(3.39f, -0.49f, 6f, -3.41f, 6f, -6.93f)
                close()
                moveTo(7f, 9f)
                lineTo(7f, 3f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(3.07f)
                reflectiveCurveToRelative(-1.97f, 2.81f, -2.0f, 2.92f)
                curveToRelative(-0.15f, 0.49f, -0.06f, 1.02f, 0.25f, 1.43f)
                curveToRelative(0.3f, 0.41f, 0.79f, 0.65f, 1.3f, 0.65f)
                horizontalLineToRelative(2.07f)
                lineToRelative(-1.53f, 2.47f)
                curveToRelative(-0.29f, 0.47f, -0.15f, 1.09f, 0.32f, 1.38f)
                curveToRelative(0.16f, 0.1f, 0.35f, 0.15f, 0.53f, 0.15f)
                curveToRelative(0.33f, 0f, 0.66f, -0.17f, 0.85f, -0.47f)
                lineToRelative(1.88f, -3.04f)
                curveToRelative(0.33f, -0.49f, 0.36f, -1.12f, 0.08f, -1.65f)
                curveToRelative(-0.28f, -0.52f, -0.82f, -0.84f, -1.41f, -0.84f)
                horizontalLineToRelative(-2.0f)
                lineToRelative(2.12f, -3f)
                horizontalLineToRelative(2.48f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 2.76f, -2.24f, 5f, -5f, 5f)
                reflectiveCurveToRelative(-5f, -2.24f, -5f, -5f)
                close()
            }
        }.also { _WineGlassCrack = it}
