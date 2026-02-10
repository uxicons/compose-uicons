package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MelonAlt: ImageVector? = null

val Icons.Sr.MelonAlt: ImageVector
    get() = _MelonAlt ?: UXIcon(name = "MelonAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(7.62f, 20.34f)
                curveToRelative(-4.59f, 2.44f, -6.35f, 0.69f, -3.93f, -3.91f)
                curveToRelative(2.42f, -4.6f, 8.1f, -10.32f, 12.69f, -12.76f)
                curveToRelative(4.59f, -2.44f, 6.35f, -0.69f, 3.93f, 3.91f)
                curveToRelative(-2.42f, 4.6f, -8.1f, 10.32f, -12.69f, 12.76f)
                close()
                moveTo(1.92f, 15.5f)
                curveTo(4.54f, 10.52f, 10.48f, 4.54f, 15.44f, 1.9f)
                curveToRelative(0.91f, -0.48f, 1.71f, -0.81f, 2.43f, -1.02f)
                curveTo(13.56f, -0.96f, 8.01f, 0.16f, 4.09f, 4.09f)
                curveTo(0.14f, 8.03f, -0.97f, 13.62f, 0.91f, 17.94f)
                curveToRelative(0.21f, -0.72f, 0.53f, -1.53f, 1.01f, -2.44f)
                close()
                moveTo(23.1f, 6.05f)
                curveToRelative(-0.21f, 0.72f, -0.53f, 1.53f, -1.02f, 2.45f)
                curveToRelative(-2.62f, 4.98f, -8.56f, 10.95f, -13.52f, 13.6f)
                curveToRelative(-0.91f, 0.48f, -1.72f, 0.81f, -2.43f, 1.03f)
                curveToRelative(1.34f, 0.57f, 2.81f, 0.87f, 4.31f, 0.87f)
                curveToRelative(3.31f, 0f, 6.78f, -1.38f, 9.48f, -4.08f)
                curveToRelative(2.39f, -2.39f, 3.83f, -5.45f, 4.06f, -8.62f)
                curveToRelative(0.13f, -1.88f, -0.18f, -3.65f, -0.87f, -5.24f)
                close()
            }
        }.also { _MelonAlt = it}
