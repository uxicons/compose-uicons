package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowFromRight: ImageVector? = null

val Icons.Rr.ArrowFromRight: ImageVector
    get() = _ArrowFromRight ?: UXIcon(name = "ArrowFromRight") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23f, 5f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, 1f)
                verticalLineToRelative(5f)
                horizontalLineTo(2.58f)
                lineTo(6.87f, 6.71f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.46f, 5.29f)
                lineTo(0.88f, 9.87f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 4.24f)
                lineToRelative(4.58f, 4.58f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1.41f, -1.41f)
                lineTo(2.59f, 13f)
                horizontalLineTo(22f)
                verticalLineToRelative(5f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 0f)
                verticalLineTo(6f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23f, 5f)
                close()
            }
        }.also { _ArrowFromRight = it}
