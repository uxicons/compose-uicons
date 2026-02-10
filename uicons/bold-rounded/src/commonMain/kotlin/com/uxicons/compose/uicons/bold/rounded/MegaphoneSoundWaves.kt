package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MegaphoneSoundWaves: ImageVector? = null

val Icons.Br.MegaphoneSoundWaves: ImageVector
    get() = _MegaphoneSoundWaves ?: UXIcon(name = "MegaphoneSoundWaves") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(18f, 1.3f)
            curveToRelative(-0.2f, -1.7f, -2.8f, -1.6f, -3f, 0.1f)
            curveTo(14.9f, 3.1f, 13.3f, 4f, 10.5f, 4f)
            horizontalLineToRelative(-6f)
            curveTo(2f, 4f, 0f, 6f, 0f, 8.5f)
            verticalLineToRelative(2f)
            curveToRelative(0f, 1.9f, 1.1f, 3.5f, 2.8f, 4.2f)
            lineToRelative(3.3f, 7.8f)
            curveTo(6.5f, 23.4f, 7.4f, 24f, 8.5f, 24f)
            curveToRelative(1.8f, 0f, 3.1f, -1.9f, 2.4f, -3.5f)
            lineTo(8.5f, 15f)
            horizontalLineToRelative(1.9f)
            curveToRelative(4.3f, 0f, 4.4f, 1.9f, 4.5f, 2.6f)
            curveToRelative(0.1f, 1.9f, 3f, 1.7f, 3f, -0.1f)
            curveTo(18f, 17.5f, 18f, 1.3f, 18f, 1.3f)
            lineTo(18f, 1.3f)
            close()
            moveTo(10.5f, 12f)
            horizontalLineToRelative(-6f)
            curveTo(3.7f, 12f, 3f, 11.3f, 3f, 10.5f)
            verticalLineToRelative(-2f)
            curveTo(3f, 7.7f, 3.7f, 7f, 4.5f, 7f)
            horizontalLineToRelative(6f)
            curveToRelative(1.8f, 0f, 3.3f, -0.3f, 4.5f, -0.9f)
            verticalLineToRelative(6.8f)
            curveTo(13.9f, 12.3f, 12.5f, 12f, 10.5f, 12f)
            lineTo(10.5f, 12f)
            close()
            moveTo(24f, 9.5f)
            curveToRelative(0f, 1.9f, -0.7f, 3.7f, -2.1f, 5.1f)
            curveToRelative(-0.6f, 0.6f, -1.5f, 0.6f, -2.1f, 0f)
            curveToRelative(-0.6f, -0.6f, -0.6f, -1.5f, 0f, -2.1f)
            curveToRelative(0.8f, -0.8f, 1.2f, -1.8f, 1.2f, -2.9f)
            reflectiveCurveToRelative(-0.4f, -2.2f, -1.2f, -2.9f)
            curveToRelative(-0.6f, -0.6f, -0.6f, -1.5f, 0f, -2.1f)
            curveToRelative(0.6f, -0.6f, 1.5f, -0.6f, 2.1f, 0f)
            curveTo(23.3f, 5.8f, 24f, 7.6f, 24f, 9.5f)
            lineTo(24f, 9.5f)
            close()
        }
    }.also { _MegaphoneSoundWaves = it }
