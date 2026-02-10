package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Test: ImageVector? = null

val Icons.Bs.Test: ImageVector
    get() = _Test ?: UXIcon(name = "Test") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14f, 16f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-3f)
                close()
                moveTo(13f, 14f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-2.13f)
                arcToRelative(8.95f, 8.95f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.8f, -3.71f)
                lineToRelative(0.68f, -1.49f)
                arcToRelative(2.71f, 2.71f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.52f, -1.67f)
                arcToRelative(2.74f, 2.74f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.55f, 1.73f)
                lineToRelative(0.65f, 1.43f)
                arcToRelative(8.94f, 8.94f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.8f, 3.71f)
                verticalLineToRelative(2.13f)
                close()
                moveTo(9f, 16.89f)
                lineTo(8.32f, 16.2f)
                lineTo(6.18f, 18.3f)
                lineTo(7.06f, 19.19f)
                arcToRelative(2.75f, 2.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.89f, 0f)
                lineToRelative(1.87f, -1.88f)
                lineToRelative(-2.13f, -2.11f)
                close()
                moveTo(22f, 6.74f)
                verticalLineToRelative(17.26f)
                horizontalLineToRelative(-20f)
                verticalLineToRelative(-20.5f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.5f, -3.5f)
                horizontalLineToRelative(9.76f)
                arcToRelative(4.53f, 4.53f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.18f, 1.32f)
                lineToRelative(2.24f, 2.24f)
                arcToRelative(4.53f, 4.53f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.32f, 3.18f)
                close()
                moveTo(19f, 21f)
                verticalLineToRelative(-14f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-9.5f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.5f, 0.5f)
                verticalLineToRelative(17.5f)
                close()
            }
        }.also { _Test = it}
