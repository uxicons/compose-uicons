package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Mountains: ImageVector? = null

val Icons.Sc.Mountains: ImageVector
    get() = _Mountains ?: UXIcon(name = "Mountains") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.35f, 8.62f)
                curveToRelative(2.75f, 0f, 3.33f, -1.82f, 3.33f, -3.34f)
                reflectiveCurveToRelative(-0.58f, -3.34f, -3.33f, -3.34f)
                reflectiveCurveToRelative(-3.33f, 1.82f, -3.33f, 3.34f)
                reflectiveCurveToRelative(0.58f, 3.34f, 3.33f, 3.34f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.98f, 20.07f)
                curveToRelative(-1.25f, -5.72f, -5.24f, -9.06f, -5.41f, -9.21f)
                curveToRelative(-0.37f, -0.31f, -0.9f, -0.3f, -1.27f, 0f)
                curveToRelative(-0.17f, 0.14f, -4.15f, 3.49f, -5.41f, 9.21f)
                curveToRelative(-0.11f, 0.51f, 0.18f, 1.02f, 0.68f, 1.17f)
                curveToRelative(1.75f, 0.54f, 3.56f, 0.81f, 5.36f, 0.81f)
                reflectiveCurveToRelative(3.61f, -0.27f, 5.36f, -0.81f)
                curveToRelative(0.5f, -0.15f, 0.79f, -0.66f, 0.68f, -1.17f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.93f, 19.64f)
                curveToRelative(0.92f, -4.18f, 3.1f, -7.19f, 4.6f, -8.86f)
                curveToRelative(-1.55f, -1.99f, -3.61f, -3.88f, -3.67f, -3.93f)
                curveToRelative(-0.37f, -0.29f, -0.9f, -0.29f, -1.26f, 0.01f)
                curveToRelative(-0.24f, 0.2f, -5.81f, 4.88f, -7.57f, 12.9f)
                curveToRelative(-0.11f, 0.51f, 0.18f, 1.02f, 0.68f, 1.17f)
                curveToRelative(2.06f, 0.64f, 4.19f, 1.01f, 6.32f, 1.11f)
                curveToRelative(0.02f, 0f, 0.03f, 0f, 0.05f, 0f)
                curveToRelative(0.42f, 0f, 0.86f, -0.22f, 1.04f, -0.58f)
                curveToRelative(-0.24f, -0.56f, -0.32f, -1.2f, -0.18f, -1.83f)
                close()
            }
        }.also { _Mountains = it}
