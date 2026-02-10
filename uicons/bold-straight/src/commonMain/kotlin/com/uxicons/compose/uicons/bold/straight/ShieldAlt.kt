package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ShieldAlt: ImageVector? = null

val Icons.Bs.ShieldAlt: ImageVector
    get() = _ShieldAlt ?: UXIcon(name = "ShieldAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19.68f, 2.55f)
                lineTo(12f, 0f)
                lineToRelative(-7.68f, 2.55f)
                curveToRelative(-1.39f, 0.46f, -2.32f, 1.75f, -2.32f, 3.21f)
                verticalLineToRelative(6.16f)
                curveToRelative(0f, 6.52f, 6.85f, 10.45f, 8.95f, 11.5f)
                lineToRelative(0.98f, 0.49f)
                lineToRelative(1.02f, -0.41f)
                curveToRelative(2.12f, -0.85f, 9.04f, -4.21f, 9.04f, -11.58f)
                verticalLineToRelative(-6.16f)
                curveToRelative(0f, -1.46f, -0.93f, -2.75f, -2.32f, -3.21f)
                close()
                moveTo(5f, 11.92f)
                verticalLineToRelative(-6.16f)
                curveToRelative(0f, -0.17f, 0.11f, -0.31f, 0.27f, -0.36f)
                lineToRelative(5.24f, -1.74f)
                verticalLineToRelative(16.05f)
                curveToRelative(-2.3f, -1.47f, -5.5f, -4.16f, -5.5f, -7.79f)
                close()
                moveTo(19f, 11.92f)
                curveToRelative(0f, 4.22f, -3.24f, 6.75f, -5.5f, 8.0f)
                lineTo(13.5f, 3.66f)
                lineToRelative(5.24f, 1.74f)
                curveToRelative(0.16f, 0.05f, 0.26f, 0.2f, 0.26f, 0.36f)
                verticalLineToRelative(6.16f)
                close()
            }
        }.also { _ShieldAlt = it}
