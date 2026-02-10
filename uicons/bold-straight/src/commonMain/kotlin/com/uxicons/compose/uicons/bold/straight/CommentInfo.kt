package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CommentInfo: ImageVector? = null

val Icons.Bs.CommentInfo: ImageVector
    get() = _CommentInfo ?: UXIcon(name = "CommentInfo") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 7.25f)
                arcTo(1.75f, 1.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, 12.25f, 5.5f)
                arcTo(1.75f, 1.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 7.25f)
                close()
                moveTo(24f, 12f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = false, 12f, 24f)
                lineTo(24f, 24f)
                close()
                moveTo(21f, 12f)
                verticalLineToRelative(9f)
                lineTo(12f, 21f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = true, isPositiveArc = true, 9f, -9f)
                close()
                moveTo(14f, 12.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.5f, 10f)
                lineTo(9f, 10f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(3f)
                close()
            }
        }.also { _CommentInfo = it}
