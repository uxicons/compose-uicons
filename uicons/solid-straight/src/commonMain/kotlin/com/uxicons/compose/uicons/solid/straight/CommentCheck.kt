package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CommentCheck: ImageVector? = null

val Icons.Ss.CommentCheck: ImageVector
    get() = _CommentCheck ?: UXIcon(name = "CommentCheck") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 24f)
                lineTo(24f, 24f)
                lineTo(24f, 12f)
                arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 0f)
                close()
                moveTo(11.91f, 16.42f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.82f, 0f)
                lineTo(5.3f, 12.71f)
                lineToRelative(1.4f, -1.43f)
                lineToRelative(3.79f, 3.71f)
                lineToRelative(6.81f, -6.7f)
                lineToRelative(1.4f, 1.42f)
                close()
            }
        }.also { _CommentCheck = it}
