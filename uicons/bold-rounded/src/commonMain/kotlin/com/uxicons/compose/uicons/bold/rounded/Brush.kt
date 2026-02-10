package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Brush: ImageVector? = null

val Icons.Br.Brush: ImageVector
    get() = _Brush ?: UXIcon(name = "Brush") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(18.5f, 0f)
            horizontalLineToRelative(-13f)
            arcToRelative(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.5f, 5.5f)
            verticalLineToRelative(5f)
            arcToRelative(7.51f, 7.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.5f, 7.5f)
            horizontalLineToRelative(0.5f)
            verticalLineToRelative(2f)
            arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 0f)
            verticalLineToRelative(-2f)
            horizontalLineToRelative(0.5f)
            arcToRelative(7.51f, 7.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.5f, -7.5f)
            verticalLineToRelative(-5f)
            arcToRelative(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.5f, -5.5f)
            close()
            moveTo(5.5f, 3f)
            horizontalLineToRelative(0.5f)
            verticalLineToRelative(0.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 0f)
            verticalLineToRelative(-0.5f)
            horizontalLineToRelative(2f)
            verticalLineToRelative(2.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 0f)
            verticalLineToRelative(-2.5f)
            horizontalLineToRelative(2f)
            verticalLineToRelative(4.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 0f)
            verticalLineToRelative(-4.45f)
            arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 2.45f)
            verticalLineToRelative(4.5f)
            horizontalLineToRelative(-18f)
            verticalLineToRelative(-4.5f)
            arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.5f, -2.5f)
            close()
            moveTo(16.5f, 15f)
            horizontalLineToRelative(-2f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.5f, 1.5f)
            verticalLineToRelative(3.5f)
            arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 0f)
            verticalLineToRelative(-3.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.5f, -1.5f)
            horizontalLineToRelative(-2f)
            arcToRelative(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.74f, -2f)
            horizontalLineToRelative(16.48f)
            arcToRelative(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.74f, 2f)
            close()
        }
    }.also { _Brush = it }
