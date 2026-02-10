package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Sword: ImageVector? = null

val Icons.Tc.Sword: ImageVector
    get() = _Sword ?: UXIcon(name = "Sword") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.95f, 1.52f)
                curveToRelative(-0.02f, -0.24f, -0.21f, -0.43f, -0.45f, -0.45f)
                curveToRelative(-4.68f, -0.42f, -9.21f, 1.56f, -12.08f, 5.29f)
                lineTo(3.94f, 14.54f)
                curveToRelative(-0.58f, -0.24f, -1.19f, -0.42f, -1.82f, -0.55f)
                curveToRelative(-0.28f, -0.05f, -0.54f, 0.12f, -0.59f, 0.39f)
                curveToRelative(-0.06f, 0.27f, 0.12f, 0.54f, 0.39f, 0.59f)
                curveToRelative(1.62f, 0.33f, 3.08f, 1.09f, 4.26f, 2.14f)
                lineToRelative(-2.92f, 2.91f)
                lineToRelative(-1.41f, -1.41f)
                curveToRelative(-0.2f, -0.2f, -0.51f, -0.2f, -0.71f, 0f)
                reflectiveCurveToRelative(-0.2f, 0.51f, 0f, 0.71f)
                lineToRelative(3.53f, 3.52f)
                curveToRelative(0.1f, 0.1f, 0.23f, 0.15f, 0.35f, 0.15f)
                reflectiveCurveToRelative(0.26f, -0.05f, 0.35f, -0.15f)
                curveToRelative(0.2f, -0.2f, 0.2f, -0.51f, 0f, -0.71f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(2.92f, -2.91f)
                curveToRelative(1.06f, 1.18f, 1.59f, 2.7f, 2.15f, 4.27f)
                curveToRelative(0.17f, 0.49f, 0.56f, 0.4f, 0.59f, 0.39f)
                curveToRelative(0.27f, -0.06f, 0.45f, -0.32f, 0.39f, -0.59f)
                curveToRelative(-0.13f, -0.63f, -0.32f, -1.24f, -0.56f, -1.82f)
                lineToRelative(8.19f, -6.47f)
                curveToRelative(3.73f, -2.87f, 5.72f, -7.39f, 5.3f, -12.08f)
                close()
                moveTo(17.03f, 12.8f)
                lineToRelative(-8.01f, 6.33f)
                curveToRelative(-0.94f, -1.76f, -2.39f, -3.21f, -4.16f, -4.15f)
                lineTo(11.2f, 6.97f)
                curveToRelative(2.58f, -3.35f, 6.59f, -5.17f, 10.78f, -4.94f)
                curveToRelative(0.23f, 4.2f, -1.59f, 8.2f, -4.95f, 10.78f)
                close()
            }
        }.also { _Sword = it}
