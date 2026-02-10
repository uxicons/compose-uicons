package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _File: ImageVector? = null

val Icons.Br.File: ImageVector
    get() = _File ?: UXIcon(name = "File", viewportWidth = 512f, viewportHeight = 512f) {
        path(fill = SolidColor(Color.Black)) {
            moveTo(435.41f, 86.38f)
            lineToRelative(-51.03f, -51.58f)
            curveTo(362.29f, 12.6f, 332.29f, 0.08f, 300.97f, 0f)
            horizontalLineTo(160f)
            curveTo(95.23f, 0.07f, 42.74f, 52.56f, 42.67f, 117.33f)
            verticalLineToRelative(277.33f)
            curveTo(42.74f, 459.44f, 95.23f, 511.93f, 160f, 512f)
            horizontalLineToRelative(192f)
            curveToRelative(64.77f, -0.07f, 117.26f, -52.56f, 117.33f, -117.33f)
            verticalLineTo(168.9f)
            curveTo(469.41f, 137.98f, 457.21f, 108.3f, 435.41f, 86.38f)
            close()
            moveTo(405.33f, 394.67f)
            curveTo(405.33f, 424.12f, 381.45f, 448f, 352f, 448f)
            horizontalLineTo(160f)
            curveToRelative(-29.45f, 0f, -53.33f, -23.88f, -53.33f, -53.33f)
            verticalLineTo(117.33f)
            curveTo(106.67f, 87.88f, 130.54f, 64f, 160f, 64f)
            horizontalLineToRelative(117.33f)
            verticalLineToRelative(85.33f)
            curveTo(277.33f, 172.9f, 296.44f, 192f, 320f, 192f)
            horizontalLineToRelative(85.33f)
            verticalLineTo(394.67f)
            close()
        }
    }.also { _File = it }
