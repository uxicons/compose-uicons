package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserInjured: ImageVector? = null

val Icons.Rs.UserInjured: ImageVector
    get() = _UserInjured ?: UXIcon(name = "UserInjured") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16.5f, 14f)
                lineTo(7.5f, 14f)
                curveToRelative(-2.48f, 0f, -4.5f, 2.02f, -4.5f, 4.5f)
                verticalLineToRelative(2.5f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2.22f)
                lineToRelative(-1.5f, -6f)
                horizontalLineToRelative(5.22f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                verticalLineToRelative(5.5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-5.5f)
                curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
                close()
                moveTo(10.72f, 22f)
                horizontalLineToRelative(-4.72f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(1.72f)
                lineToRelative(1.5f, 6f)
                close()
                moveTo(6f, 6f)
                curveToRelative(0f, -3.31f, 2.69f, -6f, 6f, -6f)
                curveToRelative(1.21f, 0f, 2.34f, 0.36f, 3.28f, 0.98f)
                lineToRelative(-7.28f, 5.02f)
                curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                reflectiveCurveToRelative(4f, -1.79f, 4f, -4f)
                horizontalLineToRelative(-4.63f)
                lineToRelative(5.4f, -3.64f)
                curveToRelative(0.77f, 1.01f, 1.24f, 2.27f, 1.24f, 3.64f)
                curveToRelative(0f, 3.31f, -2.69f, 6f, -6f, 6f)
                reflectiveCurveToRelative(-6f, -2.69f, -6f, -6f)
                close()
            }
        }.also { _UserInjured = it}
