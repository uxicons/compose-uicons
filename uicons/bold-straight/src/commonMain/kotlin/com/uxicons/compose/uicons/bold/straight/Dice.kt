package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Dice: ImageVector? = null

val Icons.Bs.Dice: ImageVector
    get() = _Dice ?: UXIcon(name = "Dice") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 24f)
                horizontalLineToRelative(-24f)
                verticalLineToRelative(-20.5f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.5f, -3.5f)
                horizontalLineToRelative(17f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.5f, 3.5f)
                close()
                moveTo(3f, 21f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(-17.5f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.5f, -0.5f)
                horizontalLineToRelative(-17f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.5f, 0.5f)
                close()
                moveTo(10.5f, 12f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1.5f, -1.5f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.5f, 1.5f)
                close()
                moveTo(6f, 7.5f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1.5f, -1.5f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.5f, 1.5f)
                close()
                moveTo(15f, 7.5f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1.5f, -1.5f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.5f, 1.5f)
                close()
                moveTo(6f, 16.5f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1.5f, -1.5f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.5f, 1.5f)
                close()
                moveTo(15f, 16.5f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1.5f, -1.5f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.5f, 1.5f)
                close()
            }
        }.also { _Dice = it}
