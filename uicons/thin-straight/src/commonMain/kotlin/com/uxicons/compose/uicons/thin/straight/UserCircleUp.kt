package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserCircleUp: ImageVector? = null

val Icons.Ts.UserCircleUp: ImageVector
    get() = _UserCircleUp ?: UXIcon(name = "UserCircleUp") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 21f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                horizontalLineToRelative(-6f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(6f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
                moveTo(2f, 12f)
                curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
                reflectiveCurveToRelative(4f, 1.79f, 4f, 4f)
                reflectiveCurveToRelative(-1.79f, 4f, -4f, 4f)
                reflectiveCurveToRelative(-4f, -1.79f, -4f, -4f)
                close()
                moveTo(3f, 12f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                reflectiveCurveToRelative(3f, -1.35f, 3f, -3f)
                reflectiveCurveToRelative(-1.35f, -3f, -3f, -3f)
                reflectiveCurveToRelative(-3f, 1.35f, -3f, 3f)
                close()
                moveTo(24f, 6.5f)
                curveToRelative(0f, 3.58f, -2.92f, 6.5f, -6.5f, 6.5f)
                reflectiveCurveToRelative(-6.5f, -2.92f, -6.5f, -6.5f)
                reflectiveCurveToRelative(2.92f, -6.5f, 6.5f, -6.5f)
                reflectiveCurveToRelative(6.5f, 2.92f, 6.5f, 6.5f)
                close()
                moveTo(23f, 6.5f)
                curveToRelative(0f, -3.03f, -2.47f, -5.5f, -5.5f, -5.5f)
                reflectiveCurveToRelative(-5.5f, 2.47f, -5.5f, 5.5f)
                reflectiveCurveToRelative(2.47f, 5.5f, 5.5f, 5.5f)
                reflectiveCurveToRelative(5.5f, -2.47f, 5.5f, -5.5f)
                close()
                moveTo(21.59f, 7f)
                horizontalLineToRelative(-3.59f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-3.59f)
                lineToRelative(3.08f, -3.58f)
                curveToRelative(0.27f, -0.27f, 0.62f, -0.42f, 1f, -0.42f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.38f, 0f, 0.73f, 0.15f, 1f, 0.41f)
                lineToRelative(3.1f, 3.59f)
                close()
                moveTo(15.59f, 6f)
                horizontalLineToRelative(3.82f)
                lineToRelative(-1.65f, -1.91f)
                curveToRelative(-0.05f, -0.05f, -0.16f, -0.09f, -0.27f, -0.09f)
                curveToRelative(-0.11f, 0f, -0.21f, 0.04f, -0.28f, 0.11f)
                close()
            }
        }.also { _UserCircleUp = it}
