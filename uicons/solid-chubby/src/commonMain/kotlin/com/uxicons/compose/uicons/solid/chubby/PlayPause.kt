package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PlayPause: ImageVector? = null

val Icons.Sc.PlayPause: ImageVector
    get() = _PlayPause ?: UXIcon(name = "PlayPause") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15.95f, 3.61f)
                curveToRelative(-0.77f, 0.3f, -1.15f, 1.17f, -0.85f, 1.94f)
                curveToRelative(0.01f, 0.02f, 0.9f, 2.35f, 0.9f, 6.45f)
                reflectiveCurveToRelative(-0.89f, 6.43f, -0.89f, 6.44f)
                curveToRelative(-0.31f, 0.77f, 0.07f, 1.64f, 0.83f, 1.95f)
                curveToRelative(0.18f, 0.07f, 0.37f, 0.11f, 0.56f, 0.11f)
                curveToRelative(0.59f, 0f, 1.16f, -0.36f, 1.39f, -0.94f)
                curveToRelative(0.04f, -0.11f, 1.11f, -2.82f, 1.11f, -7.56f)
                reflectiveCurveToRelative(-1.06f, -7.44f, -1.11f, -7.56f)
                curveToRelative(-0.31f, -0.77f, -1.18f, -1.14f, -1.94f, -0.83f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.89f, 4.44f)
                curveToRelative(-0.31f, -0.77f, -1.18f, -1.14f, -1.94f, -0.83f)
                curveToRelative(-0.77f, 0.3f, -1.15f, 1.17f, -0.85f, 1.94f)
                curveToRelative(0.01f, 0.02f, 0.9f, 2.35f, 0.9f, 6.45f)
                reflectiveCurveToRelative(-0.89f, 6.43f, -0.89f, 6.44f)
                curveToRelative(-0.31f, 0.77f, 0.07f, 1.64f, 0.83f, 1.95f)
                curveToRelative(0.18f, 0.07f, 0.37f, 0.11f, 0.56f, 0.11f)
                curveToRelative(0.59f, 0f, 1.16f, -0.36f, 1.39f, -0.94f)
                curveToRelative(0.04f, -0.11f, 1.11f, -2.82f, 1.11f, -7.56f)
                reflectiveCurveToRelative(-1.06f, -7.44f, -1.11f, -7.56f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(4.27f, 3.54f)
                curveToRelative(-0.42f, -0.12f, -0.86f, 0.05f, -1.1f, 0.41f)
                curveToRelative(-0.09f, 0.13f, -2.17f, 3.31f, -2.17f, 8.05f)
                reflectiveCurveToRelative(2.08f, 7.92f, 2.17f, 8.06f)
                curveToRelative(0.19f, 0.28f, 0.5f, 0.44f, 0.83f, 0.44f)
                curveToRelative(0.09f, 0f, 0.17f, -0.01f, 0.26f, -0.03f)
                curveToRelative(6.87f, -1.84f, 10.45f, -7.7f, 10.6f, -7.95f)
                curveToRelative(0.19f, -0.31f, 0.19f, -0.7f, 0.01f, -1.02f)
                curveToRelative(-0.14f, -0.24f, -3.57f, -6.01f, -10.6f, -7.96f)
                close()
            }
        }.also { _PlayPause = it}
