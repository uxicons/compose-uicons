package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Reel: ImageVector? = null

val Icons.Sc.Reel: ImageVector
    get() = _Reel ?: UXIcon(name = "Reel") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(5f, 13f)
                horizontalLineToRelative(12.49f)
                reflectiveCurveToRelative(0.01f, 0f, 0.01f, 0f)
                curveToRelative(2.5f, 0f, 2.5f, -0.69f, 2.5f, -1.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                curveToRelative(0f, 2.99f, -1.85f, 4.5f, -5.5f, 4.5f)
                curveToRelative(-0.0f, 0f, -0.01f, 0f, -0.01f, 0f)
                reflectiveCurveToRelative(-12.36f, 0f, -12.36f, 0f)
                curveToRelative(-0.06f, -0.88f, -0.11f, -1.88f, -0.13f, -3f)
                close()
                moveTo(18.85f, 8f)
                horizontalLineToRelative(-13.73f)
                curveToRelative(-0.06f, 0.88f, -0.11f, 1.88f, -0.13f, 3f)
                horizontalLineToRelative(13.98f)
                curveToRelative(-0.02f, -1.12f, -0.06f, -2.12f, -0.13f, -3f)
                close()
                moveTo(2.93f, 4.89f)
                curveToRelative(0.02f, -0.01f, 0.9f, -0.26f, 2.62f, -0.49f)
                curveToRelative(-0.08f, 0.45f, -0.16f, 0.98f, -0.24f, 1.6f)
                horizontalLineToRelative(13.35f)
                curveToRelative(-0.08f, -0.62f, -0.16f, -1.16f, -0.24f, -1.61f)
                curveToRelative(2.29f, 0.31f, 2.27f, 0.48f, 3.07f, 0.56f)
                curveToRelative(0.65f, 0f, 1.24f, -0.42f, 1.44f, -1.07f)
                curveToRelative(0.24f, -0.79f, -0.21f, -1.63f, -1.01f, -1.87f)
                curveToRelative(-0.14f, -0.04f, -3.45f, -1.01f, -9.93f, -1.01f)
                reflectiveCurveToRelative(-9.79f, 0.97f, -9.93f, 1.01f)
                curveToRelative(-0.79f, 0.24f, -1.24f, 1.07f, -1.0f, 1.86f)
                reflectiveCurveToRelative(1.07f, 1.25f, 1.86f, 1.01f)
                close()
                moveTo(21.07f, 19.11f)
                curveToRelative(-0.02f, 0.01f, -0.91f, 0.26f, -2.64f, 0.49f)
                curveToRelative(0.08f, -0.45f, 0.16f, -0.98f, 0.24f, -1.61f)
                horizontalLineToRelative(-13.35f)
                curveToRelative(0.07f, 0.62f, 0.16f, 1.16f, 0.24f, 1.6f)
                curveToRelative(-1.72f, -0.23f, -2.61f, -0.49f, -2.62f, -0.49f)
                curveToRelative(-0.79f, -0.24f, -1.63f, 0.21f, -1.86f, 1.01f)
                curveToRelative(-0.24f, 0.79f, 0.21f, 1.63f, 1.01f, 1.87f)
                curveToRelative(0.14f, 0.04f, 3.45f, 1.01f, 9.93f, 1.01f)
                reflectiveCurveToRelative(9.79f, -0.97f, 9.93f, -1.01f)
                curveToRelative(0.79f, -0.24f, 1.24f, -1.07f, 1.0f, -1.86f)
                reflectiveCurveToRelative(-1.07f, -1.25f, -1.86f, -1.01f)
                close()
            }
        }.also { _Reel = it}
