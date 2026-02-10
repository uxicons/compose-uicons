package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ShieldPlus: ImageVector? = null

val Icons.Ts.ShieldPlus: ImageVector
    get() = _ShieldPlus ?: UXIcon(name = "ShieldPlus") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.29f, 2.76f)
                lineTo(12f, 0.01f)
                lineTo(3.71f, 2.76f)
                curveToRelative(-1.02f, 0.34f, -1.71f, 1.29f, -1.71f, 2.37f)
                verticalLineToRelative(6.74f)
                curveToRelative(0f, 6.61f, 7.16f, 10.7f, 9.35f, 11.8f)
                lineToRelative(0.63f, 0.31f)
                lineToRelative(0.65f, -0.26f)
                curveToRelative(2.2f, -0.88f, 9.37f, -4.35f, 9.37f, -11.85f)
                lineTo(22f, 5.13f)
                curveToRelative(0f, -1.08f, -0.69f, -2.03f, -1.71f, -2.37f)
                close()
                moveTo(21f, 11.87f)
                curveToRelative(0f, 6.87f, -6.69f, 10.1f, -8.74f, 10.92f)
                lineToRelative(-0.23f, 0.09f)
                lineToRelative(-0.22f, -0.11f)
                curveToRelative(-2.06f, -1.03f, -8.8f, -4.87f, -8.8f, -10.91f)
                lineTo(3f, 5.13f)
                curveToRelative(0f, -0.65f, 0.41f, -1.22f, 1.03f, -1.42f)
                lineTo(12f, 1.07f)
                lineToRelative(7.97f, 2.64f)
                curveToRelative(0.61f, 0.2f, 1.03f, 0.78f, 1.03f, 1.42f)
                verticalLineToRelative(6.74f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.5f, 7f)
                lineToRelative(-1f, 0f)
                lineToRelative(0f, 4f)
                lineToRelative(-4f, 0f)
                lineToRelative(0f, 1f)
                lineToRelative(4f, 0f)
                lineToRelative(0f, 4f)
                lineToRelative(1f, 0f)
                lineToRelative(0f, -4f)
                lineToRelative(4f, 0f)
                lineToRelative(0f, -1f)
                lineToRelative(-4f, 0f)
                lineToRelative(0f, -4f)
                close()
            }
        }.also { _ShieldPlus = it}
