package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ExchangeAlt: ImageVector? = null

val Icons.Bs.ExchangeAlt: ImageVector
    get() = _ExchangeAlt ?: UXIcon(name = "ExchangeAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 8f)
                horizontalLineTo(0f)
                verticalLineTo(5f)
                horizontalLineTo(19f)
                verticalLineTo(1.37f)
                lineToRelative(4.63f, 4.24f)
                arcToRelative(1.11f, 1.11f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 1.66f)
                lineTo(19f, 11.5f)
                close()
                moveTo(5f, 12.37f)
                lineTo(0.37f, 16.61f)
                arcToRelative(1.11f, 1.11f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 1.66f)
                lineTo(5f, 22.5f)
                verticalLineTo(19f)
                horizontalLineTo(24f)
                verticalLineTo(16f)
                horizontalLineTo(5f)
                close()
            }
        }.also { _ExchangeAlt = it}
