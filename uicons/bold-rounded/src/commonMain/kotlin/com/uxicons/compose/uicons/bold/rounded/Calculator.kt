package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Calculator: ImageVector? = null

val Icons.Br.Calculator: ImageVector
    get() = _Calculator ?: UXIcon(name = "Calculator") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(18.5f, 24f)
            horizontalLineToRelative(-13f)
            arcToRelative(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5.5f, -5.5f)
            verticalLineToRelative(-13f)
            arcToRelative(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.5f, -5.5f)
            horizontalLineToRelative(13f)
            arcToRelative(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.5f, 5.5f)
            verticalLineToRelative(13f)
            arcToRelative(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5.5f, 5.5f)
            close()
            moveTo(5.5f, 3f)
            arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.5f, 2.5f)
            verticalLineToRelative(13f)
            arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.5f, 2.5f)
            horizontalLineToRelative(13f)
            arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.5f, -2.5f)
            verticalLineToRelative(-13f)
            arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.5f, -2.5f)
            close()
            moveTo(19f, 7f)
            arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, -2f)
            horizontalLineToRelative(-10f)
            arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 2f)
            arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 2f)
            horizontalLineToRelative(10f)
            arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, -2f)
            close()
            moveTo(6.5f, 11.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1.5f, 1.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.5f, -1.5f)
            close()
            moveTo(11.5f, 11.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1.5f, 1.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.5f, -1.5f)
            close()
            moveTo(6.5f, 16f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1.5f, 1.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.5f, -1.5f)
            close()
            moveTo(11.5f, 16f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1.5f, 1.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.5f, -1.5f)
            close()
            moveTo(19f, 17.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.5f, -1.5f)
            horizontalLineToRelative(-1f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3f)
            horizontalLineToRelative(1f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.5f, -1.5f)
            close()
            moveTo(19f, 13f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.5f, -1.5f)
            horizontalLineToRelative(-1f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3f)
            horizontalLineToRelative(1f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.5f, -1.5f)
            close()
        }
    }.also { _Calculator = it }
