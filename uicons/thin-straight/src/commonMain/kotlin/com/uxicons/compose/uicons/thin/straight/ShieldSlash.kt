package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ShieldSlash: ImageVector? = null

val Icons.Ts.ShieldSlash: ImageVector
    get() = _ShieldSlash ?: UXIcon(name = "ShieldSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16.73f, 20.27f)
                lineToRelative(0.71f, 0.71f)
                curveToRelative(-1.78f, 1.44f, -3.67f, 2.34f, -4.82f, 2.81f)
                lineToRelative(-0.65f, 0.26f)
                lineToRelative(-0.63f, -0.31f)
                curveToRelative(-2.19f, -1.1f, -9.35f, -5.19f, -9.35f, -11.8f)
                verticalLineToRelative(-6.4f)
                lineToRelative(1f, 1f)
                verticalLineToRelative(5.4f)
                curveToRelative(0f, 6.04f, 6.96f, 9.98f, 9.03f, 11.02f)
                curveToRelative(1.07f, -0.43f, 3.06f, -1.36f, 4.71f, -2.68f)
                close()
                moveTo(24.0f, 23.3f)
                lineToRelative(-0.71f, 0.71f)
                lineTo(-0.0f, 0.7f)
                lineTo(0.7f, -0.0f)
                lineToRelative(2.88f, 2.88f)
                curveToRelative(0.07f, -0.03f, 8.42f, -2.8f, 8.42f, -2.8f)
                lineToRelative(8.21f, 2.72f)
                curveToRelative(1.07f, 0.35f, 1.79f, 1.35f, 1.79f, 2.47f)
                verticalLineToRelative(6.77f)
                curveToRelative(0f, 2.52f, -0.82f, 4.82f, -2.42f, 6.83f)
                lineToRelative(4.43f, 4.43f)
                close()
                moveTo(18.86f, 18.16f)
                curveToRelative(1.42f, -1.81f, 2.14f, -3.86f, 2.14f, -6.12f)
                verticalLineToRelative(-6.77f)
                curveToRelative(0f, -0.69f, -0.44f, -1.31f, -1.1f, -1.52f)
                lineToRelative(-7.9f, -2.62f)
                lineToRelative(-7.63f, 2.53f)
                lineToRelative(14.5f, 14.5f)
                close()
            }
        }.also { _ShieldSlash = it}
