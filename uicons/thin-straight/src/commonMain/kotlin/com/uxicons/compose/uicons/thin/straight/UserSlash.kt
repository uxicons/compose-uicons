package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserSlash: ImageVector? = null

val Icons.Ts.UserSlash: ImageVector
    get() = _UserSlash ?: UXIcon(name = "UserSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 20.29f)
                verticalLineToRelative(-1.79f)
                curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
                horizontalLineToRelative(-1.79f)
                lineToRelative(-2.02f, -2.02f)
                curveToRelative(2.99f, -0.35f, 5.31f, -2.9f, 5.31f, -5.98f)
                curveTo(18f, 2.68f, 15.3f, -0.03f, 11.97f, -0.03f)
                curveTo(8.89f, -0.03f, 6.35f, 2.3f, 5.99f, 5.28f)
                lineTo(0.7f, -0.0f)
                lineTo(-0.0f, 0.7f)
                lineTo(23.3f, 24.0f)
                lineToRelative(0.71f, -0.71f)
                lineToRelative(-3.0f, -3.0f)
                close()
                moveTo(16.5f, 15f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(0.79f)
                lineToRelative(-4.29f, -4.29f)
                horizontalLineToRelative(0.79f)
                close()
                moveTo(6.95f, 6f)
                curveTo(6.95f, 3.23f, 9.2f, 0.97f, 11.97f, 0.97f)
                reflectiveCurveToRelative(5.03f, 2.25f, 5.03f, 5.03f)
                reflectiveCurveToRelative(-2.25f, 5.03f, -5.03f, 5.03f)
                curveToRelative(-0.08f, 0f, -0.17f, -0.0f, -0.25f, -0.01f)
                lineTo(6.96f, 6.25f)
                curveToRelative(-0.0f, -0.08f, -0.01f, -0.17f, -0.01f, -0.25f)
                close()
                moveTo(10.46f, 14f)
                lineToRelative(1f, 1f)
                horizontalLineToRelative(-3.96f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(5.5f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-5.5f)
                curveToRelative(0f, -2.48f, 2.02f, -4.5f, 4.5f, -4.5f)
                horizontalLineToRelative(2.96f)
                close()
            }
        }.also { _UserSlash = it}
