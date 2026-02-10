package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Kerning: ImageVector? = null

val Icons.Sc.Kerning: ImageVector
    get() = _Kerning ?: UXIcon(name = "Kerning") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19.64f, 8.52f)
                curveToRelative(-0.57f, -0.66f, -1.71f, -0.66f, -2.27f, 0f)
                curveToRelative(-0.12f, 0.13f, -2.82f, 3.34f, -3.35f, 8.83f)
                curveToRelative(-0.08f, 0.82f, 0.52f, 1.56f, 1.35f, 1.64f)
                curveToRelative(0.82f, 0.08f, 1.56f, -0.52f, 1.64f, -1.35f)
                curveToRelative(0.01f, -0.05f, 0.02f, -0.1f, 0.02f, -0.15f)
                horizontalLineToRelative(2.97f)
                curveToRelative(0.01f, 0.05f, 0.02f, 0.09f, 0.02f, 0.15f)
                curveToRelative(0.08f, 0.78f, 0.73f, 1.35f, 1.49f, 1.35f)
                curveToRelative(0.05f, 0f, 0.1f, -0.0f, 0.15f, -0.01f)
                curveToRelative(0.82f, -0.08f, 1.43f, -0.81f, 1.35f, -1.64f)
                curveToRelative(-0.54f, -5.49f, -3.24f, -8.7f, -3.35f, -8.83f)
                close()
                moveTo(17.63f, 14.5f)
                curveToRelative(0.27f, -0.85f, 0.58f, -1.59f, 0.87f, -2.18f)
                curveToRelative(0.29f, 0.59f, 0.6f, 1.32f, 0.87f, 2.18f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10.0f, 5.96f)
                curveToRelative(-0.02f, -0.83f, -0.71f, -1.5f, -1.54f, -1.46f)
                curveToRelative(-0.83f, 0.02f, -1.48f, 0.71f, -1.46f, 1.53f)
                curveToRelative(0.02f, 0.73f, -0.01f, 2.88f, -0.33f, 4.07f)
                curveToRelative(-0.32f, 1.2f, -0.77f, 2.06f, -1.17f, 2.65f)
                curveToRelative(-0.4f, -0.59f, -0.84f, -1.46f, -1.17f, -2.65f)
                curveToRelative(-0.32f, -1.19f, -0.35f, -3.34f, -0.33f, -4.07f)
                curveToRelative(0.02f, -0.83f, -0.64f, -1.51f, -1.47f, -1.53f)
                horizontalLineToRelative(-0.04f)
                curveToRelative(-0.81f, 0f, -1.48f, 0.65f, -1.5f, 1.46f)
                curveToRelative(-0.01f, 0.31f, -0.06f, 3.1f, 0.43f, 4.93f)
                curveToRelative(0.99f, 3.65f, 2.96f, 5.17f, 3.18f, 5.33f)
                curveToRelative(0.26f, 0.19f, 0.57f, 0.28f, 0.88f, 0.28f)
                reflectiveCurveToRelative(0.62f, -0.1f, 0.88f, -0.28f)
                curveToRelative(0.22f, -0.16f, 2.2f, -1.67f, 3.18f, -5.33f)
                curveToRelative(0.49f, -1.82f, 0.44f, -4.62f, 0.43f, -4.93f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16.07f, 2.11f)
                curveToRelative(-0.77f, -0.32f, -1.64f, 0.05f, -1.96f, 0.82f)
                lineToRelative(-7f, 17f)
                curveToRelative(-0.32f, 0.77f, 0.05f, 1.64f, 0.81f, 1.96f)
                curveToRelative(0.19f, 0.08f, 0.38f, 0.11f, 0.57f, 0.11f)
                curveToRelative(0.59f, 0f, 1.15f, -0.35f, 1.39f, -0.93f)
                lineToRelative(7.0f, -17f)
                curveToRelative(0.32f, -0.77f, -0.05f, -1.64f, -0.81f, -1.96f)
                close()
            }
        }.also { _Kerning = it}
