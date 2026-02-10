package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ThumbsUp: ImageVector? = null

val Icons.Sr.ThumbsUp: ImageVector
    get() = _ThumbsUp ?: UXIcon(name = "ThumbsUp") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.77f, 7.72f)
                arcTo(4.99f, 4.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 6f)
                horizontalLineTo(15.01f)
                lineToRelative(0.34f, -2.04f)
                arcTo(3.04f, 3.04f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.63f, 2.12f)
                lineTo(8f, 5.42f)
                verticalLineTo(21f)
                horizontalLineTo(18.3f)
                arcToRelative(5.02f, 5.02f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.95f, -4.3f)
                lineToRelative(0.7f, -5f)
                arcTo(4.99f, 4.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22.77f, 7.72f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(0f, 11f)
                verticalLineToRelative(5f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 5f)
                horizontalLineTo(6f)
                verticalLineTo(6f)
                horizontalLineTo(5f)
                arcTo(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 11f)
                close()
            }
        }.also { _ThumbsUp = it}
