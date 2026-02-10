package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Fork: ImageVector? = null

val Icons.Rc.Fork: ImageVector
    get() = _Fork ?: UXIcon(name = "Fork") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.37f, 8.17f)
                curveToRelative(-0.49f, -0.25f, -1.09f, -0.04f, -1.34f, 0.45f)
                curveToRelative(-0.01f, 0.02f, -0.87f, 1.72f, -2.56f, 3.42f)
                curveToRelative(-1.25f, 1.25f, -2.51f, 2.06f, -3.08f, 2.4f)
                curveToRelative(-0.59f, -0.17f, -1.84f, -0.61f, -2.97f, -1.46f)
                lineToRelative(7.82f, -7.88f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, -0.01f, -1.41f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.01f)
                lineToRelative(-7.81f, 7.86f)
                curveToRelative(-0.84f, -1.14f, -1.27f, -2.4f, -1.44f, -2.99f)
                curveToRelative(0.33f, -0.57f, 1.13f, -1.84f, 2.39f, -3.11f)
                curveToRelative(1.68f, -1.69f, 3.38f, -2.57f, 3.4f, -2.58f)
                curveToRelative(0.49f, -0.25f, 0.69f, -0.85f, 0.44f, -1.34f)
                curveToRelative(-0.25f, -0.49f, -0.85f, -0.69f, -1.34f, -0.44f)
                curveToRelative(-0.08f, 0.04f, -2.0f, 1.02f, -3.92f, 2.95f)
                curveToRelative(-1.93f, 1.95f, -2.89f, 3.86f, -2.93f, 3.94f)
                curveToRelative(-0.1f, 0.2f, -0.13f, 0.43f, -0.08f, 0.65f)
                curveToRelative(0.02f, 0.11f, 0.51f, 2.38f, 2.06f, 4.35f)
                lineTo(1.36f, 21.3f)
                curveToRelative(-0.39f, 0.39f, -0.38f, 1.01f, 0.01f, 1.41f)
                curveToRelative(0.51f, 0.53f, 1.19f, 0.22f, 1.41f, -0.01f)
                lineTo(11.0f, 14.42f)
                curveToRelative(1.95f, 1.55f, 4.2f, 2.05f, 4.31f, 2.07f)
                curveToRelative(0.07f, 0.01f, 0.14f, 0.02f, 0.21f, 0.02f)
                curveToRelative(0.16f, 0f, 0.31f, -0.04f, 0.45f, -0.11f)
                curveToRelative(0.08f, -0.04f, 2f, -1.02f, 3.92f, -2.95f)
                curveToRelative(1.93f, -1.95f, 2.89f, -3.86f, 2.93f, -3.94f)
                curveToRelative(0.24f, -0.49f, 0.04f, -1.09f, -0.45f, -1.34f)
                close()
            }
        }.also { _Fork = it}
