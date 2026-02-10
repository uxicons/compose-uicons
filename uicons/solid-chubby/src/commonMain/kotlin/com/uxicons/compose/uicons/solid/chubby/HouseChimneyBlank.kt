package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HouseChimneyBlank: ImageVector? = null

val Icons.Sc.HouseChimneyBlank: ImageVector
    get() = _HouseChimneyBlank ?: UXIcon(name = "HouseChimneyBlank") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.49f, 6.57f)
                curveToRelative(0.0f, -0.04f, 0.01f, -0.09f, 0.01f, -0.13f)
                verticalLineToRelative(-3.44f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(1.28f)
                curveToRelative(-2.25f, -1.53f, -5.12f, -3.28f, -6.5f, -3.28f)
                curveToRelative(-2.08f, 0f, -7.56f, 3.98f, -9.19f, 5.2f)
                curveToRelative(-0.11f, 0.08f, -0.2f, 0.19f, -0.27f, 0.31f)
                curveToRelative(-0.06f, 0.11f, -1.54f, 2.79f, -1.54f, 7.99f)
                curveToRelative(0f, 3.13f, 1.01f, 6.19f, 1.05f, 6.32f)
                curveToRelative(0.09f, 0.27f, 0.29f, 0.49f, 0.56f, 0.6f)
                curveToRelative(0.15f, 0.07f, 3.75f, 1.58f, 9.39f, 1.58f)
                reflectiveCurveToRelative(9.24f, -1.52f, 9.39f, -1.58f)
                curveToRelative(0.26f, -0.11f, 0.47f, -0.33f, 0.56f, -0.6f)
                curveToRelative(0.04f, -0.13f, 1.05f, -3.19f, 1.05f, -6.32f)
                curveToRelative(0f, -4.85f, -1.28f, -7.51f, -1.51f, -7.93f)
                close()
            }
        }.also { _HouseChimneyBlank = it}
