package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ExpandArrowsAlt: ImageVector? = null

val Icons.Rr.ExpandArrowsAlt: ImageVector
    get() = _ExpandArrowsAlt ?: UXIcon(name = "ExpandArrowsAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.7f, 4.72f)
                lineToRelative(1.59f, 1.59f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 5.61f)
                lineToRelative(0f, -4.6f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, -1f)
                horizontalLineTo(18.39f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.71f, 1.71f)
                lineToRelative(1.6f, 1.59f)
                lineTo(12f, 10.59f)
                lineTo(4.71f, 3.3f)
                lineTo(6.31f, 1.7f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.61f, -0.01f)
                lineTo(1f, -0.01f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, 1f)
                verticalLineToRelative(4.6f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.71f, 6.3f)
                lineTo(3.3f, 4.71f)
                lineTo(10.59f, 12f)
                lineTo(3.31f, 19.28f)
                lineToRelative(-1.6f, -1.59f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 18.39f)
                lineToRelative(0f, 4.6f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, 1f)
                horizontalLineTo(5.61f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.71f, -1.7f)
                lineTo(4.72f, 20.69f)
                lineTo(12f, 13.41f)
                lineToRelative(7.28f, 7.28f)
                lineToRelative(-1.6f, 1.6f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.71f, 1.7f)
                lineToRelative(4.61f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, -1f)
                verticalLineToRelative(-4.6f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.71f, -0.71f)
                lineTo(20.7f, 19.27f)
                lineTo(13.41f, 12f)
                close()
            }
        }.also { _ExpandArrowsAlt = it}
