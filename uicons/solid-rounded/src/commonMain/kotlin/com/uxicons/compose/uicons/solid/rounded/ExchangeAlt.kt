package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ExchangeAlt: ImageVector? = null

val Icons.Sr.ExchangeAlt: ImageVector
    get() = _ExchangeAlt ?: UXIcon(name = "ExchangeAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(0f, 7f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 6f)
                lineTo(18f, 6f)
                lineTo(18f, 2.64f)
                arcToRelative(0.79f, 0.79f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.35f, -0.55f)
                lineToRelative(4.42f, 4.36f)
                arcToRelative(0.77f, 0.77f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 1.1f)
                lineTo(19.35f, 11.91f)
                arcTo(0.79f, 0.79f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 11.36f)
                lineTo(18f, 8f)
                lineTo(1f, 8f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 7f)
                close()
                moveTo(23f, 16f)
                lineTo(6f, 16f)
                lineTo(6f, 12.64f)
                arcToRelative(0.79f, 0.79f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.35f, -0.55f)
                lineTo(0.23f, 16.45f)
                arcToRelative(0.77f, 0.77f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 1.1f)
                lineTo(4.65f, 21.91f)
                arcTo(0.79f, 0.79f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 21.36f)
                lineTo(6f, 18f)
                lineTo(23f, 18f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -2f)
                close()
            }
        }.also { _ExchangeAlt = it}
