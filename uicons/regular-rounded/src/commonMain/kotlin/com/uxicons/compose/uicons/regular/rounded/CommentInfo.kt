package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CommentInfo: ImageVector? = null

val Icons.Rr.CommentInfo: ImageVector
    get() = _CommentInfo ?: UXIcon(name = "CommentInfo") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.5f, 6.5f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, 0f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13.5f, 6.5f)
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
                moveTo(14f, 18f)
                verticalLineTo(12f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, -2f)
                horizontalLineTo(11f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 2f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(6f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 0f)
                close()
            }
        }.also { _CommentInfo = it}
