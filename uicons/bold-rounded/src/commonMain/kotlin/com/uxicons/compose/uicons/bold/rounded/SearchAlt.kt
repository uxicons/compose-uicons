package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SearchAlt: ImageVector? = null

val Icons.Br.SearchAlt: ImageVector
    get() = _SearchAlt ?: UXIcon(name = "SearchAlt") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(15.5f, 6f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 3f)
            horizontalLineToRelative(-7f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -3f)
            close()
            moveTo(23.56f, 23.56f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.12f, 0f)
            lineToRelative(-2.01f, -2.01f)
            arcToRelative(4.44f, 4.44f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.93f, 0.45f)
            arcToRelative(4.5f, 4.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 4.5f, -4.5f)
            arcToRelative(4.44f, 4.44f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.45f, 1.93f)
            lineToRelative(2.01f, 2.01f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 2.12f)
            close()
            moveTo(17.5f, 19f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, -1.5f, -1.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.5f, 1.5f)
            close()
            moveTo(11.5f, 21f)
            horizontalLineToRelative(-4f)
            arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.5f, -2.5f)
            verticalLineToRelative(-13f)
            arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.5f, -2.5f)
            horizontalLineToRelative(11f)
            arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.5f, 0.5f)
            verticalLineToRelative(7f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 0f)
            verticalLineToRelative(-7f)
            arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.5f, -3.5f)
            horizontalLineToRelative(-11f)
            arcToRelative(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.5f, 5.5f)
            verticalLineToRelative(13f)
            arcToRelative(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.5f, 5.5f)
            horizontalLineToRelative(4f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -3f)
            close()
        }
    }.also { _SearchAlt = it }
