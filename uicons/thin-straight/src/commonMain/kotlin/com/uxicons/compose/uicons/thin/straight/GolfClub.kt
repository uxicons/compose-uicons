package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GolfClub: ImageVector? = null

val Icons.Ts.GolfClub: ImageVector
    get() = _GolfClub ?: UXIcon(name = "GolfClub") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.51f, 24f)
                horizontalLineTo(4.61f)
                curveTo(2.07f, 24f, -0.01f, 21.93f, -0.01f, 19.38f)
                verticalLineToRelative(-4.8f)
                curveTo(-0.01f, 13.18f, 0.62f, 11.87f, 1.7f, 10.99f)
                curveToRelative(1.09f, -0.88f, 2.49f, -1.22f, 3.86f, -0.93f)
                lineToRelative(15.33f, 3.03f)
                lineTo(23.01f, 0.01f)
                lineToRelative(0.99f, 0.16f)
                lineToRelative(-2.6f, 16.05f)
                curveToRelative(-0.14f, 0.96f, -0.34f, 1.73f, -0.63f, 2.4f)
                curveToRelative(-1.44f, 3.27f, -4.68f, 5.39f, -8.26f, 5.39f)
                close()
                moveTo(4.61f, 10.96f)
                curveToRelative(-0.82f, 0f, -1.62f, 0.28f, -2.27f, 0.81f)
                curveToRelative(-0.85f, 0.69f, -1.34f, 1.72f, -1.34f, 2.81f)
                verticalLineToRelative(4.8f)
                curveToRelative(0f, 2.0f, 1.62f, 3.62f, 3.62f, 3.62f)
                horizontalLineToRelative(7.9f)
                curveToRelative(3.18f, 0f, 6.06f, -1.88f, 7.34f, -4.79f)
                curveToRelative(0.26f, -0.58f, 0.43f, -1.26f, 0.56f, -2.14f)
                lineToRelative(0.32f, -1.99f)
                lineToRelative(-15.37f, -3.04f)
                curveToRelative(-0.25f, -0.05f, -0.51f, -0.08f, -0.76f, -0.08f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(4.87f, 14.54f)
                lineToRelative(0.21f, -0.98f)
                lineToRelative(10.53f, 2.22f)
                lineToRelative(-0.21f, 0.98f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(3.9f, 18.49f)
                lineToRelative(0.21f, -0.98f)
                lineToRelative(6.98f, 1.48f)
                lineToRelative(-0.21f, 0.98f)
                close()
            }
        }.also { _GolfClub = it}
