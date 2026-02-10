package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _H: ImageVector? = null

val Icons.Br.H: ImageVector
    get() = _H ?: UXIcon(name = "H") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(20.5f, 0f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            verticalLineTo(10f)
            horizontalLineTo(5f)
            verticalLineTo(1.5f)
            curveToRelative(-0.03f, -1.97f, -2.97f, -1.97f, -3f, 0f)
            verticalLineTo(22.5f)
            curveToRelative(0.03f, 1.97f, 2.97f, 1.97f, 3f, 0f)
            verticalLineTo(13f)
            horizontalLineToRelative(14f)
            verticalLineToRelative(9.5f)
            curveToRelative(0.03f, 1.97f, 2.97f, 1.97f, 3f, 0f)
            verticalLineTo(1.5f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            close()
        }
    }.also { _H = it }
