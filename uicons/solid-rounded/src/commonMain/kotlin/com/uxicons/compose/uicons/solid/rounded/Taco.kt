package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Taco: ImageVector? = null

val Icons.Sr.Taco: ImageVector
    get() = _Taco ?: UXIcon(name = "Taco") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 8.57f)
                curveTo(14.97f, 2.81f, 4.89f, 7.4f, 5f, 15.79f)
                lineTo(5f, 19.5f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, 0f)
                lineTo(2f, 15.27f)
                arcToRelative(7.49f, 7.49f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.63f, -4.65f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.06f, 9.38f)
                curveTo(-0.34f, 12.05f, -0.04f, 16.16f, 0f, 19.5f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.5f, 23f)
                lineTo(19f, 23f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, -5f)
                lineTo(24f, 15.5f)
                arcTo(9.54f, 9.54f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 8.57f)
                close()
                moveTo(16f, 20f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -2f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 20f)
                close()
                moveTo(18f, 17f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -2f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 17f)
                close()
                moveTo(20f, 20f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -2f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 20f)
                close()
                moveTo(5.21f, 8.18f)
                arcTo(3.84f, 3.84f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.26f, 3.06f)
                arcToRelative(3.31f, 3.31f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.8f, -1.95f)
                arcToRelative(3.23f, 3.23f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.92f, -0.01f)
                arcToRelative(3.31f, 3.31f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.77f, 1.96f)
                arcToRelative(3.93f, 3.93f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.93f, 5.53f)
                curveToRelative(-4.2f, -6.04f, -14.03f, -6.02f, -18.22f, -0.07f)
                arcTo(3.11f, 3.11f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.21f, 8.18f)
                close()
            }
        }.also { _Taco = it}
