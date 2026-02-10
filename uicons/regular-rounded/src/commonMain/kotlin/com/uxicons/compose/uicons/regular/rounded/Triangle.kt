package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Triangle: ImageVector? = null

val Icons.Rr.Triangle: ImageVector
    get() = _Triangle ?: UXIcon(name = "Triangle") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.95f, 24f)
                horizontalLineTo(4.05f)
                arcTo(4.03f, 4.03f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.6f, 22.09f)
                arcToRelative(3.95f, 3.95f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.18f, -3.86f)
                lineTo(8.38f, 4.21f)
                arcToRelative(4.07f, 4.07f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.25f, 0.03f)
                lineToRelative(7.92f, 13.94f)
                arcToRelative(3.97f, 3.97f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.16f, 3.91f)
                arcTo(4.03f, 4.03f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19.95f, 24f)
                close()
                moveTo(12f, 4f)
                arcToRelative(2.01f, 2.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.84f, 1.13f)
                lineToRelative(-0.03f, 0.05f)
                lineTo(2.18f, 19.17f)
                arcTo(1.92f, 1.92f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.3f, 21.03f)
                arcTo(2.04f, 2.04f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.05f, 22f)
                horizontalLineToRelative(15.9f)
                arcToRelative(2.04f, 2.04f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.75f, -0.97f)
                arcToRelative(1.94f, 1.94f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.09f, -1.92f)
                lineTo(13.87f, 5.18f)
                arcTo(2.04f, 2.04f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 4f)
                close()
            }
        }.also { _Triangle = it}
