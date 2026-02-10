package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WineGlassCrack: ImageVector? = null

val Icons.Sc.WineGlassCrack: ImageVector
    get() = _WineGlassCrack ?: UXIcon(name = "WineGlassCrack") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16f, 20f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(-4.08f)
                curveToRelative(4.03f, -0.48f, 5.5f, -3.13f, 5.5f, -9.42f)
                curveToRelative(0f, -1.15f, -0.06f, -2.2f, -0.18f, -3.13f)
                curveToRelative(-0.03f, -0.25f, -0.16f, -0.48f, -0.36f, -0.65f)
                curveToRelative(-0.07f, -0.05f, -1.28f, -1.02f, -3.75f, -1.49f)
                lineToRelative(-2.85f, 4.26f)
                horizontalLineToRelative(2.13f)
                curveToRelative(0.36f, 0f, 0.69f, 0.19f, 0.86f, 0.5f)
                reflectiveCurveToRelative(0.18f, 0.69f, 0.0f, 1.0f)
                lineToRelative(-2f, 3.5f)
                curveToRelative(-0.18f, 0.32f, -0.52f, 0.5f, -0.87f, 0.5f)
                curveToRelative(-0.17f, 0f, -0.34f, -0.04f, -0.49f, -0.13f)
                curveToRelative(-0.48f, -0.27f, -0.65f, -0.89f, -0.37f, -1.36f)
                lineToRelative(1.15f, -2.0f)
                horizontalLineToRelative(-2.28f)
                curveToRelative(-0.37f, 0f, -0.71f, -0.2f, -0.88f, -0.53f)
                curveToRelative(-0.17f, -0.33f, -0.15f, -0.72f, 0.05f, -1.03f)
                lineToRelative(3.3f, -4.94f)
                curveToRelative(-0.15f, -0.0f, -0.31f, -0.01f, -0.47f, -0.01f)
                curveToRelative(-4.31f, 0f, -6.37f, 1.66f, -6.46f, 1.73f)
                curveToRelative(-0.2f, 0.16f, -0.32f, 0.39f, -0.35f, 0.64f)
                curveToRelative(-0.12f, 0.93f, -0.19f, 1.98f, -0.19f, 3.13f)
                curveToRelative(0f, 6.29f, 1.47f, 8.94f, 5.5f, 9.42f)
                verticalLineToRelative(4.08f)
                horizontalLineToRelative(-2.5f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(8f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                close()
            }
        }.also { _WineGlassCrack = it}
