package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CameraMovie: ImageVector? = null

val Icons.Bs.CameraMovie: ImageVector
    get() = _CameraMovie ?: UXIcon(name = "CameraMovie") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 10f)
                lineToRelative(-3f, 2.24f)
                verticalLineToRelative(-0.74f)
                curveToRelative(0f, -1.33f, -0.75f, -2.49f, -1.84f, -3.08f)
                curveToRelative(0.53f, -0.85f, 0.84f, -1.85f, 0.84f, -2.92f)
                curveToRelative(0f, -3.03f, -2.47f, -5.5f, -5.5f, -5.5f)
                curveToRelative(-1.57f, 0f, -3.0f, 0.67f, -4f, 1.73f)
                curveToRelative(-1.0f, -1.06f, -2.42f, -1.73f, -4f, -1.73f)
                curveTo(3.47f, 0f, 1f, 2.47f, 1f, 5.5f)
                curveToRelative(0f, 1.07f, 0.31f, 2.07f, 0.84f, 2.92f)
                curveToRelative(-1.09f, 0.59f, -1.84f, 1.75f, -1.84f, 3.08f)
                verticalLineToRelative(12.5f)
                horizontalLineToRelative(21f)
                verticalLineToRelative(-4.24f)
                lineToRelative(3f, 2.24f)
                verticalLineToRelative(-12f)
                close()
                moveTo(14.5f, 3f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.12f, -2.5f, 2.5f, -2.5f)
                close()
                moveTo(6.5f, 3f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.12f, -2.5f, 2.5f, -2.5f)
                close()
                moveTo(18f, 21f)
                lineTo(3f, 21f)
                verticalLineToRelative(-9.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(14f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(9.5f)
                close()
            }
        }.also { _CameraMovie = it}
