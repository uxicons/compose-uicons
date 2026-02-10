package com.uxicons.compose.uicons.brand

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Dribbble: ImageVector? = null

val Icons.Brand.Dribbble: ImageVector
    get() = _Dribbble ?: UXIcon(name = "Dribbble") {
        path(
            fill = SolidColor(Color.Black),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(12f, 0f)
            curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
            reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
            curveToRelative(6.61f, 0f, 12f, -5.38f, 12f, -12f)
            reflectiveCurveTo(18.61f, 0f, 12f, 0f)
            close()
            moveTo(19.93f, 5.53f)
            curveToRelative(1.43f, 1.74f, 2.29f, 3.97f, 2.32f, 6.38f)
            curveToRelative(-0.34f, -0.07f, -3.72f, -0.76f, -7.13f, -0.33f)
            curveToRelative(-0.08f, -0.17f, -0.14f, -0.35f, -0.22f, -0.53f)
            curveToRelative(-0.21f, -0.49f, -0.44f, -1.0f, -0.68f, -1.48f)
            curveTo(17.99f, 8.03f, 19.7f, 5.82f, 19.93f, 5.53f)
            close()
            moveTo(13.42f, 8.04f)
            curveToRelative(-1.68f, -3.08f, -3.54f, -5.61f, -3.83f, -6f)
            curveTo(10.36f, 1.86f, 11.17f, 1.77f, 12f, 1.77f)
            curveToRelative(2.6f, 0f, 4.99f, 0.98f, 6.79f, 2.58f)
            curveTo(18.61f, 4.61f, 17.06f, 6.68f, 13.42f, 8.04f)
            close()
            moveTo(7.64f, 2.73f)
            curveToRelative(0.27f, 0.36f, 2.1f, 2.9f, 3.8f, 5.92f)
            curveToRelative(-4.79f, 1.27f, -9.02f, 1.25f, -9.47f, 1.25f)
            curveTo(2.63f, 6.73f, 4.78f, 4.09f, 7.64f, 2.73f)
            close()
            moveTo(1.74f, 11.7f)
            curveToRelative(0.44f, 0.01f, 5.41f, 0.08f, 10.53f, -1.46f)
            curveToRelative(0.3f, 0.57f, 0.57f, 1.16f, 0.83f, 1.74f)
            curveToRelative(-0.13f, 0.04f, -0.27f, 0.08f, -0.4f, 0.12f)
            curveToRelative(-5.28f, 1.71f, -8.1f, 6.37f, -8.33f, 6.75f)
            curveToRelative(-1.63f, -1.81f, -2.63f, -4.22f, -2.63f, -6.85f)
            verticalLineTo(11.7f)
            close()
            moveTo(13.76f, 13.69f)
            curveToRelative(0.03f, -0.01f, 0.04f, -0.01f, 0.07f, -0.03f)
            curveToRelative(1.45f, 3.73f, 2.03f, 6.87f, 2.19f, 7.77f)
            curveToRelative(-1.24f, 0.53f, -2.59f, 0.82f, -4.01f, 0.82f)
            curveToRelative(-2.37f, 0f, -4.55f, -0.81f, -6.29f, -2.16f)
            curveTo(5.9f, 19.72f, 7.98f, 15.71f, 13.76f, 13.69f)
            close()
            moveTo(17.71f, 20.5f)
            curveToRelative(-0.1f, -0.62f, -0.65f, -3.62f, -1.99f, -7.3f)
            curveToRelative(3.21f, -0.51f, 6.03f, 0.33f, 6.38f, 0.44f)
            curveTo(21.66f, 16.49f, 20.02f, 18.95f, 17.71f, 20.5f)
            close()
        }
    }.also { _Dribbble = it }
