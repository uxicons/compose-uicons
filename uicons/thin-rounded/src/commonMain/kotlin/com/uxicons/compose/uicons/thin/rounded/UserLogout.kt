package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserLogout: ImageVector? = null

val Icons.Tr.UserLogout: ImageVector
    get() = _UserLogout ?: UXIcon(name = "UserLogout") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(8f, 0f)
                curveToRelative(-3.31f, 0f, -6f, 2.69f, -6f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                reflectiveCurveToRelative(6f, -2.69f, 6f, -6f)
                reflectiveCurveToRelative(-2.69f, -6f, -6f, -6f)
                close()
                moveTo(8f, 11f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                reflectiveCurveToRelative(2.24f, -5f, 5f, -5f)
                reflectiveCurveToRelative(5f, 2.24f, 5f, 5f)
                reflectiveCurveToRelative(-2.24f, 5f, -5f, 5f)
                close()
                moveTo(11.96f, 15.27f)
                curveToRelative(-0.1f, 0.26f, -0.4f, 0.38f, -0.65f, 0.28f)
                curveToRelative(-0.89f, -0.36f, -1.84f, -0.55f, -2.81f, -0.55f)
                curveToRelative(-4.14f, 0f, -7.5f, 3.36f, -7.5f, 7.5f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                reflectiveCurveToRelative(-0.5f, -0.22f, -0.5f, -0.5f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -4.69f, 3.81f, -8.5f, 8.5f, -8.5f)
                curveToRelative(1.1f, 0f, 2.17f, 0.21f, 3.19f, 0.62f)
                curveToRelative(0.26f, 0.1f, 0.38f, 0.4f, 0.28f, 0.65f)
                close()
                moveTo(19f, 23.5f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                horizontalLineToRelative(-2f)
                curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(2f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                reflectiveCurveToRelative(-0.22f, 0.5f, -0.5f, 0.5f)
                horizontalLineToRelative(-2f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(2f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                close()
                moveTo(24.0f, 18.52f)
                curveToRelative(0f, 0.4f, -0.17f, 0.82f, -0.48f, 1.09f)
                lineToRelative(-2.68f, 2.37f)
                curveToRelative(-0.21f, 0.18f, -0.52f, 0.16f, -0.71f, -0.04f)
                curveToRelative(-0.18f, -0.21f, -0.16f, -0.52f, 0.04f, -0.71f)
                lineToRelative(2.53f, -2.23f)
                horizontalLineToRelative(-5.2f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                reflectiveCurveToRelative(0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(5.06f)
                lineToRelative(-2.39f, -2.11f)
                curveToRelative(-0.21f, -0.18f, -0.23f, -0.5f, -0.04f, -0.71f)
                curveToRelative(0.18f, -0.21f, 0.5f, -0.23f, 0.71f, -0.04f)
                lineToRelative(2.69f, 2.37f)
                curveToRelative(0.3f, 0.25f, 0.48f, 0.62f, 0.48f, 1.01f)
                close()
            }
        }.also { _UserLogout = it}
