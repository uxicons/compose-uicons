package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Hairdryer: ImageVector? = null

val Icons.Ts.Hairdryer: ImageVector
    get() = _Hairdryer ?: UXIcon(name = "Hairdryer") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 13.19f)
                verticalLineToRelative(-12.35f)
                lineToRelative(-6.65f, 1.89f)
                curveToRelative(-3.26f, -1.3f, -7.3f, -2.73f, -10.35f, -2.73f)
                curveToRelative(-3.86f, 0f, -7f, 3.14f, -7f, 7.0f)
                curveToRelative(0f, 3.07f, 1.99f, 5.68f, 4.74f, 6.62f)
                lineToRelative(3.49f, 8.53f)
                curveToRelative(0.59f, 1.5f, 2.45f, 2.27f, 3.92f, 1.61f)
                curveToRelative(1.53f, -0.64f, 2.25f, -2.4f, 1.61f, -3.92f)
                lineToRelative(-2.73f, -6.53f)
                curveToRelative(1.97f, -0.56f, 4.1f, -1.4f, 6.32f, -2.29f)
                lineToRelative(6.64f, 2.16f)
                close()
                moveTo(23f, 11.81f)
                lineTo(18f, 10.18f)
                verticalLineToRelative(-6.6f)
                lineToRelative(5f, -1.42f)
                close()
                moveTo(1f, 7.0f)
                curveToRelative(0f, -3.31f, 2.69f, -6.0f, 6f, -6.0f)
                curveToRelative(2.89f, 0f, 6.82f, 1.4f, 10f, 2.66f)
                verticalLineToRelative(6.43f)
                curveToRelative(-3.77f, 1.51f, -7.32f, 2.91f, -10f, 2.91f)
                curveToRelative(-3.31f, 0f, -6f, -2.69f, -6f, -6.0f)
                close()
                moveTo(12.85f, 20.23f)
                curveToRelative(0.42f, 1.02f, -0.06f, 2.19f, -1.08f, 2.62f)
                curveToRelative(-1.02f, 0.42f, -2.19f, -0.06f, -2.61f, -1.07f)
                lineToRelative(-3.21f, -7.86f)
                curveToRelative(0.35f, 0.05f, 0.7f, 0.09f, 1.06f, 0.09f)
                curveToRelative(0.94f, 0f, 1.97f, -0.17f, 3.06f, -0.43f)
                close()
            }
        }.also { _Hairdryer = it}
