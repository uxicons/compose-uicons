package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Ring: ImageVector? = null

val Icons.Sc.Ring: ImageVector
    get() = _Ring ?: UXIcon(name = "Ring") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(1.07f, 8.43f)
                curveToRelative(0.67f, -4.75f, 5.85f, -5.43f, 10.93f, -5.43f)
                reflectiveCurveToRelative(10.29f, 0.7f, 10.91f, 5.51f)
                curveToRelative(-0.21f, 1.27f, -0.85f, 2.33f, -2.28f, 3.1f)
                curveToRelative(-0.9f, -1.89f, -3.59f, -2.58f, -8.63f, -2.62f)
                curveToRelative(-4.84f, 0f, -7.47f, 0.68f, -8.65f, 2.6f)
                curveToRelative(-1.45f, -0.79f, -2.08f, -1.87f, -2.27f, -3.18f)
                close()
                moveTo(12f, 15f)
                curveToRelative(-4.26f, 0f, -8.57f, -0.41f, -11f, -2.62f)
                verticalLineToRelative(2.12f)
                curveToRelative(0f, 5.73f, 5.56f, 6.5f, 11f, 6.5f)
                reflectiveCurveToRelative(11f, -0.77f, 11f, -6.5f)
                verticalLineToRelative(-2.12f)
                curveToRelative(-2.43f, 2.21f, -6.74f, 2.62f, -11f, 2.62f)
                close()
            }
        }.also { _Ring = it}
