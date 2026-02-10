package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GrinHearts: ImageVector? = null

val Icons.Bs.GrinHearts: ImageVector
    get() = _GrinHearts ?: UXIcon(name = "GrinHearts") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 12f)
                curveToRelative(0.6f, 15.9f, 23.4f, 15.89f, 24f, 0f)
                arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 0f)
                close()
                moveTo(12f, 21f)
                arcToRelative(9.01f, 9.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, -9f, -9f)
                curveTo(3.45f, 0.08f, 20.55f, 0.08f, 21f, 12f)
                arcTo(9.01f, 9.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 21f)
                close()
                moveTo(11.99f, 15f)
                arcTo(21.92f, 21.92f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 14f)
                curveToRelative(-0.61f, 2.28f, -2.66f, 5f, -6f, 5f)
                reflectiveCurveToRelative(-5.39f, -2.72f, -6.01f, -5f)
                arcTo(21.84f, 21.84f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.99f, 15f)
                close()
                moveTo(5f, 8.5f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 0f)
                curveToRelative(0.45f, -3.38f, 6.46f, -0.62f, 0f, 3.75f)
                curveTo(8f, 12.25f, 5f, 10.25f, 5f, 8.5f)
                close()
                moveTo(19f, 8.5f)
                curveToRelative(0f, 1.75f, -3f, 3.75f, -3f, 3.75f)
                curveToRelative(-6.45f, -4.36f, -0.46f, -7.14f, 0f, -3.75f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 8.5f)
                close()
            }
        }.also { _GrinHearts = it}
