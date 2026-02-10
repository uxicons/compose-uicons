package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SleepingBag: ImageVector? = null

val Icons.Bs.SleepingBag: ImageVector
    get() = _SleepingBag ?: UXIcon(name = "SleepingBag") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.34f, 2.8f)
                curveToRelative(-0.33f, -1.62f, -1.77f, -2.8f, -3.43f, -2.8f)
                horizontalLineToRelative(-7.83f)
                curveToRelative(-1.66f, 0f, -3.1f, 1.18f, -3.43f, 2.8f)
                curveToRelative(-0.3f, 1.47f, -0.66f, 3.74f, -0.66f, 6.2f)
                curveToRelative(0f, 5.12f, 1.96f, 13.49f, 2.04f, 13.84f)
                lineToRelative(0.27f, 1.16f)
                horizontalLineToRelative(11.38f)
                lineToRelative(0.27f, -1.16f)
                curveToRelative(0.08f, -0.35f, 2.04f, -8.73f, 2.04f, -13.84f)
                curveToRelative(0f, -2.45f, -0.36f, -4.73f, -0.66f, -6.2f)
                close()
                moveTo(7.6f, 3.4f)
                curveToRelative(0.05f, -0.23f, 0.25f, -0.4f, 0.49f, -0.4f)
                horizontalLineToRelative(7.83f)
                curveToRelative(0.24f, 0f, 0.44f, 0.16f, 0.49f, 0.4f)
                curveToRelative(0.24f, 1.19f, 0.52f, 2.95f, 0.58f, 4.87f)
                curveToRelative(-2.39f, 0.43f, -6.46f, 1.51f, -9.76f, 4.15f)
                curveToRelative(-0.14f, -1.22f, -0.23f, -2.4f, -0.23f, -3.42f)
                curveToRelative(0f, -2.21f, 0.32f, -4.27f, 0.6f, -5.6f)
                close()
                moveTo(8.7f, 21f)
                curveToRelative(-0.32f, -1.48f, -0.87f, -4.17f, -1.25f, -6.88f)
                lineToRelative(5.55f, 2.38f)
                lineToRelative(3.95f, -6.11f)
                curveToRelative(-0.22f, 3.64f, -1.19f, 8.44f, -1.66f, 10.61f)
                horizontalLineToRelative(-6.6f)
                close()
                moveTo(9.5f, 6.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                close()
            }
        }.also { _SleepingBag = it}
