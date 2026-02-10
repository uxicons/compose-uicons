package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CheckDouble: ImageVector? = null

val Icons.Rc.CheckDouble: ImageVector
    get() = _CheckDouble ?: UXIcon(name = "CheckDouble") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(2.2f, 7.1f)
                curveToRelative(-0.33f, -0.44f, -0.24f, -1.07f, 0.2f, -1.4f)
                curveToRelative(0.44f, -0.33f, 1.07f, -0.24f, 1.4f, 0.2f)
                curveToRelative(1.1f, 1.48f, 2.45f, 2.74f, 4.2f, 3.91f)
                curveToRelative(3.47f, -2.25f, 5.81f, -5.47f, 7.66f, -8.35f)
                curveToRelative(0.3f, -0.47f, 0.92f, -0.6f, 1.38f, -0.3f)
                curveToRelative(0.47f, 0.3f, 0.6f, 0.92f, 0.3f, 1.38f)
                curveToRelative(-1.94f, 3.03f, -4.69f, 6.83f, -8.84f, 9.32f)
                curveToRelative(-0.32f, 0.19f, -0.73f, 0.19f, -1.05f, -0.01f)
                curveToRelative(-2.22f, -1.41f, -3.9f, -2.92f, -5.26f, -4.75f)
                close()
                moveTo(22.51f, 8.14f)
                curveToRelative(-0.47f, -0.28f, -1.09f, -0.13f, -1.37f, 0.34f)
                curveToRelative(-3.13f, 5.21f, -7.18f, 9.47f, -11.73f, 12.33f)
                curveToRelative(-2.41f, -1.62f, -4.68f, -3.83f, -6.61f, -6.41f)
                curveToRelative(-0.33f, -0.44f, -0.96f, -0.54f, -1.4f, -0.2f)
                curveToRelative(-0.44f, 0.33f, -0.54f, 0.96f, -0.2f, 1.4f)
                curveToRelative(2.21f, 2.96f, 4.86f, 5.47f, 7.66f, 7.25f)
                curveToRelative(0.32f, 0.2f, 0.72f, 0.21f, 1.05f, 0.01f)
                curveToRelative(5.05f, -3.03f, 9.53f, -7.65f, 12.95f, -13.34f)
                curveToRelative(0.28f, -0.47f, 0.13f, -1.09f, -0.34f, -1.37f)
                close()
            }
        }.also { _CheckDouble = it}
