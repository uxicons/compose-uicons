package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CommentHeart: ImageVector? = null

val Icons.Bs.CommentHeart: ImageVector
    get() = _CommentHeart ?: UXIcon(name = "CommentHeart") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 24f)
                lineTo(12f, 24f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, 24f, 12f)
                close()
                moveTo(12f, 3f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 18f)
                horizontalLineToRelative(9f)
                lineTo(21f, 12f)
                arcTo(9.01f, 9.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 3f)
                close()
                moveTo(14.5f, 8f)
                arcTo(2.63f, 2.63f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 10.75f)
                arcTo(2.63f, 2.63f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.5f, 8f)
                arcTo(2.63f, 2.63f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 10.75f)
                curveTo(7f, 13.63f, 12f, 17f, 12f, 17f)
                reflectiveCurveToRelative(5f, -3.37f, 5f, -6.25f)
                arcTo(2.63f, 2.63f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14.5f, 8f)
                close()
            }
        }.also { _CommentHeart = it}
