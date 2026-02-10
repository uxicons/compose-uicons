package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ThumbsDown: ImageVector? = null

val Icons.Sr.ThumbsDown: ImageVector
    get() = _ThumbsDown ?: UXIcon(name = "ThumbsDown") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.95f, 12.3f)
                lineToRelative(-0.7f, -5f)
                arcTo(5.02f, 5.02f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.3f, 3f)
                horizontalLineTo(8f)
                verticalLineTo(18.58f)
                lineToRelative(1.63f, 3.3f)
                arcToRelative(3.04f, 3.04f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.72f, -1.84f)
                lineTo(15.01f, 18f)
                horizontalLineTo(19f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.95f, -5.7f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(0f, 8f)
                verticalLineToRelative(5f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 5f)
                horizontalLineTo(6f)
                verticalLineTo(3f)
                horizontalLineTo(5f)
                arcTo(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 8f)
                close()
            }
        }.also { _ThumbsDown = it}
