package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Clapperboard: ImageVector? = null

val Icons.Sc.Clapperboard: ImageVector
    get() = _Clapperboard ?: UXIcon(name = "Clapperboard") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.84f, 9f)
                curveToRelative(0.09f, 0.95f, 0.16f, 1.98f, 0.16f, 3f)
                curveToRelative(0f, 4.08f, -0.99f, 8.07f, -1.03f, 8.24f)
                curveToRelative(-0.08f, 0.33f, -0.33f, 0.6f, -0.65f, 0.71f)
                curveToRelative(-0.13f, 0.04f, -3.23f, 1.05f, -9.32f, 1.05f)
                reflectiveCurveToRelative(-9.19f, -1.01f, -9.32f, -1.05f)
                curveToRelative(-0.32f, -0.11f, -0.57f, -0.37f, -0.65f, -0.71f)
                curveToRelative(-0.04f, -0.17f, -1.03f, -4.17f, -1.03f, -8.24f)
                curveToRelative(0f, -1.02f, 0.06f, -2.04f, 0.16f, -3f)
                close()
                moveTo(16.01f, 2.16f)
                lineTo(11.17f, 7f)
                horizontalLineToRelative(3.4f)
                lineToRelative(4.47f, -4.47f)
                curveToRelative(-0.8f, -0.14f, -1.8f, -0.27f, -3.02f, -0.38f)
                close()
                moveTo(4.82f, 7f)
                horizontalLineToRelative(3.52f)
                lineToRelative(4.98f, -4.98f)
                curveToRelative(-0.42f, -0.01f, -0.86f, -0.02f, -1.32f, -0.02f)
                curveToRelative(-0.79f, 0f, -1.53f, 0.02f, -2.23f, 0.05f)
                close()
                moveTo(6.71f, 2.29f)
                curveToRelative(-2.6f, 0.3f, -3.94f, 0.74f, -4.02f, 0.76f)
                curveToRelative(-0.32f, 0.11f, -0.57f, 0.37f, -0.65f, 0.71f)
                curveToRelative(-0.02f, 0.09f, -0.34f, 1.4f, -0.62f, 3.24f)
                horizontalLineToRelative(0.59f)
                close()
                moveTo(21.33f, 3.06f)
                lineTo(17.39f, 7f)
                horizontalLineToRelative(5.2f)
                curveToRelative(-0.28f, -1.84f, -0.6f, -3.15f, -0.62f, -3.24f)
                curveToRelative(-0.08f, -0.33f, -0.32f, -0.59f, -0.64f, -0.7f)
                close()
            }
        }.also { _Clapperboard = it}
