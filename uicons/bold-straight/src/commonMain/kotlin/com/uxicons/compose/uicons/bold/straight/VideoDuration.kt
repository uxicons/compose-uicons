package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _VideoDuration: ImageVector? = null

val Icons.Bs.VideoDuration: ImageVector
    get() = _VideoDuration ?: UXIcon(name = "VideoDuration") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 3.5f)
                verticalLineToRelative(9.22f)
                curveToRelative(-0.81f, -0.93f, -1.84f, -1.66f, -3f, -2.13f)
                lineTo(21f, 3.5f)
                curveToRelative(0f, -0.28f, -0.23f, -0.5f, -0.5f, -0.5f)
                lineTo(3.5f, 3f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(13.5f)
                horizontalLineToRelative(7.07f)
                curveToRelative(-0.04f, 0.33f, -0.07f, 0.66f, -0.07f, 1f)
                curveToRelative(0f, 0.69f, 0.1f, 1.36f, 0.26f, 2f)
                lineTo(0f, 20f)
                lineTo(0f, 3.5f)
                curveTo(0f, 1.57f, 1.57f, 0f, 3.5f, 0f)
                horizontalLineToRelative(17f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                close()
                moveTo(9f, 6.22f)
                verticalLineToRelative(7.78f)
                lineToRelative(7f, -3.89f)
                lineToRelative(-7f, -3.89f)
                close()
                moveTo(24f, 18f)
                curveToRelative(0f, 3.31f, -2.69f, 6f, -6f, 6f)
                reflectiveCurveToRelative(-6f, -2.69f, -6f, -6f)
                reflectiveCurveToRelative(2.69f, -6f, 6f, -6f)
                reflectiveCurveToRelative(6f, 2.69f, 6f, 6f)
                close()
                moveTo(21.21f, 19.79f)
                lineToRelative(-2.21f, -2.21f)
                verticalLineToRelative(-3.59f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(4.41f)
                lineToRelative(2.79f, 2.79f)
                lineToRelative(1.41f, -1.41f)
                close()
            }
        }.also { _VideoDuration = it}
