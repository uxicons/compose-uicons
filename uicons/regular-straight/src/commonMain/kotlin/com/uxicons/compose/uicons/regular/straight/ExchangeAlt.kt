package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ExchangeAlt: ImageVector? = null

val Icons.Rs.ExchangeAlt: ImageVector
    get() = _ExchangeAlt ?: UXIcon(name = "ExchangeAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 8f)
                horizontalLineTo(0f)
                verticalLineTo(6f)
                horizontalLineTo(19f)
                verticalLineTo(1.87f)
                lineToRelative(4.63f, 4.24f)
                arcToRelative(1.11f, 1.11f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 1.66f)
                lineTo(19f, 12f)
                close()
                moveTo(5f, 11.87f)
                lineTo(0.37f, 16.11f)
                arcToRelative(1.11f, 1.11f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 1.66f)
                lineTo(5f, 22f)
                verticalLineTo(18f)
                horizontalLineTo(24f)
                verticalLineTo(16f)
                horizontalLineTo(5f)
                close()
            }
        }.also { _ExchangeAlt = it}
