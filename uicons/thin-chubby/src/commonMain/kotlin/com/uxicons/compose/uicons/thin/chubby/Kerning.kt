package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Kerning: ImageVector? = null

val Icons.Tc.Kerning: ImageVector
    get() = _Kerning ?: UXIcon(name = "Kerning") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.0f, 16.95f)
                curveToRelative(-0.67f, -6.45f, -3.99f, -10.13f, -4.13f, -10.29f)
                curveToRelative(-0.19f, -0.21f, -0.55f, -0.21f, -0.74f, 0f)
                curveToRelative(-0.14f, 0.15f, -3.46f, 3.84f, -4.13f, 10.29f)
                curveToRelative(-0.03f, 0.27f, 0.17f, 0.52f, 0.45f, 0.55f)
                curveToRelative(0.27f, 0.03f, 0.52f, -0.17f, 0.55f, -0.45f)
                curveToRelative(0.1f, -0.91f, 0.25f, -1.76f, 0.44f, -2.55f)
                horizontalLineToRelative(6.13f)
                curveToRelative(0.19f, 0.79f, 0.34f, 1.64f, 0.44f, 2.55f)
                curveToRelative(0.03f, 0.26f, 0.24f, 0.45f, 0.5f, 0.45f)
                curveToRelative(0.02f, 0f, 0.04f, 0f, 0.05f, -0.0f)
                curveToRelative(0.27f, -0.03f, 0.47f, -0.27f, 0.45f, -0.55f)
                close()
                moveTo(15.7f, 13.5f)
                curveToRelative(0.86f, -2.9f, 2.17f, -4.87f, 2.8f, -5.71f)
                curveToRelative(0.63f, 0.84f, 1.94f, 2.81f, 2.8f, 5.71f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9.99f, 6.99f)
                curveToRelative(-0.01f, -0.28f, -0.23f, -0.49f, -0.52f, -0.49f)
                curveToRelative(-0.28f, 0.01f, -0.49f, 0.24f, -0.48f, 0.51f)
                curveToRelative(0f, 0.03f, 0.08f, 3.08f, -0.49f, 4.83f)
                curveToRelative(-0.87f, 2.67f, -2.4f, 4.07f, -3.01f, 4.54f)
                curveToRelative(-0.61f, -0.47f, -2.14f, -1.85f, -3.01f, -4.54f)
                curveToRelative(-0.57f, -1.75f, -0.49f, -4.8f, -0.49f, -4.83f)
                curveToRelative(0.01f, -0.28f, -0.21f, -0.51f, -0.48f, -0.51f)
                curveToRelative(-0.27f, -0.0f, -0.51f, 0.21f, -0.52f, 0.49f)
                curveToRelative(-0.0f, 0.13f, -0.09f, 3.26f, 0.54f, 5.17f)
                curveToRelative(1.21f, 3.74f, 3.6f, 5.21f, 3.7f, 5.27f)
                curveToRelative(0.08f, 0.05f, 0.17f, 0.07f, 0.26f, 0.07f)
                reflectiveCurveToRelative(0.18f, -0.02f, 0.26f, -0.07f)
                curveToRelative(0.1f, -0.06f, 2.49f, -1.53f, 3.7f, -5.27f)
                curveToRelative(0.62f, -1.91f, 0.54f, -5.04f, 0.54f, -5.17f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15.86f, 2.54f)
                curveToRelative(-0.26f, -0.1f, -0.55f, 0.02f, -0.65f, 0.27f)
                lineToRelative(-7.35f, 18f)
                curveToRelative(-0.1f, 0.26f, 0.02f, 0.55f, 0.27f, 0.65f)
                curveToRelative(0.06f, 0.03f, 0.13f, 0.04f, 0.19f, 0.04f)
                curveToRelative(0.2f, 0f, 0.38f, -0.12f, 0.46f, -0.31f)
                lineToRelative(7.35f, -18f)
                curveToRelative(0.1f, -0.26f, -0.02f, -0.55f, -0.27f, -0.65f)
                close()
            }
        }.also { _Kerning = it}
