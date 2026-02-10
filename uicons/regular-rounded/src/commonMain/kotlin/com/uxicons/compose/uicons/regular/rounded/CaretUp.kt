package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CaretUp: ImageVector? = null

val Icons.Rr.CaretUp: ImageVector
    get() = _CaretUp ?: UXIcon(name = "CaretUp") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6.41f, 16f)
                horizontalLineTo(17.59f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.7f, -1.71f)
                lineTo(12.71f, 8.71f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.42f, 0f)
                lineTo(5.71f, 14.29f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.41f, 16f)
                close()
            }
        }.also { _CaretUp = it}
