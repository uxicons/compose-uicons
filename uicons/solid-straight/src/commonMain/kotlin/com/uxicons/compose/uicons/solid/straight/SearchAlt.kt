package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SearchAlt: ImageVector? = null

val Icons.Ss.SearchAlt: ImageVector
    get() = _SearchAlt ?: UXIcon(name = "SearchAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(11f, 17.5f)
                arcToRelative(6.5f, 6.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, -4.68f)
                verticalLineToRelative(-12.82f)
                horizontalLineToRelative(-17f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, 3f)
                verticalLineToRelative(18f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 3f)
                horizontalLineToRelative(12.5f)
                arcToRelative(6.5f, 6.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6.5f, -6.5f)
                close()
                moveTo(7f, 5f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-10f)
                close()
                moveTo(22.54f, 23.96f)
                lineTo(19.89f, 21.3f)
                arcToRelative(4.46f, 4.46f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.39f, 0.7f)
                arcToRelative(4.5f, 4.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 4.5f, -4.5f)
                arcToRelative(4.46f, 4.46f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.7f, 2.39f)
                lineToRelative(2.66f, 2.66f)
                close()
            }
        }.also { _SearchAlt = it}
