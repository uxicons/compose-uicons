package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowFromLeft: ImageVector? = null

val Icons.Sr.ArrowFromLeft: ImageVector
    get() = _ArrowFromLeft ?: UXIcon(name = "ArrowFromLeft") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.12f, 9.89f)
                lineTo(18.54f, 5.31f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.41f, 1.41f)
                lineTo(21.41f, 11f)
                horizontalLineTo(2f)
                verticalLineTo(6f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 6f)
                verticalLineTo(18f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 0f)
                verticalLineTo(13f)
                horizontalLineTo(21.42f)
                lineToRelative(-4.29f, 4.29f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1.41f, 1.41f)
                lineToRelative(4.58f, -4.58f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23.12f, 9.89f)
                close()
            }
        }.also { _ArrowFromLeft = it}
