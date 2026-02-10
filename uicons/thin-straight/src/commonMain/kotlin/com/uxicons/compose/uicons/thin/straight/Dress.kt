package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Dress: ImageVector? = null

val Icons.Ts.Dress: ImageVector
    get() = _Dress ?: UXIcon(name = "Dress") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.06f, 9.33f)
                lineToRelative(0.69f, -2.65f)
                curveToRelative(0.17f, -0.75f, 0.25f, -1.51f, 0.25f, -2.28f)
                lineTo(17f, 0f)
                horizontalLineToRelative(-1f)
                lineTo(16f, 2.04f)
                curveToRelative(-1.83f, 0.22f, -3.32f, 1.54f, -4f, 2.26f)
                curveToRelative(-0.68f, -0.72f, -2.17f, -2.04f, -4f, -2.26f)
                lineTo(8f, 0f)
                horizontalLineToRelative(-1f)
                lineTo(7f, 4.4f)
                curveToRelative(0f, 0.76f, 0.08f, 1.53f, 0.25f, 2.29f)
                lineToRelative(0.68f, 2.63f)
                lineTo(0.25f, 16.14f)
                curveToRelative(1.95f, 4.74f, 6.6f, 7.87f, 11.75f, 7.86f)
                curveToRelative(5.15f, 0.01f, 9.8f, -3.12f, 11.75f, -7.86f)
                lineToRelative(-7.69f, -6.81f)
                close()
                moveTo(11.61f, 5.37f)
                lineToRelative(0.4f, 0.5f)
                lineToRelative(0.39f, -0.5f)
                curveToRelative(0.02f, -0.02f, 1.61f, -2.0f, 3.61f, -2.31f)
                verticalLineToRelative(1.34f)
                curveToRelative(0f, 0.69f, -0.08f, 1.39f, -0.22f, 2.04f)
                lineToRelative(-0.66f, 2.56f)
                horizontalLineToRelative(-6.23f)
                lineToRelative(-0.66f, -2.54f)
                curveToRelative(-0.15f, -0.68f, -0.23f, -1.37f, -0.23f, -2.06f)
                verticalLineToRelative(-1.34f)
                curveToRelative(1.99f, 0.31f, 3.59f, 2.29f, 3.61f, 2.31f)
                close()
                moveTo(12f, 23f)
                curveToRelative(-4.5f, 0f, -8.6f, -2.58f, -10.54f, -6.6f)
                lineToRelative(7.22f, -6.4f)
                horizontalLineToRelative(6.62f)
                lineToRelative(7.23f, 6.4f)
                curveToRelative(-1.94f, 4.02f, -6.03f, 6.6f, -10.54f, 6.6f)
                close()
            }
        }.also { _Dress = it}
