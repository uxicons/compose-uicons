package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CameraMovie: ImageVector? = null

val Icons.Ts.CameraMovie: ImageVector
    get() = _CameraMovie ?: UXIcon(name = "CameraMovie") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 9.5f)
                lineToRelative(-4f, 3f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-0.5f)
                curveToRelative(1.22f, -0.91f, 2.0f, -2.37f, 2.0f, -4f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                curveToRelative(-1.98f, 0f, -3.69f, 1.15f, -4.5f, 2.82f)
                curveToRelative(-0.81f, -1.67f, -2.52f, -2.82f, -4.5f, -2.82f)
                curveTo(2.24f, 0f, 0f, 2.24f, 0f, 5f)
                curveToRelative(0f, 1.66f, 0.81f, 3.13f, 2.06f, 4.04f)
                curveToRelative(-1.17f, 0.21f, -2.06f, 1.23f, -2.06f, 2.46f)
                verticalLineToRelative(12.5f)
                horizontalLineToRelative(20f)
                verticalLineToRelative(-4.5f)
                lineToRelative(4f, 3f)
                verticalLineToRelative(-13f)
                close()
                moveTo(14f, 1f)
                curveToRelative(2.21f, 0f, 4f, 1.79f, 4f, 4f)
                reflectiveCurveToRelative(-1.79f, 4f, -4f, 4f)
                reflectiveCurveToRelative(-4f, -1.79f, -4f, -4f)
                reflectiveCurveToRelative(1.79f, -4f, 4f, -4f)
                close()
                moveTo(11.0f, 9f)
                horizontalLineToRelative(-3.01f)
                curveToRelative(0.64f, -0.48f, 1.15f, -1.1f, 1.5f, -1.82f)
                curveToRelative(0.35f, 0.72f, 0.87f, 1.34f, 1.5f, 1.82f)
                close()
                moveTo(1f, 5f)
                curveTo(1f, 2.79f, 2.79f, 1f, 5f, 1f)
                reflectiveCurveToRelative(4f, 1.79f, 4f, 4f)
                reflectiveCurveToRelative(-1.79f, 4f, -4f, 4f)
                reflectiveCurveTo(1f, 7.21f, 1f, 5f)
                close()
                moveTo(19f, 23f)
                lineTo(1f, 23f)
                verticalLineToRelative(-11.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(15f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(11.5f)
                close()
                moveTo(23f, 20.5f)
                lineToRelative(-3f, -2.25f)
                verticalLineToRelative(-4.5f)
                lineToRelative(3f, -2.25f)
                verticalLineToRelative(9f)
                close()
            }
        }.also { _CameraMovie = it}
