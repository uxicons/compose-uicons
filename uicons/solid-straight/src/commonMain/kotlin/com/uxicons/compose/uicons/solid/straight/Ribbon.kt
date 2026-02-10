package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Ribbon: ImageVector? = null

val Icons.Ss.Ribbon: ImageVector
    get() = _Ribbon ?: UXIcon(name = "Ribbon") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10.59f, 19.3f)
                lineToRelative(-4.66f, 4.66f)
                lineToRelative(-3.94f, -3.94f)
                lineToRelative(4.67f, -4.64f)
                lineToRelative(3.92f, 3.92f)
                close()
                moveTo(10.62f, 8.86f)
                lineToRelative(0.01f, -0.01f)
                curveToRelative(-0.68f, -0.56f, -1.52f, -1.5f, -2.44f, -2.42f)
                curveToRelative(-0.66f, -0.66f, -0.81f, -2.07f, -0.17f, -2.81f)
                curveToRelative(1.19f, -1.19f, 2.38f, -1.61f, 3.98f, -1.61f)
                reflectiveCurveToRelative(2.9f, 0.43f, 4.09f, 1.62f)
                curveToRelative(0.64f, 0.74f, 0.39f, 2.17f, -0.13f, 2.7f)
                curveToRelative(-1.02f, 1.03f, -1.82f, 1.99f, -2.5f, 2.55f)
                lineToRelative(3.79f, 3.77f)
                lineToRelative(0.69f, -0.69f)
                curveToRelative(1.37f, -1.37f, 2.03f, -3.17f, 2.06f, -4.94f)
                curveToRelative(0.02f, -1.74f, -0.72f, -3.44f, -2.13f, -4.74f)
                curveToRelative(-0.83f, -0.76f, -2.72f, -2.26f, -5.87f, -2.26f)
                horizontalLineToRelative(0f)
                reflectiveCurveToRelative(-0.01f, 0f, 0f, 0f)
                curveToRelative(-3.14f, 0.01f, -5.08f, 1.5f, -5.91f, 2.26f)
                curveToRelative(-1.41f, 1.3f, -2.15f, 2.99f, -2.13f, 4.74f)
                curveToRelative(0.02f, 1.76f, 0.68f, 3.56f, 2.06f, 4.94f)
                lineToRelative(0.69f, 0.69f)
                lineToRelative(11.37f, 11.33f)
                lineToRelative(3.92f, -3.81f)
                lineToRelative(-11.36f, -11.29f)
                close()
            }
        }.also { _Ribbon = it}
