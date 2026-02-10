package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CommentInfo: ImageVector? = null

val Icons.Sr.CommentInfo: ImageVector
    get() = _CommentInfo ?: UXIcon(name = "CommentInfo") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.84f, 0.03f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.03f, 12.86f)
                curveTo(0.47f, 19.21f, 6.08f, 24f, 13.08f, 24f)
                lineTo(19f, 24f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, -5f)
                lineTo(24f, 12.34f)
                arcTo(12.21f, 12.21f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12.84f, 0.03f)
                close()
                moveTo(12f, 5f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 3f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 5f)
                close()
                moveTo(14f, 18f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 0f)
                lineTo(12f, 12f)
                lineTo(11f, 12f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -2f)
                horizontalLineToRelative(1f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 2f)
                close()
            }
        }.also { _CommentInfo = it}
