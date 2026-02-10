package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Music: ImageVector? = null

val Icons.Sr.Music: ImageVector
    get() = _Music ?: UXIcon(name = "Music") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5f, 23f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, -5f)
                verticalLineTo(6f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, -3f)
                horizontalLineToRelative(6f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 3f)
                verticalLineToRelative(8.03f)
                arcTo(4.95f, 4.95f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 13f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 5f, 5f)
                verticalLineTo(6f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5f, -5f)
                horizontalLineTo(13f)
                arcTo(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 6f)
                verticalLineToRelative(8.03f)
                arcTo(4.95f, 4.95f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 13f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 23f)
                close()
            }
        }.also { _Music = it}
