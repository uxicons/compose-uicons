package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _L: ImageVector? = null

val Icons.Br.L: ImageVector
    get() = _L ?: UXIcon(name = "L") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(20.5f, 24f)
            horizontalLineTo(7.5f)
            curveToRelative(-3.03f, 0f, -5.5f, -2.47f, -5.5f, -5.5f)
            verticalLineTo(1.5f)
            curveToRelative(0.03f, -1.97f, 2.97f, -1.97f, 3f, 0f)
            verticalLineTo(18.5f)
            curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
            horizontalLineToRelative(13f)
            curveToRelative(1.97f, 0.03f, 1.97f, 2.97f, 0f, 3f)
            close()
        }
    }.also { _L = it }
