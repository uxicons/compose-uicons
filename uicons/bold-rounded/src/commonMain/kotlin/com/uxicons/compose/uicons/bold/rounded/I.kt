package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _I: ImageVector? = null

val Icons.Br.I: ImageVector
    get() = _I ?: UXIcon(name = "I") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(17.5f, 21f)
            horizontalLineToRelative(-4f)
            verticalLineTo(3f)
            horizontalLineToRelative(4f)
            curveToRelative(1.97f, -0.03f, 1.97f, -2.97f, 0f, -3f)
            horizontalLineTo(6.5f)
            curveToRelative(-1.97f, 0.03f, -1.97f, 2.97f, 0f, 3f)
            horizontalLineToRelative(4f)
            verticalLineTo(21f)
            horizontalLineTo(6.5f)
            curveToRelative(-1.97f, 0.03f, -1.97f, 2.97f, 0f, 3f)
            horizontalLineToRelative(11f)
            curveToRelative(1.97f, -0.03f, 1.97f, -2.97f, 0f, -3f)
            close()
        }
    }.also { _I = it }
