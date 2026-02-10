package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Palette: ImageVector? = null

val Icons.Rs.Palette: ImageVector
    get() = _Palette ?: UXIcon(name = "Palette") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.5f, 9.5f)
                moveToRelative(-1.5f, 0f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 3f, 0f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, -3f, 0f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.5f, 6.5f)
                moveToRelative(-1.5f, 0f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 3f, 0f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, -3f, 0f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(7.5f, 9.5f)
                moveToRelative(-1.5f, 0f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 3f, 0f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, -3f, 0f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(7.5f, 15.5f)
                moveToRelative(-1.5f, 0f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 3f, 0f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, -3f, 0f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.08f, 24f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.75f, 3.37f)
                arcTo(11.88f, 11.88f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12.5f, 0.01f)
                arcTo(12.15f, 12.15f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24.08f, 11.7f)
                arcToRelative(11.92f, 11.92f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.78f, 4.55f)
                arcToRelative(1.89f, 1.89f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.38f, 1.18f)
                arcToRelative(1.91f, 1.91f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.77f, -0.52f)
                lineToRelative(-0.1f, -0.1f)
                arcToRelative(3.57f, 3.57f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6.09f, 2.55f)
                lineToRelative(0.04f, 4.52f)
                lineToRelative(-0.92f, 0.08f)
                curveTo(12.75f, 23.98f, 12.42f, 24f, 12.08f, 24f)
                close()
                moveTo(12.08f, 2f)
                arcToRelative(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.09f, 20f)
                lineToRelative(-0.02f, -2.62f)
                arcTo(5.6f, 5.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13.6f, 15.39f)
                horizontalLineToRelative(0f)
                arcToRelative(5.57f, 5.57f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.87f, 0f)
                lineToRelative(0.01f, 0.01f)
                arcToRelative(9.89f, 9.89f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.59f, -3.65f)
                arcToRelative(10.13f, 10.13f, 0f, isMoreThanHalf = false, isPositiveArc = false, -9.64f, -9.74f)
                curveTo(12.32f, 2f, 12.2f, 2f, 12.08f, 2f)
                close()
            }
        }.also { _Palette = it}
