package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Box: ImageVector? = null

val Icons.Br.Box: ImageVector
    get() = _Box ?: UXIcon(name = "Box", viewportWidth = 512f, viewportHeight = 512f) {
        path(fill = SolidColor(Color.Black)) {
            moveTo(512f, 117.33f)
            curveTo(511.93f, 52.56f, 459.44f, 0.07f, 394.67f, 0f)
            horizontalLineTo(117.33f)
            curveTo(52.56f, 0.07f, 0.07f, 52.56f, 0f, 117.33f)
            verticalLineToRelative(21.33f)
            curveToRelative(0.01f, 19.49f, 7.67f, 38.2f, 21.33f, 52.1f)
            verticalLineToRelative(203.9f)
            curveTo(21.4f, 459.44f, 73.89f, 511.93f, 138.67f, 512f)
            horizontalLineToRelative(234.67f)
            curveToRelative(64.77f, -0.07f, 117.26f, -52.56f, 117.33f, -117.33f)
            verticalLineTo(190.76f)
            curveToRelative(13.66f, -13.9f, 21.33f, -32.61f, 21.33f, -52.1f)
            verticalLineTo(117.33f)
            close()
            moveTo(64f, 117.33f)
            curveTo(64f, 87.88f, 87.88f, 64f, 117.33f, 64f)
            horizontalLineToRelative(277.33f)
            curveTo(424.12f, 64f, 448f, 87.88f, 448f, 117.33f)
            verticalLineToRelative(21.33f)
            curveToRelative(0f, 5.89f, -4.78f, 10.67f, -10.67f, 10.67f)
            horizontalLineTo(74.67f)
            curveToRelative(-5.89f, 0f, -10.67f, -4.78f, -10.67f, -10.67f)
            verticalLineTo(117.33f)
            close()
            moveTo(426.67f, 394.67f)
            curveToRelative(0f, 29.45f, -23.88f, 53.33f, -53.33f, 53.33f)
            horizontalLineTo(138.67f)
            curveToRelative(-29.45f, 0f, -53.33f, -23.88f, -53.33f, -53.33f)
            verticalLineTo(213.33f)
            horizontalLineToRelative(341.33f)
            verticalLineTo(394.67f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(202.67f, 256f)
            horizontalLineToRelative(106.67f)
            curveToRelative(17.67f, 0f, 32f, 14.33f, 32f, 32f)
            lineToRelative(0f, 0f)
            curveToRelative(0f, 17.67f, -14.33f, 32f, -32f, 32f)
            horizontalLineTo(202.67f)
            curveToRelative(-17.67f, 0f, -32f, -14.33f, -32f, -32f)
            lineToRelative(0f, 0f)
            curveTo(170.67f, 270.33f, 184.99f, 256f, 202.67f, 256f)
            close()
        }
    }.also { _Box = it }
