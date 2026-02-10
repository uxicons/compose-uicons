package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Ban: ImageVector? = null

val Icons.Br.Ban: ImageVector
    get() = _Ban ?: UXIcon(name = "Ban", viewportWidth = 512f, viewportHeight = 512f) {
        path(fill = SolidColor(Color.Black)) {
            moveTo(256f, 0f)
            curveTo(114.61f, 0f, 0f, 114.61f, 0f, 256f)
            reflectiveCurveToRelative(114.61f, 256f, 256f, 256f)
            reflectiveCurveToRelative(256f, -114.61f, 256f, -256f)
            curveTo(511.85f, 114.68f, 397.32f, 0.15f, 256f, 0f)
            close()
            moveTo(256f, 64f)
            curveToRelative(39.84f, 0f, 78.69f, 12.48f, 111.08f, 35.67f)
            lineTo(99.67f, 367.06f)
            curveToRelative(-61.5f, -86.18f, -41.5f, -205.9f, 44.68f, -267.4f)
            curveTo(176.93f, 76.41f, 215.97f, 63.94f, 256f, 64f)
            close()
            moveTo(256f, 448f)
            curveToRelative(-39.84f, -0f, -78.67f, -12.48f, -111.06f, -35.67f)
            lineToRelative(267.39f, -267.41f)
            curveToRelative(61.51f, 86.17f, 41.53f, 205.89f, -44.64f, 267.41f)
            curveTo(335.1f, 435.59f, 296.04f, 448.06f, 256f, 448f)
            close()
        }
    }.also { _Ban = it }
