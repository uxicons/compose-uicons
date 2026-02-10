package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowFromTop: ImageVector? = null

val Icons.Rr.ArrowFromTop: ImageVector
    get() = _ArrowFromTop ?: UXIcon(name = "ArrowFromTop") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.28f, 17.13f)
                lineTo(13f, 21.41f)
                verticalLineTo(2f)
                horizontalLineToRelative(5f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -2f)
                horizontalLineTo(6f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 2f)
                horizontalLineToRelative(5f)
                verticalLineTo(21.42f)
                lineTo(6.71f, 17.13f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, -1.41f, 1.41f)
                lineToRelative(4.58f, 4.58f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.24f, 0f)
                lineToRelative(4.58f, -4.58f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, -1.41f, -1.41f)
                close()
            }
        }.also { _ArrowFromTop = it}
