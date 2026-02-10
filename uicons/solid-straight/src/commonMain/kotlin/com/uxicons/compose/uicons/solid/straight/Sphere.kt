package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Sphere: ImageVector? = null

val Icons.Ss.Sphere: ImageVector
    get() = _Sphere ?: UXIcon(name = "Sphere") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 18f)
                curveTo(7.44f, 18f, 2.64f, 17f, 0.36f, 14.86f)
                arcToRelative(11.98f, 11.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23.28f, 0f)
                curveTo(21.36f, 17f, 16.56f, 18f, 12f, 18f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 6f)
                curveToRelative(4.56f, 0f, 9.36f, 1f, 11.64f, 3.14f)
                arcToRelative(11.98f, 11.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, -23.28f, 0f)
                curveTo(2.64f, 7f, 7.44f, 6f, 12f, 6f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(1f, 12f)
                arcToRelative(11f, 4f, 0f, isMoreThanHalf = true, isPositiveArc = false, 22f, 0f)
                arcToRelative(11f, 4f, 0f, isMoreThanHalf = true, isPositiveArc = false, -22f, 0f)
                close()
            }
        }.also { _Sphere = it}
