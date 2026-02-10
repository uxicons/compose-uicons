package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Sphere: ImageVector? = null

val Icons.Bs.Sphere: ImageVector
    get() = _Sphere ?: UXIcon(name = "Sphere") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = false, 24f, 12f)
                arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 0f)
                close()
                moveTo(3.04f, 12f)
                curveToRelative(0.52f, -0.65f, 3.57f, -2f, 8.96f, -2f)
                reflectiveCurveToRelative(8.44f, 1.35f, 8.96f, 2f)
                curveToRelative(-0.52f, 0.65f, -3.57f, 2f, -8.96f, 2f)
                reflectiveCurveTo(3.56f, 12.64f, 3.04f, 12f)
                close()
                moveTo(12f, 3f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.13f, 5.17f)
                arcTo(25.53f, 25.53f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 7f)
                arcTo(25.53f, 25.53f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.87f, 8.17f)
                arcTo(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 3f)
                close()
                moveTo(12f, 21f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8.13f, -5.17f)
                arcTo(25.53f, 25.53f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 17f)
                arcToRelative(25.53f, 25.53f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.13f, -1.17f)
                arcTo(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 21f)
                close()
            }
        }.also { _Sphere = it}
