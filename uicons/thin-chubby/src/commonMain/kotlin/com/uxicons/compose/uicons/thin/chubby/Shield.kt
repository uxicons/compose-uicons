package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Shield: ImageVector? = null

val Icons.Tc.Shield: ImageVector
    get() = _Shield ?: UXIcon(name = "Shield") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.8f, 5.49f)
                curveToRelative(-0.04f, -0.18f, -0.17f, -0.32f, -0.34f, -0.37f)
                lineToRelative(-0.85f, -0.26f)
                curveToRelative(-3.75f, -0.99f, -7.26f, -3.73f, -7.3f, -3.76f)
                curveToRelative(-0.18f, -0.14f, -0.44f, -0.14f, -0.62f, 0f)
                curveToRelative(-0.03f, 0.03f, -3.45f, 2.71f, -7.31f, 3.76f)
                lineToRelative(-0.84f, 0.25f)
                curveToRelative(-0.17f, 0.05f, -0.3f, 0.19f, -0.34f, 0.37f)
                curveToRelative(-0.25f, 1.1f, -2.38f, 10.87f, 0.13f, 13.4f)
                curveToRelative(2.44f, 2.46f, 8.29f, 4.04f, 8.54f, 4.1f)
                curveToRelative(0.09f, 0.02f, 0.18f, 0.02f, 0.26f, 0f)
                curveToRelative(0.25f, -0.07f, 6.11f, -1.64f, 8.54f, -4.1f)
                curveToRelative(2.51f, -2.53f, 0.38f, -12.29f, 0.13f, -13.4f)
                close()
                moveTo(19.96f, 18.18f)
                curveToRelative(-2.06f, 2.08f, -7.09f, 3.56f, -7.96f, 3.8f)
                curveToRelative(-0.87f, -0.24f, -5.9f, -1.72f, -7.96f, -3.8f)
                curveToRelative(-1.74f, -1.76f, -0.59f, -9.13f, 0.07f, -12.19f)
                lineToRelative(0.55f, -0.16f)
                curveToRelative(3.4f, -0.92f, 6.4f, -3.0f, 7.35f, -3.7f)
                curveToRelative(0.96f, 0.71f, 4.01f, 2.82f, 7.33f, 3.7f)
                lineToRelative(0.56f, 0.17f)
                curveToRelative(0.66f, 3.06f, 1.81f, 10.43f, 0.07f, 12.19f)
                close()
            }
        }.also { _Shield = it}
