package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Comet: ImageVector? = null

val Icons.Br.Comet: ImageVector
    get() = _Comet ?: UXIcon(name = "Comet") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8.66f, 24f)
            curveToRelative(-2.31f, 0f, -4.49f, -0.9f, -6.12f, -2.54f)
            curveTo(-4.77f, 13.74f, 5.31f, 3.76f, 9.48f, 1.47f)
            curveToRelative(0.9f, -0.58f, 2.05f, -0.62f, 3.0f, -0.11f)
            curveToRelative(0.83f, 0.45f, 1.38f, 1.27f, 1.5f, 2.19f)
            curveToRelative(2.53f, -1.81f, 4.26f, -2.88f, 5.38f, -3.32f)
            curveToRelative(1.27f, -0.5f, 2.67f, -0.21f, 3.65f, 0.77f)
            curveToRelative(0.97f, 0.97f, 1.26f, 2.37f, 0.77f, 3.65f)
            curveToRelative(-0.44f, 1.11f, -1.5f, 2.85f, -3.32f, 5.38f)
            curveToRelative(0.92f, 0.12f, 1.74f, 0.68f, 2.19f, 1.5f)
            curveToRelative(0.52f, 0.94f, 0.47f, 2.09f, -0.11f, 3.0f)
            curveToRelative(-1.43f, 2.22f, -6.65f, 9.48f, -13.87f, 9.48f)
            close()
            moveTo(11f, 4.06f)
            curveToRelative(-17.44f, 11.4f, -2.41f, 26.36f, 8.94f, 8.94f)
            horizontalLineToRelative(-2.44f)
            curveToRelative(-1.2f, 0.04f, -1.95f, -1.46f, -1.2f, -2.4f)
            curveToRelative(2.65f, -3.54f, 4.22f, -5.91f, 4.67f, -7.05f)
            curveToRelative(0.08f, -0.2f, -0.01f, -0.34f, -0.09f, -0.43f)
            curveToRelative(-0.09f, -0.09f, -0.23f, -0.17f, -0.43f, -0.09f)
            horizontalLineToRelative(0f)
            curveToRelative(-1.14f, 0.45f, -3.51f, 2.02f, -7.05f, 4.67f)
            curveToRelative(-0.46f, 0.34f, -1.06f, 0.4f, -1.57f, 0.14f)
            curveToRelative(-0.51f, -0.25f, -0.83f, -0.77f, -0.83f, -1.34f)
            verticalLineToRelative(-2.44f)
            close()
            moveTo(9f, 18f)
            curveToRelative(3.96f, -0.1f, 3.96f, -5.9f, 0f, -6f)
            curveToRelative(-3.96f, 0.1f, -3.96f, 5.9f, 0f, 6f)
            close()
        }
    }.also { _Comet = it }
