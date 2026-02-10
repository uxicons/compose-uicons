package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Glucose: ImageVector? = null

val Icons.Rs.Glucose: ImageVector
    get() = _Glucose ?: UXIcon(name = "Glucose") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10.21f, 21.99f)
                lineToRelative(2.65f, 1.59f)
                curveToRelative(-0.92f, 0.27f, -1.89f, 0.42f, -2.86f, 0.42f)
                curveToRelative(-5.54f, 0f, -10.05f, -4.51f, -10.05f, -10.05f)
                curveToRelative(0.08f, -5.16f, 6.26f, -10.78f, 10.0f, -13.89f)
                curveToRelative(2.26f, 1.66f, 4.59f, 3.92f, 6.84f, 6.66f)
                curveToRelative(0.63f, 0.8f, 1.16f, 1.56f, 1.6f, 2.31f)
                curveToRelative(-0.72f, -0.07f, -1.45f, 0.06f, -2.12f, 0.38f)
                curveToRelative(-0.31f, -0.47f, -0.66f, -0.95f, -1.05f, -1.45f)
                curveToRelative(-1.61f, -2.04f, -3.63f, -3.95f, -5.21f, -5.32f)
                curveToRelative(-2.89f, 2.5f, -8.05f, 7.49f, -8.05f, 11.32f)
                curveToRelative(0f, 4.44f, 3.61f, 8.05f, 8.05f, 8.05f)
                curveToRelative(0.07f, 0f, 0.14f, -0.01f, 0.21f, -0.01f)
                close()
                moveTo(24f, 14.27f)
                verticalLineToRelative(6.46f)
                lineToRelative(-4.97f, 2.98f)
                curveToRelative(-0.64f, 0.38f, -1.42f, 0.38f, -2.06f, 0f)
                lineToRelative(-4.97f, -2.98f)
                verticalLineToRelative(-6.46f)
                lineToRelative(4.97f, -2.98f)
                curveToRelative(0.64f, -0.38f, 1.42f, -0.38f, 2.06f, 0f)
                lineToRelative(4.97f, 2.98f)
                close()
                moveTo(14.94f, 14.83f)
                lineTo(18f, 16.67f)
                lineTo(21.06f, 14.83f)
                lineTo(18f, 13.0f)
                close()
                moveTo(17f, 21.4f)
                verticalLineToRelative(-3.0f)
                lineToRelative(-3f, -1.8f)
                verticalLineToRelative(3.0f)
                lineToRelative(3f, 1.8f)
                close()
                moveTo(22f, 19.6f)
                verticalLineToRelative(-3.0f)
                lineToRelative(-3f, 1.8f)
                verticalLineToRelative(3.0f)
                lineToRelative(3f, -1.8f)
                close()
            }
        }.also { _Glucose = it}
