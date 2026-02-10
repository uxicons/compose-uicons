package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ShieldAlt: ImageVector? = null

val Icons.Ts.ShieldAlt: ImageVector
    get() = _ShieldAlt ?: UXIcon(name = "ShieldAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.21f, 2.72f)
                lineTo(12f, 0f)
                lineTo(3.79f, 2.72f)
                curveToRelative(-1.07f, 0.35f, -1.79f, 1.35f, -1.79f, 2.47f)
                verticalLineToRelative(6.66f)
                curveToRelative(0f, 6.61f, 7.16f, 10.7f, 9.35f, 11.8f)
                lineToRelative(0.63f, 0.31f)
                lineToRelative(0.65f, -0.26f)
                curveToRelative(2.82f, -1.13f, 9.37f, -4.54f, 9.37f, -11.74f)
                verticalLineToRelative(-6.77f)
                curveToRelative(0f, -1.12f, -0.72f, -2.12f, -1.79f, -2.47f)
                close()
                moveTo(3f, 11.86f)
                verticalLineToRelative(-6.66f)
                curveToRelative(0f, -0.69f, 0.44f, -1.3f, 1.1f, -1.52f)
                lineToRelative(7.4f, -2.45f)
                verticalLineToRelative(21.39f)
                curveToRelative(-2.34f, -1.22f, -8.5f, -4.97f, -8.5f, -10.75f)
                close()
                moveTo(21f, 11.97f)
                curveToRelative(0f, 6.4f, -5.76f, 9.57f, -8.5f, 10.71f)
                lineTo(12.5f, 1.22f)
                lineToRelative(7.4f, 2.45f)
                curveToRelative(0.66f, 0.22f, 1.1f, 0.83f, 1.1f, 1.52f)
                verticalLineToRelative(6.77f)
                close()
            }
        }.also { _ShieldAlt = it}
