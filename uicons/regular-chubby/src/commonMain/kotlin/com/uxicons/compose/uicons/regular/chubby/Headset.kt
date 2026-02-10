package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Headset: ImageVector? = null

val Icons.Rc.Headset: ImageVector
    get() = _Headset ?: UXIcon(name = "Headset") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23f, 16.75f)
                curveToRelative(0f, -2.52f, -0.97f, -3.89f, -2.28f, -4.63f)
                curveToRelative(-0.11f, -7.18f, -2.81f, -10.38f, -8.72f, -10.38f)
                reflectiveCurveTo(3.38f, 4.96f, 3.28f, 12.15f)
                curveToRelative(-1.26f, 0.73f, -2.28f, 2.08f, -2.28f, 4.6f)
                curveToRelative(0f, 4.89f, 3.64f, 5.46f, 6.38f, 5.46f)
                curveToRelative(0.43f, 0f, 0.81f, -0.28f, 0.95f, -0.69f)
                curveToRelative(1.02f, -3.08f, 1.02f, -6.46f, 0f, -9.54f)
                curveToRelative(-0.14f, -0.41f, -0.52f, -0.69f, -0.95f, -0.69f)
                curveToRelative(-0.47f, 0f, -1.24f, 0f, -2.08f, 0.15f)
                curveToRelative(0.27f, -6.36f, 2.88f, -7.71f, 6.7f, -7.71f)
                reflectiveCurveToRelative(6.43f, 1.35f, 6.7f, 7.71f)
                curveToRelative(-0.7f, -0.12f, -1.42f, -0.15f, -2.08f, -0.15f)
                curveToRelative(-0.43f, 0f, -0.81f, 0.28f, -0.95f, 0.69f)
                curveToRelative(-0.88f, 2.66f, -1f, 5.55f, -0.36f, 8.27f)
                curveToRelative(-1.06f, 0.02f, -2.08f, -0.01f, -3.04f, -0.09f)
                curveToRelative(-0.56f, -0.04f, -1.03f, 0.37f, -1.08f, 0.92f)
                curveToRelative(-0.04f, 0.55f, 0.37f, 1.03f, 0.92f, 1.08f)
                curveToRelative(0.84f, 0.07f, 1.72f, 0.1f, 2.63f, 0.1f)
                curveToRelative(0.62f, 0f, 1.26f, -0.02f, 1.91f, -0.05f)
                curveToRelative(1.6f, 0f, 6.35f, -0.03f, 6.35f, -5.46f)
                close()
                moveTo(6.64f, 20.19f)
                curveToRelative(-2.67f, -0.14f, -3.64f, -1.09f, -3.64f, -3.44f)
                reflectiveCurveToRelative(0.97f, -3.3f, 3.64f, -3.44f)
                curveToRelative(0.6f, 2.24f, 0.6f, 4.63f, 0f, 6.88f)
                close()
                moveTo(17.36f, 20.19f)
                curveToRelative(-0.6f, -2.24f, -0.6f, -4.63f, 0f, -6.88f)
                curveToRelative(2.67f, 0.14f, 3.64f, 1.09f, 3.64f, 3.44f)
                reflectiveCurveToRelative(-0.97f, 3.3f, -3.64f, 3.44f)
                close()
            }
        }.also { _Headset = it}
