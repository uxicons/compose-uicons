package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Soap: ImageVector? = null

val Icons.Br.Soap: ImageVector
    get() = _Soap ?: UXIcon(name = "Soap") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(17f, 7.66f)
            verticalLineToRelative(-0.66f)
            arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, -2f)
            verticalLineToRelative(-2f)
            horizontalLineToRelative(3.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -3f)
            horizontalLineToRelative(-6f)
            arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.5f, 3.5f)
            verticalLineToRelative(1.5f)
            arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 2f)
            verticalLineToRelative(0.66f)
            arcToRelative(9.44f, 9.44f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5f, 8.35f)
            verticalLineToRelative(1.5f)
            arcToRelative(6.51f, 6.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.5f, 6.5f)
            horizontalLineToRelative(7f)
            arcToRelative(6.51f, 6.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.5f, -6.5f)
            verticalLineToRelative(-1.5f)
            arcToRelative(9.44f, 9.44f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5f, -8.35f)
            close()
            moveTo(19f, 17.5f)
            arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.5f, 3.5f)
            horizontalLineToRelative(-7f)
            arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.5f, -3.5f)
            verticalLineToRelative(-1.5f)
            arcToRelative(6.47f, 6.47f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.01f, -6f)
            horizontalLineToRelative(5.99f)
            arcToRelative(6.47f, 6.47f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.01f, 6f)
            close()
            moveTo(17f, 17f)
            arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 2f)
            horizontalLineToRelative(-6f)
            arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -4f)
            horizontalLineToRelative(6f)
            arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 2f)
            close()
        }
    }.also { _Soap = it }
