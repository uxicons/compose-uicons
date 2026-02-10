package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BoxAlt: ImageVector? = null

val Icons.Br.BoxAlt: ImageVector
    get() = _BoxAlt ?: UXIcon(name = "BoxAlt") {
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
            moveTo(20.95f, 5f)
            horizontalLineToRelative(-4.95f)
            verticalLineToRelative(-2f)
            horizontalLineToRelative(2.5f)
            arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.45f, 2f)
            close()
            moveTo(11f, 3f)
            horizontalLineToRelative(2f)
            verticalLineToRelative(4f)
            arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 0f)
            close()
            moveTo(5.5f, 3f)
            horizontalLineToRelative(2.5f)
            verticalLineToRelative(2f)
            horizontalLineToRelative(-4.95f)
            arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.45f, -2f)
            close()
            moveTo(18.5f, 21f)
            horizontalLineToRelative(-13f)
            arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.5f, -2.5f)
            verticalLineToRelative(-10.5f)
            horizontalLineToRelative(5.14f)
            arcToRelative(3.98f, 3.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.72f, 0f)
            horizontalLineToRelative(5.14f)
            verticalLineToRelative(10.5f)
            arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.5f, 2.5f)
            close()
            moveTo(19f, 17.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.5f, 1.5f)
            horizontalLineToRelative(-3f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -3f)
            horizontalLineToRelative(3f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.5f, 1.5f)
            close()
        }
    }.also { _BoxAlt = it }
