package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Mower: ImageVector? = null

val Icons.Bs.Mower: ImageVector
    get() = _Mower ?: UXIcon(name = "Mower") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7.1f, 21f)
                lineTo(24f, 21f)
                verticalLineToRelative(3f)
                lineTo(0f, 24f)
                verticalLineToRelative(-3f)
                lineTo(0.92f, 21f)
                curveToRelative(0.01f, -1.24f, -0.1f, -2.76f, -0.92f, -4f)
                curveToRelative(1.62f, 0.57f, 2.47f, 2.08f, 2.92f, 3.38f)
                curveToRelative(0.04f, -1.57f, 0.04f, -3.99f, -0.92f, -5.42f)
                curveToRelative(1.81f, 0.64f, 2.67f, 2.83f, 3.06f, 4.49f)
                curveToRelative(0.44f, -1.31f, 1.29f, -2.88f, 2.94f, -3.45f)
                curveToRelative(-1.07f, 1.6f, -0.94f, 3.69f, -0.9f, 5f)
                close()
                moveTo(8.51f, 14f)
                lineToRelative(1.77f, -1.77f)
                reflectiveCurveToRelative(-3.38f, -2.89f, -6.28f, -1.5f)
                curveToRelative(2.15f, 0.43f, 3.65f, 2.41f, 4.51f, 3.27f)
                close()
                moveTo(14f, 4.01f)
                curveToRelative(-3.21f, -0.26f, -5.33f, 3.65f, -5.33f, 3.65f)
                lineToRelative(2.28f, 1.02f)
                curveToRelative(0.49f, -1.11f, 1.2f, -3.49f, 3.05f, -4.66f)
                close()
                moveTo(19f, 18.5f)
                curveToRelative(-0.05f, 3.24f, 5.05f, 3.24f, 5f, 0f)
                curveToRelative(0.05f, -3.24f, -5.05f, -3.24f, -5f, 0f)
                close()
                moveTo(20.3f, 0f)
                lineToRelative(-2.94f, 13f)
                curveToRelative(-3.64f, -0.49f, -4.72f, 0.85f, -5.53f, 3.1f)
                curveToRelative(-1.36f, -0.16f, -2.86f, 0.64f, -2.84f, 2.4f)
                curveToRelative(-0.04f, 3.07f, 4.5f, 3.23f, 4.96f, 0.5f)
                horizontalLineToRelative(3.09f)
                curveToRelative(-0.02f, -0.17f, -0.05f, -0.33f, -0.05f, -0.5f)
                curveToRelative(0f, -2.02f, 1.34f, -3.7f, 3.16f, -4.28f)
                lineToRelative(2.54f, -11.22f)
                horizontalLineToRelative(1.3f)
                lineTo(24.0f, 0f)
                horizontalLineToRelative(-3.7f)
                close()
            }
        }.also { _Mower = it}
