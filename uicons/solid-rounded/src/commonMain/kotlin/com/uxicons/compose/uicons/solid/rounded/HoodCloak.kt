package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HoodCloak: ImageVector? = null

val Icons.Sr.HoodCloak: ImageVector
    get() = _HoodCloak ?: UXIcon(name = "HoodCloak") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 12f)
                curveToRelative(0f, -0.96f, -0.5f, -3.48f, -1.5f, -5.07f)
                curveToRelative(-0.32f, -0.51f, -0.5f, -1.07f, -0.5f, -1.59f)
                curveToRelative(0f, -0.35f, 0.62f, -0.92f, 0.99f, -1.26f)
                curveToRelative(0.24f, -0.22f, 0.46f, -0.42f, 0.6f, -0.59f)
                curveToRelative(0.54f, -0.65f, 0.65f, -1.52f, 0.29f, -2.28f)
                curveToRelative(-0.35f, -0.75f, -1.09f, -1.22f, -1.93f, -1.22f)
                horizontalLineToRelative(-7.95f)
                curveToRelative(-1.03f, 0f, -1.95f, 0.01f, -2.6f, 0.04f)
                curveTo(5.34f, 0.34f, 0.36f, 5.3f, 0.04f, 11.34f)
                curveToRelative(-0.2f, 3.76f, 0.56f, 6.88f, 2.44f, 10.1f)
                curveToRelative(0.09f, 0.15f, 0.04f, 0.29f, 0f, 0.35f)
                curveToRelative(-0.04f, 0.07f, -0.14f, 0.19f, -0.32f, 0.19f)
                horizontalLineToRelative(-1.17f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(10.76f)
                curveToRelative(-0.69f, -0.06f, -1.33f, -0.35f, -1.82f, -0.88f)
                curveToRelative(-1.85f, -1.95f, -4.94f, -5.79f, -4.94f, -9.64f)
                curveToRelative(0f, -4.11f, 3.14f, -7.46f, 7f, -7.46f)
                reflectiveCurveToRelative(7f, 3.35f, 7f, 7.46f)
                curveToRelative(0f, 3.85f, -3.1f, 7.69f, -4.95f, 9.64f)
                curveToRelative(-0.49f, 0.52f, -1.13f, 0.81f, -1.82f, 0.87f)
                horizontalLineToRelative(10.76f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-1.15f)
                curveToRelative(-0.17f, 0f, -0.26f, -0.09f, -0.3f, -0.17f)
                curveToRelative(-0.03f, -0.06f, -0.1f, -0.21f, -0.0f, -0.4f)
                curveToRelative(1.84f, -3.43f, 2.46f, -5.8f, 2.46f, -9.41f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 8f)
                curveToRelative(-2.76f, 0f, -5f, 2.45f, -5f, 5.46f)
                curveToRelative(0f, 3.16f, 2.75f, 6.54f, 4.4f, 8.27f)
                curveToRelative(0.34f, 0.35f, 0.87f, 0.35f, 1.21f, 0f)
                curveToRelative(1.64f, -1.73f, 4.4f, -5.11f, 4.4f, -8.27f)
                curveToRelative(0f, -3.01f, -2.24f, -5.46f, -5f, -5.46f)
                close()
            }
        }.also { _HoodCloak = it}
