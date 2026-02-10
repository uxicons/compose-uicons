package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Palette: ImageVector? = null

val Icons.Sr.Palette: ImageVector
    get() = _Palette ?: UXIcon(name = "Palette") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.06f, 16.8f)
                lineToRelative(0.1f, 0.1f)
                arcToRelative(1.91f, 1.91f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.77f, 0.52f)
                arcToRelative(1.89f, 1.89f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.38f, -1.18f)
                arcTo(11.92f, 11.92f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24.08f, 11.7f)
                arcTo(12.15f, 12.15f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12.5f, 0.01f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.08f, 12f)
                arcToRelative(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 12f)
                curveToRelative(0.34f, 0f, 0.67f, -0.02f, 1f, -0.05f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.92f, -1f)
                lineToRelative(-0.03f, -3.59f)
                arcTo(3.57f, 3.57f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20.06f, 16.8f)
                close()
                moveTo(17.11f, 8.05f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 16.05f, 9.88f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17.11f, 8.05f)
                close()
                moveTo(7.88f, 16.95f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 8.95f, 15.12f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.88f, 16.95f)
                close()
                moveTo(7.88f, 10.95f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 8.95f, 9.12f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.88f, 10.95f)
                close()
                moveTo(12.88f, 7.95f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 13.95f, 6.12f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12.88f, 7.95f)
                close()
            }
        }.also { _Palette = it}
