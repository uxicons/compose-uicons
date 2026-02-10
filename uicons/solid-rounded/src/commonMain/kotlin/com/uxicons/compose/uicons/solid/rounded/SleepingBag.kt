package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SleepingBag: ImageVector? = null

val Icons.Sr.SleepingBag: ImageVector
    get() = _SleepingBag ?: UXIcon(name = "SleepingBag") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.61f, 0f)
                horizontalLineToRelative(-5.22f)
                curveToRelative(-2.42f, 0f, -4.49f, 1.74f, -4.92f, 4.12f)
                curveToRelative(-0.31f, 1.71f, -0.46f, 3.35f, -0.46f, 4.88f)
                curveToRelative(0f, 1.41f, 0.14f, 3.06f, 0.35f, 4.74f)
                curveToRelative(5.17f, -5.11f, 15.02f, -5.71f, 15.62f, -5.74f)
                curveToRelative(-0.05f, -1.24f, -0.19f, -2.53f, -0.43f, -3.88f)
                curveToRelative(-0.43f, -2.39f, -2.5f, -4.13f, -4.92f, -4.13f)
                close()
                moveTo(12f, 7.5f)
                curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                close()
                moveTo(19.98f, 9.99f)
                curveToRelative(-0.12f, 3.12f, -0.77f, 7.06f, -1.32f, 9.96f)
                curveToRelative(-0.45f, 2.35f, -2.52f, 4.06f, -4.91f, 4.06f)
                horizontalLineToRelative(-3.48f)
                curveToRelative(-2.39f, 0f, -4.46f, -1.71f, -4.91f, -4.06f)
                curveToRelative(-0.26f, -1.35f, -0.54f, -2.93f, -0.77f, -4.55f)
                curveToRelative(0.05f, 0.02f, 6.1f, 1.83f, 6.1f, 1.83f)
                curveToRelative(0.41f, 0.15f, 0.84f, 0.22f, 1.26f, 0.22f)
                curveToRelative(1.19f, 0f, 2.35f, -0.57f, 3.06f, -1.58f)
                lineToRelative(4.98f, -5.88f)
                close()
                moveTo(11.29f, 15.33f)
                lineToRelative(-4.25f, -1.27f)
                curveToRelative(3.14f, -2.33f, 7.4f, -3.34f, 10.05f, -3.77f)
                curveToRelative(0f, 0f, -3.7f, 4.37f, -3.72f, 4.4f)
                curveToRelative(-0.45f, 0.65f, -1.29f, 0.92f, -2.08f, 0.64f)
                close()
            }
        }.also { _SleepingBag = it}
