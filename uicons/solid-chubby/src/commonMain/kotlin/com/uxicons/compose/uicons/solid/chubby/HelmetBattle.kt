package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HelmetBattle: ImageVector? = null

val Icons.Sc.HelmetBattle: ImageVector
    get() = _HelmetBattle ?: UXIcon(name = "HelmetBattle") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16.32f, 11.9f)
                curveToRelative(-0.65f, -0.36f, -2.02f, -0.9f, -4.32f, -0.9f)
                reflectiveCurveToRelative(-3.66f, 0.54f, -4.32f, 0.9f)
                curveToRelative(1.0f, 2.42f, 3.73f, 3.0f, 4.32f, 3.09f)
                curveToRelative(0.61f, -0.1f, 3.33f, -0.68f, 4.32f, -3.09f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.36f, 5.49f)
                curveToRelative(-0.07f, -0.12f, -0.17f, -0.23f, -0.29f, -0.31f)
                curveToRelative(-1.42f, -0.98f, -6.18f, -4.18f, -8.07f, -4.18f)
                reflectiveCurveToRelative(-6.65f, 3.2f, -8.07f, 4.18f)
                curveToRelative(-0.12f, 0.08f, -0.21f, 0.19f, -0.29f, 0.31f)
                curveToRelative(-0.07f, 0.11f, -1.64f, 2.79f, -1.64f, 7.51f)
                curveToRelative(0f, 4.19f, 1.06f, 6.36f, 1.1f, 6.45f)
                curveToRelative(0.09f, 0.18f, 0.24f, 0.33f, 0.42f, 0.43f)
                curveToRelative(0.52f, 0.28f, 4.68f, 2.62f, 7.48f, 3.12f)
                verticalLineToRelative(-6.18f)
                curveToRelative(-1.54f, -0.39f, -4.6f, -1.59f, -5.47f, -5.08f)
                curveToRelative(-0.09f, -0.34f, 0.01f, -0.7f, 0.26f, -0.95f)
                curveToRelative(0.18f, -0.18f, 1.92f, -1.79f, 6.21f, -1.79f)
                reflectiveCurveToRelative(6.02f, 1.61f, 6.21f, 1.79f)
                curveToRelative(0.25f, 0.25f, 0.35f, 0.61f, 0.26f, 0.95f)
                curveToRelative(-0.78f, 3.13f, -3.5f, 4.59f, -5.47f, 5.08f)
                verticalLineToRelative(6.17f)
                curveToRelative(2.8f, -0.5f, 6.96f, -2.84f, 7.48f, -3.12f)
                curveToRelative(0.18f, -0.1f, 0.32f, -0.25f, 0.42f, -0.43f)
                curveToRelative(0.04f, -0.09f, 1.1f, -2.26f, 1.1f, -6.45f)
                curveToRelative(0f, -4.72f, -1.58f, -7.4f, -1.64f, -7.51f)
                close()
            }
        }.also { _HelmetBattle = it}
