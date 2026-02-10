package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MusicSlash: ImageVector? = null

val Icons.Ss.MusicSlash: ImageVector
    get() = _MusicSlash ?: UXIcon(name = "MusicSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 4f)
                curveToRelative(0f, -1.7f, -1.3f, -3f, -3f, -3f)
                horizontalLineTo(11f)
                curveTo(9.3f, 1f, 8f, 2.3f, 8f, 4f)
                verticalLineToRelative(2.6f)
                lineTo(1.5f, 0f)
                lineTo(0f, 1.5f)
                lineTo(22.5f, 24f)
                lineToRelative(1.4f, -1.4f)
                lineToRelative(-1.2f, -1.2f)
                curveToRelative(0.8f, -0.9f, 1.3f, -2.1f, 1.3f, -3.3f)
                curveToRelative(0f, -0.2f, 0f, -0.3f, -0.1f, -0.5f)
                horizontalLineTo(24f)
                curveTo(24f, 17.5f, 24f, 4f, 24f, 4f)
                close()
                moveTo(22f, 14f)
                curveToRelative(-0.8f, -0.6f, -1.9f, -1f, -3f, -1f)
                curveToRelative(-1.2f, 0f, -2.4f, 0.5f, -3.3f, 1.3f)
                lineTo(10f, 8.6f)
                verticalLineTo(4f)
                curveToRelative(0f, -0.6f, 0.4f, -1f, 1f, -1f)
                horizontalLineToRelative(10f)
                curveToRelative(0.6f, 0f, 1f, 0.4f, 1f, 1f)
                curveTo(22f, 4f, 22f, 14f, 22f, 14f)
                close()
                moveTo(8f, 14f)
                curveToRelative(-0.8f, -0.6f, -1.9f, -1f, -3f, -1f)
                curveToRelative(-2.8f, 0f, -5f, 2.2f, -5f, 5f)
                reflectiveCurveToRelative(2.2f, 5f, 5f, 5f)
                reflectiveCurveToRelative(5f, -2.2f, 5f, -5f)
                verticalLineToRelative(-3.8f)
                lineToRelative(-2f, -2f)
                verticalLineTo(14f)
                lineTo(8f, 14f)
                close()
            }
        }.also { _MusicSlash = it}
