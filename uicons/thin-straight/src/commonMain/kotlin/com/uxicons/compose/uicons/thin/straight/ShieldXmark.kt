package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ShieldXmark: ImageVector? = null

val Icons.Ts.ShieldXmark: ImageVector
    get() = _ShieldXmark ?: UXIcon(name = "ShieldXmark") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.21f, 2.8f)
                lineTo(12f, 0.08f)
                lineTo(3.79f, 2.8f)
                curveToRelative(-1.07f, 0.35f, -1.79f, 1.35f, -1.79f, 2.47f)
                verticalLineToRelative(6.66f)
                curveToRelative(0f, 6.61f, 7.16f, 10.7f, 9.35f, 11.8f)
                lineToRelative(0.63f, 0.31f)
                lineToRelative(0.65f, -0.26f)
                curveToRelative(2.82f, -1.13f, 9.37f, -4.54f, 9.37f, -11.74f)
                verticalLineToRelative(-6.77f)
                curveToRelative(0f, -1.12f, -0.72f, -2.12f, -1.79f, -2.47f)
                close()
                moveTo(21f, 12.04f)
                curveToRelative(0f, 6.59f, -6.35f, 9.85f, -8.97f, 10.91f)
                curveToRelative(-2.06f, -1.03f, -9.03f, -4.98f, -9.03f, -11.02f)
                verticalLineToRelative(-6.66f)
                curveToRelative(0f, -0.69f, 0.44f, -1.3f, 1.1f, -1.52f)
                lineToRelative(7.9f, -2.62f)
                lineToRelative(7.9f, 2.62f)
                curveToRelative(0.66f, 0.22f, 1.1f, 0.83f, 1.1f, 1.52f)
                verticalLineToRelative(6.77f)
                close()
                moveTo(16.35f, 7.85f)
                lineToRelative(-3.65f, 3.65f)
                lineToRelative(3.65f, 3.65f)
                lineToRelative(-0.71f, 0.71f)
                lineToRelative(-3.65f, -3.65f)
                lineToRelative(-3.65f, 3.65f)
                lineToRelative(-0.71f, -0.71f)
                lineToRelative(3.65f, -3.65f)
                lineToRelative(-3.65f, -3.65f)
                lineToRelative(0.71f, -0.71f)
                lineToRelative(3.65f, 3.65f)
                lineToRelative(3.65f, -3.65f)
                lineToRelative(0.71f, 0.71f)
                close()
            }
        }.also { _ShieldXmark = it}
