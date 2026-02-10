package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Nose: ImageVector? = null

val Icons.Tr.Nose: ImageVector
    get() = _Nose ?: UXIcon(name = "Nose") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.5f, 20f)
                curveToRelative(0f, -1.31f, -0.72f, -2.77f, -2.13f, -4.33f)
                curveToRelative(-1.72f, -1.9f, -3.84f, -6.21f, -4.96f, -8.61f)
                curveToRelative(-1.05f, -2.27f, -1.38f, -3.47f, -1.41f, -6.56f)
                curveToRelative(-0.0f, -0.27f, -0.23f, -0.49f, -0.5f, -0.49f)
                horizontalLineToRelative(-0.0f)
                curveToRelative(-0.28f, 0.0f, -0.5f, 0.23f, -0.5f, 0.51f)
                curveToRelative(0.03f, 3.26f, 0.4f, 4.6f, 1.51f, 6.98f)
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
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(7.28f, 12.05f)
                curveToRelative(-0.21f, 0.11f, -5.28f, 2.68f, -5.28f, 6.45f)
                curveToRelative(0f, 3.79f, 3.65f, 5.39f, 3.8f, 5.46f)
                curveToRelative(0.06f, 0.03f, 0.13f, 0.04f, 0.2f, 0.04f)
                curveToRelative(0.19f, 0f, 0.38f, -0.11f, 0.46f, -0.3f)
                curveToRelative(0.11f, -0.25f, -0.01f, -0.55f, -0.26f, -0.66f)
                curveToRelative(-0.13f, -0.06f, -3.2f, -1.42f, -3.2f, -4.54f)
                curveToRelative(0f, -3.15f, 4.68f, -5.53f, 4.72f, -5.55f)
                curveToRelative(0.25f, -0.12f, 0.35f, -0.42f, 0.22f, -0.67f)
                curveToRelative(-0.12f, -0.25f, -0.42f, -0.35f, -0.67f, -0.22f)
                close()
            }
        }.also { _Nose = it}
