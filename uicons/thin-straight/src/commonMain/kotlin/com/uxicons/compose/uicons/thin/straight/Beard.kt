package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Beard: ImageVector? = null

val Icons.Ts.Beard: ImageVector
    get() = _Beard ?: UXIcon(name = "Beard") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.25f, 9f)
                horizontalLineToRelative(-4.5f)
                curveToRelative(-1.5f, 0f, -2.74f, 1.24f, -2.75f, 2.77f)
                verticalLineToRelative(0.4f)
                curveToRelative(0.63f, 0.24f, 1.49f, 0.76f, 4.99f, 0.83f)
                curveToRelative(3.52f, -0.11f, 4.4f, -0.51f, 5.01f, -0.92f)
                lineToRelative(0.0f, -0.33f)
                curveToRelative(0.01f, -0.74f, -0.27f, -1.43f, -0.78f, -1.95f)
                curveToRelative(-0.52f, -0.52f, -1.22f, -0.81f, -1.97f, -0.81f)
                close()
                moveTo(11.99f, 12f)
                curveToRelative(-2.06f, 0f, -3.39f, -0.32f, -3.96f, -0.5f)
                curveToRelative(0.14f, -0.85f, 0.86f, -1.5f, 1.73f, -1.5f)
                horizontalLineToRelative(4.5f)
                curveToRelative(0.49f, 0f, 0.93f, 0.18f, 1.26f, 0.51f)
                curveToRelative(0.25f, 0.25f, 0.41f, 0.58f, 0.47f, 0.98f)
                curveToRelative(-0.58f, 0.18f, -1.92f, 0.51f, -3.99f, 0.51f)
                close()
                moveTo(22.67f, 2f)
                curveToRelative(-0.94f, 2.38f, -3.01f, 4.76f, -4.37f, 6.12f)
                curveToRelative(-1.23f, -1.35f, -2.95f, -2.12f, -4.8f, -2.12f)
                horizontalLineToRelative(-3f)
                curveToRelative(-1.85f, 0f, -3.56f, 0.77f, -4.8f, 2.12f)
                curveToRelative(-1.36f, -1.36f, -3.44f, -3.75f, -4.37f, -6.12f)
                lineTo(0f, 2f)
                lineTo(0f, 10f)
                curveToRelative(-0.03f, 4.84f, 4.93f, 10.18f, 12f, 13.04f)
                curveToRelative(7.07f, -2.86f, 12.03f, -8.2f, 12f, -13.04f)
                lineTo(24f, 2f)
                horizontalLineToRelative(-1.33f)
                close()
                moveTo(23f, 10f)
                curveToRelative(0f, 3.64f, -3.4f, 8.73f, -11f, 11.96f)
                curveTo(4.4f, 18.73f, 1f, 13.64f, 1f, 10f)
                lineTo(1f, 3.65f)
                curveToRelative(1.44f, 2.63f, 3.33f, 4.55f, 4.79f, 5.96f)
                curveToRelative(1.06f, -1.59f, 2.78f, -2.63f, 4.71f, -2.61f)
                horizontalLineToRelative(3f)
                curveToRelative(1.93f, -0.02f, 3.64f, 1.02f, 4.71f, 2.61f)
                curveToRelative(1.46f, -1.42f, 3.35f, -3.34f, 4.79f, -5.96f)
                verticalLineToRelative(6.35f)
                close()
            }
        }.also { _Beard = it}
