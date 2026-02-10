package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Italic: ImageVector? = null

val Icons.Br.Italic: ImageVector
    get() = _Italic ?: UXIcon(name = "Italic") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(21f, 0f)
            horizontalLineTo(6f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 3f)
            horizontalLineToRelative(5.71f)
            lineTo(9.26f, 21f)
            horizontalLineTo(3f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3f)
            horizontalLineTo(18f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -3f)
            horizontalLineTo(12.29f)
            lineTo(14.74f, 3f)
            horizontalLineTo(21f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -3f)
            close()
        }
    }.also { _Italic = it }
