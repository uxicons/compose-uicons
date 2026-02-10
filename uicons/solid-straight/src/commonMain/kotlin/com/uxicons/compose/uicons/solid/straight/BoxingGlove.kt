package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BoxingGlove: ImageVector? = null

val Icons.Ss.BoxingGlove: ImageVector
    get() = _BoxingGlove ?: UXIcon(name = "BoxingGlove") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(1f, 7f)
                arcTo(7.01f, 7.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 0f)
                horizontalLineToRelative(5f)
                arcToRelative(7.01f, 7.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.71f, 5.03f)
                arcTo(4.99f, 4.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15f, 10f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(2f)
                verticalLineTo(10f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 0f)
                verticalLineToRelative(3.08f)
                arcTo(7.48f, 7.48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19.75f, 19f)
                horizontalLineTo(2.83f)
                lineToRelative(-0.38f, -0.54f)
                arcTo(7.96f, 7.96f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 13.87f)
                verticalLineTo(10.44f)
                arcTo(3.96f, 3.96f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 11f)
                horizontalLineTo(13f)
                verticalLineTo(9f)
                horizontalLineTo(3f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 7f)
                close()
                moveTo(3f, 21f)
                verticalLineToRelative(3f)
                horizontalLineTo(19f)
                verticalLineTo(21f)
                close()
            }
        }.also { _BoxingGlove = it}
