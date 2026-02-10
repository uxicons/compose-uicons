package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowSquareDown: ImageVector? = null

val Icons.Rr.ArrowSquareDown: ImageVector
    get() = _ArrowSquareDown ?: UXIcon(name = "ArrowSquareDown") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 0f)
                lineTo(5f, 0f)
                arcTo(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 5f)
                lineTo(0f, 19f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 5f)
                lineTo(19f, 24f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, -5f)
                lineTo(24f, 5f)
                arcTo(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 0f)
                close()
                moveTo(22f, 19f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, 3f)
                lineTo(5f, 22f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, -3f)
                lineTo(2f, 5f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 2f)
                lineTo(19f, 2f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 3f)
                close()
                moveTo(17.71f, 13.12f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.41f, 0f)
                lineTo(13f, 16.41f)
                lineTo(12.99f, 6f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 0f)
                lineTo(11f, 16.41f)
                lineTo(7.71f, 13.12f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 6.27f, 14.51f)
                lineToRelative(0.02f, 0.03f)
                lineToRelative(3.58f, 3.59f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.24f, 0f)
                horizontalLineToRelative(0f)
                lineToRelative(3.59f, -3.59f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17.71f, 13.12f)
                close()
            }
        }.also { _ArrowSquareDown = it}
