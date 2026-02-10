package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BatterySlash: ImageVector? = null

val Icons.Sc.BatterySlash: ImageVector
    get() = _BatterySlash ?: UXIcon(name = "BatterySlash") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.32f, 8.58f)
                curveToRelative(-0.13f, -0.28f, -0.38f, -0.48f, -0.68f, -0.55f)
                curveToRelative(-0.04f, -0.01f, -0.34f, -0.08f, -0.89f, -0.16f)
                curveToRelative(-0.3f, -1.46f, -0.66f, -2.37f, -0.69f, -2.44f)
                curveToRelative(-0.12f, -0.31f, -0.39f, -0.54f, -0.72f, -0.61f)
                curveToRelative(-0.16f, -0.03f, -3.87f, -0.83f, -8.26f, -0.83f)
                curveToRelative(-1.61f, 0f, -3.13f, 0.11f, -4.42f, 0.24f)
                lineToRelative(-1.8f, -2.2f)
                curveToRelative(-0.53f, -0.64f, -1.47f, -0.73f, -2.11f, -0.21f)
                curveToRelative(-0.64f, 0.53f, -0.73f, 1.47f, -0.21f, 2.11f)
                lineToRelative(14.77f, 18f)
                curveToRelative(0.3f, 0.36f, 1.15f, 0.9f, 2.11f, 0.21f)
                curveToRelative(0.68f, -0.48f, 0.73f, -1.47f, 0.21f, -2.11f)
                lineToRelative(-0.66f, -0.8f)
                curveToRelative(0.22f, -0.04f, 0.34f, -0.07f, 0.37f, -0.07f)
                curveToRelative(0.33f, -0.07f, 0.6f, -0.3f, 0.72f, -0.61f)
                curveToRelative(0.03f, -0.07f, 0.38f, -0.98f, 0.68f, -2.43f)
                curveToRelative(0.55f, -0.08f, 0.85f, -0.15f, 0.89f, -0.16f)
                curveToRelative(0.3f, -0.07f, 0.55f, -0.28f, 0.68f, -0.56f)
                curveToRelative(0.03f, -0.06f, 0.68f, -1.51f, 0.68f, -3.42f)
                curveToRelative(0f, -1.92f, -0.66f, -3.36f, -0.69f, -3.42f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(1f, 12f)
                curveToRelative(0f, 3.71f, 1.07f, 6.45f, 1.12f, 6.56f)
                curveToRelative(0.12f, 0.31f, 0.39f, 0.54f, 0.72f, 0.61f)
                curveToRelative(0.16f, 0.03f, 3.87f, 0.83f, 8.26f, 0.83f)
                curveToRelative(0.7f, 0f, 1.39f, -0.02f, 2.05f, -0.06f)
                lineToRelative(-11.28f, -13.75f)
                curveToRelative(-0.33f, 1.08f, -0.86f, 3.22f, -0.86f, 5.81f)
                close()
            }
        }.also { _BatterySlash = it}
