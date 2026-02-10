package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PlateEmpty: ImageVector? = null

val Icons.Ts.PlateEmpty: ImageVector
    get() = _PlateEmpty ?: UXIcon(name = "PlateEmpty") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.4f, 5.88f)
                curveToRelative(-0.48f, -0.56f, -1.17f, -0.88f, -1.91f, -0.88f)
                lineTo(2.51f, 5f)
                curveToRelative(-0.74f, 0f, -1.43f, 0.32f, -1.91f, 0.88f)
                curveTo(0.12f, 6.44f, -0.08f, 7.18f, 0.03f, 7.9f)
                curveToRelative(0.76f, 4.71f, 3.95f, 9.3f, 7.75f, 11.1f)
                horizontalLineToRelative(8.33f)
                curveToRelative(3.81f, -1.8f, 7.1f, -6.39f, 7.86f, -11.1f)
                curveToRelative(0.12f, -0.72f, -0.09f, -1.46f, -0.56f, -2.02f)
                close()
                moveTo(22.98f, 7.74f)
                curveToRelative(-0.7f, 4.36f, -3.61f, 8.56f, -7.09f, 10.26f)
                horizontalLineToRelative(-7.77f)
                curveToRelative(-3.48f, -1.7f, -6.39f, -5.9f, -7.09f, -10.26f)
                curveToRelative(-0.07f, -0.43f, 0.05f, -0.87f, 0.34f, -1.21f)
                curveToRelative(0.29f, -0.34f, 0.71f, -0.53f, 1.15f, -0.53f)
                lineTo(21.49f, 6.0f)
                curveToRelative(0.44f, 0f, 0.86f, 0.19f, 1.15f, 0.53f)
                curveToRelative(0.29f, 0.34f, 0.41f, 0.78f, 0.34f, 1.21f)
                close()
            }
        }.also { _PlateEmpty = it}
