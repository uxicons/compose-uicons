package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CompassSlash: ImageVector? = null

val Icons.Sc.CompassSlash: ImageVector
    get() = _CompassSlash ?: UXIcon(name = "CompassSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.3f, 19.2f)
                curveToRelative(1.13f, -1.72f, 1.68f, -4.04f, 1.68f, -7.19f)
                curveToRelative(0f, -7.71f, -3.29f, -10.99f, -10.99f, -10.99f)
                curveToRelative(-3.15f, 0f, -5.47f, 0.55f, -7.19f, 1.68f)
                lineToRelative(-1.24f, -1.24f)
                curveToRelative(-0.59f, -0.59f, -1.53f, -0.59f, -2.12f, 0f)
                curveToRelative(-0.59f, 0.58f, -0.59f, 1.53f, 0f, 2.12f)
                lineToRelative(18.99f, 18.99f)
                curveToRelative(0.29f, 0.29f, 0.68f, 0.44f, 1.06f, 0.44f)
                reflectiveCurveToRelative(0.77f, -0.15f, 1.06f, -0.44f)
                curveToRelative(0.59f, -0.58f, 0.59f, -1.53f, 0f, -2.12f)
                close()
                moveTo(16.86f, 6.02f)
                curveToRelative(0.62f, -0.1f, 1.21f, 0.49f, 1.11f, 1.11f)
                curveToRelative(-0.01f, 0.09f, -0.47f, 3.49f, -2.38f, 6.37f)
                lineToRelative(-1.46f, -1.46f)
                curveToRelative(0.81f, -1.34f, 1.28f, -2.74f, 1.55f, -3.75f)
                curveToRelative(-1.0f, 0.26f, -2.4f, 0.74f, -3.75f, 1.55f)
                lineToRelative(-1.45f, -1.45f)
                curveToRelative(2.89f, -1.91f, 6.26f, -2.36f, 6.37f, -2.38f)
                close()
                moveTo(11.65f, 16.62f)
                lineTo(17.29f, 22.25f)
                curveToRelative(-1.44f, 0.5f, -3.18f, 0.75f, -5.3f, 0.75f)
                curveToRelative(-7.71f, 0f, -10.99f, -3.29f, -10.99f, -10.99f)
                curveToRelative(0f, -2.12f, 0.25f, -3.86f, 0.75f, -5.3f)
                lineToRelative(5.63f, 5.63f)
                curveToRelative(-1.08f, 2.33f, -1.36f, 4.41f, -1.38f, 4.54f)
                curveToRelative(-0.1f, 0.62f, 0.49f, 1.21f, 1.11f, 1.11f)
                curveToRelative(0.12f, -0.01f, 2.21f, -0.3f, 4.54f, -1.38f)
                close()
            }
        }.also { _CompassSlash = it}
