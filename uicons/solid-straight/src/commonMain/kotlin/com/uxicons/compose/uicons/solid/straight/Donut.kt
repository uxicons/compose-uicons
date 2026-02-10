package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Donut: ImageVector? = null

val Icons.Ss.Donut: ImageVector
    get() = _Donut ?: UXIcon(name = "Donut") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18f, 20f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(0.94f)
                curveToRelative(-2.12f, 1.9f, -4.93f, 3.06f, -8f, 3.06f)
                curveTo(5.84f, 24f, 0.76f, 19.36f, 0.08f, 13.38f)
                curveToRelative(0.35f, 0.15f, 0.68f, 0.35f, 0.98f, 0.59f)
                curveToRelative(0.82f, 0.64f, 1.86f, 0.99f, 2.94f, 0.99f)
                curveToRelative(1.07f, 0f, 2.12f, -0.35f, 2.94f, -0.99f)
                curveToRelative(0.4f, -0.31f, 0.82f, -0.54f, 1.27f, -0.69f)
                curveToRelative(0.53f, 1.58f, 2.03f, 2.72f, 3.79f, 2.72f)
                curveToRelative(1.47f, 0f, 2.75f, -0.79f, 3.45f, -1.97f)
                curveToRelative(0.32f, 0.09f, 0.55f, 0.37f, 0.55f, 0.72f)
                verticalLineToRelative(3.26f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                close()
                moveTo(12.51f, 0.01f)
                curveTo(5.91f, -0.26f, 0.43f, 4.8f, 0.03f, 11.23f)
                curveToRelative(0.81f, 0.24f, 1.58f, 0.63f, 2.26f, 1.16f)
                curveToRelative(0.95f, 0.74f, 2.45f, 0.77f, 3.4f, 0.02f)
                curveToRelative(0.73f, -0.57f, 1.52f, -0.96f, 2.38f, -1.18f)
                curveToRelative(0.36f, -1.84f, 1.98f, -3.23f, 3.93f, -3.23f)
                curveToRelative(2.21f, 0f, 4f, 1.79f, 4f, 4f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-5.0f)
                curveToRelative(0.02f, -0.56f, 0.46f, -1.0f, 1f, -1.0f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-8.63f)
                curveTo(24f, 5.88f, 19.0f, 0.28f, 12.51f, 0.01f)
                close()
            }
        }.also { _Donut = it}
