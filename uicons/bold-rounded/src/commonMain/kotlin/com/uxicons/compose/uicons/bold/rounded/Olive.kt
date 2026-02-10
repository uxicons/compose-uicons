package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Olive: ImageVector? = null

val Icons.Br.Olive: ImageVector
    get() = _Olive ?: UXIcon(name = "Olive") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(20.99f, 3.01f)
            curveTo(16.62f, -1.37f, 9.02f, -0.9f, 4.06f, 4.06f)
            curveTo(1.69f, 6.44f, 0.26f, 9.48f, 0.03f, 12.64f)
            curveToRelative(-0.23f, 3.24f, 0.83f, 6.21f, 2.98f, 8.35f)
            curveToRelative(2.01f, 2.01f, 4.7f, 3.0f, 7.5f, 3.0f)
            curveToRelative(3.3f, 0f, 6.75f, -1.37f, 9.44f, -4.05f)
            curveToRelative(2.38f, -2.38f, 3.81f, -5.42f, 4.03f, -8.58f)
            curveToRelative(0.23f, -3.24f, -0.83f, -6.21f, -2.98f, -8.35f)
            close()
            moveTo(20.98f, 11.15f)
            curveToRelative(-0.17f, 2.44f, -1.3f, 4.81f, -3.16f, 6.67f)
            curveToRelative(-3.79f, 3.79f, -9.48f, 4.26f, -12.69f, 1.06f)
            curveToRelative(-1.52f, -1.52f, -2.27f, -3.66f, -2.1f, -6.02f)
            curveToRelative(0.17f, -2.44f, 1.3f, -4.81f, 3.16f, -6.67f)
            curveToRelative(3.79f, -3.79f, 9.48f, -4.26f, 12.69f, -1.06f)
            curveToRelative(1.52f, 1.52f, 2.27f, 3.66f, 2.1f, 6.02f)
            close()
            moveTo(17.71f, 6.29f)
            curveToRelative(1.36f, 1.36f, 1.7f, 3.23f, 0.76f, 4.17f)
            reflectiveCurveToRelative(-2.81f, 0.61f, -4.17f, -0.76f)
            reflectiveCurveToRelative(-1.7f, -3.23f, -0.76f, -4.17f)
            reflectiveCurveToRelative(2.81f, -0.61f, 4.17f, 0.76f)
            close()
        }
    }.also { _Olive = it }
