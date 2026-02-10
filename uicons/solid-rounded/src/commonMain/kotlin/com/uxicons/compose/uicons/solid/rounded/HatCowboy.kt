package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HatCowboy: ImageVector? = null

val Icons.Sr.HatCowboy: ImageVector
    get() = _HatCowboy ?: UXIcon(name = "HatCowboy") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 1f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1.0f, 0.45f, -1.0f, 1.0f)
                horizontalLineToRelative(0f)
                reflectiveCurveToRelative(-0.01f, 2.07f, -0.01f, 3.6f)
                curveToRelative(0f, 1.47f, -0.14f, 2.85f, -0.41f, 4.16f)
                curveTo(17.03f, 5.16f, 10.15f, 0.41f, 7.97f, 2.6f)
                curveToRelative(-0.98f, 0.98f, -0.98f, 2.31f, -0.98f, 3.27f)
                curveToRelative(0f, 0.35f, 0f, 0.93f, -0.07f, 1.04f)
                curveToRelative(-0.14f, 0.09f, -0.7f, 0.08f, -1.04f, 0.08f)
                curveToRelative(-0.96f, -0.0f, -2.28f, -0.01f, -3.26f, 0.97f)
                curveToRelative(-1.65f, 1.65f, 0.64f, 5.96f, 3.4f, 9.94f)
                curveToRelative(3.31f, -0.26f, 6.0f, -1.47f, 8.21f, -3.68f)
                curveToRelative(0.97f, -0.97f, 1.75f, -2.05f, 2.34f, -3.23f)
                curveToRelative(0.25f, -0.49f, 0.85f, -0.69f, 1.34f, -0.45f)
                curveToRelative(0.49f, 0.25f, 0.69f, 0.85f, 0.45f, 1.34f)
                curveToRelative(-0.69f, 1.37f, -1.6f, 2.63f, -2.72f, 3.74f)
                curveToRelative(-2.25f, 2.25f, -5.04f, 3.62f, -8.29f, 4.11f)
                curveToRelative(0.48f, 0.64f, 0.95f, 1.26f, 1.41f, 1.83f)
                curveToRelative(-1.31f, 0.26f, -2.68f, 0.41f, -4.16f, 0.41f)
                curveToRelative(-1.53f, 0f, -3.6f, 0.01f, -3.6f, 0.01f)
                horizontalLineToRelative(0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                curveToRelative(0.0f, 0f, 0.0f, 0f, 0.0f, 0f)
                horizontalLineToRelative(0f)
                reflectiveCurveToRelative(2.06f, -0.01f, 3.6f, -0.01f)
                curveToRelative(5.63f, 0f, 10.33f, -1.83f, 13.94f, -5.45f)
                reflectiveCurveToRelative(5.45f, -8.31f, 5.45f, -13.94f)
                curveToRelative(0f, -1.53f, 0.01f, -3.6f, 0.01f, -3.6f)
                horizontalLineToRelative(0f)
                reflectiveCurveToRelative(0f, -0.0f, 0f, -0.0f)
                close()
            }
        }.also { _HatCowboy = it}
