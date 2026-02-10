package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Mushroom: ImageVector? = null

val Icons.Rr.Mushroom: ImageVector
    get() = _Mushroom ?: UXIcon(name = "Mushroom") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.08f, 0f, 11.33f)
                curveToRelative(0.03f, 4.28f, 4.67f, 4.22f, 7.73f, 2.6f)
                arcTo(30.51f, 30.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 19f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10f, 0f)
                arcToRelative(30.51f, 30.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.73f, -5.07f)
                curveToRelative(3.7f, 1.89f, 7.79f, 1.29f, 7.73f, -2.6f)
                curveTo(24f, 5.08f, 18.62f, 0f, 12f, 0f)
                close()
                moveTo(15f, 19f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6f, 0f)
                arcToRelative(32.59f, 32.59f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.94f, -5.77f)
                arcToRelative(9.55f, 9.55f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.13f, 0f)
                arcTo(32.59f, 32.59f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 19f)
                close()
                moveTo(20f, 13f)
                curveToRelative(-2.62f, -0.38f, -4.63f, -2.09f, -8f, -2f)
                curveToRelative(-3.37f, -0.09f, -5.38f, 1.62f, -8f, 2f)
                curveToRelative(-1.76f, 0f, -2f, -0.8f, -2f, -1.67f)
                curveTo(2f, 6.19f, 6.49f, 2f, 12f, 2f)
                reflectiveCurveToRelative(10f, 4.19f, 10f, 9.33f)
                curveTo(22f, 12.41f, 21.68f, 13f, 20f, 13f)
                close()
            }
        }.also { _Mushroom = it}
