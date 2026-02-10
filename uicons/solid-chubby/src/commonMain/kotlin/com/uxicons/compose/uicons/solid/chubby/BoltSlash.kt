package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BoltSlash: ImageVector? = null

val Icons.Sc.BoltSlash: ImageVector
    get() = _BoltSlash ?: UXIcon(name = "BoltSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.56f, 22.56f)
                curveToRelative(-0.59f, 0.59f, -1.53f, 0.59f, -2.12f, 0f)
                lineToRelative(-19.0f, -19f)
                curveToRelative(-0.59f, -0.59f, -0.59f, -1.53f, 0f, -2.12f)
                reflectiveCurveToRelative(1.53f, -0.59f, 2.12f, 0f)
                lineToRelative(4.5f, 4.5f)
                curveToRelative(1.94f, -2.51f, 4.17f, -4.16f, 6.65f, -4.9f)
                curveToRelative(0.66f, -0.22f, 1.39f, 0.39f, 1.28f, 1.08f)
                lineToRelative(-0.86f, 6.88f)
                horizontalLineToRelative(3.87f)
                curveToRelative(0.65f, -0.02f, 1.16f, 0.67f, 0.96f, 1.28f)
                curveToRelative(-0.04f, 0.11f, -0.77f, 2.53f, -2.32f, 5.23f)
                lineToRelative(4.92f, 4.92f)
                curveToRelative(0.59f, 0.59f, 0.59f, 1.53f, 0f, 2.12f)
                close()
                moveTo(4.04f, 13.71f)
                curveToRelative(-0.2f, 0.62f, 0.31f, 1.3f, 0.96f, 1.28f)
                horizontalLineToRelative(3.87f)
                lineToRelative(-0.86f, 6.88f)
                curveToRelative(-0.11f, 0.69f, 0.61f, 1.3f, 1.28f, 1.08f)
                curveToRelative(1.94f, -0.58f, 3.72f, -1.72f, 5.33f, -3.39f)
                lineToRelative(-9.23f, -9.23f)
                curveToRelative(-0.89f, 1.86f, -1.32f, 3.29f, -1.35f, 3.38f)
                close()
            }
        }.also { _BoltSlash = it}
