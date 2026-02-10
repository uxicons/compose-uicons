package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WrenchAlt: ImageVector? = null

val Icons.Bs.WrenchAlt: ImageVector
    get() = _WrenchAlt ?: UXIcon(name = "WrenchAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.26f, 5.04f)
                lineToRelative(-0.89f, -1.99f)
                lineToRelative(-4.66f, 4.66f)
                horizontalLineToRelative(0f)
                curveToRelative(-0.38f, 0.38f, -1.04f, 0.38f, -1.41f, 0f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0f, -1.41f)
                lineToRelative(4.66f, -4.66f)
                lineToRelative(-1.99f, -0.89f)
                curveToRelative(-1.1f, -0.49f, -2.27f, -0.74f, -3.46f, -0.74f)
                curveTo(10.81f, 0f, 7f, 3.81f, 7f, 8.5f)
                curveToRelative(0f, 0.84f, 0.12f, 1.67f, 0.37f, 2.47f)
                lineToRelative(-6.2f, 6.2f)
                curveToRelative(-0.76f, 0.76f, -1.17f, 1.76f, -1.17f, 2.83f)
                reflectiveCurveToRelative(0.42f, 2.07f, 1.17f, 2.83f)
                reflectiveCurveToRelative(1.76f, 1.17f, 2.83f, 1.17f)
                reflectiveCurveToRelative(2.07f, -0.42f, 2.83f, -1.17f)
                lineToRelative(6.2f, -6.2f)
                curveToRelative(0.8f, 0.24f, 1.63f, 0.37f, 2.47f, 0.37f)
                curveToRelative(4.69f, 0f, 8.5f, -3.81f, 8.5f, -8.5f)
                curveToRelative(0f, -1.2f, -0.25f, -2.36f, -0.74f, -3.46f)
                close()
                moveTo(15.5f, 14f)
                curveToRelative(-0.77f, 0f, -1.53f, -0.16f, -2.24f, -0.48f)
                lineToRelative(-0.94f, -0.42f)
                lineToRelative(-7.61f, 7.61f)
                curveToRelative(-0.38f, 0.38f, -1.04f, 0.38f, -1.41f, 0f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0f, -1.41f)
                lineToRelative(7.61f, -7.61f)
                lineToRelative(-0.42f, -0.94f)
                curveToRelative(-0.32f, -0.71f, -0.48f, -1.47f, -0.48f, -2.24f)
                curveToRelative(0f, -2.98f, 2.38f, -5.41f, 5.34f, -5.5f)
                lineToRelative(-1.17f, 1.17f)
                curveToRelative(-1.56f, 1.56f, -1.56f, 4.1f, 0f, 5.66f)
                curveToRelative(1.51f, 1.51f, 4.15f, 1.51f, 5.66f, 0f)
                lineToRelative(1.17f, -1.17f)
                curveToRelative(-0.08f, 2.96f, -2.52f, 5.34f, -5.5f, 5.34f)
                close()
            }
        }.also { _WrenchAlt = it}
