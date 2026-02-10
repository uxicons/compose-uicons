package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CommentCheck: ImageVector? = null

val Icons.Bs.CommentCheck: ImageVector
    get() = _CommentCheck ?: UXIcon(name = "CommentCheck") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.5f, 17f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.77f, -0.73f)
                lineTo(5.45f, 13.07f)
                lineToRelative(2.09f, -2.15f)
                lineTo(10.5f, 13.8f)
                lineToRelative(5.95f, -5.87f)
                lineToRelative(2.11f, 2.14f)
                lineToRelative(-6.29f, 6.21f)
                arcTo(2.48f, 2.48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10.5f, 17f)
                close()
                moveTo(24f, 24f)
                horizontalLineTo(12f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, 24f, 12f)
                close()
                moveTo(12f, 3f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 18f)
                horizontalLineToRelative(9f)
                verticalLineTo(12f)
                arcTo(9.01f, 9.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 3f)
                close()
            }
        }.also { _CommentCheck = it}
