package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowDownLeft: ImageVector? = null

val Icons.Ss.ArrowDownLeft: ImageVector
    get() = _ArrowDownLeft ?: UXIcon(name = "ArrowDownLeft") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.96f, 1.46f)
                lineTo(22.54f, 0.04f)
                lineTo(2f, 20.59f)
                verticalLineTo(10f)
                horizontalLineTo(0f)
                verticalLineToRelative(12f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineTo(14f)
                verticalLineToRelative(-2f)
                horizontalLineTo(3.41f)
                lineTo(23.96f, 1.46f)
                close()
            }
        }.also { _ArrowDownLeft = it}
