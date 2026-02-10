package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Glasses: ImageVector? = null

val Icons.Br.Glasses: ImageVector
    get() = _Glasses ?: UXIcon(name = "Glasses") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(19.5f, 0f)
            arcToRelative(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.5f, 4.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 0f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 0f)
            verticalLineToRelative(9.11f)
            arcToRelative(5.47f, 5.47f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6.84f, 1.53f)
            arcToRelative(3.94f, 3.94f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.31f, 0f)
            arcToRelative(5.47f, 5.47f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6.84f, -1.53f)
            verticalLineToRelative(-9.11f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 0f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 0f)
            arcToRelative(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -9f, 0f)
            verticalLineToRelative(14f)
            arcToRelative(5.5f, 5.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, 0f)
            arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 0f)
            arcToRelative(5.5f, 5.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, 0f)
            verticalLineToRelative(-14f)
            arcToRelative(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.5f, -4.5f)
            close()
            moveTo(5.5f, 21f)
            arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2.5f, -2.5f)
            arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.5f, 2.5f)
            close()
            moveTo(18.5f, 21f)
            arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2.5f, -2.5f)
            arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.5f, 2.5f)
            close()
        }
    }.also { _Glasses = it }
