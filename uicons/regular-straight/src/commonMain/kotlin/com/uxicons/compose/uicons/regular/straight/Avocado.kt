package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Avocado: ImageVector? = null

val Icons.Rs.Avocado: ImageVector
    get() = _Avocado ?: UXIcon(name = "Avocado") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 20f)
                arcToRelative(3.91f, 3.91f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4f, -4f)
                curveToRelative(0f, -2.97f, 2.02f, -6f, 4f, -6f)
                reflectiveCurveToRelative(4f, 3.03f, 4f, 6f)
                arcTo(3.91f, 3.91f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 20f)
                close()
                moveTo(12f, 12f)
                curveToRelative(-0.47f, 0f, -2f, 1.71f, -2f, 4f)
                arcToRelative(1.91f, 1.91f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 2f)
                arcToRelative(1.91f, 1.91f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, -2f)
                curveTo(14f, 13.71f, 12.47f, 12f, 12f, 12f)
                close()
                moveTo(12f, 24f)
                curveTo(6.49f, 24f, 2f, 19.88f, 2f, 14.82f)
                curveTo(2f, 5.23f, 8.61f, 0f, 12f, 0f)
                arcToRelative(5.76f, 5.76f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.59f, 4.36f)
                arcTo(14.99f, 14.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20.04f, 9.11f)
                arcTo(8.27f, 8.27f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 14.82f)
                curveTo(22f, 19.88f, 17.51f, 24f, 12f, 24f)
                close()
                moveTo(12f, 2f)
                curveTo(9.68f, 2f, 4f, 6.49f, 4f, 14.82f)
                curveTo(4f, 18.78f, 7.59f, 22f, 12f, 22f)
                reflectiveCurveToRelative(8f, -3.22f, 8f, -7.18f)
                arcToRelative(6.37f, 6.37f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.55f, -4.5f)
                arcToRelative(16.97f, 16.97f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.77f, -5.39f)
                arcTo(3.78f, 3.78f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 2f)
                close()
            }
        }.also { _Avocado = it}
