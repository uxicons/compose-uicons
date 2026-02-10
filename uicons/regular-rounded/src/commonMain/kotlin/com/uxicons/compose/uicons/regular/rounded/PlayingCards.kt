package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PlayingCards: ImageVector? = null

val Icons.Rr.PlayingCards: ImageVector
    get() = _PlayingCards ?: UXIcon(name = "PlayingCards") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.47f, 1.97f)
                lineTo(14.78f, 0.22f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6.22f, 3.24f)
                lineTo(8.37f, 4f)
                horizontalLineTo(5f)
                arcTo(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 9f)
                verticalLineTo(19f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 5f)
                horizontalLineToRelative(6f)
                arcToRelative(4.97f, 4.97f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.92f, -1.93f)
                arcToRelative(5.03f, 5.03f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.69f, 0.05f)
                arcToRelative(4.98f, 4.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.78f, -3.56f)
                lineTo(23.8f, 8.16f)
                arcTo(5.02f, 5.02f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20.47f, 1.97f)
                close()
                moveTo(11f, 22f)
                horizontalLineTo(5f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, -3f)
                verticalLineTo(9f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 6f)
                horizontalLineToRelative(6f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 3f)
                verticalLineTo(19f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, 22f)
                close()
                moveTo(21.89f, 7.56f)
                lineToRelative(-3.41f, 10.4f)
                arcToRelative(2.99f, 2.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.6f, 2.13f)
                arcTo(4.99f, 4.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 19f)
                verticalLineTo(9f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5f, -5f)
                horizontalLineToRelative(-0.51f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.7f, -1.87f)
                lineToRelative(5.69f, 1.75f)
                arcTo(3.01f, 3.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21.89f, 7.56f)
                close()
                moveTo(12f, 13f)
                curveToRelative(0f, 1.45f, -1.54f, 3.39f, -2.71f, 4.38f)
                arcToRelative(1.99f, 1.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.57f, 0f)
                curveTo(5.54f, 16.39f, 4f, 14.45f, 4f, 13f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 0f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 0f)
                close()
            }
        }.also { _PlayingCards = it}
