package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _L: ImageVector? = null

val Icons.Rr.L: ImageVector
    get() = _L ?: UXIcon(name = "L") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 24f)
                horizontalLineTo(7f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                verticalLineTo(1f)
                curveToRelative(0.01f, -1.31f, 1.99f, -1.31f, 2f, 0f)
                verticalLineTo(19f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(14f)
                curveToRelative(1.31f, 0.01f, 1.31f, 2.0f, 0f, 2f)
                close()
            }
        }.also { _L = it}
