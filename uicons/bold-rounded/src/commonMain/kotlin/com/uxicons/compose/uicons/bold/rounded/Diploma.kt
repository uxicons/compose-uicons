package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Diploma: ImageVector? = null

val Icons.Br.Diploma: ImageVector
    get() = _Diploma ?: UXIcon(name = "Diploma") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(7f, 11.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.5f, -1.5f)
            horizontalLineToRelative(3f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 3f)
            horizontalLineToRelative(-3f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.5f, -1.5f)
            close()
            moveTo(8.5f, 8f)
            horizontalLineToRelative(7f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -3f)
            horizontalLineToRelative(-7f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3f)
            close()
            moveTo(21f, 19.97f)
            verticalLineToRelative(2.94f)
            arcToRelative(1.08f, 1.08f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.85f, 0.77f)
            lineToRelative(-1.15f, -1.15f)
            lineToRelative(-1.15f, 1.15f)
            arcToRelative(1.08f, 1.08f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.85f, -0.77f)
            verticalLineToRelative(-2.94f)
            arcToRelative(4.99f, 4.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, -8.87f)
            verticalLineToRelative(-5.6f)
            arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.5f, -2.5f)
            lineToRelative(-8.99f, 0.04f)
            arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.51f, 2.5f)
            verticalLineToRelative(11.96f)
            arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.5f, 2.5f)
            horizontalLineToRelative(4f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 3f)
            horizontalLineToRelative(-4f)
            arcToRelative(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5.5f, -5.5f)
            verticalLineToRelative(-11.96f)
            arcToRelative(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.5f, -5.5f)
            lineToRelative(8.99f, -0.04f)
            arcToRelative(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.51f, 5.5f)
            verticalLineToRelative(7.53f)
            arcToRelative(4.93f, 4.93f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, 6.94f)
            close()
            moveTo(16f, 16f)
            arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = false, 2f, -2f)
            arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 2f)
            close()
        }
    }.also { _Diploma = it }
