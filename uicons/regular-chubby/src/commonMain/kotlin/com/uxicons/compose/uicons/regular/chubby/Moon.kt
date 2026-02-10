package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Moon: ImageVector? = null

val Icons.Rc.Moon: ImageVector
    get() = _Moon ?: UXIcon(name = "Moon") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.02f, 22.97f)
                curveToRelative(-6.08f, 0f, -11.02f, -4.93f, -11.02f, -10.99f)
                curveTo(1f, 6.28f, 5.29f, 1.57f, 10.97f, 1.03f)
                curveToRelative(0.44f, -0.05f, 0.84f, 0.2f, 1.01f, 0.6f)
                curveToRelative(0.17f, 0.4f, 0.06f, 0.87f, -0.27f, 1.15f)
                curveToRelative(-1.09f, 0.94f, -1.63f, 2.56f, -1.63f, 4.96f)
                curveToRelative(0f, 5.13f, 2.36f, 6.16f, 6.18f, 6.16f)
                curveToRelative(2.46f, 0f, 4.04f, -0.52f, 4.97f, -1.62f)
                curveToRelative(0.28f, -0.34f, 0.75f, -0.45f, 1.15f, -0.28f)
                curveToRelative(0.4f, 0.17f, 0.65f, 0.58f, 0.61f, 1.02f)
                curveToRelative(-0.54f, 5.67f, -5.25f, 9.95f, -10.97f, 9.95f)
                close()
                moveTo(8.78f, 3.58f)
                curveToRelative(-3.42f, 1.3f, -5.78f, 4.57f, -5.78f, 8.4f)
                curveToRelative(0f, 4.96f, 4.05f, 8.99f, 9.02f, 8.99f)
                curveToRelative(3.83f, 0f, 7.12f, -2.35f, 8.42f, -5.74f)
                curveToRelative(-1.42f, 0.58f, -2.96f, 0.67f, -4.18f, 0.67f)
                curveToRelative(-3.51f, 0f, -8.18f, -0.85f, -8.18f, -8.16f)
                curveToRelative(0f, -1.65f, 0.23f, -3.04f, 0.69f, -4.17f)
                close()
            }
        }.also { _Moon = it}
