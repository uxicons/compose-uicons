package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SearchAlt: ImageVector? = null

val Icons.Sr.SearchAlt: ImageVector
    get() = _SearchAlt ?: UXIcon(name = "SearchAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(11f, 17.5f)
                arcToRelative(6.5f, 6.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, -4.68f)
                verticalLineToRelative(-9.82f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, -3f)
                horizontalLineToRelative(-12f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5f, 5f)
                verticalLineToRelative(14f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 5f)
                horizontalLineToRelative(10.5f)
                arcToRelative(6.5f, 6.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6.5f, -6.5f)
                close()
                moveTo(7f, 7f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, -1f)
                horizontalLineToRelative(8f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 2f)
                horizontalLineToRelative(-8f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, -1f)
                close()
                moveTo(23.71f, 23.71f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.41f, 0f)
                lineToRelative(-2.41f, -2.41f)
                arcToRelative(4.46f, 4.46f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.39f, 0.7f)
                arcToRelative(4.5f, 4.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 4.5f, -4.5f)
                arcToRelative(4.46f, 4.46f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.7f, 2.39f)
                lineToRelative(2.41f, 2.41f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 1.41f)
                close()
            }
        }.also { _SearchAlt = it}
