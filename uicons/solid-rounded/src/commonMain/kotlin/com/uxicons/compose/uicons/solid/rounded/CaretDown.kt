package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CaretDown: ImageVector? = null

val Icons.Sr.CaretDown: ImageVector
    get() = _CaretDown ?: UXIcon(name = "CaretDown") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6.41f, 9f)
                horizontalLineTo(17.59f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.71f, 1.71f)
                lineToRelative(-5.59f, 5.59f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.41f, 0f)
                lineTo(5.71f, 10.71f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.41f, 9f)
                close()
            }
        }.also { _CaretDown = it}
