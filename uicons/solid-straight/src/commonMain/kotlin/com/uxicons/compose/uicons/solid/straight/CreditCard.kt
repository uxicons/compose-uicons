package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CreditCard: ImageVector? = null

val Icons.Ss.CreditCard: ImageVector
    get() = _CreditCard ?: UXIcon(name = "CreditCard") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 3f)
                horizontalLineTo(3f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 6f)
                verticalLineTo(8f)
                horizontalLineTo(24f)
                verticalLineTo(6f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 3f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(0f, 21f)
                lineTo(24f, 21f)
                lineTo(24f, 10f)
                lineTo(0f, 10f)
                close()
                moveTo(7f, 15.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 5.5f, 14f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 15.5f)
            }
        }.also { _CreditCard = it}
