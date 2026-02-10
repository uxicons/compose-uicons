package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CommentUser: ImageVector? = null

val Icons.Br.CommentUser: ImageVector
    get() = _CommentUser ?: UXIcon(name = "CommentUser") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(9.5f, 7.5f)
            arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 0f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.5f, 7.5f)
            close()
            moveTo(13.62f, 23.07f)
            lineTo(17.33f, 20f)
            lineTo(18.5f, 20f)
            arcTo(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 14.5f)
            verticalLineToRelative(-9f)
            arcTo(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.5f, 0f)
            lineTo(5.5f, 0f)
            arcTo(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 5.5f)
            verticalLineToRelative(9f)
            arcTo(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.5f, 20f)
            lineTo(6.74f, 20f)
            lineToRelative(3.6f, 3.03f)
            arcToRelative(2.52f, 2.52f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.68f, 0.64f)
            arcTo(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.62f, 23.07f)
            close()
            moveTo(18.5f, 3f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 5.5f)
            verticalLineToRelative(9f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18.5f, 17f)
            lineTo(16.79f, 17f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.96f, 0.34f)
            lineTo(12f, 20.51f)
            lineTo(8.26f, 17.35f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.29f, 17f)
            lineTo(5.5f, 17f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 14.5f)
            verticalLineToRelative(-9f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.5f, 3f)
            close()
            moveTo(7.98f, 14.23f)
            arcTo(0.67f, 0.67f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.65f, 15f)
            horizontalLineToRelative(6.66f)
            arcToRelative(0.67f, 0.67f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.67f, -0.77f)
            curveTo(15.13f, 9.97f, 8.84f, 9.97f, 7.98f, 14.23f)
            close()
        }
    }.also { _CommentUser = it }
