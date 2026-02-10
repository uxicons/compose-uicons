package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Megaphone: ImageVector? = null

val Icons.Ss.Megaphone: ImageVector
    get() = _Megaphone ?: UXIcon(name = "Megaphone") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.29f, 15.71f)
                lineToRelative(-2.29f, -2.29f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(2.29f, 2.29f)
                close()
                moveTo(23.71f, 5.71f)
                lineTo(22.29f, 4.29f)
                lineTo(20.04f, 6.54f)
                lineTo(21.46f, 7.96f)
                close()
                moveTo(24f, 9f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3f)
                close()
                moveTo(8.37f, 17f)
                horizontalLineToRelative(-5.63f)
                lineToRelative(3.11f, 7f)
                horizontalLineToRelative(1.4f)
                arcToRelative(2.75f, 2.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.51f, -3.87f)
                close()
                moveTo(18f, 0f)
                verticalLineToRelative(20f)
                horizontalLineToRelative(-2f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5f, -5f)
                horizontalLineToRelative(-8f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, -3f)
                verticalLineToRelative(-4f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, -3f)
                horizontalLineToRelative(8f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, -5f)
                close()
            }
        }.also { _Megaphone = it}
