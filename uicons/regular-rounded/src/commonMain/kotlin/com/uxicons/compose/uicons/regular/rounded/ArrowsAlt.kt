package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowsAlt: ImageVector? = null

val Icons.Rr.ArrowsAlt: ImageVector
    get() = _ArrowsAlt ?: UXIcon(name = "ArrowsAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.73f, 11.36f)
                lineToRelative(-3.34f, -3.3f)
                arcTo(0.82f, 0.82f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 8.64f)
                verticalLineTo(11f)
                horizontalLineTo(13f)
                verticalLineTo(5f)
                horizontalLineToRelative(2.36f)
                arcToRelative(0.82f, 0.82f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.58f, -1.39f)
                lineTo(12.64f, 0.27f)
                arcToRelative(0.9f, 0.9f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.29f, 0f)
                lineToRelative(-3.3f, 3.34f)
                arcTo(0.82f, 0.82f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.64f, 5f)
                horizontalLineTo(11f)
                verticalLineToRelative(6f)
                horizontalLineTo(5f)
                verticalLineTo(8.64f)
                arcToRelative(0.82f, 0.82f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.39f, -0.58f)
                lineToRelative(-3.34f, 3.3f)
                arcToRelative(0.91f, 0.91f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 1.29f)
                lineToRelative(3.34f, 3.3f)
                arcTo(0.82f, 0.82f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 15.36f)
                verticalLineTo(13f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(6f)
                horizontalLineTo(8.64f)
                arcToRelative(0.82f, 0.82f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.58f, 1.39f)
                lineToRelative(3.3f, 3.34f)
                arcToRelative(0.9f, 0.9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.29f, 0f)
                lineToRelative(3.3f, -3.34f)
                arcTo(0.82f, 0.82f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15.36f, 19f)
                horizontalLineTo(13f)
                verticalLineTo(13f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(2.36f)
                arcToRelative(0.82f, 0.82f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.39f, 0.58f)
                lineToRelative(3.34f, -3.3f)
                arcTo(0.91f, 0.91f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23.73f, 11.36f)
                close()
            }
        }.also { _ArrowsAlt = it}
