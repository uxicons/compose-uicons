package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BoxingGlove: ImageVector? = null

val Icons.Sr.BoxingGlove: ImageVector
    get() = _BoxingGlove ?: UXIcon(name = "BoxingGlove") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(1f, 7.08f)
                arcTo(7.01f, 7.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 0f)
                horizontalLineToRelative(5f)
                arcToRelative(7.01f, 7.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.71f, 5.03f)
                arcTo(4.99f, 4.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15f, 10f)
                verticalLineToRelative(4f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, 1f)
                horizontalLineToRelative(0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, -1f)
                verticalLineTo(10.17f)
                arcTo(3.11f, 3.11f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19.84f, 7f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 23f, 10f)
                verticalLineToRelative(3.08f)
                arcTo(7.48f, 7.48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19.75f, 19f)
                horizontalLineTo(2.83f)
                lineToRelative(-0.38f, -0.54f)
                arcTo(7.99f, 7.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 13.87f)
                verticalLineTo(10.44f)
                arcTo(3.96f, 3.96f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 11f)
                horizontalLineToRelative(9f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, -1f)
                horizontalLineToRelative(0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, -1f)
                horizontalLineTo(3f)
                arcTo(1.98f, 1.98f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 7.08f)
                close()
                moveTo(3f, 21f)
                verticalLineToRelative(1f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 2f)
                horizontalLineTo(17f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, -2f)
                verticalLineTo(21f)
                close()
            }
        }.also { _BoxingGlove = it}
