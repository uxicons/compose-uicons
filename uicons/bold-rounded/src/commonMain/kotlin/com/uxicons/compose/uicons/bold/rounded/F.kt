package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _F: ImageVector? = null

val Icons.Br.F: ImageVector
    get() = _F ?: UXIcon(name = "F") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(20.5f, 0f)
            horizontalLineTo(7.5f)
            curveTo(4.47f, 0f, 2f, 2.47f, 2f, 5.5f)
            verticalLineTo(22.5f)
            curveToRelative(0.03f, 1.97f, 2.97f, 1.97f, 3f, 0f)
            verticalLineTo(14f)
            horizontalLineToRelative(11.5f)
            curveToRelative(1.97f, -0.03f, 1.97f, -2.97f, 0f, -3f)
            horizontalLineTo(5f)
            verticalLineTo(5.5f)
            curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
            horizontalLineToRelative(13f)
            curveToRelative(1.97f, -0.03f, 1.97f, -2.97f, 0f, -3f)
            close()
        }
    }.also { _F = it }
