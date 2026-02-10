package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CommentUser: ImageVector? = null

val Icons.Bs.CommentUser: ImageVector
    get() = _CommentUser ?: UXIcon(name = "CommentUser") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.01f, 23.67f)
                arcToRelative(2.52f, 2.52f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.68f, -0.64f)
                lineTo(6.74f, 20f)
                lineTo(0f, 20f)
                lineTo(0f, 3.5f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.5f, 0f)
                horizontalLineToRelative(17f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 3.5f)
                lineTo(24f, 20f)
                lineTo(17.33f, 20f)
                lineTo(13.62f, 23.07f)
                arcTo(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12.01f, 23.67f)
                close()
                moveTo(3f, 17f)
                lineTo(7.84f, 17f)
                lineTo(12f, 20.51f)
                lineTo(16.25f, 17f)
                lineTo(21f, 17f)
                lineTo(21f, 3.5f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.5f, -0.5f)
                lineTo(3.5f, 3f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.5f, 0.5f)
                close()
                moveTo(12f, 10f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 9.5f, 7.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 10f)
                close()
                moveTo(8f, 13f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(8f)
                lineTo(16f, 13f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, -2f)
                lineTo(10f, 11f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 13f)
                close()
            }
        }.also { _CommentUser = it}
