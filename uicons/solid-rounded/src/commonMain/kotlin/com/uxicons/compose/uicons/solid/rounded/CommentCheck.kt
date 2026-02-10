package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CommentCheck: ImageVector? = null

val Icons.Sr.CommentCheck: ImageVector
    get() = _CommentCheck ?: UXIcon(name = "CommentCheck") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.84f, 0.03f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.03f, 12.86f)
                curveTo(0.47f, 19.21f, 6.08f, 24f, 13.08f, 24f)
                horizontalLineTo(19f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, -5f)
                verticalLineTo(12.34f)
                arcTo(12.21f, 12.21f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12.84f, 0.03f)
                close()
                moveTo(18.7f, 9.71f)
                lineToRelative(-6.79f, 6.71f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.82f, 0f)
                lineTo(5.3f, 12.71f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.4f, -1.43f)
                lineToRelative(3.79f, 3.71f)
                lineToRelative(6.81f, -6.7f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.4f, 1.42f)
                close()
            }
        }.also { _CommentCheck = it}
