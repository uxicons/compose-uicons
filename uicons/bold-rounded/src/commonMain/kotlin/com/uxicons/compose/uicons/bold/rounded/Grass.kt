package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Grass: ImageVector? = null

val Icons.Br.Grass: ImageVector
    get() = _Grass ?: UXIcon(name = "Grass") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(22.5f, 21f)
            horizontalLineToRelative(-1.46f)
            curveToRelative(0.23f, -5.33f, 1.22f, -8.29f, 2.86f, -11.71f)
            curveToRelative(0.47f, -0.97f, -0.73f, -1.87f, -1.58f, -1.2f)
            curveToRelative(-0.52f, 0.42f, -2.28f, 2.65f, -2.92f, 3.6f)
            curveToRelative(-0.85f, 3.2f, -1.35f, 6.78f, -1.4f, 9.31f)
            horizontalLineToRelative(-1.99f)
            curveToRelative(0.09f, -6.8f, 2.01f, -13.08f, 5.73f, -18.67f)
            curveToRelative(0.35f, -0.53f, 0.33f, -1.23f, -0.05f, -1.73f)
            curveToRelative(-0.38f, -0.51f, -1.04f, -0.72f, -1.65f, -0.53f)
            curveToRelative(-4.89f, 1.56f, -7.79f, 5.33f, -9.52f, 9.29f)
            curveToRelative(-1.54f, -3.01f, -3.71f, -5.35f, -5.68f, -7.08f)
            curveToRelative(-0.88f, -0.77f, -2.22f, 0.18f, -1.74f, 1.25f)
            curveToRelative(2.51f, 5.63f, 4.9f, 10.97f, 4.9f, 17.47f)
            horizontalLineToRelative(-2.03f)
            curveToRelative(0f, -1.86f, -0.31f, -5.28f, -1.41f, -8.14f)
            curveToRelative(-1.0f, -1.01f, -2.43f, -2.36f, -3.0f, -2.71f)
            curveToRelative(-0.85f, -0.52f, -1.87f, 0.38f, -1.47f, 1.29f)
            curveToRelative(1.08f, 2.48f, 2.48f, 6.14f, 2.83f, 9.55f)
            lineTo(1.5f, 21.0f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            lineTo(22.5f, 24.0f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            close()
            moveTo(16.37f, 5.81f)
            curveToRelative(-2.17f, 4.71f, -3.29f, 9.8f, -3.36f, 15.19f)
            horizontalLineToRelative(-2.0f)
            curveToRelative(0.09f, -2.11f, 0.75f, -10.41f, 5.35f, -15.19f)
            close()
        }
    }.also { _Grass = it }
