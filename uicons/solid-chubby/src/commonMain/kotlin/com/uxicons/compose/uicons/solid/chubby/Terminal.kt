package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Terminal: ImageVector? = null

val Icons.Sc.Terminal: ImageVector
    get() = _Terminal ?: UXIcon(name = "Terminal") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.95f, 21.31f)
                curveToRelative(-0.2f, 0.81f, -1.04f, 1.29f, -1.82f, 1.09f)
                curveToRelative(-0.01f, -0.0f, -1.68f, -0.41f, -4.14f, -0.41f)
                reflectiveCurveToRelative(-4.12f, 0.4f, -4.14f, 0.41f)
                curveToRelative(-0.81f, 0.2f, -1.62f, -0.29f, -1.81f, -1.1f)
                reflectiveCurveToRelative(0.29f, -1.61f, 1.09f, -1.81f)
                curveToRelative(0.08f, -0.02f, 2.01f, -0.49f, 4.86f, -0.49f)
                reflectiveCurveToRelative(4.78f, 0.47f, 4.86f, 0.49f)
                curveToRelative(0.8f, 0.2f, 1.29f, 1.02f, 1.09f, 1.82f)
                close()
                moveTo(12.26f, 11.19f)
                curveToRelative(-2.26f, -3.54f, -5.27f, -6.54f, -8.94f, -8.95f)
                curveToRelative(-0.69f, -0.45f, -1.62f, -0.26f, -2.08f, 0.43f)
                curveToRelative(-0.45f, 0.69f, -0.26f, 1.62f, 0.43f, 2.08f)
                curveToRelative(3.03f, 1.98f, 5.56f, 4.42f, 7.52f, 7.25f)
                curveToRelative(-1.96f, 2.83f, -4.49f, 5.26f, -7.52f, 7.25f)
                curveToRelative(-0.69f, 0.45f, -0.89f, 1.38f, -0.43f, 2.08f)
                curveToRelative(0.46f, 0.7f, 1.39f, 0.88f, 2.08f, 0.43f)
                curveToRelative(3.67f, -2.4f, 6.68f, -5.41f, 8.94f, -8.95f)
                curveToRelative(0.32f, -0.49f, 0.32f, -1.12f, 0f, -1.62f)
                close()
            }
        }.also { _Terminal = it}
