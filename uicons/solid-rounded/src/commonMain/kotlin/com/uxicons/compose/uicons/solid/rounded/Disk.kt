package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Disk: ImageVector? = null

val Icons.Sr.Disk: ImageVector
    get() = _Disk ?: UXIcon(name = "Disk", viewportWidth = 512f, viewportHeight = 512f) {
            path(fill = SolidColor(Color.Black)) {
                moveTo(256f, 298.67f)
                moveToRelative(-42.67f, 0f)
                arcToRelative(42.67f, 42.67f, 0f, isMoreThanHalf = true, isPositiveArc = true, 85.33f, 0f)
                arcToRelative(42.67f, 42.67f, 0f, isMoreThanHalf = true, isPositiveArc = true, -85.33f, 0f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(480.77f, 87.94f)
                lineToRelative(-56.7f, -56.7f)
                curveToRelative(-5.67f, -5.59f, -11.96f, -10.52f, -18.73f, -14.7f)
                verticalLineTo(64f)
                curveToRelative(-0.07f, 58.88f, -47.79f, 106.6f, -106.67f, 106.67f)
                horizontalLineToRelative(-85.33f)
                curveTo(154.45f, 170.6f, 106.74f, 122.88f, 106.67f, 64f)
                verticalLineTo(0f)
                curveTo(47.79f, 0.07f, 0.07f, 47.79f, 0f, 106.67f)
                verticalLineToRelative(298.67f)
                curveTo(0.07f, 464.21f, 47.79f, 511.93f, 106.67f, 512f)
                horizontalLineToRelative(298.67f)
                curveTo(464.21f, 511.93f, 511.93f, 464.21f, 512f, 405.33f)
                verticalLineTo(163.35f)
                curveTo(512.08f, 135.05f, 500.83f, 107.89f, 480.77f, 87.94f)
                close()
                moveTo(256f, 384f)
                curveToRelative(-47.13f, 0f, -85.33f, -38.21f, -85.33f, -85.33f)
                reflectiveCurveToRelative(38.21f, -85.33f, 85.33f, -85.33f)
                reflectiveCurveToRelative(85.33f, 38.21f, 85.33f, 85.33f)
                reflectiveCurveTo(303.13f, 384f, 256f, 384f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(213.33f, 128f)
                horizontalLineToRelative(85.33f)
                curveToRelative(35.35f, 0f, 64f, -28.65f, 64f, -64f)
                verticalLineTo(1.37f)
                curveToRelative(-4.64f, -0.76f, -9.32f, -1.21f, -14.02f, -1.37f)
                horizontalLineTo(149.33f)
                verticalLineToRelative(64f)
                curveTo(149.33f, 99.35f, 177.99f, 128f, 213.33f, 128f)
                close()
            }
        }.also { _Disk = it}
