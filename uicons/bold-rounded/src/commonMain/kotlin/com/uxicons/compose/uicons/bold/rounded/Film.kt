package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Film: ImageVector? = null

val Icons.Br.Film: ImageVector
    get() = _Film ?: UXIcon(name = "Film") {
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
            moveTo(3f, 10f)
            horizontalLineToRelative(2f)
            verticalLineToRelative(4f)
            horizontalLineToRelative(-2f)
            close()
            moveTo(16f, 10.5f)
            horizontalLineToRelative(-8f)
            verticalLineToRelative(-7.5f)
            horizontalLineToRelative(8f)
            close()
            moveTo(8f, 13.5f)
            horizontalLineToRelative(8f)
            verticalLineToRelative(7.5f)
            horizontalLineToRelative(-8f)
            close()
            moveTo(19f, 10f)
            horizontalLineToRelative(2f)
            verticalLineToRelative(4f)
            horizontalLineToRelative(-2f)
            close()
            moveTo(21f, 5.5f)
            verticalLineToRelative(1.5f)
            horizontalLineToRelative(-2f)
            verticalLineToRelative(-3.95f)
            arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 2.45f)
            close()
            moveTo(5f, 3.05f)
            verticalLineToRelative(3.95f)
            horizontalLineToRelative(-2f)
            verticalLineToRelative(-1.5f)
            arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, -2.45f)
            close()
            moveTo(3f, 18.5f)
            verticalLineToRelative(-1.5f)
            horizontalLineToRelative(2f)
            verticalLineToRelative(3.95f)
            arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, -2.45f)
            close()
            moveTo(19f, 20.95f)
            verticalLineToRelative(-3.95f)
            horizontalLineToRelative(2f)
            verticalLineToRelative(1.5f)
            arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 2.45f)
            close()
        }
    }.also { _Film = it }
