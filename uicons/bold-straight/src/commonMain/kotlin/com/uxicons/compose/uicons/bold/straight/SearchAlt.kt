package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SearchAlt: ImageVector? = null

val Icons.Bs.SearchAlt: ImageVector
    get() = _SearchAlt ?: UXIcon(name = "SearchAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(8f, 9f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(3f)
                close()
                moveTo(21.81f, 23.94f)
                lineTo(19.3f, 21.42f)
                arcToRelative(4.93f, 4.93f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.3f, 0.58f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 5f, -5f)
                arcToRelative(4.93f, 4.93f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.58f, 2.3f)
                lineToRelative(2.52f, 2.52f)
                close()
                moveTo(19f, 17f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = false, -2f, 2f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, -2f)
                close()
                moveTo(10.08f, 21f)
                horizontalLineToRelative(-4.58f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.5f, -0.5f)
                verticalLineToRelative(-17f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.5f, -0.5f)
                horizontalLineToRelative(13.5f)
                verticalLineToRelative(6.26f)
                arcToRelative(7.97f, 7.97f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 1.5f)
                verticalLineToRelative(-10.76f)
                horizontalLineToRelative(-16.5f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.5f, 3.5f)
                verticalLineToRelative(17f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.5f, 3.5f)
                horizontalLineToRelative(7.63f)
                arcToRelative(8.03f, 8.03f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.05f, -3f)
                close()
            }
        }.also { _SearchAlt = it}
