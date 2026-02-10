package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Moon: ImageVector? = null

val Icons.Tc.Moon: ImageVector
    get() = _Moon ?: UXIcon(name = "Moon") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.69f, 12.51f)
                curveToRelative(-0.2f, -0.09f, -0.44f, -0.03f, -0.58f, 0.14f)
                curveToRelative(-1.09f, 1.3f, -2.88f, 1.9f, -5.64f, 1.9f)
                curveToRelative(-5.0f, 0f, -7.04f, -2.04f, -7.04f, -7.03f)
                curveToRelative(0f, -2.69f, 0.62f, -4.54f, 1.9f, -5.64f)
                curveToRelative(0.17f, -0.14f, 0.22f, -0.37f, 0.13f, -0.57f)
                curveToRelative(-0.09f, -0.2f, -0.29f, -0.31f, -0.51f, -0.3f)
                curveTo(5.29f, 1.55f, 1f, 6.26f, 1f, 11.98f)
                curveToRelative(0f, 6.08f, 4.95f, 11.02f, 11.02f, 11.02f)
                curveToRelative(5.72f, 0f, 10.44f, -4.29f, 10.97f, -9.97f)
                curveToRelative(0.02f, -0.22f, -0.1f, -0.42f, -0.31f, -0.51f)
                close()
                moveTo(12.02f, 21.99f)
                curveToRelative(-5.53f, 0f, -10.02f, -4.49f, -10.02f, -10.02f)
                curveTo(2f, 7.24f, 5.24f, 3.26f, 9.72f, 2.22f)
                curveToRelative(-0.86f, 1.28f, -1.28f, 3.03f, -1.28f, 5.3f)
                curveToRelative(0f, 7.12f, 4.29f, 8.03f, 8.04f, 8.03f)
                curveToRelative(2.31f, 0f, 4.04f, -0.41f, 5.3f, -1.26f)
                curveToRelative(-1.05f, 4.47f, -5.02f, 7.7f, -9.76f, 7.7f)
                close()
            }
        }.also { _Moon = it}
