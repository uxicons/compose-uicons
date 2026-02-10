package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Palette: ImageVector? = null

val Icons.Ss.Palette: ImageVector
    get() = _Palette ?: UXIcon(name = "Palette") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.3f, 16.25f)
                arcToRelative(1.89f, 1.89f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.38f, 1.18f)
                arcToRelative(1.91f, 1.91f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.77f, -0.52f)
                lineToRelative(-0.1f, -0.1f)
                arcToRelative(3.57f, 3.57f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6.09f, 2.55f)
                lineToRelative(0.04f, 4.52f)
                lineToRelative(-0.92f, 0.08f)
                curveToRelative(-0.33f, 0.03f, -0.66f, 0.05f, -1f, 0.05f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.75f, 3.37f)
                arcTo(11.88f, 11.88f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12.5f, 0.01f)
                arcTo(12.15f, 12.15f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24.08f, 11.7f)
                arcTo(11.92f, 11.92f, 0f, isMoreThanHalf = false, isPositiveArc = true, 23.3f, 16.25f)
                close()
                moveTo(17.11f, 8.05f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 18.95f, 9.12f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17.11f, 8.05f)
                close()
                moveTo(12.12f, 5.05f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 13.95f, 6.12f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12.12f, 5.05f)
                close()
                moveTo(7.12f, 8.05f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 8.95f, 9.12f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.12f, 8.05f)
                close()
                moveTo(7.12f, 14.05f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 8.95f, 15.12f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.12f, 14.05f)
                close()
            }
        }.also { _Palette = it}
