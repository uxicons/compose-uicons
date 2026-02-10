package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LaughBeam: ImageVector? = null

val Icons.Bs.LaughBeam: ImageVector
    get() = _LaughBeam ?: UXIcon(name = "LaughBeam") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 14f)
                curveToRelative(0f, 2f, -2f, 5f, -4.99f, 5f)
                reflectiveCurveTo(7.05f, 16f, 7f, 14f)
                close()
                moveTo(24f, 12f)
                arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 24f)
                curveTo(-3.9f, 23.4f, -3.89f, 0.6f, 12f, 0f)
                arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 12f)
                close()
                moveTo(21f, 12f)
                arcToRelative(9.01f, 9.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -9f, -9f)
                curveTo(0.08f, 3.45f, 0.08f, 20.55f, 12f, 21f)
                arcTo(9.01f, 9.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 12f)
                close()
                moveTo(11f, 12f)
                curveToRelative(-0.17f, -6.66f, -5.83f, -6.65f, -6f, 0f)
                curveTo(7.76f, 9.39f, 8.25f, 9.41f, 11f, 12f)
                close()
                moveTo(16f, 7f)
                curveToRelative(-2.27f, 0f, -3f, 3.37f, -3f, 5f)
                curveToRelative(2.76f, -2.61f, 3.25f, -2.59f, 6f, 0f)
                curveTo(19f, 10.37f, 18.27f, 7f, 16f, 7f)
                close()
            }
        }.also { _LaughBeam = it}
