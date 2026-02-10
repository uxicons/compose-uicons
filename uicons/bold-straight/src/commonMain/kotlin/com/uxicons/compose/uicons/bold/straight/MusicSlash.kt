package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MusicSlash: ImageVector? = null

val Icons.Bs.MusicSlash: ImageVector
    get() = _MusicSlash ?: UXIcon(name = "MusicSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5.5f, 12f)
                curveToRelative(-3f, 0f, -5.5f, 2.5f, -5.5f, 5.5f)
                reflectiveCurveTo(2.5f, 23f, 5.5f, 23f)
                reflectiveCurveToRelative(5.5f, -2.5f, 5.5f, -5.5f)
                reflectiveCurveTo(8.5f, 12f, 5.5f, 12f)
                close()
                moveTo(5.5f, 20f)
                curveTo(4.1f, 20f, 3f, 18.9f, 3f, 17.5f)
                reflectiveCurveTo(4.1f, 15f, 5.5f, 15f)
                reflectiveCurveTo(8f, 16.1f, 8f, 17.5f)
                reflectiveCurveTo(6.9f, 20f, 5.5f, 20f)
                close()
                moveTo(24f, 4.5f)
                curveTo(24f, 2.6f, 22.4f, 1f, 20.5f, 1f)
                horizontalLineToRelative(-9f)
                curveTo(9.6f, 1f, 8f, 2.6f, 8f, 4.5f)
                verticalLineToRelative(1.4f)
                lineTo(2.2f, 0f)
                lineTo(0f, 2.2f)
                lineTo(21.8f, 24f)
                lineToRelative(2.1f, -2.1f)
                lineToRelative(-1f, -1f)
                curveToRelative(0.7f, -0.9f, 1.1f, -2.1f, 1.1f, -3.3f)
                lineTo(24f, 4.5f)
                lineTo(24f, 4.5f)
                close()
                moveTo(11f, 4.5f)
                curveTo(11f, 4.2f, 11.2f, 4f, 11.5f, 4f)
                horizontalLineToRelative(9f)
                curveTo(20.8f, 4f, 21f, 4.2f, 21f, 4.5f)
                verticalLineToRelative(8.1f)
                curveToRelative(-0.8f, -0.4f, -1.6f, -0.6f, -2.5f, -0.6f)
                curveToRelative(-1.2f, 0f, -2.4f, 0.4f, -3.3f, 1.1f)
                lineTo(11f, 8.9f)
                curveTo(11f, 8.9f, 11f, 4.5f, 11f, 4.5f)
                close()
                moveTo(20.7f, 18.6f)
                lineToRelative(-3.4f, -3.4f)
                curveToRelative(0.3f, -0.2f, 0.7f, -0.3f, 1.1f, -0.3f)
                curveToRelative(1.4f, 0f, 2.5f, 1.1f, 2.5f, 2.5f)
                curveTo(21f, 17.9f, 20.9f, 18.3f, 20.7f, 18.6f)
                lineTo(20.7f, 18.6f)
                close()
            }
        }.also { _MusicSlash = it}
