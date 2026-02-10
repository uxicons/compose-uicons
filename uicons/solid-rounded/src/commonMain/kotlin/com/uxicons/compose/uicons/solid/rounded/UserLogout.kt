package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserLogout: ImageVector? = null

val Icons.Sr.UserLogout: ImageVector
    get() = _UserLogout ?: UXIcon(name = "UserLogout") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15f, 6f)
                curveToRelative(0f, 3.31f, -2.69f, 6f, -6f, 6f)
                reflectiveCurveToRelative(-6f, -2.69f, -6f, -6f)
                reflectiveCurveToRelative(2.69f, -6f, 6f, -6f)
                reflectiveCurveToRelative(6f, 2.69f, 6f, 6f)
                close()
                moveTo(17f, 22f)
                horizontalLineToRelative(-1f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(1f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-1f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(1f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
                moveTo(23.4f, 16.75f)
                lineTo(21.2f, 14.81f)
                curveToRelative(-0.41f, -0.36f, -1.05f, -0.33f, -1.41f, 0.09f)
                curveToRelative(-0.36f, 0.41f, -0.33f, 1.05f, 0.09f, 1.41f)
                lineToRelative(0.78f, 0.69f)
                horizontalLineToRelative(-2.66f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(2.79f)
                lineToRelative(-0.92f, 0.81f)
                curveToRelative(-0.41f, 0.36f, -0.45f, 1.0f, -0.09f, 1.41f)
                curveToRelative(0.37f, 0.42f, 1.0f, 0.45f, 1.41f, 0.09f)
                lineToRelative(2.2f, -1.94f)
                curveToRelative(0.38f, -0.33f, 0.6f, -0.81f, 0.6f, -1.31f)
                reflectiveCurveToRelative(-0.22f, -0.98f, -0.6f, -1.3f)
                close()
                moveTo(11f, 15f)
                curveToRelative(0f, -0.26f, 0.04f, -0.5f, 0.08f, -0.75f)
                curveToRelative(-0.67f, -0.16f, -1.36f, -0.25f, -2.08f, -0.25f)
                curveToRelative(-4.96f, 0f, -9f, 4.04f, -9f, 9f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(11.03f)
                curveToRelative(-0.64f, -0.84f, -1.03f, -1.87f, -1.03f, -3f)
                close()
            }
        }.also { _UserLogout = it}
