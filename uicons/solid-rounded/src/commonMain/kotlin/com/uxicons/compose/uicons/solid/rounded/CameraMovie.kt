package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CameraMovie: ImageVector? = null

val Icons.Sr.CameraMovie: ImageVector
    get() = _CameraMovie ?: UXIcon(name = "CameraMovie") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9f, 4f)
                curveToRelative(0f, 2.21f, -1.79f, 4f, -4f, 4f)
                reflectiveCurveTo(1f, 6.21f, 1f, 4f)
                reflectiveCurveTo(2.79f, 0f, 5f, 0f)
                reflectiveCurveToRelative(4f, 1.79f, 4f, 4f)
                close()
                moveTo(14f, 0f)
                curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
                reflectiveCurveToRelative(1.79f, 4f, 4f, 4f)
                reflectiveCurveToRelative(4f, -1.79f, 4f, -4f)
                reflectiveCurveTo(16.21f, 0f, 14f, 0f)
                close()
                moveTo(19f, 14f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 2.21f, -1.79f, 4f, -4f, 4f)
                lineTo(4f, 24f)
                curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
                horizontalLineToRelative(11f)
                curveToRelative(2.21f, 0f, 4f, 1.79f, 4f, 4f)
                close()
                moveTo(21.77f, 11.89f)
                lineToRelative(-0.77f, 0.77f)
                verticalLineToRelative(7.75f)
                lineToRelative(0.77f, 0.77f)
                curveToRelative(0.82f, 0.82f, 2.23f, 0.24f, 2.23f, -0.93f)
                verticalLineToRelative(-7.43f)
                curveToRelative(0f, -1.17f, -1.41f, -1.75f, -2.23f, -0.93f)
                close()
            }
        }.also { _CameraMovie = it}
