package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Cube: ImageVector? = null

val Icons.Sr.Cube: ImageVector
    get() = _Cube ?: UXIcon(name = "Cube") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.76f, 11.59f)
                arcTo(5.5f, 5.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13f, 12.22f)
                verticalLineTo(23.87f)
                arcToRelative(4.92f, 4.92f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.5f, -0.56f)
                lineToRelative(6.03f, -3.48f)
                arcToRelative(5.02f, 5.02f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.5f, -4.33f)
                verticalLineTo(8.55f)
                arcToRelative(4.96f, 4.96f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.27f, -1.57f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.24f, 9.86f)
                arcToRelative(3.53f, 3.53f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.52f, 0f)
                lineToRelative(8f, -4.61f)
                arcToRelative(4.98f, 4.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.24f, -1.03f)
                lineTo(14.5f, 0.74f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5f, 0f)
                lineTo(3.47f, 4.22f)
                arcToRelative(4.97f, 4.97f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.2f, 0.98f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 12.22f)
                arcToRelative(5.49f, 5.49f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.76f, -0.64f)
                lineTo(1.26f, 6.92f)
                arcTo(4.96f, 4.96f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.97f, 8.55f)
                verticalLineToRelative(6.96f)
                arcToRelative(5.02f, 5.02f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.5f, 4.33f)
                lineTo(9.5f, 23.32f)
                arcToRelative(4.92f, 4.92f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.5f, 0.56f)
                close()
            }
        }.also { _Cube = it}
