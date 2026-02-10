package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Megaphone: ImageVector? = null

val Icons.Rs.Megaphone: ImageVector
    get() = _Megaphone ?: UXIcon(name = "Megaphone") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(1.72f, 14.7f)
                lineToRelative(4.13f, 9.3f)
                horizontalLineToRelative(2.46f)
                arcToRelative(2.75f, 2.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.51f, -3.87f)
                lineToRelative(-2.28f, -5.13f)
                horizontalLineToRelative(2.46f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-20f)
                horizontalLineToRelative(-2f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5f, 5f)
                horizontalLineToRelative(-8f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, 3f)
                verticalLineToRelative(4f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.72f, 2.7f)
                close()
                moveTo(8.99f, 20.94f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.69f, 1.06f)
                horizontalLineToRelative(-1.16f)
                lineToRelative(-3.11f, -7f)
                horizontalLineToRelative(2.31f)
                close()
                moveTo(2f, 8f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, -1f)
                horizontalLineToRelative(8f)
                arcToRelative(6.97f, 6.97f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, -2.11f)
                verticalLineToRelative(10.22f)
                arcToRelative(6.97f, 6.97f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5f, -2.11f)
                horizontalLineToRelative(-8f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, -1f)
                close()
                moveTo(22.29f, 15.71f)
                lineTo(20.0f, 13.42f)
                lineTo(21.42f, 12.01f)
                lineTo(23.71f, 14.29f)
                close()
                moveTo(21.46f, 7.96f)
                lineTo(20.04f, 6.54f)
                lineTo(22.29f, 4.29f)
                lineTo(23.71f, 5.71f)
                close()
                moveTo(21f, 9f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-3f)
                close()
            }
        }.also { _Megaphone = it}
