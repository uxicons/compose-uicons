package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SleepingBag: ImageVector? = null

val Icons.Rs.SleepingBag: ImageVector
    get() = _SleepingBag ?: UXIcon(name = "SleepingBag") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.15f, 2.29f)
                curveToRelative(-0.32f, -1.34f, -1.52f, -2.29f, -2.91f, -2.29f)
                lineTo(7.77f, 0f)
                curveToRelative(-1.39f, 0f, -2.59f, 0.94f, -2.91f, 2.28f)
                curveToRelative(-0.39f, 1.61f, -0.85f, 4.08f, -0.85f, 6.72f)
                curveToRelative(0f, 5.29f, 1.94f, 13.86f, 2.02f, 14.22f)
                lineToRelative(0.18f, 0.78f)
                horizontalLineToRelative(11.6f)
                lineToRelative(0.18f, -0.78f)
                curveToRelative(0.08f, -0.36f, 2.02f, -8.93f, 2.02f, -14.22f)
                curveToRelative(0f, -2.63f, -0.46f, -5.11f, -0.85f, -6.71f)
                close()
                moveTo(6.8f, 2.75f)
                curveToRelative(0.11f, -0.44f, 0.51f, -0.75f, 0.97f, -0.75f)
                horizontalLineToRelative(8.47f)
                curveToRelative(0.46f, 0f, 0.86f, 0.31f, 0.97f, 0.75f)
                curveToRelative(0.32f, 1.32f, 0.69f, 3.25f, 0.78f, 5.35f)
                curveToRelative(-2.17f, 0.28f, -7.58f, 1.3f, -11.72f, 4.8f)
                curveToRelative(-0.16f, -1.39f, -0.26f, -2.74f, -0.26f, -3.9f)
                curveToRelative(0f, -2.44f, 0.43f, -4.74f, 0.8f, -6.25f)
                close()
                moveTo(16.3f, 10.43f)
                lineToRelative(-3.69f, 5.37f)
                lineToRelative(-4.67f, -1.67f)
                curveToRelative(2.73f, -2.15f, 6.06f, -3.21f, 8.37f, -3.7f)
                close()
                moveTo(16.2f, 22.0f)
                lineTo(7.8f, 22.0f)
                curveToRelative(-0.25f, -1.19f, -0.74f, -3.59f, -1.15f, -6.2f)
                lineToRelative(6.73f, 2.4f)
                lineToRelative(4.47f, -6.5f)
                curveToRelative(-0.35f, 3.9f, -1.28f, 8.5f, -1.67f, 10.3f)
                close()
                moveTo(9.5f, 6f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                close()
            }
        }.also { _SleepingBag = it}
