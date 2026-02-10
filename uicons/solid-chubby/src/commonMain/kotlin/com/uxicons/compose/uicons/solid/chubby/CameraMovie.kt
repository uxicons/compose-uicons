package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CameraMovie: ImageVector? = null

val Icons.Sc.CameraMovie: ImageVector
    get() = _CameraMovie ?: UXIcon(name = "CameraMovie") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(6.0f, 1f)
                curveToRelative(1.69f, 0.01f, 2.96f, 0.82f, 3.0f, 3f)
                curveToRelative(-0.04f, 2.27f, -1.31f, 2.99f, -3.0f, 3f)
                curveToRelative(-1.69f, -0.01f, -2.96f, -0.74f, -3.0f, -3f)
                curveToRelative(0.04f, -2.23f, 1.31f, -2.99f, 3.0f, -3f)
                close()
                moveTo(10.0f, 4f)
                curveToRelative(0.04f, 2.26f, 1.32f, 2.99f, 3.0f, 3f)
                curveToRelative(1.69f, -0.01f, 2.96f, -0.73f, 3.0f, -3f)
                curveToRelative(-0.04f, -2.18f, -1.32f, -2.99f, -3.0f, -3f)
                curveToRelative(-1.69f, 0.01f, -2.96f, 0.77f, -3.0f, 3f)
                close()
                moveTo(16.63f, 22.05f)
                curveToRelative(0.27f, -0.1f, 0.48f, -0.32f, 0.57f, -0.58f)
                curveToRelative(0.03f, -0.09f, 0.8f, -2.37f, 0.8f, -5.97f)
                reflectiveCurveToRelative(-0.77f, -5.88f, -0.8f, -5.97f)
                curveToRelative(-0.09f, -0.26f, -0.3f, -0.47f, -0.57f, -0.58f)
                curveToRelative(-0.1f, -0.04f, -2.49f, -0.95f, -7.13f, -0.95f)
                reflectiveCurveToRelative(-7.03f, 0.91f, -7.13f, 0.95f)
                curveToRelative(-0.27f, 0.1f, -0.48f, 0.32f, -0.57f, 0.58f)
                curveToRelative(-0.03f, 0.1f, -0.8f, 2.37f, -0.8f, 5.97f)
                reflectiveCurveToRelative(0.77f, 5.88f, 0.8f, 5.97f)
                curveToRelative(0.09f, 0.26f, 0.3f, 0.47f, 0.57f, 0.58f)
                curveToRelative(0.1f, 0.04f, 2.49f, 0.95f, 7.13f, 0.95f)
                reflectiveCurveToRelative(7.03f, -0.91f, 7.13f, -0.95f)
                close()
                moveTo(23f, 11f)
                verticalLineToRelative(9f)
                curveToRelative(0f, 0.35f, -0.18f, 0.67f, -0.47f, 0.85f)
                reflectiveCurveToRelative(-0.66f, 0.2f, -0.97f, 0.04f)
                curveToRelative(-0.65f, -0.32f, -1.29f, -0.76f, -1.92f, -1.26f)
                curveToRelative(0.2f, -1.18f, 0.37f, -2.24f, 0.37f, -4.14f)
                curveToRelative(0f, -1.87f, -0.17f, -2.92f, -0.36f, -4.09f)
                curveToRelative(0.56f, -0.43f, 1.16f, -0.85f, 1.85f, -1.26f)
                curveToRelative(0.31f, -0.18f, 0.69f, -0.19f, 1.01f, -0.01f)
                curveToRelative(0.31f, 0.18f, 0.51f, 0.51f, 0.51f, 0.87f)
                close()
            }
        }.also { _CameraMovie = it}
