package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HouseChimneyBlank: ImageVector? = null

val Icons.Tc.HouseChimneyBlank: ImageVector
    get() = _HouseChimneyBlank ?: UXIcon(name = "HouseChimneyBlank") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.46f, 6.5f)
                curveToRelative(-0.03f, -0.06f, -0.08f, -0.11f, -0.14f, -0.15f)
                curveToRelative(-0.07f, -0.05f, -0.17f, -0.13f, -0.32f, -0.24f)
                verticalLineToRelative(-3.61f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                reflectiveCurveToRelative(-0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(2.89f)
                curveToRelative(-2.19f, -1.56f, -6.38f, -4.39f, -8f, -4.39f)
                curveToRelative(-2.11f, 0f, -8.59f, 4.8f, -9.32f, 5.35f)
                curveToRelative(-0.06f, 0.04f, -0.1f, 0.09f, -0.14f, 0.15f)
                curveToRelative(-0.06f, 0.11f, -1.54f, 2.8f, -1.54f, 8.12f)
                curveToRelative(0f, 3.19f, 1.03f, 6.33f, 1.07f, 6.46f)
                curveToRelative(0.05f, 0.14f, 0.15f, 0.24f, 0.28f, 0.3f)
                curveToRelative(0.15f, 0.07f, 3.84f, 1.62f, 9.65f, 1.62f)
                reflectiveCurveToRelative(9.49f, -1.55f, 9.65f, -1.62f)
                curveToRelative(0.13f, -0.06f, 0.23f, -0.17f, 0.28f, -0.3f)
                curveToRelative(0.04f, -0.13f, 1.07f, -3.26f, 1.07f, -6.46f)
                curveToRelative(0f, -5.32f, -1.48f, -8.01f, -1.54f, -8.12f)
                close()
                moveTo(21.04f, 20.55f)
                curveToRelative(-0.84f, 0.32f, -4.2f, 1.45f, -9.04f, 1.45f)
                reflectiveCurveToRelative(-8.2f, -1.14f, -9.04f, -1.45f)
                curveToRelative(-0.23f, -0.76f, -0.95f, -3.35f, -0.95f, -5.92f)
                curveToRelative(0f, -4.52f, 1.13f, -7.05f, 1.37f, -7.54f)
                curveToRelative(2.68f, -1.99f, 7.31f, -5.08f, 8.63f, -5.08f)
                reflectiveCurveToRelative(5.95f, 3.09f, 8.63f, 5.08f)
                curveToRelative(0.24f, 0.49f, 1.37f, 3.03f, 1.37f, 7.54f)
                curveToRelative(0f, 2.56f, -0.73f, 5.16f, -0.96f, 5.92f)
                close()
            }
        }.also { _HouseChimneyBlank = it}
