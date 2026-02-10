package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserUnlock: ImageVector? = null

val Icons.Ss.UserUnlock: ImageVector
    get() = _UserUnlock ?: UXIcon(name = "UserUnlock") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10f, 21f)
                curveToRelative(0f, 1.12f, 0.37f, 2.16f, 1.0f, 3f)
                lineTo(0f, 24f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -2.76f, 2.24f, -5f, 5f, -5f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(7f)
                close()
                moveTo(8f, 12f)
                curveToRelative(3.31f, 0f, 6f, -2.69f, 6f, -6f)
                reflectiveCurveTo(11.31f, 0f, 8f, 0f)
                reflectiveCurveTo(2f, 2.69f, 2f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                close()
                moveTo(24f, 14f)
                verticalLineToRelative(7f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                horizontalLineToRelative(-6f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
                curveToRelative(1.86f, 0f, 3.43f, 1.28f, 3.87f, 3f)
                horizontalLineToRelative(-2.14f)
                curveToRelative(-0.35f, -0.6f, -0.99f, -1f, -1.73f, -1f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(8f)
                close()
                moveTo(19f, 18f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                close()
            }
        }.also { _UserUnlock = it}
