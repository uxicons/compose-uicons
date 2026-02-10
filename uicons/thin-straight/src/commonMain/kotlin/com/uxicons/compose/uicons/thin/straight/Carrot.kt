package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Carrot: ImageVector? = null

val Icons.Ts.Carrot: ImageVector
    get() = _Carrot ?: UXIcon(name = "Carrot") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 6f)
                lineToRelative(-5.34f, 0.05f)
                lineToRelative(4.61f, -4.61f)
                lineToRelative(-0.71f, -0.71f)
                lineToRelative(-4.56f, 4.56f)
                lineTo(18f, 0f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(5.48f)
                curveToRelative(-2.07f, -2.01f, -4.39f, -3.75f, -6.96f, -1.19f)
                curveTo(7.53f, 6.8f, 0.83f, 22.15f, 0.54f, 22.8f)
                lineToRelative(-0.51f, 1.17f)
                lineToRelative(1.17f, -0.51f)
                curveToRelative(0.65f, -0.28f, 16.0f, -6.99f, 18.51f, -9.5f)
                curveToRelative(2.57f, -2.57f, 0.82f, -4.88f, -1.19f, -6.96f)
                horizontalLineToRelative(5.48f)
                verticalLineToRelative(-1f)
                close()
                moveTo(19.0f, 13.25f)
                curveToRelative(-0.5f, 0.5f, -1.57f, 1.19f, -2.96f, 1.97f)
                lineToRelative(-2.84f, -2.84f)
                lineToRelative(-0.71f, 0.71f)
                lineToRelative(2.63f, 2.63f)
                curveToRelative(-4.24f, 2.29f, -10.55f, 5.14f, -13.15f, 6.3f)
                curveToRelative(0.81f, -1.82f, 2.46f, -5.47f, 4.16f, -8.95f)
                lineToRelative(2.73f, 2.73f)
                lineToRelative(0.71f, -0.71f)
                lineToRelative(-2.97f, -2.97f)
                curveToRelative(1.17f, -2.35f, 2.33f, -4.53f, 3.23f, -5.91f)
                lineToRelative(3.19f, 3.19f)
                lineToRelative(0.71f, -0.71f)
                lineToRelative(-3.31f, -3.31f)
                curveToRelative(0.12f, -0.15f, 0.23f, -0.28f, 0.33f, -0.38f)
                curveToRelative(0.69f, -0.69f, 1.33f, -0.99f, 1.98f, -0.99f)
                curveToRelative(1.3f, 0f, 2.62f, 1.22f, 4.33f, 2.93f)
                curveToRelative(2.56f, 2.56f, 4.02f, 4.23f, 1.95f, 6.3f)
                close()
            }
        }.also { _Carrot = it}
