package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CreditCard: ImageVector? = null

val Icons.Rs.CreditCard: ImageVector
    get() = _CreditCard ?: UXIcon(name = "CreditCard") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5.5f, 15.5f)
                moveToRelative(-1.5f, 0f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 3f, 0f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, -3f, 0f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 3f)
                horizontalLineTo(3f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 6f)
                verticalLineTo(21f)
                horizontalLineTo(24f)
                verticalLineTo(6f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 3f)
                close()
                moveTo(3f, 5f)
                horizontalLineTo(21f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 1f)
                verticalLineTo(8f)
                horizontalLineTo(2f)
                verticalLineTo(6f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 5f)
                close()
                moveTo(2f, 19f)
                verticalLineTo(10f)
                horizontalLineTo(22f)
                verticalLineToRelative(9f)
                close()
            }
        }.also { _CreditCard = it}
