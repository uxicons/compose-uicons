package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SearchAlt: ImageVector? = null

val Icons.Rs.SearchAlt: ImageVector
    get() = _SearchAlt ?: UXIcon(name = "SearchAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(8f, 8f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(2f)
                close()
                moveTo(5f, 22f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, -1f)
                verticalLineToRelative(-18f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, -1f)
                horizontalLineToRelative(15f)
                verticalLineToRelative(9.5f)
                arcToRelative(6.51f, 6.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 1.32f)
                verticalLineToRelative(-12.82f)
                horizontalLineToRelative(-17f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, 3f)
                verticalLineToRelative(18f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 3f)
                horizontalLineToRelative(12.5f)
                arcToRelative(6.47f, 6.47f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.68f, -2f)
                close()
                moveTo(22.54f, 23.96f)
                lineTo(19.89f, 21.3f)
                arcToRelative(4.46f, 4.46f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.39f, 0.7f)
                arcToRelative(4.5f, 4.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 4.5f, -4.5f)
                arcToRelative(4.46f, 4.46f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.7f, 2.39f)
                lineToRelative(2.66f, 2.66f)
                close()
                moveTo(17.5f, 20f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, -2.5f, -2.5f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.5f, 2.5f)
                close()
            }
        }.also { _SearchAlt = it}
