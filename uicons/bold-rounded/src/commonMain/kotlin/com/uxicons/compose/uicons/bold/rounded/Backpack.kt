package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Backpack: ImageVector? = null

val Icons.Br.Backpack: ImageVector
    get() = _Backpack ?: UXIcon(name = "Backpack") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(20f, 14.14f)
            verticalLineToRelative(-2.14f)
            arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4f, -6.92f)
            verticalLineToRelative(-1.08f)
            arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, 0f)
            verticalLineToRelative(1.08f)
            arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4f, 6.92f)
            verticalLineToRelative(2.14f)
            arcToRelative(3.99f, 3.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, 3.86f)
            verticalLineToRelative(2f)
            arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 4f)
            horizontalLineToRelative(14f)
            arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, -4f)
            verticalLineToRelative(-2f)
            arcToRelative(3.99f, 3.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, -3.86f)
            close()
            moveTo(17f, 21f)
            horizontalLineToRelative(-10f)
            verticalLineToRelative(-0.26f)
            arcToRelative(5.93f, 5.93f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 0f)
            close()
            moveTo(17f, 16.54f)
            arcToRelative(8.9f, 8.9f, 0f, isMoreThanHalf = false, isPositiveArc = false, -10f, 0f)
            verticalLineToRelative(-4.54f)
            arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 0f)
            close()
            moveTo(15f, 11.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.5f, 1.5f)
            horizontalLineToRelative(-3f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -3f)
            horizontalLineToRelative(3f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.5f, 1.5f)
            close()
        }
    }.also { _Backpack = it }
