package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Gem: ImageVector? = null

val Icons.Bs.Gem: ImageVector
    get() = _Gem ?: UXIcon(name = "Gem") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2.44f, 7.44f)
                lineTo(0.66f, 9.93f)
                arcToRelative(3.4f, 3.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.42f, 4.49f)
                lineTo(12f, 24f)
                lineToRelative(10.99f, -9.64f)
                arcToRelative(3.4f, 3.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.29f, -4.5f)
                lineTo(21.24f, 7.42f)
                arcTo(3.42f, 3.42f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.5f, 6.03f)
                lineTo(5.2f, 6.03f)
                arcTo(3.42f, 3.42f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.44f, 7.44f)
                close()
                moveTo(3.09f, 11.69f)
                lineTo(4.87f, 9.2f)
                arcTo(0.4f, 0.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.2f, 9.03f)
                lineTo(9.19f, 9.03f)
                lineTo(8f, 12f)
                horizontalLineToRelative(8f)
                lineTo(14.81f, 9.03f)
                lineTo(18.5f, 9.03f)
                arcToRelative(0.48f, 0.48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.39f, 0.24f)
                lineTo(20.92f, 11.7f)
                arcTo(0.43f, 0.43f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 12f)
                lineTo(16f, 12f)
                lineToRelative(-4f, 8.01f)
                lineTo(8f, 12f)
                lineTo(3.02f, 12f)
                arcTo(0.4f, 0.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.09f, 11.69f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.5f, 0f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-3f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.73f, 3.44f)
                lineToRelative(2f, -3.14f)
                lineToRelative(2.53f, 1.61f)
                lineToRelative(-2f, 3.14f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(3.73f, 1.92f)
                lineToRelative(2.53f, -1.61f)
                lineToRelative(2f, 3.14f)
                lineToRelative(-2.53f, 1.61f)
                close()
            }
        }.also { _Gem = it}
