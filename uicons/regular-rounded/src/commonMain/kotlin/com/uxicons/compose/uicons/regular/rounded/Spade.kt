package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Spade: ImageVector? = null

val Icons.Rr.Spade: ImageVector
    get() = _Spade ?: UXIcon(name = "Spade") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23f, 13.5f)
                curveToRelative(0f, -4.36f, -4.85f, -9.76f, -7.71f, -12.26f)
                arcToRelative(5.03f, 5.03f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6.58f, 0f)
                curveTo(5.85f, 3.75f, 1f, 9.14f, 1f, 13.5f)
                arcTo(6.27f, 6.27f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 20f)
                arcToRelative(5.82f, 5.82f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.93f, -1.66f)
                curveTo(10.75f, 20.8f, 10.12f, 22f, 8f, 22f)
                horizontalLineTo(6f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 2f)
                horizontalLineTo(18f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -2f)
                horizontalLineTo(16f)
                curveToRelative(-2.12f, 0f, -2.75f, -1.2f, -2.93f, -3.66f)
                arcTo(5.82f, 5.82f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17f, 20f)
                arcTo(6.27f, 6.27f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23f, 13.5f)
                close()
                moveTo(12.9f, 14.92f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 14.37f)
                horizontalLineToRelative(0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.89f, 0.55f)
                curveTo(11.09f, 14.95f, 9.51f, 18f, 7f, 18f)
                arcToRelative(4.28f, 4.28f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4f, -4.5f)
                curveToRelative(0f, -3.03f, 3.53f, -7.7f, 7.02f, -10.75f)
                arcToRelative(3.02f, 3.02f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.95f, 0f)
                curveTo(17.47f, 5.8f, 21f, 10.47f, 21f, 13.5f)
                arcTo(4.28f, 4.28f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17f, 18f)
                curveTo(14.48f, 18f, 12.91f, 14.95f, 12.9f, 14.92f)
                close()
            }
        }.also { _Spade = it}
