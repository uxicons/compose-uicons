package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WineGlassCrack: ImageVector? = null

val Icons.Sr.WineGlassCrack: ImageVector
    get() = _WineGlassCrack ?: UXIcon(name = "WineGlassCrack") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 9f)
                verticalLineTo(3f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                horizontalLineToRelative(-1.75f)
                lineToRelative(-2.85f, 4f)
                horizontalLineToRelative(1.99f)
                curveToRelative(0.59f, 0f, 1.13f, 0.32f, 1.41f, 0.84f)
                curveToRelative(0.28f, 0.52f, 0.25f, 1.15f, -0.08f, 1.65f)
                lineToRelative(-1.88f, 3.04f)
                curveToRelative(-0.19f, 0.3f, -0.52f, 0.47f, -0.85f, 0.47f)
                curveToRelative(-0.18f, 0f, -0.36f, -0.05f, -0.53f, -0.15f)
                curveToRelative(-0.47f, -0.29f, -0.61f, -0.91f, -0.32f, -1.38f)
                lineToRelative(1.53f, -2.47f)
                horizontalLineToRelative(-2.07f)
                curveToRelative(-0.51f, 0f, -0.99f, -0.24f, -1.3f, -0.65f)
                curveToRelative(-0.3f, -0.41f, -0.4f, -0.94f, -0.25f, -1.43f)
                curveToRelative(0.03f, -0.1f, 2.72f, -3.92f, 2.72f, -3.92f)
                horizontalLineToRelative(-3.79f)
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
            }
        }.also { _WineGlassCrack = it}
