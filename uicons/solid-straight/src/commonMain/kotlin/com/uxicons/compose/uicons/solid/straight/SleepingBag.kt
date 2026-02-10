package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SleepingBag: ImageVector? = null

val Icons.Ss.SleepingBag: ImageVector
    get() = _SleepingBag ?: UXIcon(name = "SleepingBag") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4.79f, 13.29f)
                curveToRelative(5.21f, -5.21f, 13.79f, -5.77f, 14.15f, -5.79f)
                lineToRelative(1.0f, -0.06f)
                curveToRelative(-0.13f, -2.03f, -0.49f, -3.87f, -0.8f, -5.16f)
                curveToRelative(-0.32f, -1.34f, -1.52f, -2.29f, -2.91f, -2.29f)
                lineTo(7.77f, 0f)
                curveToRelative(-1.39f, 0f, -2.59f, 0.94f, -2.91f, 2.28f)
                curveToRelative(-0.39f, 1.61f, -0.85f, 4.08f, -0.85f, 6.72f)
                curveToRelative(0f, 1.42f, 0.14f, 3.07f, 0.35f, 4.74f)
                lineToRelative(0.45f, -0.45f)
                close()
                moveTo(12f, 2.5f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.12f, -2.5f, 2.5f, -2.5f)
                close()
                moveTo(12.63f, 15.32f)
                lineToRelative(-5.17f, -1.72f)
                curveToRelative(3.02f, -2.33f, 6.89f, -3.36f, 9.3f, -3.79f)
                lineToRelative(-4.14f, 5.52f)
                close()
                moveTo(20.0f, 8.84f)
                curveToRelative(0f, 0.05f, 0.0f, 0.11f, 0.0f, 0.16f)
                curveToRelative(0f, 5.29f, -1.94f, 13.86f, -2.02f, 14.22f)
                lineToRelative(-0.18f, 0.78f)
                lineTo(6.2f, 24f)
                lineToRelative(-0.18f, -0.78f)
                curveToRelative(-0.06f, -0.25f, -0.97f, -4.29f, -1.55f, -8.51f)
                lineToRelative(8.89f, 2.96f)
                lineToRelative(6.63f, -8.84f)
                close()
            }
        }.also { _SleepingBag = it}
