package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Marker: ImageVector? = null

val Icons.Bs.Marker: ImageVector
    get() = _Marker ?: UXIcon(name = "Marker") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0.02f)
                arcTo(10.08f, 10.08f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.94f, 10.09f)
                curveToRelative(0f, 5.27f, 8.17f, 12.33f, 9.1f, 13.12f)
                lineToRelative(0.97f, 0.82f)
                lineToRelative(0.97f, -0.82f)
                curveToRelative(0.93f, -0.79f, 9.1f, -7.84f, 9.1f, -13.12f)
                arcTo(10.08f, 10.08f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 0.02f)
                close()
                moveTo(12f, 20.06f)
                curveToRelative(-3.06f, -2.79f, -7.07f, -7.33f, -7.07f, -9.98f)
                arcToRelative(7.07f, 7.07f, 0f, isMoreThanHalf = true, isPositiveArc = true, 14.13f, 0f)
                curveTo(19.07f, 12.73f, 15.06f, 17.27f, 12f, 20.06f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 10.0f)
                moveToRelative(-3.0f, 0f)
                arcToRelative(3.0f, 3.0f, 0f, isMoreThanHalf = true, isPositiveArc = true, 5.99f, 0f)
                arcToRelative(3.0f, 3.0f, 0f, isMoreThanHalf = true, isPositiveArc = true, -5.99f, 0f)
            }
        }.also { _Marker = it}
