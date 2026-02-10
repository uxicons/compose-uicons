package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GridAlt: ImageVector? = null

val Icons.Br.GridAlt: ImageVector
    get() = _GridAlt ?: UXIcon(name = "GridAlt") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(18.5f, 0f)
            horizontalLineToRelative(-13f)
            arcToRelative(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.5f, 5.5f)
            verticalLineToRelative(13f)
            arcToRelative(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.5f, 5.5f)
            horizontalLineToRelative(13f)
            arcToRelative(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.5f, -5.5f)
            verticalLineToRelative(-13f)
            arcToRelative(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.5f, -5.5f)
            close()
            moveTo(10f, 14f)
            verticalLineToRelative(-4f)
            horizontalLineToRelative(4f)
            verticalLineToRelative(4f)
            close()
            moveTo(14f, 17f)
            verticalLineToRelative(4f)
            horizontalLineToRelative(-4f)
            verticalLineToRelative(-4f)
            close()
            moveTo(3f, 10f)
            horizontalLineToRelative(4f)
            verticalLineToRelative(4f)
            horizontalLineToRelative(-4f)
            close()
            moveTo(10f, 7f)
            verticalLineToRelative(-4f)
            horizontalLineToRelative(4f)
            verticalLineToRelative(4f)
            close()
            moveTo(17f, 10f)
            horizontalLineToRelative(4f)
            verticalLineToRelative(4f)
            horizontalLineToRelative(-4f)
            close()
            moveTo(21f, 5.5f)
            verticalLineToRelative(1.5f)
            horizontalLineToRelative(-4f)
            verticalLineToRelative(-4f)
            horizontalLineToRelative(1.5f)
            arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.5f, 2.5f)
            close()
            moveTo(5.5f, 3f)
            horizontalLineToRelative(1.5f)
            verticalLineToRelative(4f)
            horizontalLineToRelative(-4f)
            verticalLineToRelative(-1.5f)
            arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.5f, -2.5f)
            close()
            moveTo(3f, 18.5f)
            verticalLineToRelative(-1.5f)
            horizontalLineToRelative(4f)
            verticalLineToRelative(4f)
            horizontalLineToRelative(-1.5f)
            arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.5f, -2.5f)
            close()
            moveTo(18.5f, 21f)
            horizontalLineToRelative(-1.5f)
            verticalLineToRelative(-4f)
            horizontalLineToRelative(4f)
            verticalLineToRelative(1.5f)
            arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.5f, 2.5f)
            close()
        }
    }.also { _GridAlt = it }
