package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ShieldMinus: ImageVector? = null

val Icons.Ts.ShieldMinus: ImageVector
    get() = _ShieldMinus ?: UXIcon(name = "ShieldMinus") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(7f, 11f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(1f)
                lineTo(7f, 12f)
                verticalLineToRelative(-1f)
                close()
                moveTo(22f, 5.27f)
                verticalLineToRelative(6.77f)
                curveToRelative(0f, 7.2f, -6.55f, 10.61f, -9.37f, 11.74f)
                lineToRelative(-0.65f, 0.26f)
                lineToRelative(-0.63f, -0.31f)
                curveToRelative(-2.19f, -1.1f, -9.35f, -5.19f, -9.35f, -11.8f)
                verticalLineToRelative(-6.66f)
                curveToRelative(0f, -1.12f, 0.72f, -2.12f, 1.79f, -2.47f)
                lineTo(12f, 0.08f)
                lineToRelative(8.21f, 2.72f)
                curveToRelative(1.07f, 0.35f, 1.79f, 1.35f, 1.79f, 2.47f)
                close()
                moveTo(21f, 5.27f)
                curveToRelative(0f, -0.69f, -0.44f, -1.31f, -1.1f, -1.52f)
                lineToRelative(-7.9f, -2.62f)
                lineToRelative(-7.9f, 2.62f)
                curveToRelative(-0.66f, 0.22f, -1.1f, 0.83f, -1.1f, 1.52f)
                verticalLineToRelative(6.66f)
                curveToRelative(0f, 6.04f, 6.96f, 9.98f, 9.03f, 11.02f)
                curveToRelative(2.63f, -1.06f, 8.97f, -4.32f, 8.97f, -10.91f)
                verticalLineToRelative(-6.77f)
                close()
            }
        }.also { _ShieldMinus = it}
