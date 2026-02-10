package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Massage: ImageVector? = null

val Icons.Ts.Massage: ImageVector
    get() = _Massage ?: UXIcon(name = "Massage") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.5f, 9f)
                curveToRelative(-2.53f, 0f, -4.88f, 0.82f, -6.82f, 2.22f)
                curveToRelative(-0.18f, -3.35f, -1.7f, -6.61f, -4.33f, -9.24f)
                lineToRelative(-0.35f, -0.35f)
                lineToRelative(-0.35f, 0.35f)
                curveToRelative(-2.63f, 2.63f, -4.15f, 5.88f, -4.33f, 9.24f)
                curveToRelative(-1.94f, -1.4f, -4.29f, -2.22f, -6.82f, -2.22f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(0.5f)
                curveToRelative(0f, 6.72f, 5.11f, 12.21f, 11.5f, 12.49f)
                verticalLineToRelative(0.01f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-0.01f)
                curveToRelative(6.39f, -0.27f, 11.5f, -5.77f, 11.5f, -12.49f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(-0.5f)
                close()
                moveTo(8.3f, 12.0f)
                curveToRelative(-0.03f, -3.21f, 1.28f, -6.36f, 3.7f, -8.94f)
                curveToRelative(2.42f, 2.58f, 3.73f, 5.74f, 3.7f, 8.94f)
                horizontalLineToRelative(0.01f)
                curveToRelative(-1.74f, 1.54f, -3.04f, 3.6f, -3.71f, 5.93f)
                curveToRelative(-0.67f, -2.34f, -1.98f, -4.39f, -3.71f, -5.93f)
                horizontalLineToRelative(0.01f)
                close()
                moveTo(1.01f, 10.01f)
                curveToRelative(5.67f, 0.27f, 10.23f, 5.05f, 10.48f, 10.98f)
                curveToRelative(-5.67f, -0.27f, -10.23f, -5.05f, -10.48f, -10.98f)
                close()
                moveTo(12.51f, 20.99f)
                curveToRelative(0.25f, -5.93f, 4.81f, -10.7f, 10.48f, -10.98f)
                curveToRelative(-0.25f, 5.93f, -4.81f, 10.7f, -10.48f, 10.98f)
                close()
            }
        }.also { _Massage = it}
