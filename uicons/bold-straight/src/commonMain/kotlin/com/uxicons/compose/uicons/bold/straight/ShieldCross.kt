package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ShieldCross: ImageVector? = null

val Icons.Bs.ShieldCross: ImageVector
    get() = _ShieldCross ?: UXIcon(name = "ShieldCross") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19.68f, 2.56f)
                lineTo(12f, 0f)
                lineToRelative(-7.68f, 2.56f)
                curveToRelative(-1.39f, 0.46f, -2.32f, 1.76f, -2.32f, 3.22f)
                verticalLineToRelative(6.18f)
                curveToRelative(0f, 6.54f, 6.85f, 10.49f, 8.95f, 11.54f)
                lineToRelative(0.98f, 0.49f)
                lineToRelative(1.02f, -0.41f)
                curveToRelative(2.12f, -0.86f, 9.04f, -4.23f, 9.04f, -11.62f)
                verticalLineToRelative(-6.18f)
                curveToRelative(0f, -1.47f, -0.93f, -2.76f, -2.32f, -3.22f)
                close()
                moveTo(19f, 11.96f)
                curveToRelative(0f, 5.28f, -5.03f, 7.92f, -6.93f, 8.73f)
                curveToRelative(-1.93f, -1.0f, -7.07f, -4.11f, -7.07f, -8.73f)
                verticalLineToRelative(-6.18f)
                curveToRelative(0f, -0.17f, 0.11f, -0.31f, 0.27f, -0.36f)
                lineToRelative(6.73f, -2.24f)
                lineToRelative(6.74f, 2.24f)
                curveToRelative(0.16f, 0.05f, 0.27f, 0.2f, 0.27f, 0.36f)
                verticalLineToRelative(6.18f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.5f, 5f)
                lineToRelative(-3f, 0f)
                lineToRelative(0f, 3f)
                lineToRelative(-3.5f, 0f)
                lineToRelative(0f, 3f)
                lineToRelative(3.5f, 0f)
                lineToRelative(0f, 7f)
                lineToRelative(3f, 0f)
                lineToRelative(0f, -7f)
                lineToRelative(3.5f, 0f)
                lineToRelative(0f, -3f)
                lineToRelative(-3.5f, 0f)
                lineToRelative(0f, -3f)
                close()
            }
        }.also { _ShieldCross = it}
