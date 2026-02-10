package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Football: ImageVector? = null

val Icons.Tc.Football: ImageVector
    get() = _Football ?: UXIcon(name = "Football") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 1f)
                curveTo(6.89f, 1f, 1.03f, 2.25f, 1.03f, 12f)
                curveToRelative(0f, 7.71f, 3.28f, 11f, 10.97f, 11f)
                curveToRelative(5.11f, 0f, 10.97f, -1.25f, 10.97f, -11f)
                curveToRelative(0f, -7.71f, -3.28f, -11f, -10.97f, -11f)
                close()
                moveTo(21.41f, 16.56f)
                lineToRelative(-4.85f, -2.64f)
                verticalLineToRelative(-3.83f)
                lineToRelative(4.85f, -2.64f)
                curveToRelative(0.38f, 1.27f, 0.56f, 2.78f, 0.56f, 4.56f)
                reflectiveCurveToRelative(-0.18f, 3.29f, -0.56f, 4.56f)
                close()
                moveTo(21.07f, 6.49f)
                lineToRelative(-4.89f, 2.67f)
                curveToRelative(-1.12f, -0.95f, -2.95f, -1.81f, -3.67f, -2.14f)
                lineTo(12.5f, 2.01f)
                curveToRelative(4.55f, 0.09f, 7.28f, 1.46f, 8.57f, 4.48f)
                close()
                moveTo(12.0f, 16.11f)
                curveToRelative(-0.62f, -0.28f, -2.51f, -1.18f, -3.56f, -2.09f)
                verticalLineToRelative(-4.04f)
                curveToRelative(1.05f, -0.91f, 2.95f, -1.81f, 3.56f, -2.09f)
                curveToRelative(0.61f, 0.27f, 2.51f, 1.15f, 3.56f, 2.06f)
                verticalLineToRelative(4.08f)
                curveToRelative(-1.05f, 0.91f, -2.94f, 1.81f, -3.56f, 2.09f)
                close()
                moveTo(11.5f, 2.01f)
                lineTo(11.5f, 7.02f)
                curveToRelative(-0.72f, 0.33f, -2.54f, 1.22f, -3.66f, 2.16f)
                lineTo(2.93f, 6.49f)
                curveTo(4.22f, 3.47f, 6.95f, 2.1f, 11.5f, 2.01f)
                close()
                moveTo(2.03f, 12f)
                curveToRelative(0f, -1.77f, 0.18f, -3.29f, 0.56f, -4.56f)
                lineToRelative(4.85f, 2.66f)
                verticalLineToRelative(3.82f)
                lineToRelative(-4.85f, 2.64f)
                curveToRelative(-0.38f, -1.27f, -0.56f, -2.79f, -0.56f, -4.57f)
                close()
                moveTo(2.94f, 17.52f)
                lineToRelative(4.92f, -2.68f)
                curveToRelative(1.12f, 0.94f, 2.93f, 1.81f, 3.65f, 2.14f)
                verticalLineToRelative(5.01f)
                curveToRelative(-4.54f, -0.09f, -7.27f, -1.46f, -8.56f, -4.48f)
                close()
                moveTo(12.5f, 21.99f)
                verticalLineToRelative(-5.01f)
                curveToRelative(0.72f, -0.33f, 2.53f, -1.21f, 3.65f, -2.15f)
                lineToRelative(4.92f, 2.68f)
                curveToRelative(-1.29f, 3.02f, -4.02f, 4.39f, -8.57f, 4.48f)
                close()
            }
        }.also { _Football = it}
