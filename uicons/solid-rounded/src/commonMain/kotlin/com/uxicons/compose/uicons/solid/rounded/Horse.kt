package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Horse: ImageVector? = null

val Icons.Sr.Horse: ImageVector
    get() = _Horse ?: UXIcon(name = "Horse") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 8.22f)
                curveToRelative(0f, 0.73f, -0.56f, 1.34f, -1.28f, 1.42f)
                lineToRelative(-2.82f, 0.28f)
                curveToRelative(-0.51f, 0.05f, -0.9f, 0.48f, -0.9f, 0.99f)
                verticalLineToRelative(1.99f)
                curveToRelative(0f, 1.48f, -0.2f, 2.44f, -0.61f, 3.9f)
                lineToRelative(-0.39f, 1.81f)
                verticalLineToRelative(3.4f)
                curveToRelative(0f, 1.22f, -1.08f, 2.18f, -2.34f, 1.97f)
                curveToRelative(-0.98f, -0.16f, -1.66f, -1.08f, -1.66f, -2.08f)
                verticalLineToRelative(-2.89f)
                horizontalLineToRelative(-4.38f)
                lineToRelative(-0.4f, 3.25f)
                curveToRelative(-0.12f, 1.0f, -0.88f, 1.75f, -2.25f, 1.75f)
                curveToRelative(-1.21f, 0f, -1.96f, -1.06f, -1.79f, -2.27f)
                lineToRelative(0.37f, -2.65f)
                curveToRelative(-0.11f, -0.36f, -0.25f, -0.76f, -0.4f, -1.17f)
                curveToRelative(-0.49f, -1.4f, -1.09f, -3.13f, -1.13f, -4.72f)
                curveToRelative(-1.32f, 1.08f, -2.0f, 3.02f, -2.0f, 5.81f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                curveToRelative(0f, -5.68f, 2.55f, -7.73f, 4.68f, -8.45f)
                curveToRelative(0.73f, -0.91f, 2.06f, -1.55f, 3.31f, -1.55f)
                horizontalLineToRelative(3.01f)
                curveToRelative(1f, 0f, 1.01f, -0.83f, 1.02f, -1.01f)
                curveToRelative(0.15f, -1.9f, 1.17f, -4.7f, 4.06f, -5.66f)
                curveToRelative(0.24f, -1.05f, 1.02f, -2.0f, 2.03f, -2.31f)
                curveToRelative(0.44f, -0.14f, 0.89f, 0.21f, 0.89f, 0.67f)
                verticalLineToRelative(1.88f)
                curveToRelative(0.48f, 1.91f, 2.04f, 3.49f, 4.14f, 4.33f)
                curveToRelative(0.53f, 0.21f, 0.86f, 0.74f, 0.86f, 1.3f)
                close()
            }
        }.also { _Horse = it}
