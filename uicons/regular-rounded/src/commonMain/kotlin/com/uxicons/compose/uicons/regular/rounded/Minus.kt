package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Minus: ImageVector? = null

val Icons.Rr.Minus: ImageVector
    get() = _Minus ?: UXIcon(name = "Minus") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(1f, 11f)
                lineTo(23f, 11f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 12f)
                lineTo(24f, 12f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 23f, 13f)
                lineTo(1f, 13f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 12f)
                lineTo(0f, 12f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 11f)
                close()
            }
        }.also { _Minus = it}
