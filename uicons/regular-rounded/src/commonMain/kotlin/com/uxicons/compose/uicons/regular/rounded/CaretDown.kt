package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CaretDown: ImageVector? = null

val Icons.Rr.CaretDown: ImageVector
    get() = _CaretDown ?: UXIcon(name = "CaretDown") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6.41f, 9f)
                horizontalLineTo(17.59f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.7f, 1.71f)
                lineToRelative(-5.58f, 5.58f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.42f, 0f)
                lineTo(5.71f, 10.71f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.41f, 9f)
                close()
            }
        }.also { _CaretDown = it}
