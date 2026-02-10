package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserLogout: ImageVector? = null

val Icons.Rs.UserLogout: ImageVector
    get() = _UserLogout ?: UXIcon(name = "UserLogout") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(8f, 0f)
                curveToRelative(-3.31f, 0f, -6f, 2.69f, -6f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                reflectiveCurveToRelative(6f, -2.69f, 6f, -6f)
                reflectiveCurveToRelative(-2.69f, -6f, -6f, -6f)
                close()
                moveTo(8f, 10f)
                curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
                reflectiveCurveToRelative(1.79f, -4f, 4f, -4f)
                reflectiveCurveToRelative(4f, 1.79f, 4f, 4f)
                reflectiveCurveToRelative(-1.79f, 4f, -4f, 4f)
                close()
                moveTo(4.5f, 14f)
                horizontalLineToRelative(6.5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-6.5f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(5.5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-5.5f)
                curveToRelative(0f, -2.48f, 2.02f, -4.5f, 4.5f, -4.5f)
                close()
                moveTo(16f, 22f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                close()
                moveTo(24f, 18.06f)
                curveToRelative(0f, 0.55f, -0.24f, 1.07f, -0.66f, 1.43f)
                lineToRelative(-2.68f, 2.36f)
                lineToRelative(-1.32f, -1.5f)
                lineToRelative(1.53f, -1.35f)
                horizontalLineToRelative(-3.87f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(3.74f)
                lineToRelative(-1.4f, -1.24f)
                lineToRelative(1.32f, -1.5f)
                lineToRelative(2.69f, 2.37f)
                curveToRelative(0.41f, 0.35f, 0.65f, 0.88f, 0.65f, 1.43f)
                close()
            }
        }.also { _UserLogout = it}
