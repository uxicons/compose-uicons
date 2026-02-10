package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Lock: ImageVector? = null

val Icons.Br.Lock: ImageVector
    get() = _Lock ?: UXIcon(name = "Lock", viewportWidth = 512f, viewportHeight = 512f) {
        path(fill = SolidColor(Color.Black)) {
            moveTo(403.72f, 180.4f)
            verticalLineToRelative(-31.06f)
            curveTo(403.72f, 66.86f, 336.86f, 0f, 254.39f, 0f)
            reflectiveCurveTo(105.06f, 66.86f, 105.06f, 149.33f)
            verticalLineToRelative(31.06f)
            curveToRelative(-39.24f, 20.02f, -63.95f, 60.33f, -64f, 104.38f)
            verticalLineToRelative(106.67f)
            curveToRelative(0.07f, 64.77f, 52.56f, 117.26f, 117.33f, 117.33f)
            horizontalLineToRelative(192f)
            curveToRelative(64.77f, -0.07f, 117.26f, -52.56f, 117.33f, -117.33f)
            verticalLineTo(284.78f)
            curveTo(467.67f, 240.73f, 442.96f, 200.42f, 403.72f, 180.4f)
            close()
            moveTo(254.39f, 64f)
            curveToRelative(47.13f, 0f, 85.33f, 38.21f, 85.33f, 85.33f)
            verticalLineToRelative(18.11f)
            horizontalLineTo(169.06f)
            verticalLineToRelative(-18.11f)
            curveTo(169.06f, 102.21f, 207.26f, 64f, 254.39f, 64f)
            close()
            moveTo(403.72f, 391.45f)
            curveToRelative(0f, 29.45f, -23.88f, 53.33f, -53.33f, 53.33f)
            horizontalLineToRelative(-192f)
            curveToRelative(-29.45f, 0f, -53.33f, -23.88f, -53.33f, -53.33f)
            verticalLineTo(284.78f)
            curveToRelative(0f, -29.45f, 23.88f, -53.33f, 53.33f, -53.33f)
            horizontalLineToRelative(192f)
            curveToRelative(29.45f, 0f, 53.33f, 23.88f, 53.33f, 53.33f)
            verticalLineTo(391.45f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(243.72f, 295.45f)
            horizontalLineToRelative(21.33f)
            curveToRelative(17.67f, 0f, 32f, 14.33f, 32f, 32f)
            lineToRelative(0f, 0f)
            curveToRelative(0f, 17.67f, -14.33f, 32f, -32f, 32f)
            horizontalLineToRelative(-21.33f)
            curveToRelative(-17.67f, 0f, -32f, -14.33f, -32f, -32f)
            lineToRelative(0f, 0f)
            curveTo(211.72f, 309.77f, 226.05f, 295.45f, 243.72f, 295.45f)
            close()
        }
    }.also { _Lock = it }
