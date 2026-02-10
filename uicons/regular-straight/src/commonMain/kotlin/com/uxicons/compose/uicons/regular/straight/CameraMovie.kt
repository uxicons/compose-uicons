package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CameraMovie: ImageVector? = null

val Icons.Rs.CameraMovie: ImageVector
    get() = _CameraMovie ?: UXIcon(name = "CameraMovie") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 8.09f)
                lineToRelative(-4f, 4f)
                verticalLineToRelative(-1.09f)
                curveToRelative(0f, -1.34f, -0.89f, -2.48f, -2.11f, -2.87f)
                curveToRelative(0.69f, -0.86f, 1.11f, -1.95f, 1.11f, -3.13f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                curveToRelative(-1.63f, 0f, -3.09f, 0.79f, -4f, 2.0f)
                curveToRelative(-0.91f, -1.22f, -2.37f, -2.0f, -4f, -2.0f)
                curveTo(3.24f, 0f, 1f, 2.24f, 1f, 5f)
                curveToRelative(0f, 1.19f, 0.42f, 2.28f, 1.11f, 3.13f)
                curveToRelative(-1.22f, 0.38f, -2.11f, 1.52f, -2.11f, 2.87f)
                verticalLineToRelative(13f)
                horizontalLineToRelative(20f)
                verticalLineToRelative(-4.09f)
                lineToRelative(4f, 4f)
                verticalLineToRelative(-15.83f)
                close()
                moveTo(14f, 2f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                reflectiveCurveToRelative(-1.35f, 3f, -3f, 3f)
                reflectiveCurveToRelative(-3f, -1.35f, -3f, -3f)
                reflectiveCurveToRelative(1.35f, -3f, 3f, -3f)
                close()
                moveTo(6f, 2f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                reflectiveCurveToRelative(-1.35f, 3f, -3f, 3f)
                reflectiveCurveToRelative(-3f, -1.35f, -3f, -3f)
                reflectiveCurveToRelative(1.35f, -3f, 3f, -3f)
                close()
                moveTo(18f, 22f)
                lineTo(2f, 22f)
                verticalLineToRelative(-11f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(14f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(11f)
                close()
                moveTo(22f, 19.09f)
                lineToRelative(-2f, -2f)
                verticalLineToRelative(-2.17f)
                lineToRelative(2f, -2f)
                verticalLineToRelative(6.17f)
                close()
            }
        }.also { _CameraMovie = it}
