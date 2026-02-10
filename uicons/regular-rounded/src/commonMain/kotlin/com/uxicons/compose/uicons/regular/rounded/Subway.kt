package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Subway: ImageVector? = null

val Icons.Rr.Subway: ImageVector
    get() = _Subway ?: UXIcon(name = "Subway") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 0f)
                horizontalLineTo(7f)
                arcTo(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 5f)
                verticalLineToRelative(9f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.27f, 4.95f)
                lineTo(4.14f, 22.48f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.71f, 1.03f)
                lineTo(8.57f, 19f)
                horizontalLineToRelative(6.87f)
                lineToRelative(2.71f, 4.51f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.71f, -1.03f)
                lineToRelative(-2.12f, -3.54f)
                arcTo(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 14f)
                verticalLineTo(5f)
                arcTo(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17f, 0f)
                close()
                moveTo(13f, 11f)
                verticalLineTo(6f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(5f)
                close()
                moveTo(4f, 11f)
                verticalLineTo(6f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(5f)
                close()
                moveTo(7f, 2f)
                horizontalLineTo(17f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.83f, 2f)
                horizontalLineTo(4.17f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 2f)
                close()
                moveTo(17f, 17f)
                horizontalLineTo(7f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, -3f)
                verticalLineTo(13f)
                horizontalLineTo(6f)
                verticalLineToRelative(1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 0f)
                verticalLineTo(13f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 0f)
                verticalLineTo(13f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(1f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17f, 17f)
                close()
            }
        }.also { _Subway = it}
