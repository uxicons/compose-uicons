package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _I: ImageVector? = null

val Icons.Rr.I: ImageVector
    get() = _I ?: UXIcon(name = "I") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 22f)
                horizontalLineToRelative(-5f)
                verticalLineTo(2f)
                horizontalLineToRelative(5f)
                curveToRelative(1.31f, -0.01f, 1.31f, -2.0f, 0f, -2f)
                horizontalLineTo(6f)
                curveToRelative(-1.31f, 0.01f, -1.31f, 2.0f, 0f, 2f)
                horizontalLineToRelative(5f)
                verticalLineTo(22f)
                horizontalLineTo(6f)
                curveToRelative(-1.31f, 0.01f, -1.31f, 2.0f, 0f, 2f)
                horizontalLineToRelative(12f)
                curveToRelative(1.31f, -0.01f, 1.31f, -2.0f, 0f, -2f)
                close()
            }
        }.also { _I = it}
