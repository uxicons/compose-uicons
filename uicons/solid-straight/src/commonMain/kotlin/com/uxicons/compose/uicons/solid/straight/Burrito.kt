package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Burrito: ImageVector? = null

val Icons.Ss.Burrito: ImageVector
    get() = _Burrito ?: UXIcon(name = "Burrito") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 8f)
                lineTo(4f, 21f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 3f)
                lineTo(17f, 24f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.91f, -2.31f)
                curveTo(18.87f, 12.98f, 7.68f, 8f, 4f, 8f)
                close()
                moveTo(8f, 21f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1f, -1f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 21f)
                close()
                moveTo(10f, 18f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1f, -1f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 18f)
                close()
                moveTo(12f, 21f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1f, -1f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 21f)
                close()
                moveTo(14.33f, 10.1f)
                arcTo(10.15f, 10.15f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 8f)
                verticalLineToRelative(8.06f)
                arcTo(20.5f, 20.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14.33f, 10.1f)
                close()
                moveTo(21f, 4f)
                arcToRelative(3.79f, 3.79f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.62f, 2f)
                lineTo(20f, 6f)
                arcToRelative(12.2f, 12.2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6.88f, 2.51f)
                lineToRelative(-0.59f, 0.45f)
                curveTo(11.81f, 8.55f, 11.1f, 8.18f, 10.4f, 7.85f)
                arcTo(9.24f, 9.24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12.54f, 5.71f)
                lineTo(11.46f, 4.03f)
                arcTo(11.97f, 11.97f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.5f, 7.05f)
                arcTo(14.14f, 14.14f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 6f)
                lineTo(3.62f, 6f)
                arcTo(3.74f, 3.74f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 4f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.14f, 1.22f)
                arcTo(4.07f, 4.07f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 0.55f)
                arcToRelative(4.07f, 4.07f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.86f, 0.68f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 4f)
                close()
            }
        }.also { _Burrito = it}
