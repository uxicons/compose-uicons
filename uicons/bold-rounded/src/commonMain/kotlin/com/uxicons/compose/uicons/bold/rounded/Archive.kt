package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Archive: ImageVector? = null

val Icons.Br.Archive: ImageVector
    get() = _Archive ?: UXIcon(name = "Archive", viewportWidth = 512f, viewportHeight = 512f) {
        path(fill = SolidColor(Color.Black)) {
            moveTo(352f, 0f)
            horizontalLineTo(160f)
            curveTo(95.23f, 0.07f, 42.74f, 52.56f, 42.67f, 117.33f)
            verticalLineToRelative(277.33f)
            curveTo(42.74f, 459.44f, 95.23f, 511.93f, 160f, 512f)
            horizontalLineToRelative(192f)
            curveToRelative(64.77f, -0.07f, 117.26f, -52.56f, 117.33f, -117.33f)
            verticalLineTo(117.33f)
            curveTo(469.26f, 52.56f, 416.77f, 0.07f, 352f, 0f)
            close()
            moveTo(160f, 64f)
            horizontalLineToRelative(192f)
            curveToRelative(29.45f, 0f, 53.33f, 23.88f, 53.33f, 53.33f)
            verticalLineToRelative(117.33f)
            horizontalLineTo(106.67f)
            verticalLineTo(117.33f)
            curveTo(106.67f, 87.88f, 130.54f, 64f, 160f, 64f)
            close()
            moveTo(352f, 448f)
            horizontalLineTo(160f)
            curveToRelative(-29.45f, 0f, -53.33f, -23.88f, -53.33f, -53.33f)
            verticalLineToRelative(-96f)
            horizontalLineToRelative(298.67f)
            verticalLineToRelative(96f)
            curveTo(405.33f, 424.12f, 381.45f, 448f, 352f, 448f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(245.33f, 128f)
            horizontalLineToRelative(21.33f)
            curveToRelative(17.67f, 0f, 32f, 14.33f, 32f, 32f)
            lineToRelative(0f, 0f)
            curveToRelative(0f, 17.67f, -14.33f, 32f, -32f, 32f)
            horizontalLineToRelative(-21.33f)
            curveToRelative(-17.67f, 0f, -32f, -14.33f, -32f, -32f)
            lineToRelative(0f, 0f)
            curveTo(213.33f, 142.33f, 227.66f, 128f, 245.33f, 128f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(245.33f, 341.33f)
            horizontalLineToRelative(21.33f)
            curveToRelative(17.67f, 0f, 32f, 14.33f, 32f, 32f)
            lineToRelative(0f, 0f)
            curveToRelative(0f, 17.67f, -14.33f, 32f, -32f, 32f)
            horizontalLineToRelative(-21.33f)
            curveToRelative(-17.67f, 0f, -32f, -14.33f, -32f, -32f)
            lineToRelative(0f, 0f)
            curveTo(213.33f, 355.66f, 227.66f, 341.33f, 245.33f, 341.33f)
            close()
        }
    }.also { _Archive = it }
