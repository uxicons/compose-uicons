package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Pallet: ImageVector? = null

val Icons.Tc.Pallet: ImageVector
    get() = _Pallet ?: UXIcon(name = "Pallet") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.0f, 13.48f)
                curveToRelative(0.01f, 0.28f, -0.2f, 0.51f, -0.47f, 0.52f)
                curveToRelative(-0.01f, 0f, -0.02f, 0f, -0.02f, 0f)
                curveToRelative(-0.27f, 0f, -0.49f, -0.21f, -0.5f, -0.48f)
                curveToRelative(-0.05f, -1.0f, -0.24f, -1.64f, -0.36f, -1.94f)
                curveToRelative(-1.06f, -0.12f, -5.07f, -0.55f, -9.14f, -0.58f)
                verticalLineToRelative(2.5f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                reflectiveCurveToRelative(-0.5f, -0.22f, -0.5f, -0.5f)
                verticalLineToRelative(-2.5f)
                curveToRelative(-4.08f, 0.03f, -8.09f, 0.46f, -9.14f, 0.59f)
                curveToRelative(-0.12f, 0.3f, -0.33f, 0.94f, -0.35f, 1.92f)
                curveToRelative(-0.01f, 0.28f, -0.24f, 0.49f, -0.51f, 0.49f)
                curveToRelative(-0.28f, -0.01f, -0.49f, -0.24f, -0.49f, -0.51f)
                curveToRelative(0.04f, -1.71f, 0.58f, -2.59f, 0.6f, -2.63f)
                curveToRelative(0.08f, -0.13f, 0.21f, -0.21f, 0.36f, -0.23f)
                curveToRelative(0.05f, -0.01f, 5.08f, -0.63f, 10.04f, -0.63f)
                reflectiveCurveToRelative(9.99f, 0.62f, 10.04f, 0.63f)
                curveToRelative(0.15f, 0.02f, 0.28f, 0.11f, 0.36f, 0.24f)
                curveToRelative(0.05f, 0.09f, 0.51f, 0.89f, 0.6f, 2.61f)
                close()
            }
        }.also { _Pallet = it}
