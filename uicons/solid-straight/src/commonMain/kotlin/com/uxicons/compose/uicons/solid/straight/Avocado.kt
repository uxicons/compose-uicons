package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Avocado: ImageVector? = null

val Icons.Ss.Avocado: ImageVector
    get() = _Avocado ?: UXIcon(name = "Avocado") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.04f, 9.11f)
                arcToRelative(14.99f, 14.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.45f, -4.75f)
                arcTo(5.76f, 5.76f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 0f)
                curveTo(8.61f, 0f, 2f, 5.23f, 2f, 14.82f)
                curveTo(2f, 19.88f, 6.49f, 24f, 12f, 24f)
                reflectiveCurveToRelative(10f, -4.12f, 10f, -9.18f)
                arcTo(8.27f, 8.27f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20.04f, 9.11f)
                close()
                moveTo(12f, 20f)
                arcToRelative(3.91f, 3.91f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4f, -4f)
                curveToRelative(0f, -2.97f, 2.02f, -6f, 4f, -6f)
                reflectiveCurveToRelative(4f, 3.03f, 4f, 6f)
                arcTo(3.91f, 3.91f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 20f)
                close()
                moveTo(14f, 16f)
                arcToRelative(1.91f, 1.91f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 2f)
                arcToRelative(1.91f, 1.91f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, -2f)
                curveToRelative(0f, -2.29f, 1.53f, -4f, 2f, -4f)
                reflectiveCurveTo(14f, 13.71f, 14f, 16f)
                close()
            }
        }.also { _Avocado = it}
