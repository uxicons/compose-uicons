package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Mountains: ImageVector? = null

val Icons.Rc.Mountains: ImageVector
    get() = _Mountains ?: UXIcon(name = "Mountains") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.35f, 8.62f)
                curveToRelative(2.75f, 0f, 3.33f, -1.82f, 3.33f, -3.34f)
                reflectiveCurveToRelative(-0.58f, -3.34f, -3.33f, -3.34f)
                reflectiveCurveToRelative(-3.33f, 1.82f, -3.33f, 3.34f)
                reflectiveCurveToRelative(0.58f, 3.34f, 3.33f, 3.34f)
                close()
                moveTo(16.35f, 3.94f)
                curveToRelative(1.01f, 0f, 1.33f, 0.18f, 1.33f, 1.34f)
                reflectiveCurveToRelative(-0.32f, 1.34f, -1.33f, 1.34f)
                reflectiveCurveToRelative(-1.33f, -0.18f, -1.33f, -1.34f)
                reflectiveCurveToRelative(0.32f, -1.34f, 1.33f, -1.34f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.83f, 11.63f)
                curveToRelative(0.44f, -0.33f, 0.53f, -0.96f, 0.2f, -1.4f)
                curveToRelative(-1.57f, -2.08f, -3.11f, -3.31f, -3.17f, -3.37f)
                curveToRelative(-0.37f, -0.29f, -0.9f, -0.29f, -1.26f, 0.01f)
                curveToRelative(-0.24f, 0.2f, -5.81f, 4.88f, -7.57f, 12.9f)
                curveToRelative(-0.11f, 0.51f, 0.18f, 1.02f, 0.68f, 1.17f)
                curveToRelative(2.06f, 0.64f, 4.19f, 1.01f, 6.32f, 1.11f)
                curveToRelative(0.02f, 0f, 0.03f, 0f, 0.05f, 0f)
                curveToRelative(0.53f, 0f, 0.97f, -0.42f, 1.0f, -0.95f)
                curveToRelative(0.03f, -0.55f, -0.4f, -1.02f, -0.95f, -1.05f)
                curveToRelative(-1.65f, -0.08f, -3.31f, -0.34f, -4.92f, -0.77f)
                curveToRelative(1.42f, -5.31f, 4.68f, -8.95f, 6.05f, -10.3f)
                curveToRelative(0.54f, 0.51f, 1.36f, 1.34f, 2.19f, 2.44f)
                curveToRelative(0.33f, 0.44f, 0.96f, 0.53f, 1.4f, 0.2f)
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
                moveTo(13.07f, 19.59f)
                curveToRelative(0.94f, -3.24f, 2.86f, -5.54f, 3.86f, -6.57f)
                curveToRelative(1f, 1.03f, 2.92f, 3.33f, 3.86f, 6.57f)
                curveToRelative(-2.54f, 0.62f, -5.18f, 0.62f, -7.72f, 0f)
                close()
            }
        }.also { _Mountains = it}
