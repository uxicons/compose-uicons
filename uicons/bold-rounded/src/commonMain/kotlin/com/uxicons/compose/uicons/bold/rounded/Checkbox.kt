package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Checkbox: ImageVector? = null

val Icons.Br.Checkbox: ImageVector
    get() = _Checkbox ?: UXIcon(name = "Checkbox", viewportWidth = 512f, viewportHeight = 512f) {
        path(fill = SolidColor(Color.Black)) {
            moveTo(394.67f, 512f)
            horizontalLineTo(117.33f)
            curveTo(52.56f, 511.93f, 0.07f, 459.44f, 0f, 394.67f)
            verticalLineTo(117.33f)
            curveTo(0.07f, 52.56f, 52.56f, 0.07f, 117.33f, 0f)
            horizontalLineToRelative(277.33f)
            curveTo(459.44f, 0.07f, 511.93f, 52.56f, 512f, 117.33f)
            verticalLineToRelative(277.33f)
            curveTo(511.93f, 459.44f, 459.44f, 511.93f, 394.67f, 512f)
            close()
            moveTo(117.33f, 64f)
            curveTo(87.88f, 64f, 64f, 87.88f, 64f, 117.33f)
            verticalLineToRelative(277.33f)
            curveTo(64f, 424.12f, 87.88f, 448f, 117.33f, 448f)
            horizontalLineToRelative(277.33f)
            curveTo(424.12f, 448f, 448f, 424.12f, 448f, 394.67f)
            verticalLineTo(117.33f)
            curveTo(448f, 87.88f, 424.12f, 64f, 394.67f, 64f)
            horizontalLineTo(117.33f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(206.23f, 379.46f)
            curveToRelative(-13.46f, 0.01f, -26.37f, -5.37f, -35.84f, -14.93f)
            lineToRelative(-63.72f, -63.62f)
            curveToRelative(-12.5f, -12.49f, -12.51f, -32.75f, -0.01f, -45.26f)
            curveToRelative(0f, -0f, 0.01f, -0.01f, 0.01f, -0.01f)
            lineToRelative(0f, 0f)
            curveToRelative(12.5f, -12.49f, 32.75f, -12.49f, 45.25f, 0f)
            lineToRelative(54.31f, 54.29f)
            lineToRelative(153.86f, -153.86f)
            curveToRelative(12.5f, -12.49f, 32.75f, -12.49f, 45.25f, 0f)
            lineToRelative(0f, 0f)
            curveToRelative(12.5f, 12.49f, 12.51f, 32.75f, 0.01f, 45.26f)
            curveToRelative(-0f, 0f, -0.01f, 0.01f, -0.01f, 0.01f)
            lineTo(242.05f, 364.63f)
            curveTo(232.57f, 374.15f, 219.67f, 379.49f, 206.23f, 379.46f)
            close()
        }
    }.also { _Checkbox = it }
