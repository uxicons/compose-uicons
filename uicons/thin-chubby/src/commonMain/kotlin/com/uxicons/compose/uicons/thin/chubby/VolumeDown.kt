package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _VolumeDown: ImageVector? = null

val Icons.Tc.VolumeDown: ImageVector
    get() = _VolumeDown ?: UXIcon(name = "VolumeDown") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13.17f, 3.11f)
                curveToRelative(-0.38f, -0.18f, -0.76f, -0.14f, -1.09f, 0.14f)
                curveToRelative(-0.48f, 0.52f, -3.6f, 3.61f, -4.69f, 4.06f)
                lineToRelative(-4.52f, 0.39f)
                curveToRelative(-0.15f, 0.01f, -0.28f, 0.09f, -0.36f, 0.21f)
                curveToRelative(-0.95f, 1.33f, -1.5f, 2.43f, -1.5f, 4.09f)
                reflectiveCurveToRelative(0.55f, 2.76f, 1.5f, 4.09f)
                curveToRelative(0.09f, 0.12f, 0.22f, 0.2f, 0.36f, 0.21f)
                lineToRelative(4.52f, 0.39f)
                curveToRelative(1.1f, 0.45f, 4.21f, 3.54f, 4.66f, 4.03f)
                curveToRelative(0.15f, 0.19f, 0.4f, 0.28f, 0.64f, 0.28f)
                curveToRelative(0.15f, 0f, 0.32f, -0.04f, 0.48f, -0.12f)
                curveToRelative(1.39f, -0.66f, 2.82f, -4.17f, 2.82f, -8.89f)
                reflectiveCurveToRelative(-1.44f, -8.23f, -2.83f, -8.89f)
                close()
                moveTo(12.77f, 20.03f)
                curveToRelative(-0.55f, -0.57f, -3.78f, -3.84f, -5.1f, -4.31f)
                curveToRelative(-0.1f, -0.05f, -4.37f, -0.37f, -4.49f, -0.4f)
                curveToRelative(-0.78f, -1.13f, -1.18f, -1.99f, -1.18f, -3.33f)
                reflectiveCurveToRelative(0.4f, -2.2f, 1.18f, -3.33f)
                curveToRelative(0.12f, -0.03f, 4.38f, -0.34f, 4.49f, -0.4f)
                curveToRelative(1.3f, -0.46f, 4.43f, -3.62f, 5.07f, -4.28f)
                curveToRelative(0.76f, 0.36f, 2.26f, 3.18f, 2.26f, 8.0f)
                reflectiveCurveToRelative(-1.49f, 7.62f, -2.23f, 8.03f)
                close()
                moveTo(20f, 12f)
                curveToRelative(0f, 1.09f, -0.56f, 2.16f, -1.75f, 3.35f)
                curveToRelative(-0.2f, 0.2f, -0.51f, 0.2f, -0.71f, 0f)
                reflectiveCurveToRelative(-0.2f, -0.51f, 0f, -0.71f)
                curveToRelative(1.0f, -1.0f, 1.46f, -1.84f, 1.46f, -2.65f)
                reflectiveCurveToRelative(-0.46f, -1.65f, -1.46f, -2.65f)
                curveToRelative(-0.2f, -0.2f, -0.2f, -0.51f, 0f, -0.71f)
                reflectiveCurveToRelative(0.51f, -0.2f, 0.71f, 0f)
                curveToRelative(1.2f, 1.2f, 1.75f, 2.26f, 1.75f, 3.35f)
                close()
            }
        }.also { _VolumeDown = it}
