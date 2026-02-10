package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CommentHeart: ImageVector? = null

val Icons.Br.CommentHeart: ImageVector
    get() = _CommentHeart ?: UXIcon(name = "CommentHeart") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(18.5f, 24f)
            horizontalLineTo(13.03f)
            curveTo(5.71f, 24.14f, -0.75f, 18.25f, 0.06f, 10.88f)
            arcTo(12.02f, 12.02f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.91f, 0.19f)
            arcToRelative(11.65f, 11.65f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.65f, 2.57f)
            arcTo(12.45f, 12.45f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 12.32f)
            verticalLineTo(18.5f)
            arcTo(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18.5f, 24f)
            close()
            moveTo(12.03f, 3f)
            arcToRelative(9.02f, 9.02f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8.99f, 8.16f)
            arcToRelative(8.51f, 8.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.18f, 6.61f)
            arcTo(10.5f, 10.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.03f, 21f)
            horizontalLineTo(18.5f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 18.5f)
            verticalLineTo(12.32f)
            arcToRelative(9.46f, 9.46f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.37f, -7.27f)
            arcTo(8.63f, 8.63f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12.03f, 3f)
            close()
            moveTo(14.5f, 8f)
            arcTo(2.63f, 2.63f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 10.75f)
            arcToRelative(2.51f, 2.51f, 0f, isMoreThanHalf = true, isPositiveArc = false, -5f, 0f)
            curveToRelative(0f, 2.16f, 2.82f, 4.85f, 4.22f, 5.98f)
            arcToRelative(1.24f, 1.24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.55f, 0f)
            curveTo(14.18f, 15.6f, 17f, 12.91f, 17f, 10.75f)
            arcTo(2.63f, 2.63f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14.5f, 8f)
            close()
        }
    }.also { _CommentHeart = it }
