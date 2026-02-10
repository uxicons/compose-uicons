package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowFromBottom: ImageVector? = null

val Icons.Sr.ArrowFromBottom: ImageVector
    get() = _ArrowFromBottom ?: UXIcon(name = "ArrowFromBottom") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 22f)
                horizontalLineTo(13f)
                verticalLineTo(2.82f)
                lineToRelative(4.3f, 4.3f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.41f, -1.41f)
                lineTo(13.77f, 0.76f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.54f, 0f)
                lineToRelative(-4.95f, 4.95f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.7f, 7.13f)
                lineToRelative(4.3f, -4.3f)
                verticalLineTo(22f)
                horizontalLineTo(6f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 2f)
                horizontalLineTo(18f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -2f)
                close()
            }
        }.also { _ArrowFromBottom = it}
