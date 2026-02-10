package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MinusSmall: ImageVector? = null

val Icons.Rr.MinusSmall: ImageVector
    get() = _MinusSmall ?: UXIcon(name = "MinusSmall") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7f, 11f)
                lineTo(17f, 11f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 12f)
                lineTo(18f, 12f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17f, 13f)
                lineTo(7f, 13f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 12f)
                lineTo(6f, 12f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 11f)
                close()
            }
        }.also { _MinusSmall = it}
