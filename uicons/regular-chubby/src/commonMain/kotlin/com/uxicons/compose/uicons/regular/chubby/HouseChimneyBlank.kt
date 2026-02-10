package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HouseChimneyBlank: ImageVector? = null

val Icons.Rc.HouseChimneyBlank: ImageVector
    get() = _HouseChimneyBlank ?: UXIcon(name = "HouseChimneyBlank") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.46f, 6.51f)
                curveToRelative(-0.07f, -0.12f, -0.16f, -0.23f, -0.27f, -0.31f)
                curveToRelative(-0.06f, -0.04f, -0.12f, -0.09f, -0.19f, -0.14f)
                verticalLineToRelative(-3.06f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(1.62f)
                curveToRelative(-2.31f, -1.6f, -5.52f, -3.62f, -7f, -3.62f)
                curveToRelative(-2.08f, 0f, -7.56f, 3.98f, -9.19f, 5.2f)
                curveToRelative(-0.11f, 0.08f, -0.2f, 0.19f, -0.27f, 0.31f)
                curveToRelative(-0.06f, 0.11f, -1.54f, 2.79f, -1.54f, 7.99f)
                curveToRelative(0f, 3.13f, 1.01f, 6.19f, 1.05f, 6.32f)
                curveToRelative(0.09f, 0.27f, 0.29f, 0.49f, 0.56f, 0.6f)
                curveToRelative(0.15f, 0.07f, 3.75f, 1.58f, 9.39f, 1.58f)
                reflectiveCurveToRelative(9.24f, -1.52f, 9.39f, -1.58f)
                curveToRelative(0.26f, -0.11f, 0.47f, -0.33f, 0.56f, -0.6f)
                curveToRelative(0.04f, -0.13f, 1.05f, -3.19f, 1.05f, -6.32f)
                curveToRelative(0f, -5.2f, -1.48f, -7.88f, -1.54f, -7.99f)
                close()
                moveTo(12f, 21f)
                curveToRelative(-4.14f, 0f, -7.13f, -0.89f, -8.19f, -1.26f)
                curveToRelative(-0.26f, -0.92f, -0.81f, -3.1f, -0.81f, -5.24f)
                curveToRelative(0f, -3.93f, 0.92f, -6.23f, 1.2f, -6.84f)
                curveToRelative(3.06f, -2.27f, 6.85f, -4.66f, 7.8f, -4.66f)
                reflectiveCurveToRelative(4.75f, 2.39f, 7.8f, 4.66f)
                curveToRelative(0.28f, 0.62f, 1.2f, 2.92f, 1.2f, 6.84f)
                curveToRelative(0f, 2.14f, -0.55f, 4.33f, -0.81f, 5.24f)
                curveToRelative(-1.05f, 0.37f, -4.02f, 1.26f, -8.19f, 1.26f)
                close()
            }
        }.also { _HouseChimneyBlank = it}
