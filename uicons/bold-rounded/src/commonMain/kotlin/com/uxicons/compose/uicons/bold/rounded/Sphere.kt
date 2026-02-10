package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Sphere: ImageVector? = null

val Icons.Br.Sphere: ImageVector
    get() = _Sphere ?: UXIcon(name = "Sphere") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12f, 0f)
            arcTo(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = false, 24f, 12f)
            arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 0f)
            close()
            moveTo(12f, 15.27f)
            curveTo(6.59f, 15.27f, 3f, 13.3f, 3f, 12f)
            reflectiveCurveToRelative(3.59f, -3.27f, 9f, -3.27f)
            reflectiveCurveTo(21f, 10.7f, 21f, 12f)
            reflectiveCurveTo(17.41f, 15.27f, 12f, 15.27f)
            close()
            moveTo(12f, 3f)
            arcToRelative(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.5f, 4.04f)
            arcTo(20.18f, 20.18f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 5.73f)
            arcTo(20.18f, 20.18f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.5f, 7.04f)
            arcTo(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 3f)
            close()
            moveTo(12f, 21f)
            arcToRelative(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = true, -7.5f, -4.04f)
            arcTo(20.18f, 20.18f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 18.27f)
            arcToRelative(20.18f, 20.18f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.5f, -1.31f)
            arcTo(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 21f)
            close()
        }
    }.also { _Sphere = it }
