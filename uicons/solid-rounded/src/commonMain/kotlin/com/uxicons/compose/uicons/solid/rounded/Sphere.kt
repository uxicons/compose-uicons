package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Sphere: ImageVector? = null

val Icons.Sr.Sphere: ImageVector
    get() = _Sphere ?: UXIcon(name = "Sphere") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 6f)
                curveToRelative(6.84f, 0f, 12f, 2.58f, 12f, 6f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 12f)
                curveTo(0f, 8.58f, 5.16f, 6f, 12f, 6f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 12f)
                arcToRelative(10f, 4f, 0f, isMoreThanHalf = true, isPositiveArc = false, 20f, 0f)
                arcToRelative(10f, 4f, 0f, isMoreThanHalf = true, isPositiveArc = false, -20f, 0f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 18f)
                curveTo(5.16f, 18f, 0f, 15.42f, 0f, 12f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 0f)
                curveTo(24f, 15.42f, 18.84f, 18f, 12f, 18f)
                close()
            }
        }.also { _Sphere = it}
