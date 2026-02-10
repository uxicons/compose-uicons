package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LeafOak: ImageVector? = null

val Icons.Ss.LeafOak: ImageVector
    get() = _LeafOak ?: UXIcon(name = "LeafOak") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(5.34f, 20.09f)
                lineToRelative(-3.9f, 3.9f)
                lineTo(0.02f, 22.58f)
                lineToRelative(3.9f, -3.9f)
                lineToRelative(1.42f, 1.41f)
                close()
                moveTo(22.78f, 7.08f)
                curveToRelative(0.78f, -0.78f, 1.22f, -1.82f, 1.22f, -2.93f)
                reflectiveCurveToRelative(-0.43f, -2.15f, -1.22f, -2.94f)
                curveToRelative(-0.78f, -0.78f, -1.82f, -1.22f, -2.94f, -1.22f)
                reflectiveCurveToRelative(-2.15f, 0.43f, -2.93f, 1.21f)
                lineToRelative(-0.16f, 0.16f)
                curveToRelative(-0.79f, -0.76f, -1.79f, -1.37f, -3.21f, -1.37f)
                curveToRelative(-2.29f, 0f, -4.15f, 1.86f, -4.15f, 4.15f)
                verticalLineToRelative(0.1f)
                curveToRelative(-0.3f, -0.03f, -0.61f, -0.04f, -0.87f, -0.04f)
                curveToRelative(-2.4f, 0f, -4.35f, 1.93f, -4.38f, 4.32f)
                curveToRelative(-1.81f, 0.45f, -3.15f, 2.08f, -3.15f, 4.03f)
                curveToRelative(0f, 1.62f, 1.93f, 4.66f, 2.92f, 6.12f)
                lineToRelative(9.88f, -9.88f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(-9.88f, 9.88f)
                curveToRelative(1.47f, 1.0f, 4.5f, 2.91f, 6.12f, 2.91f)
                curveToRelative(1.94f, 0f, 3.58f, -1.34f, 4.03f, -3.15f)
                curveToRelative(2.39f, -0.03f, 4.32f, -1.99f, 4.32f, -4.38f)
                curveToRelative(0f, -0.26f, -0.02f, -0.57f, -0.04f, -0.87f)
                horizontalLineToRelative(0.1f)
                curveToRelative(2.29f, 0f, 4.15f, -1.86f, 4.15f, -4.15f)
                curveToRelative(0f, -1.42f, -0.61f, -2.42f, -1.37f, -3.21f)
                lineToRelative(0.16f, -0.16f)
                close()
            }
        }.also { _LeafOak = it}
