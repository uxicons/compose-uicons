package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PlayPause: ImageVector? = null

val Icons.Tc.PlayPause: ImageVector
    get() = _PlayPause ?: UXIcon(name = "PlayPause") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17.33f, 4.03f)
                curveToRelative(-0.26f, 0.1f, -0.39f, 0.38f, -0.29f, 0.64f)
                curveToRelative(0.01f, 0.03f, 0.97f, 2.67f, 0.97f, 7.33f)
                reflectiveCurveToRelative(-0.96f, 7.3f, -0.97f, 7.33f)
                curveToRelative(-0.1f, 0.26f, 0.04f, 0.55f, 0.3f, 0.64f)
                curveToRelative(0.06f, 0.02f, 0.12f, 0.03f, 0.17f, 0.03f)
                curveToRelative(0.2f, 0f, 0.39f, -0.12f, 0.47f, -0.33f)
                curveToRelative(0.04f, -0.11f, 1.03f, -2.84f, 1.03f, -7.67f)
                reflectiveCurveToRelative(-0.99f, -7.56f, -1.03f, -7.67f)
                curveToRelative(-0.1f, -0.26f, -0.38f, -0.39f, -0.64f, -0.29f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.97f, 4.33f)
                curveToRelative(-0.1f, -0.26f, -0.38f, -0.39f, -0.64f, -0.29f)
                curveToRelative(-0.26f, 0.1f, -0.39f, 0.38f, -0.29f, 0.64f)
                curveToRelative(0.01f, 0.03f, 0.97f, 2.67f, 0.97f, 7.33f)
                reflectiveCurveToRelative(-0.96f, 7.3f, -0.97f, 7.33f)
                curveToRelative(-0.1f, 0.26f, 0.04f, 0.55f, 0.3f, 0.64f)
                curveToRelative(0.06f, 0.02f, 0.12f, 0.03f, 0.17f, 0.03f)
                curveToRelative(0.2f, 0f, 0.39f, -0.12f, 0.47f, -0.33f)
                curveToRelative(0.04f, -0.11f, 1.03f, -2.84f, 1.03f, -7.67f)
                reflectiveCurveToRelative(-0.99f, -7.56f, -1.03f, -7.67f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14.89f, 11.69f)
                curveToRelative(-0.7f, -1.04f, -4.55f, -6.32f, -11.16f, -8.17f)
                curveToRelative(-0.21f, -0.06f, -0.43f, 0.03f, -0.55f, 0.21f)
                curveToRelative(-0.09f, 0.14f, -2.18f, 3.39f, -2.18f, 8.27f)
                reflectiveCurveToRelative(2.09f, 8.14f, 2.18f, 8.28f)
                curveToRelative(0.09f, 0.14f, 0.25f, 0.23f, 0.42f, 0.23f)
                curveToRelative(0.04f, 0f, 0.09f, -0.01f, 0.13f, -0.02f)
                curveToRelative(6.99f, -1.9f, 11.02f, -7.95f, 11.19f, -8.21f)
                curveToRelative(0.12f, -0.18f, 0.11f, -0.41f, -0.02f, -0.57f)
                curveToRelative(-0.0f, -0.0f, -0.0f, -0.01f, -0.01f, -0.01f)
                close()
                moveTo(3.83f, 19.41f)
                curveToRelative(-0.5f, -0.9f, -1.83f, -3.65f, -1.83f, -7.41f)
                curveToRelative(0f, -3.74f, 1.33f, -6.51f, 1.83f, -7.41f)
                curveToRelative(5.63f, 1.72f, 9.08f, 6.04f, 10.06f, 7.41f)
                curveToRelative(-0.85f, 1.17f, -4.46f, 5.74f, -10.06f, 7.41f)
                close()
            }
        }.also { _PlayPause = it}
