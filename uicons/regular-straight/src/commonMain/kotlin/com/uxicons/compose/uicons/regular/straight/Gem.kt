package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Gem: ImageVector? = null

val Icons.Rs.Gem: ImageVector
    get() = _Gem ?: UXIcon(name = "Gem") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.41f, 7.23f)
                arcTo(3.01f, 3.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.99f, 6f)
                lineTo(5.01f, 6f)
                arcToRelative(3.01f, 3.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.42f, 1.23f)
                lineTo(0.55f, 10.02f)
                arcToRelative(2.99f, 2.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.34f, 3.94f)
                lineTo(12f, 23.93f)
                lineTo(23.15f, 13.92f)
                arcToRelative(2.98f, 2.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.31f, -3.9f)
                close()
                moveTo(7.31f, 13f)
                lineToRelative(2.31f, 6.1f)
                lineTo(2.82f, 13f)
                close()
                moveTo(14.55f, 13f)
                lineTo(12f, 19.76f)
                lineTo(9.45f, 13f)
                close()
                moveTo(9.48f, 11f)
                lineToRelative(1.2f, -3f)
                horizontalLineToRelative(2.65f)
                lineToRelative(1.2f, 3f)
                close()
                moveTo(16.69f, 13f)
                horizontalLineToRelative(4.49f)
                lineToRelative(-6.8f, 6.1f)
                close()
                moveTo(19.79f, 8.41f)
                lineTo(21.69f, 11f)
                lineTo(16.68f, 11f)
                lineToRelative(-1.2f, -3f)
                horizontalLineToRelative(3.51f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19.79f, 8.41f)
                close()
                moveTo(4.21f, 8.41f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.01f, 8f)
                lineTo(8.52f, 8f)
                lineToRelative(-1.2f, 3f)
                lineTo(2.31f, 11f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 0f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-2f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.16f, 3.71f)
                lineToRelative(2f, -3.14f)
                lineToRelative(1.69f, 1.07f)
                lineToRelative(-2f, 3.14f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(4.16f, 1.65f)
                lineToRelative(1.69f, -1.07f)
                lineToRelative(2f, 3.14f)
                lineToRelative(-1.69f, 1.07f)
                close()
            }
        }.also { _Gem = it}
