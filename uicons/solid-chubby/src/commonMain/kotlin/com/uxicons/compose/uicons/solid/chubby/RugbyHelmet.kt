package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RugbyHelmet: ImageVector? = null

val Icons.Sc.RugbyHelmet: ImageVector
    get() = _RugbyHelmet ?: UXIcon(name = "RugbyHelmet") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.46f, 5.4f)
                curveToRelative(-1.61f, -1.98f, -4.2f, -2.95f, -7.92f, -2.97f)
                horizontalLineToRelative(0f)
                curveToRelative(-3.42f, -0.02f, -5.83f, 0.77f, -7.45f, 2.38f)
                curveToRelative(-1.63f, 1.63f, -2.38f, 4.04f, -2.37f, 7.6f)
                curveToRelative(0.02f, 4.42f, 0.59f, 9.15f, 7.2f, 9.15f)
                curveToRelative(2.87f, 0f, 6.19f, -1.19f, 6.33f, -1.24f)
                curveToRelative(0.51f, -0.18f, 0.78f, -0.74f, 0.61f, -1.25f)
                lineToRelative(-1.38f, -4.21f)
                curveToRelative(-0.25f, -0.83f, -0.09f, -1.71f, 0.42f, -2.41f)
                curveToRelative(0.51f, -0.68f, 1.28f, -1.07f, 2.12f, -1.07f)
                curveToRelative(0.05f, 0f, 0.14f, -0.01f, 0.19f, -0.02f)
                curveToRelative(1.28f, -0.2f, 2.33f, -1.05f, 2.81f, -2.29f)
                curveToRelative(0.49f, -1.27f, 0.28f, -2.64f, -0.56f, -3.68f)
                close()
                moveTo(11.04f, 18.42f)
                curveToRelative(-0.82f, 0f, -1.48f, -0.66f, -1.48f, -1.48f)
                reflectiveCurveToRelative(0.66f, -1.48f, 1.48f, -1.48f)
                reflectiveCurveToRelative(1.48f, 0.66f, 1.48f, 1.48f)
                reflectiveCurveToRelative(-0.66f, 1.48f, -1.48f, 1.48f)
                close()
            }
        }.also { _RugbyHelmet = it}
