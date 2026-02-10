package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CommentCheck: ImageVector? = null

val Icons.Br.CommentCheck: ImageVector
    get() = _CommentCheck ?: UXIcon(name = "CommentCheck") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(18.5f, 24f)
            horizontalLineTo(13.03f)
            arcTo(13.5f, 13.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 19.79f)
            arcToRelative(11.47f, 11.47f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.95f, -8.9f)
            arcTo(12.02f, 12.02f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.91f, 0.19f)
            arcToRelative(11.64f, 11.64f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.65f, 2.57f)
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
            arcToRelative(9.47f, 9.47f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.37f, -7.27f)
            arcTo(8.64f, 8.64f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12.03f, 3f)
            close()
            moveTo(10.5f, 17f)
            arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.77f, -0.73f)
            lineTo(5.96f, 13.58f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.09f, -2.15f)
            lineTo(10.5f, 13.8f)
            lineToRelative(5.45f, -5.37f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2.11f, 2.14f)
            lineTo(12.26f, 16.27f)
            arcTo(2.48f, 2.48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10.5f, 17f)
            close()
        }
    }.also { _CommentCheck = it }
