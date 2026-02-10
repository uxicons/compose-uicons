package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _L: ImageVector? = null

val Icons.Bs.L: ImageVector
    get() = _L ?: UXIcon(name = "L") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 24f)
                horizontalLineTo(5.5f)
                curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
                verticalLineTo(0f)
                horizontalLineToRelative(3f)
                verticalLineTo(20.5f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineTo(22f)
                verticalLineToRelative(3f)
                close()
            }
        }.also { _L = it}
