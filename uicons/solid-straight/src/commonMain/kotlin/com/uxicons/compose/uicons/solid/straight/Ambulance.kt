package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Ambulance: ImageVector? = null

val Icons.Ss.Ambulance: ImageVector
    get() = _Ambulance ?: UXIcon(name = "Ambulance") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.76f, 11f)
                horizontalLineToRelative(-6.76f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(1.05f)
                arcToRelative(4.01f, 4.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.66f, 2.38f)
                close()
                moveTo(24f, 15.06f)
                verticalLineToRelative(3.94f)
                horizontalLineToRelative(-24f)
                verticalLineToRelative(-12f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, -3f)
                horizontalLineToRelative(7f)
                lineToRelative(0.76f, -3.03f)
                arcToRelative(1.28f, 1.28f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.49f, 0f)
                lineToRelative(0.76f, 3.03f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(9.63f)
                arcToRelative(5.95f, 5.95f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.37f, 2.06f)
                close()
                moveTo(10f, 11f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                close()
                moveTo(3.06f, 21f)
                arcToRelative(2.42f, 2.42f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.06f, 0.5f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 0f)
                arcToRelative(2.42f, 2.42f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.06f, -0.5f)
                close()
                moveTo(17.06f, 21f)
                arcToRelative(2.42f, 2.42f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.06f, 0.5f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 0f)
                arcToRelative(2.42f, 2.42f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.06f, -0.5f)
                close()
            }
        }.also { _Ambulance = it}
