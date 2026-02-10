package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowDownLeft: ImageVector? = null

val Icons.Bs.ArrowDownLeft: ImageVector
    get() = _ArrowDownLeft ?: UXIcon(name = "ArrowDownLeft") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.97f, 2.15f)
                lineTo(21.85f, 0.03f)
                lineTo(3f, 18.88f)
                verticalLineTo(9f)
                horizontalLineTo(0f)
                verticalLineToRelative(12.5f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                horizontalLineTo(15f)
                verticalLineToRelative(-3f)
                horizontalLineTo(5.12f)
                lineTo(23.97f, 2.15f)
                close()
            }
        }.also { _ArrowDownLeft = it}
