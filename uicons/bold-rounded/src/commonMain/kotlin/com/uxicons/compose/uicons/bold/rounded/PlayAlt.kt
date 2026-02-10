package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PlayAlt: ImageVector? = null

val Icons.Br.PlayAlt: ImageVector
    get() = _PlayAlt ?: UXIcon(name = "PlayAlt") {
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
            moveTo(7.99f, 9.34f)
            verticalLineToRelative(5.32f)
            arcToRelative(1.34f, 1.34f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 1.16f)
            lineToRelative(5.33f, -2.66f)
            arcToRelative(1.34f, 1.34f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -2.32f)
            lineToRelative(-5.33f, -2.66f)
            arcToRelative(1.34f, 1.34f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 1.16f)
            close()
        }
    }.also { _PlayAlt = it }
