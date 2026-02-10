package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Palette: ImageVector? = null

val Icons.Bs.Palette: ImageVector
    get() = _Palette ?: UXIcon(name = "Palette") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16f, 8f)
                moveToRelative(-2f, 0f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, 4f, 0f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, -4f, 0f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 8f)
                moveToRelative(-2f, 0f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, 4f, 0f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, -4f, 0f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(8f, 15f)
                moveToRelative(-2f, 0f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, 4f, 0f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, -4f, 0f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.5f, 0.01f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = false, 12.08f, 24f)
                curveToRelative(0.34f, 0f, 0.67f, -0.02f, 1f, -0.05f)
                lineToRelative(1.39f, -0.12f)
                lineToRelative(-0.04f, -4.82f)
                arcToRelative(2.86f, 2.86f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.88f, -2.05f)
                lineToRelative(0.1f, 0.1f)
                arcToRelative(2.38f, 2.38f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.19f, 0.64f)
                arcToRelative(2.35f, 2.35f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.71f, -1.46f)
                arcTo(11.92f, 11.92f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24.08f, 11.7f)
                arcTo(12.16f, 12.16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12.5f, 0.01f)
                close()
                moveTo(20.79f, 14.29f)
                arcToRelative(5.86f, 5.86f, 0f, isMoreThanHalf = false, isPositiveArc = false, -9.36f, 4.75f)
                lineToRelative(0.02f, 1.93f)
                arcTo(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12.08f, 3f)
                curveToRelative(0.1f, 0f, 0.21f, 0f, 0.32f, 0f)
                arcToRelative(9.11f, 9.11f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.68f, 8.77f)
                arcTo(8.91f, 8.91f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20.79f, 14.29f)
                close()
            }
        }.also { _Palette = it}
