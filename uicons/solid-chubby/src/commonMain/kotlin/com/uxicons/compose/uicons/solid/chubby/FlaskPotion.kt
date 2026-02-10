package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FlaskPotion: ImageVector? = null

val Icons.Sc.FlaskPotion: ImageVector
    get() = _FlaskPotion ?: UXIcon(name = "FlaskPotion") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(8f, 6.39f)
                verticalLineToRelative(-3.19f)
                curveToRelative(-0.75f, -0.12f, -1.2f, -0.22f, -1.24f, -0.23f)
                curveToRelative(-0.54f, -0.13f, -0.86f, -0.68f, -0.73f, -1.21f)
                reflectiveCurveToRelative(0.67f, -0.86f, 1.21f, -0.73f)
                curveToRelative(0.02f, 0.0f, 1.94f, 0.47f, 4.76f, 0.47f)
                reflectiveCurveToRelative(4.74f, -0.47f, 4.76f, -0.47f)
                curveToRelative(0.53f, -0.14f, 1.08f, 0.19f, 1.21f, 0.73f)
                curveToRelative(0.13f, 0.54f, -0.19f, 1.08f, -0.73f, 1.21f)
                curveToRelative(-0.04f, 0.01f, -0.49f, 0.12f, -1.24f, 0.23f)
                verticalLineToRelative(3.19f)
                curveToRelative(3.21f, 0.7f, 5.23f, 2.4f, 6.24f, 5.28f)
                lineToRelative(-0.67f, 0.62f)
                curveToRelative(-0.02f, 0.02f, -2.19f, 2.17f, -5.34f, 1.62f)
                curveToRelative(-0.83f, -0.14f, -3.9f, -0.88f, -3.94f, -0.88f)
                curveToRelative(-0.13f, -0.03f, -3.17f, -0.75f, -4.06f, -0.91f)
                curveToRelative(-4.09f, -0.71f, -6.88f, 1.96f, -7.06f, 2.14f)
                curveToRelative(0.59f, -4.48f, 2.76f, -6.98f, 6.83f, -7.87f)
                close()
                moveTo(15.88f, 15.88f)
                curveToRelative(-0.89f, -0.15f, -3.93f, -0.88f, -4.06f, -0.91f)
                curveToRelative(-0.03f, -0.01f, -3.1f, -0.74f, -3.94f, -0.88f)
                curveToRelative(-3.11f, -0.54f, -5.25f, 1.53f, -5.34f, 1.62f)
                lineToRelative(-1.54f, 1.43f)
                curveToRelative(0.01f, 1.67f, 0.17f, 3.1f, 0.51f, 4.37f)
                curveToRelative(0.1f, 0.38f, 0.42f, 0.67f, 0.81f, 0.73f)
                curveToRelative(1.83f, 0.28f, 5.52f, 0.76f, 9.68f, 0.76f)
                reflectiveCurveToRelative(7.84f, -0.48f, 9.68f, -0.76f)
                curveToRelative(0.39f, -0.06f, 0.71f, -0.35f, 0.81f, -0.73f)
                curveToRelative(0.34f, -1.3f, 0.51f, -2.77f, 0.51f, -4.51f)
                curveToRelative(0f, -1.13f, -0.07f, -2.16f, -0.22f, -3.11f)
                curveToRelative(-0.68f, 0.6f, -3.28f, 2.62f, -6.9f, 1.99f)
                close()
            }
        }.also { _FlaskPotion = it}
