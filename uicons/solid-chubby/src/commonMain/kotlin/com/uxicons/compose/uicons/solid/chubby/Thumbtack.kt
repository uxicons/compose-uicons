package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Thumbtack: ImageVector? = null

val Icons.Sc.Thumbtack: ImageVector
    get() = _Thumbtack ?: UXIcon(name = "Thumbtack") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.14f, 18.7f)
                curveToRelative(-1.15f, 0f, -3.97f, -0.32f, -6.71f, -3.09f)
                curveToRelative(-3.49f, -3.52f, -3.01f, -7.21f, -2.99f, -7.37f)
                curveToRelative(0.04f, -0.3f, 0.18f, -0.58f, 0.39f, -0.8f)
                lineToRelative(1.5f, -1.54f)
                curveToRelative(1.01f, -1.03f, 3.37f, -2.31f, 6.28f, -1.23f)
                lineToRelative(0.02f, -0.02f)
                curveToRelative(0.09f, -0.78f, 0.35f, -1.79f, 1.05f, -2.5f)
                curveToRelative(0.73f, -0.75f, 1.72f, -1.16f, 2.79f, -1.16f)
                horizontalLineToRelative(0f)
                curveToRelative(1.3f, 0f, 2.61f, 0.6f, 3.68f, 1.7f)
                curveToRelative(2.0f, 2.04f, 2.22f, 4.79f, 0.53f, 6.52f)
                curveToRelative(-0.7f, 0.71f, -1.69f, 0.98f, -2.46f, 1.08f)
                lineToRelative(-0.03f, 0.03f)
                curveToRelative(1.08f, 2.96f, -0.17f, 5.36f, -1.18f, 6.39f)
                lineToRelative(-1.5f, 1.54f)
                curveToRelative(-0.22f, 0.23f, -0.52f, 0.38f, -0.83f, 0.42f)
                curveToRelative(-0.03f, 0.0f, -0.22f, 0.03f, -0.53f, 0.03f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(7.01f, 17.02f)
                curveToRelative(-0.34f, -0.34f, -0.65f, -0.69f, -0.93f, -1.03f)
                lineTo(1.6f, 20.56f)
                curveToRelative(-0.56f, 0.56f, -0.55f, 1.47f, 0.02f, 2.03f)
                curveToRelative(0.28f, 0.27f, 0.64f, 0.41f, 1.0f, 0.41f)
                curveToRelative(0.37f, 0f, 0.74f, -0.14f, 1.02f, -0.43f)
                lineToRelative(4.47f, -4.55f)
                curveToRelative(-0.37f, -0.3f, -0.73f, -0.63f, -1.1f, -1.0f)
                close()
            }
        }.also { _Thumbtack = it}
