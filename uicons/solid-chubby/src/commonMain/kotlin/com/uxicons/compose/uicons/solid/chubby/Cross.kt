package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Cross: ImageVector? = null

val Icons.Sc.Cross: ImageVector
    get() = _Cross ?: UXIcon(name = "Cross") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.71f, 1.73f)
                curveToRelative(-0.42f, -0.71f, -1.34f, -0.94f, -2.06f, -0.52f)
                curveToRelative(-0.2f, 0.12f, -4.32f, 2.6f, -8.65f, 6.74f)
                curveTo(7.67f, 3.81f, 3.55f, 1.33f, 3.35f, 1.21f)
                curveToRelative(-0.71f, -0.42f, -1.63f, -0.19f, -2.06f, 0.52f)
                curveToRelative(-0.42f, 0.71f, -0.19f, 1.63f, 0.52f, 2.06f)
                curveToRelative(0.04f, 0.03f, 3.99f, 2.4f, 8.08f, 6.3f)
                curveToRelative(-4.69f, 5.09f, -7.56f, 10.48f, -7.68f, 10.71f)
                curveToRelative(-0.39f, 0.73f, -0.11f, 1.64f, 0.62f, 2.03f)
                curveToRelative(0.22f, 0.12f, 0.46f, 0.17f, 0.7f, 0.17f)
                curveToRelative(0.54f, 0f, 1.06f, -0.29f, 1.33f, -0.8f)
                curveToRelative(0.03f, -0.05f, 2.76f, -5.18f, 7.13f, -9.96f)
                curveToRelative(4.36f, 4.77f, 7.1f, 9.91f, 7.13f, 9.96f)
                curveToRelative(0.27f, 0.51f, 0.79f, 0.8f, 1.33f, 0.8f)
                curveToRelative(0.24f, 0f, 0.48f, -0.06f, 0.7f, -0.17f)
                curveToRelative(0.73f, -0.39f, 1.01f, -1.29f, 0.62f, -2.03f)
                curveToRelative(-0.12f, -0.23f, -2.99f, -5.62f, -7.68f, -10.71f)
                curveToRelative(4.08f, -3.89f, 8.04f, -6.28f, 8.08f, -6.3f)
                curveToRelative(0.71f, -0.42f, 0.94f, -1.34f, 0.52f, -2.06f)
                close()
            }
        }.also { _Cross = it}
