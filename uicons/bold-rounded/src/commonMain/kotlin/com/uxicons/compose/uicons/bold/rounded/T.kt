package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _T: ImageVector? = null

val Icons.Br.T: ImageVector
    get() = _T ?: UXIcon(name = "T") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(20.5f, 0f)
            horizontalLineTo(3.5f)
            curveToRelative(-1.97f, 0.03f, -1.97f, 2.97f, 0f, 3f)
            horizontalLineToRelative(7f)
            verticalLineTo(22.5f)
            curveToRelative(0.03f, 1.97f, 2.97f, 1.97f, 3f, 0f)
            verticalLineTo(3f)
            horizontalLineToRelative(7f)
            curveToRelative(1.97f, -0.03f, 1.97f, -2.97f, 0f, -3f)
            close()
        }
    }.also { _T = it }
