package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SleepingBag: ImageVector? = null

val Icons.Br.SleepingBag: ImageVector
    get() = _SleepingBag ?: UXIcon(name = "SleepingBag") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(19.82f, 5.81f)
            curveToRelative(-0.37f, -3.31f, -3.15f, -5.81f, -6.47f, -5.81f)
            horizontalLineToRelative(-2.7f)
            curveToRelative(-3.32f, 0f, -6.1f, 2.5f, -6.46f, 5.81f)
            curveToRelative(-0.12f, 1.09f, -0.18f, 2.17f, -0.18f, 3.19f)
            curveToRelative(0f, 3.12f, 0.73f, 7.47f, 1.34f, 10.57f)
            curveToRelative(0.51f, 2.57f, 2.78f, 4.43f, 5.4f, 4.43f)
            horizontalLineToRelative(2.52f)
            curveToRelative(2.62f, 0f, 4.89f, -1.86f, 5.4f, -4.43f)
            curveToRelative(0.61f, -3.1f, 1.34f, -7.46f, 1.34f, -10.57f)
            curveToRelative(0f, -1.02f, -0.06f, -2.09f, -0.18f, -3.19f)
            close()
            moveTo(7.17f, 6.14f)
            curveToRelative(0.2f, -1.79f, 1.69f, -3.14f, 3.48f, -3.14f)
            horizontalLineToRelative(2.7f)
            curveToRelative(1.79f, 0f, 3.29f, 1.35f, 3.48f, 3.14f)
            curveToRelative(0.08f, 0.76f, 0.13f, 1.5f, 0.15f, 2.21f)
            curveToRelative(-2.39f, 0.43f, -6.46f, 1.51f, -9.74f, 4.14f)
            curveToRelative(-0.14f, -1.25f, -0.24f, -2.45f, -0.24f, -3.49f)
            curveToRelative(0f, -0.91f, 0.06f, -1.88f, 0.17f, -2.86f)
            close()
            moveTo(13.26f, 21f)
            horizontalLineToRelative(-2.52f)
            curveToRelative(-1.19f, 0f, -2.22f, -0.85f, -2.45f, -2.01f)
            curveToRelative(-0.29f, -1.45f, -0.6f, -3.17f, -0.84f, -4.89f)
            lineToRelative(3.45f, 1.23f)
            curveToRelative(1.24f, 0.44f, 2.63f, -0.0f, 3.38f, -1.09f)
            lineToRelative(2.69f, -3.91f)
            curveToRelative(-0.16f, 2.73f, -0.74f, 6.12f, -1.24f, 8.66f)
            curveToRelative(-0.23f, 1.17f, -1.26f, 2.01f, -2.45f, 2.01f)
            close()
            moveTo(9.5f, 6.5f)
            curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
            reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
            reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
            reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
            close()
        }
    }.also { _SleepingBag = it }
