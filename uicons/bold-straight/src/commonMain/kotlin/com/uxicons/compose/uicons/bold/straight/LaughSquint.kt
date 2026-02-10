package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LaughSquint: ImageVector? = null

val Icons.Bs.LaughSquint: ImageVector
    get() = _LaughSquint ?: UXIcon(name = "LaughSquint") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.99f, 14f)
                curveToRelative(0f, 2f, -2f, 5f, -4.99f, 5f)
                reflectiveCurveToRelative(-4.96f, -3f, -5.01f, -5f)
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
                moveTo(13f, 9f)
                curveToRelative(0f, 2.27f, 3.37f, 3f, 5f, 3f)
                curveToRelative(-2.61f, -2.76f, -2.59f, -3.25f, 0f, -6f)
                curveTo(16.37f, 6f, 13f, 6.73f, 13f, 9f)
                close()
                moveTo(11f, 9f)
                curveToRelative(0f, -2.27f, -3.37f, -3f, -5f, -3f)
                curveToRelative(2.61f, 2.76f, 2.59f, 3.25f, 0f, 6f)
                curveTo(7.63f, 12f, 11f, 11.27f, 11f, 9f)
                close()
            }
        }.also { _LaughSquint = it}
