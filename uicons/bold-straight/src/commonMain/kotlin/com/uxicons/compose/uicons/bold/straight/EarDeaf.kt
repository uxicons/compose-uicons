package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EarDeaf: ImageVector? = null

val Icons.Bs.EarDeaf: ImageVector
    get() = _EarDeaf ?: UXIcon(name = "EarDeaf") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9.44f, 12.44f)
                lineToRelative(2.12f, 2.12f)
                lineTo(2.16f, 23.96f)
                lineTo(0.04f, 21.84f)
                lineTo(9.44f, 12.44f)
                close()
                moveTo(15.75f, 13.31f)
                curveToRelative(0.81f, -0.91f, 1.25f, -2.09f, 1.25f, -3.31f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                reflectiveCurveToRelative(-5f, 2.24f, -5f, 5f)
                horizontalLineToRelative(3f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                curveToRelative(0f, 0.49f, -0.18f, 0.96f, -0.5f, 1.32f)
                lineToRelative(2.25f, 1.98f)
                close()
                moveTo(23.96f, 2.16f)
                lineTo(21.84f, 0.04f)
                lineToRelative(-2.83f, 2.83f)
                curveToRelative(-1.81f, -1.78f, -4.28f, -2.87f, -7.01f, -2.87f)
                curveTo(6.49f, 0f, 2f, 4.49f, 2f, 10f)
                horizontalLineToRelative(3f)
                curveToRelative(0f, -3.86f, 3.14f, -7f, 7f, -7f)
                reflectiveCurveToRelative(7f, 3.14f, 7f, 7f)
                curveToRelative(0f, 1.66f, -0.59f, 3.27f, -1.67f, 4.53f)
                curveToRelative(-0.4f, 0.45f, -1.32f, 1.5f, -1.36f, 2.94f)
                curveToRelative(-0.04f, 1.92f, -1.86f, 3.53f, -3.98f, 3.53f)
                verticalLineToRelative(3f)
                curveToRelative(3.77f, 0f, 6.9f, -2.9f, 6.98f, -6.47f)
                curveToRelative(0f, -0.32f, 0.35f, -0.73f, 0.64f, -1.06f)
                curveToRelative(1.54f, -1.8f, 2.38f, -4.1f, 2.38f, -6.47f)
                curveToRelative(0f, -1.7f, -0.43f, -3.3f, -1.18f, -4.7f)
                lineToRelative(3.14f, -3.14f)
                close()
            }
        }.also { _EarDeaf = it}
