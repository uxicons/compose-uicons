package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ShieldCheck: ImageVector? = null

val Icons.Ts.ShieldCheck: ImageVector
    get() = _ShieldCheck ?: UXIcon(name = "ShieldCheck") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.98f, 23.99f)
                lineToRelative(-0.63f, -0.31f)
                curveToRelative(-2.19f, -1.1f, -9.35f, -5.19f, -9.35f, -11.8f)
                lineTo(2f, 5.13f)
                curveToRelative(0f, -1.08f, 0.69f, -2.03f, 1.71f, -2.37f)
                lineTo(12f, 0.01f)
                lineToRelative(8.29f, 2.75f)
                curveToRelative(1.02f, 0.34f, 1.71f, 1.29f, 1.71f, 2.37f)
                verticalLineToRelative(6.74f)
                curveToRelative(0f, 7.5f, -7.17f, 10.97f, -9.37f, 11.85f)
                lineToRelative(-0.65f, 0.26f)
                close()
                moveTo(12f, 1.07f)
                lineTo(4.03f, 3.71f)
                curveToRelative(-0.61f, 0.2f, -1.03f, 0.78f, -1.03f, 1.42f)
                verticalLineToRelative(6.74f)
                curveToRelative(0f, 6.04f, 6.74f, 9.87f, 8.8f, 10.91f)
                lineToRelative(0.22f, 0.11f)
                lineToRelative(0.23f, -0.09f)
                curveToRelative(2.05f, -0.82f, 8.74f, -4.05f, 8.74f, -10.92f)
                lineTo(21f, 5.13f)
                curveToRelative(0f, -0.65f, -0.41f, -1.22f, -1.03f, -1.42f)
                lineTo(12f, 1.07f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.5f, 15f)
                curveToRelative(-0.38f, 0f, -0.77f, -0.15f, -1.06f, -0.44f)
                lineToRelative(-3.29f, -3.2f)
                lineToRelative(0.7f, -0.72f)
                lineToRelative(3.29f, 3.21f)
                curveToRelative(0.2f, 0.2f, 0.52f, 0.2f, 0.71f, 0.01f)
                lineToRelative(6.29f, -6.21f)
                lineToRelative(0.7f, 0.71f)
                lineToRelative(-6.29f, 6.21f)
                curveToRelative(-0.29f, 0.29f, -0.67f, 0.44f, -1.06f, 0.44f)
                close()
            }
        }.also { _ShieldCheck = it}
