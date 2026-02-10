package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Cube: ImageVector? = null

val Icons.Rr.Cube: ImageVector
    get() = _Cube ?: UXIcon(name = "Cube") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.53f, 4.22f)
                lineTo(14.5f, 0.74f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5f, 0f)
                lineTo(3.47f, 4.22f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.5f, 4.33f)
                verticalLineToRelative(6.96f)
                arcToRelative(5.02f, 5.02f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.5f, 4.33f)
                lineTo(9.5f, 23.32f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 0f)
                lineToRelative(6.03f, -3.48f)
                arcToRelative(5.02f, 5.02f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.5f, -4.33f)
                lineTo(23.03f, 8.55f)
                arcTo(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20.53f, 4.22f)
                close()
                moveTo(10.5f, 2.47f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 0f)
                lineToRelative(6.03f, 3.48f)
                arcToRelative(2.94f, 2.94f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.43f, 0.33f)
                lineTo(13.76f, 9.85f)
                arcToRelative(3.53f, 3.53f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.53f, 0f)
                lineTo(4.04f, 6.28f)
                arcToRelative(2.94f, 2.94f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.43f, -0.33f)
                close()
                moveTo(4.47f, 18.11f)
                arcToRelative(3.01f, 3.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.5f, -2.6f)
                lineTo(2.97f, 8.55f)
                arcToRelative(2.89f, 2.89f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.07f, -0.54f)
                lineToRelative(6.19f, 3.58f)
                arcTo(5.49f, 5.49f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, 12.22f)
                verticalLineToRelative(9.57f)
                arcToRelative(2.89f, 2.89f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.5f, -0.21f)
                close()
                moveTo(21.03f, 15.51f)
                arcToRelative(3.01f, 3.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.5f, 2.6f)
                lineTo(13.5f, 21.59f)
                arcToRelative(2.89f, 2.89f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.5f, 0.21f)
                lineTo(13f, 12.22f)
                arcToRelative(5.49f, 5.49f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.76f, -0.64f)
                lineToRelative(6.19f, -3.58f)
                arcToRelative(2.89f, 2.89f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.07f, 0.54f)
                close()
            }
        }.also { _Cube = it}
