package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Snap: ImageVector? = null

val Icons.Ts.Snap: ImageVector
    get() = _Snap ?: UXIcon(name = "Snap") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13.35f, 5.85f)
                lineToRelative(-0.71f, -0.71f)
                lineToRelative(3f, -3f)
                lineToRelative(0.71f, 0.71f)
                lineToRelative(-3f, 3f)
                close()
                moveTo(6.35f, 5.15f)
                lineToRelative(-3f, -3f)
                lineToRelative(-0.71f, 0.71f)
                lineToRelative(3f, 3f)
                lineToRelative(0.71f, -0.71f)
                close()
                moveTo(10f, 0f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(1f)
                lineTo(10f, 0f)
                close()
                moveTo(16.74f, 12.88f)
                lineToRelative(4.49f, -4.63f)
                curveToRelative(0.88f, -0.88f, 1.03f, -2.27f, 0.34f, -3.23f)
                curveToRelative(-0.43f, -0.59f, -1.08f, -0.96f, -1.8f, -1.02f)
                curveToRelative(-0.72f, -0.06f, -1.42f, 0.2f, -1.93f, 0.71f)
                lineToRelative(-8.69f, 8.83f)
                lineToRelative(-0.25f, -2.18f)
                curveToRelative(-0.02f, -0.65f, -0.3f, -1.26f, -0.77f, -1.71f)
                curveToRelative(-0.48f, -0.45f, -1.1f, -0.69f, -1.75f, -0.66f)
                curveToRelative(-1.35f, 0.04f, -2.41f, 1.18f, -2.37f, 2.51f)
                verticalLineToRelative(9.46f)
                reflectiveCurveToRelative(-3.1f, 3.03f, -3.1f, 3.03f)
                horizontalLineToRelative(1.41f)
                lineToRelative(2.69f, -2.62f)
                verticalLineToRelative(-9.88f)
                curveToRelative(-0.03f, -0.8f, 0.6f, -1.47f, 1.4f, -1.5f)
                curveToRelative(0.39f, -0.02f, 0.76f, 0.12f, 1.04f, 0.39f)
                curveToRelative(0.28f, 0.26f, 0.45f, 0.62f, 0.46f, 1.05f)
                lineToRelative(0.49f, 4.3f)
                lineToRelative(10.15f, -10.32f)
                curveToRelative(0.3f, -0.3f, 0.72f, -0.46f, 1.14f, -0.42f)
                curveToRelative(0.43f, 0.04f, 0.81f, 0.25f, 1.07f, 0.61f)
                curveToRelative(0.41f, 0.56f, 0.3f, 1.39f, -0.24f, 1.94f)
                lineToRelative(-5.05f, 5.21f)
                lineToRelative(4.9f, 7.34f)
                lineToRelative(-3.92f, 3.89f)
                horizontalLineToRelative(1.41f)
                lineToRelative(3.79f, -3.76f)
                lineToRelative(-4.91f, -7.36f)
                close()
            }
        }.also { _Snap = it}
