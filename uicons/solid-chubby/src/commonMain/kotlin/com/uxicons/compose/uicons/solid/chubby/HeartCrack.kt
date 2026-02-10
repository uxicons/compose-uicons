package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HeartCrack: ImageVector? = null

val Icons.Sc.HeartCrack: ImageVector
    get() = _HeartCrack ?: UXIcon(name = "HeartCrack") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.6f, 4.76f)
                horizontalLineToRelative(0f)
                curveToRelative(-1.22f, -1.12f, -2.82f, -1.74f, -4.38f, -1.67f)
                curveToRelative(-0.92f, 0.04f, -1.78f, 0.3f, -2.54f, 0.77f)
                lineToRelative(-1.8f, 2.53f)
                curveToRelative(-0.48f, 0.67f, -0.49f, 1.57f, -0.01f, 2.24f)
                lineToRelative(0.51f, 0.72f)
                curveToRelative(0.97f, 1.37f, 0.97f, 3.21f, -0.02f, 4.57f)
                lineToRelative(-1.71f, 2.36f)
                curveToRelative(-0.2f, 0.27f, -0.5f, 0.41f, -0.81f, 0.41f)
                curveToRelative(-0.2f, 0f, -0.41f, -0.06f, -0.58f, -0.19f)
                curveToRelative(-0.45f, -0.32f, -0.55f, -0.95f, -0.22f, -1.4f)
                lineToRelative(1.71f, -2.36f)
                curveToRelative(0.48f, -0.67f, 0.49f, -1.57f, 0.01f, -2.24f)
                lineToRelative(-0.51f, -0.72f)
                curveToRelative(-0.97f, -1.37f, -0.97f, -3.2f, 0.02f, -4.56f)
                lineToRelative(0.67f, -0.94f)
                curveToRelative(-0.88f, -0.72f, -1.97f, -1.14f, -3.13f, -1.19f)
                curveToRelative(-1.56f, -0.07f, -3.17f, 0.54f, -4.38f, 1.67f)
                curveToRelative(-1.17f, 1.08f, -2.5f, 3.27f, -2.4f, 5.89f)
                curveToRelative(0.11f, 2.75f, 1.69f, 5.34f, 4.71f, 7.73f)
                curveToRelative(0.67f, 0.53f, 3.28f, 2.53f, 6.29f, 2.53f)
                curveToRelative(3.27f, 0f, 6.21f, -2.43f, 7.07f, -3.18f)
                curveToRelative(2.58f, -2.26f, 3.9f, -4.71f, 3.93f, -7.27f)
                curveToRelative(0.03f, -2.54f, -1.27f, -4.66f, -2.4f, -5.7f)
                close()
            }
        }.also { _HeartCrack = it}
