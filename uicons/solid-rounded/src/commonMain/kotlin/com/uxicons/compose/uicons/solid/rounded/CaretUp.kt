package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CaretUp: ImageVector? = null

val Icons.Sr.CaretUp: ImageVector
    get() = _CaretUp ?: UXIcon(name = "CaretUp") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6.41f, 15.59f)
                horizontalLineTo(17.59f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.71f, -1.71f)
                lineTo(12.71f, 8.29f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.41f, 0f)
                lineTo(5.71f, 13.88f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.41f, 15.59f)
                close()
            }
        }.also { _CaretUp = it}
