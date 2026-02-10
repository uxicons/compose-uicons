package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ShieldCross: ImageVector? = null

val Icons.Ts.ShieldCross: ImageVector
    get() = _ShieldCross ?: UXIcon(name = "ShieldCross") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.5f, 3f)
                lineToRelative(-1f, 0f)
                lineToRelative(0f, 5f)
                lineToRelative(-5.5f, 0f)
                lineToRelative(0f, 1f)
                lineToRelative(5.5f, 0f)
                lineToRelative(0f, 11.5f)
                lineToRelative(1f, 0f)
                lineToRelative(0f, -11.5f)
                lineToRelative(5.5f, 0f)
                lineToRelative(0f, -1f)
                lineToRelative(-5.5f, 0f)
                lineToRelative(0f, -5f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.29f, 2.75f)
                lineTo(12f, -0.0f)
                lineTo(3.71f, 2.75f)
                curveToRelative(-1.02f, 0.34f, -1.71f, 1.29f, -1.71f, 2.38f)
                verticalLineToRelative(6.74f)
                curveToRelative(0f, 6.62f, 7.16f, 10.72f, 9.35f, 11.81f)
                lineToRelative(0.63f, 0.31f)
                lineToRelative(0.65f, -0.26f)
                curveToRelative(2.2f, -0.89f, 9.37f, -4.36f, 9.37f, -11.87f)
                verticalLineToRelative(-6.74f)
                curveToRelative(0f, -1.08f, -0.69f, -2.04f, -1.71f, -2.38f)
                close()
                moveTo(21f, 11.87f)
                curveToRelative(0f, 6.88f, -6.69f, 10.11f, -8.74f, 10.94f)
                lineToRelative(-0.23f, 0.09f)
                lineToRelative(-0.22f, -0.11f)
                curveToRelative(-2.06f, -1.03f, -8.8f, -4.88f, -8.8f, -10.92f)
                verticalLineToRelative(-6.74f)
                curveToRelative(0f, -0.65f, 0.41f, -1.22f, 1.03f, -1.43f)
                lineToRelative(7.97f, -2.65f)
                lineToRelative(7.97f, 2.65f)
                curveToRelative(0.61f, 0.2f, 1.03f, 0.78f, 1.03f, 1.43f)
                verticalLineToRelative(6.74f)
                close()
            }
        }.also { _ShieldCross = it}
