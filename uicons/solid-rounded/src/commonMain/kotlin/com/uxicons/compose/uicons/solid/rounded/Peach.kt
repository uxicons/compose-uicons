package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Peach: ImageVector? = null

val Icons.Sr.Peach: ImageVector
    get() = _Peach ?: UXIcon(name = "Peach") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.9f, 2.55f)
                curveTo(21.33f, 4.29f, 19.73f, 7f, 15.31f, 7f)
                curveToRelative(-0.84f, -0.02f, -2.27f, 0.26f, -2.31f, -1f)
                arcTo(3.85f, 3.85f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 2f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 0f)
                arcToRelative(5.5f, 5.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.2f, 2.9f)
                arcTo(5.88f, 5.88f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19.29f, 0f)
                curveTo(20.86f, -0.13f, 22.44f, 0.78f, 21.9f, 2.55f)
                close()
                moveTo(21.94f, 6.35f)
                curveTo(20.11f, 8.48f, 16.77f, 9.23f, 13.7f, 8.98f)
                arcTo(7.09f, 7.09f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 11f)
                arcToRelative(17.16f, 17.16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.17f, 7.55f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.67f, -1.11f)
                arcTo(15.5f, 15.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 11f)
                curveToRelative(0f, -0.82f, -0.49f, -6f, -5.5f, -6f)
                arcTo(6.41f, 6.41f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 11.5f)
                curveTo(0f, 19.59f, 7.93f, 24f, 12f, 24f)
                reflectiveCurveToRelative(12f, -4.41f, 12f, -12.5f)
                arcTo(7.48f, 7.48f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21.94f, 6.35f)
                close()
            }
        }.also { _Peach = it}
