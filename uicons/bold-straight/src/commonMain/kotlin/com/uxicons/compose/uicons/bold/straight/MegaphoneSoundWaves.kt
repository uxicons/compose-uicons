package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MegaphoneSoundWaves: ImageVector? = null

val Icons.Bs.MegaphoneSoundWaves: ImageVector
    get() = _MegaphoneSoundWaves ?: UXIcon(name = "MegaphoneSoundWaves") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.5f, 4f)
                lineTo(3.5f, 4f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 1.31f, 0.73f, 2.44f, 1.8f, 3.04f)
                lineToRelative(4.05f, 9.46f)
                horizontalLineToRelative(1.4f)
                curveToRelative(1.93f, 0.06f, 3.35f, -2.13f, 2.51f, -3.87f)
                lineToRelative(-2.15f, -5.13f)
                horizontalLineToRelative(2.87f)
                curveToRelative(2.65f, 0f, 4.5f, 1.65f, 4.5f, 4f)
                horizontalLineToRelative(3f)
                lineTo(18f, 0f)
                horizontalLineToRelative(-3f)
                curveToRelative(0f, 2.35f, -1.85f, 4f, -4.5f, 4f)
                close()
                moveTo(10.5f, 12f)
                lineTo(3.5f, 12f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                lineTo(3f, 7.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(7f)
                curveToRelative(1.72f, 0f, 3.26f, -0.49f, 4.5f, -1.33f)
                verticalLineToRelative(7.67f)
                curveToRelative(-1.24f, -0.84f, -2.78f, -1.33f, -4.5f, -1.33f)
                close()
                moveTo(24f, 9.5f)
                curveToRelative(0f, 2.29f, -0.89f, 4.44f, -2.51f, 6.06f)
                lineToRelative(-2.12f, -2.12f)
                curveToRelative(1.05f, -1.05f, 1.63f, -2.45f, 1.63f, -3.94f)
                reflectiveCurveToRelative(-0.58f, -2.89f, -1.63f, -3.94f)
                lineToRelative(2.12f, -2.12f)
                curveToRelative(1.62f, 1.62f, 2.51f, 3.77f, 2.51f, 6.06f)
                close()
            }
        }.also { _MegaphoneSoundWaves = it}
