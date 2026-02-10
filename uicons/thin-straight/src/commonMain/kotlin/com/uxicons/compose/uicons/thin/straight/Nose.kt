package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Nose: ImageVector? = null

val Icons.Ts.Nose: ImageVector
    get() = _Nose ?: UXIcon(name = "Nose") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.5f, 20f)
                curveToRelative(0f, -1.31f, -0.72f, -2.77f, -2.13f, -4.33f)
                curveToRelative(-1.72f, -1.9f, -3.84f, -6.21f, -4.96f, -8.61f)
                curveToRelative(-1.11f, -2.4f, -1.42f, -3.55f, -1.42f, -7.06f)
                horizontalLineToRelative(-1f)
                curveToRelative(0f, 3.48f, 0.27f, 4.81f, 1.51f, 7.48f)
                curveToRelative(1.14f, 2.45f, 3.32f, 6.86f, 5.12f, 8.85f)
                curveToRelative(1.22f, 1.35f, 1.87f, 2.62f, 1.88f, 3.73f)
                curveToRelative(0.0f, 0.01f, 0.12f, 1.0f, -0.57f, 1.8f)
                curveToRelative(-0.65f, 0.75f, -1.81f, 1.13f, -3.43f, 1.13f)
                curveToRelative(-1.57f, 0f, -2.61f, -1.06f, -3.62f, -2.08f)
                curveToRelative(-0.94f, -0.94f, -1.9f, -1.92f, -3.23f, -1.92f)
                curveToRelative(-0.81f, 0f, -1.3f, 0.52f, -1.45f, 0.81f)
                curveToRelative(-0.31f, 0.55f, -0.45f, 1.84f, 1.26f, 2.81f)
                curveToRelative(2.42f, 1.37f, 3.78f, 1.37f, 7.05f, 1.37f)
                curveToRelative(1.93f, 0f, 3.34f, -0.5f, 4.19f, -1.48f)
                curveToRelative(1.0f, -1.15f, 0.82f, -2.52f, 0.81f, -2.52f)
                close()
                moveTo(3f, 18.5f)
                curveToRelative(0f, 3.12f, 3.07f, 4.48f, 3.2f, 4.54f)
                lineToRelative(-0.4f, 0.92f)
                curveToRelative(-0.15f, -0.07f, -3.8f, -1.67f, -3.8f, -5.46f)
                reflectiveCurveToRelative(5.1f, -5.88f, 5.31f, -5.96f)
                lineToRelative(0.37f, 0.93f)
                curveToRelative(-0.05f, 0.02f, -4.69f, 1.92f, -4.69f, 5.04f)
                close()
            }
        }.also { _Nose = it}
