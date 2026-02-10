package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CommentCheck: ImageVector? = null

val Icons.Rr.CommentCheck: ImageVector
    get() = _CommentCheck ?: UXIcon(name = "CommentCheck") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.5f, 17f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.42f, -0.59f)
                lineTo(5.3f, 12.71f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.4f, -1.43f)
                lineToRelative(3.79f, 3.71f)
                lineToRelative(6.81f, -6.7f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.4f, 1.42f)
                lineToRelative(-6.79f, 6.71f)
                arcTo(1.98f, 1.98f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10.5f, 17f)
                close()
                moveTo(24f, 19f)
                verticalLineTo(12.34f)
                arcTo(12.21f, 12.21f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12.84f, 0.03f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.03f, 12.85f)
                curveTo(0.47f, 19.21f, 6.08f, 24f, 13.08f, 24f)
                horizontalLineTo(19f)
                arcTo(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 19f)
                close()
                moveTo(12.7f, 2.02f)
                arcTo(10.2f, 10.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 12.34f)
                verticalLineTo(19f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, 3f)
                horizontalLineTo(13.08f)
                curveTo(7.05f, 22f, 2.4f, 18.1f, 2.02f, 12.72f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12.02f, 2f)
                curveTo(12.24f, 2f, 12.47f, 2.01f, 12.7f, 2.02f)
                close()
            }
        }.also { _CommentCheck = it}
