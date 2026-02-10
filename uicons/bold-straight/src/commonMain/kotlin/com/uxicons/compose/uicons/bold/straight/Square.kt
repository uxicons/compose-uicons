package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Square: ImageVector? = null

val Icons.Bs.Square: ImageVector
    get() = _Square ?: UXIcon(name = "Square") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                horizontalLineTo(24f)
                close()
                moveTo(3f, 21f)
                horizontalLineTo(21f)
                verticalLineTo(3f)
                horizontalLineTo(3f)
                close()
            }
        }.also { _Square = it}
