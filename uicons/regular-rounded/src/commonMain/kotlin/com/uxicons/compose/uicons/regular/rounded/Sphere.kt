package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Sphere: ImageVector? = null

val Icons.Rr.Sphere: ImageVector
    get() = _Sphere ?: UXIcon(name = "Sphere") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = false, 24f, 12f)
                arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 0f)
                close()
                moveTo(12f, 16f)
                curveTo(6.28f, 16f, 2f, 13.89f, 2f, 12f)
                reflectiveCurveTo(6.28f, 8f, 12f, 8f)
                reflectiveCurveToRelative(10f, 2.11f, 10f, 4f)
                reflectiveCurveTo(17.72f, 16f, 12f, 16f)
                close()
                moveTo(12f, 2f)
                arcToRelative(10.01f, 10.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.19f, 6.06f)
                arcTo(18.64f, 18.64f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 6f)
                arcTo(18.64f, 18.64f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.81f, 8.06f)
                arcTo(10.01f, 10.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 2f)
                close()
                moveTo(12f, 22f)
                arcToRelative(10.01f, 10.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, -9.19f, -6.06f)
                arcTo(18.64f, 18.64f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 18f)
                arcToRelative(18.64f, 18.64f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.19f, -2.06f)
                arcTo(10.01f, 10.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 22f)
                close()
            }
        }.also { _Sphere = it}
