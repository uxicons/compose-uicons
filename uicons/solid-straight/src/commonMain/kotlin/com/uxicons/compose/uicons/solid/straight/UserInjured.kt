package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserInjured: ImageVector? = null

val Icons.Ss.UserInjured: ImageVector
    get() = _UserInjured ?: UXIcon(name = "UserInjured") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17.91f, 7f)
                curveToRelative(-0.48f, 2.83f, -2.94f, 5f, -5.91f, 5f)
                reflectiveCurveToRelative(-5.43f, -2.17f, -5.91f, -5f)
                horizontalLineToRelative(11.82f)
                close()
                moveTo(17.92f, 5f)
                curveToRelative(-0.17f, -0.98f, -0.57f, -1.88f, -1.15f, -2.64f)
                lineToRelative(-3.91f, 2.64f)
                horizontalLineToRelative(5.07f)
                close()
                moveTo(9.45f, 5f)
                lineTo(15.28f, 0.98f)
                curveToRelative(-0.94f, -0.62f, -2.07f, -0.98f, -3.28f, -0.98f)
                curveToRelative(-2.97f, 0f, -5.43f, 2.17f, -5.91f, 5f)
                horizontalLineToRelative(3.36f)
                close()
                moveTo(16.5f, 14f)
                horizontalLineToRelative(-4.38f)
                lineToRelative(1.6f, 6f)
                horizontalLineToRelative(3.28f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-5.5f)
                curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
                close()
                moveTo(7.5f, 14f)
                horizontalLineToRelative(2.4f)
                lineToRelative(2.1f, 8f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(2f)
                lineTo(6f, 24f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0f, -2.48f, 2.02f, -4.5f, 4.5f, -4.5f)
                close()
            }
        }.also { _UserInjured = it}
