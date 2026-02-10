package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CameraMovie: ImageVector? = null

val Icons.Ss.CameraMovie: ImageVector
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
                moveTo(19f, 13f)
                verticalLineToRelative(11f)
                lineTo(0f, 24f)
                verticalLineToRelative(-11f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(13f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
                moveTo(21f, 13.24f)
                verticalLineToRelative(7.51f)
                lineToRelative(3f, 2.24f)
                verticalLineToRelative(-11.98f)
                lineToRelative(-3f, 2.24f)
                close()
            }
        }.also { _CameraMovie = it}
