package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LandLayerLocation: ImageVector? = null

val Icons.Sc.LandLayerLocation: ImageVector
    get() = _LandLayerLocation ?: UXIcon(name = "LandLayerLocation") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12.0f, 1.01f)
                curveToRelative(-4.15f, 0f, -6f, 1.85f, -6f, 6f)
                curveToRelative(0f, 3.91f, 4.79f, 8.27f, 5.34f, 8.75f)
                curveToRelative(0.19f, 0.17f, 0.43f, 0.25f, 0.66f, 0.25f)
                reflectiveCurveToRelative(0.47f, -0.08f, 0.66f, -0.25f)
                curveToRelative(0.55f, -0.48f, 5.34f, -4.84f, 5.34f, -8.75f)
                curveToRelative(0f, -4.15f, -1.85f, -6f, -6f, -6f)
                close()
                moveTo(12.0f, 9.01f)
                curveToRelative(-1.43f, 0f, -2f, -0.57f, -2f, -2f)
                reflectiveCurveToRelative(0.57f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.57f, 2f, 2f)
                reflectiveCurveToRelative(-0.57f, 2f, -2f, 2f)
                close()
                moveTo(22.63f, 16.78f)
                curveToRelative(-0.35f, 0.33f, -2.23f, 2.01f, -4.56f, 3.4f)
                curveToRelative(-2.52f, 1.51f, -5.58f, 2.69f, -5.71f, 2.74f)
                curveToRelative(-0.12f, 0.04f, -0.24f, 0.07f, -0.36f, 0.07f)
                reflectiveCurveToRelative(-0.24f, -0.02f, -0.36f, -0.07f)
                curveToRelative(-0.13f, -0.05f, -3.2f, -1.23f, -5.71f, -2.74f)
                curveToRelative(-2.29f, -1.37f, -4.14f, -3.02f, -4.54f, -3.39f)
                curveToRelative(-0.2f, -0.16f, -0.34f, -0.39f, -0.38f, -0.65f)
                verticalLineToRelative(-0.01f)
                curveToRelative(-0.05f, -0.37f, 0.1f, -0.73f, 0.39f, -0.94f)
                curveToRelative(0.4f, -0.36f, 2.09f, -1.86f, 4.21f, -3.18f)
                curveToRelative(1.56f, 2.61f, 3.77f, 4.67f, 4.41f, 5.24f)
                curveToRelative(0.55f, 0.48f, 1.25f, 0.75f, 1.99f, 0.75f)
                reflectiveCurveToRelative(1.44f, -0.27f, 1.99f, -0.75f)
                curveToRelative(0.63f, -0.56f, 2.85f, -2.62f, 4.4f, -5.23f)
                curveToRelative(2.13f, 1.33f, 3.84f, 2.84f, 4.21f, 3.19f)
                curveToRelative(0.2f, 0.16f, 0.34f, 0.39f, 0.38f, 0.65f)
                curveToRelative(0.05f, 0.35f, -0.09f, 0.71f, -0.36f, 0.93f)
                close()
            }
        }.also { _LandLayerLocation = it}
