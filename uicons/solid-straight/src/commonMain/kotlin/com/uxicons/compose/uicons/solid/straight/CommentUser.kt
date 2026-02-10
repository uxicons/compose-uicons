package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CommentUser: ImageVector? = null

val Icons.Ss.CommentUser: ImageVector
    get() = _CommentUser ?: UXIcon(name = "CommentUser") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 0f)
                lineTo(3f, 0f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3f)
                lineTo(0f, 20f)
                lineTo(6.92f, 20f)
                lineToRelative(3.75f, 3.16f)
                arcToRelative(2.01f, 2.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.34f, 0.51f)
                arcTo(1.94f, 1.94f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.3f, 23.18f)
                lineTo(17.15f, 20f)
                lineTo(24f, 20f)
                lineTo(24f, 3f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 0f)
                close()
                moveTo(12f, 3f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 8.5f, 6.5f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 3f)
                close()
                moveTo(18f, 17f)
                lineTo(16f, 17f)
                lineTo(16f, 15f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, -1f)
                lineTo(9f, 14f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, 1f)
                verticalLineToRelative(2f)
                lineTo(6f, 17f)
                lineTo(6f, 15f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, -3f)
                horizontalLineToRelative(6f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 3f)
                close()
                moveTo(10.5f, 6.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 12f, 8f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10.5f, 6.5f)
                close()
            }
        }.also { _CommentUser = it}
