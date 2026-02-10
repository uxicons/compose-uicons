package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _IceCream: ImageVector? = null

val Icons.Ss.IceCream: ImageVector
    get() = _IceCream ?: UXIcon(name = "IceCream") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.04f, 10f)
                curveTo(12.6f, 3.79f, 21.7f, 3.27f, 22f, 9.5f)
                horizontalLineToRelative(0f)
                lineToRelative(0f, 0.02f)
                lineToRelative(0f, 0.01f)
                horizontalLineToRelative(0f)
                curveToRelative(0f, 0.15f, -0.02f, 0.31f, -0.03f, 0.46f)
                close()
                moveTo(10.97f, 10f)
                curveToRelative(0.41f, -6.61f, -9.35f, -6.61f, -8.93f, 0f)
                close()
                moveTo(2.63f, 12f)
                curveTo(2.68f, 12.08f, 12f, 23.99f, 12f, 23.99f)
                reflectiveCurveTo(21.32f, 12.08f, 21.37f, 12f)
                close()
                moveTo(12.02f, 6.09f)
                arcToRelative(6.48f, 6.48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.6f, -2.99f)
                arcTo(5.02f, 5.02f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.39f, 3.07f)
                arcTo(6.5f, 6.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12.02f, 6.09f)
                close()
            }
        }.also { _IceCream = it}
