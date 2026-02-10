package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MegaphoneSoundWaves: ImageVector? = null

val Icons.Ss.MegaphoneSoundWaves: ImageVector
    get() = _MegaphoneSoundWaves ?: UXIcon(name = "MegaphoneSoundWaves") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 1f)
                curveToRelative(0f, 2.47f, -0.75f, 4f, -4.5f, 4f)
                lineTo(3f, 5f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(6.5f)
                curveToRelative(3.75f, 0f, 4.5f, 1.53f, 4.5f, 4f)
                horizontalLineToRelative(2f)
                lineTo(16f, 1f)
                horizontalLineToRelative(-2f)
                close()
                moveTo(21.64f, 15.21f)
                lineToRelative(-1.41f, -1.41f)
                curveToRelative(1.15f, -1.15f, 1.78f, -2.67f, 1.78f, -4.29f)
                reflectiveCurveToRelative(-0.63f, -3.15f, -1.78f, -4.29f)
                lineToRelative(1.41f, -1.41f)
                curveToRelative(1.52f, 1.52f, 2.36f, 3.55f, 2.36f, 5.71f)
                reflectiveCurveToRelative(-0.84f, 4.18f, -2.36f, 5.71f)
                close()
                moveTo(21.66f, 15.16f)
                lineToRelative(-1.41f, -1.41f)
                curveToRelative(2.34f, -2.34f, 2.34f, -6.15f, 0f, -8.48f)
                lineToRelative(1.41f, -1.41f)
                curveToRelative(3.12f, 3.12f, 3.12f, 8.19f, 0f, 11.31f)
                close()
                moveTo(18.84f, 12.34f)
                lineToRelative(-1.41f, -1.41f)
                curveToRelative(0.78f, -0.78f, 0.78f, -2.06f, 0f, -2.84f)
                lineToRelative(1.41f, -1.41f)
                curveToRelative(1.56f, 1.56f, 1.56f, 4.11f, 0f, 5.67f)
                close()
                moveTo(9.27f, 19.02f)
                curveToRelative(0.84f, 1.8f, -0.65f, 4.04f, -2.63f, 3.98f)
                horizontalLineToRelative(-1.29f)
                lineToRelative(-3.14f, -7.08f)
                curveToRelative(0.26f, 0.04f, 0.52f, 0.08f, 0.79f, 0.08f)
                horizontalLineToRelative(5.01f)
                lineToRelative(1.26f, 3.02f)
                close()
            }
        }.also { _MegaphoneSoundWaves = it}
