package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserChef: ImageVector? = null

val Icons.Bs.UserChef: ImageVector
    get() = _UserChef ?: UXIcon(name = "UserChef") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 21.5f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(-0.5f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0f, -3.03f, 2.47f, -5.5f, 5.5f, -5.5f)
                horizontalLineToRelative(7f)
                curveToRelative(3.03f, 0f, 5.5f, 2.47f, 5.5f, 5.5f)
                close()
                moveTo(4f, 2.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                curveToRelative(0.58f, 0f, 1.54f, 0.2f, 2.48f, 0.53f)
                curveToRelative(0.62f, -0.2f, 1.79f, -0.53f, 3.02f, -0.53f)
                reflectiveCurveToRelative(2.4f, 0.32f, 3.02f, 0.53f)
                curveToRelative(0.93f, -0.33f, 1.9f, -0.53f, 2.48f, -0.53f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                curveToRelative(0f, 1.21f, -0.86f, 2.22f, -2.0f, 2.45f)
                curveToRelative(0f, 0.02f, 0.0f, 0.03f, 0.0f, 0.05f)
                verticalLineToRelative(3.98f)
                curveToRelative(0f, 3.31f, -2.69f, 6f, -6f, 6f)
                reflectiveCurveToRelative(-6f, -2.69f, -6f, -6f)
                verticalLineToRelative(-3.98f)
                curveToRelative(0f, -0.02f, 0.0f, -0.03f, 0.0f, -0.05f)
                curveToRelative(-1.14f, -0.23f, -2.0f, -1.24f, -2.0f, -2.45f)
                close()
                moveTo(9f, 8f)
                verticalLineToRelative(0.98f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                reflectiveCurveToRelative(3f, -1.35f, 3f, -3f)
                verticalLineToRelative(-0.98f)
                horizontalLineToRelative(-6f)
                close()
                moveTo(14.5f, 20f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                close()
            }
        }.also { _UserChef = it}
