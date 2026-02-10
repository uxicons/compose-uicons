package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Folder: ImageVector? = null

val Icons.Br.Folder: ImageVector
    get() = _Folder ?: UXIcon(name = "Folder", viewportWidth = 512f, viewportHeight = 512f) {
        path(fill = SolidColor(Color.Black)) {
            moveTo(394.67f, 64f)
            horizontalLineTo(266.5f)
            curveToRelative(-1.72f, -0.01f, -3.42f, -0.43f, -4.95f, -1.22f)
            lineTo(198.72f, 29.87f)
            curveToRelative(-10.7f, -5.6f, -22.59f, -8.53f, -34.67f, -8.53f)
            horizontalLineToRelative(-46.72f)
            curveTo(52.56f, 21.4f, 0.07f, 73.89f, 0f, 138.67f)
            verticalLineToRelative(234.67f)
            curveToRelative(0.07f, 64.77f, 52.56f, 117.26f, 117.33f, 117.33f)
            horizontalLineToRelative(277.33f)
            curveToRelative(64.77f, -0.07f, 117.26f, -52.56f, 117.33f, -117.33f)
            verticalLineToRelative(-192f)
            curveTo(511.93f, 116.56f, 459.44f, 64.07f, 394.67f, 64f)
            close()
            moveTo(448f, 373.33f)
            curveToRelative(0f, 29.45f, -23.88f, 53.33f, -53.33f, 53.33f)
            horizontalLineTo(117.33f)
            curveTo(87.88f, 426.67f, 64f, 402.79f, 64f, 373.33f)
            verticalLineTo(169.96f)
            horizontalLineToRelative(382.72f)
            curveToRelative(0.84f, 3.73f, 1.27f, 7.55f, 1.28f, 11.37f)
            verticalLineTo(373.33f)
            close()
        }
    }.also { _Folder = it }
