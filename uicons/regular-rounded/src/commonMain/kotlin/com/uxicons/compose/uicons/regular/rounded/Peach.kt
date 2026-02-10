package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Peach: ImageVector? = null

val Icons.Rr.Peach: ImageVector
    get() = _Peach ?: UXIcon(name = "Peach") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.6f, 5.24f)
                curveTo(22.74f, 2.68f, 22.51f, -0.17f, 18.74f, 0f)
                arcToRelative(7.16f, 7.16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6.19f, 3.44f)
                arcTo(4.66f, 4.66f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 0f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 2f)
                curveToRelative(1.92f, 0f, 2.6f, 1.62f, 2.85f, 2.8f)
                arcTo(7.54f, 7.54f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 11.5f)
                curveTo(0f, 19.59f, 7.93f, 24f, 12f, 24f)
                reflectiveCurveToRelative(12f, -4.41f, 12f, -12.5f)
                arcTo(7.47f, 7.47f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20.6f, 5.24f)
                close()
                moveTo(18.74f, 2f)
                arcToRelative(5.96f, 5.96f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.23f, 0.12f)
                curveToRelative(-0.66f, 2.69f, -3.12f, 4f, -6.48f, 3.87f)
                arcTo(5.57f, 5.57f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18.74f, 2f)
                close()
                moveTo(12f, 22f)
                curveTo(9.01f, 22f, 2f, 18.43f, 2f, 11.5f)
                curveToRelative(0.23f, -7.27f, 10.77f, -7.27f, 11f, 0f)
                arcToRelative(12.25f, 12.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.83f, 5.95f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.67f, 1.11f)
                curveToRelative(0.79f, -0.88f, 3.53f, -7.09f, 1.29f, -10.56f)
                arcToRelative(8.9f, 8.9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.93f, -1.35f)
                arcTo(5.48f, 5.48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 11.5f)
                curveTo(22f, 18.43f, 14.99f, 22f, 12f, 22f)
                close()
            }
        }.also { _Peach = it}
