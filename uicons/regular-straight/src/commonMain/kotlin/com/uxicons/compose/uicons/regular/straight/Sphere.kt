package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Sphere: ImageVector? = null

val Icons.Rs.Sphere: ImageVector
    get() = _Sphere ?: UXIcon(name = "Sphere") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = false, 24f, 12f)
                arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 0f)
                close()
                moveTo(12f, 15f)
                curveTo(5.99f, 15f, 2f, 13.19f, 2f, 12f)
                reflectiveCurveTo(5.99f, 9f, 12f, 9f)
                reflectiveCurveToRelative(10f, 1.81f, 10f, 3f)
                reflectiveCurveTo(18.01f, 15f, 12f, 15f)
                close()
                moveTo(12f, 2f)
                arcToRelative(10.01f, 10.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.47f, 6.82f)
                arcTo(22.01f, 22.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 7f)
                arcTo(22.01f, 22.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.53f, 8.82f)
                arcTo(10.01f, 10.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 2f)
                close()
                moveTo(12f, 22f)
                arcToRelative(10.01f, 10.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, -9.47f, -6.82f)
                arcTo(22.01f, 22.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 17f)
                arcToRelative(22.01f, 22.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.47f, -1.82f)
                arcTo(10.01f, 10.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 22f)
                close()
            }
        }.also { _Sphere = it}
