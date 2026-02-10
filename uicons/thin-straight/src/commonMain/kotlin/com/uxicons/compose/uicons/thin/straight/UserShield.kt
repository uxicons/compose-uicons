package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserShield: ImageVector? = null

val Icons.Ts.UserShield: ImageVector
    get() = _UserShield ?: UXIcon(name = "UserShield") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(8f, 0f)
                curveTo(4.69f, 0f, 2f, 2.69f, 2f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                reflectiveCurveToRelative(6f, -2.69f, 6f, -6f)
                reflectiveCurveTo(11.31f, 0f, 8f, 0f)
                close()
                moveTo(8f, 11f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                reflectiveCurveTo(5.24f, 1f, 8f, 1f)
                reflectiveCurveToRelative(5f, 2.24f, 5f, 5f)
                reflectiveCurveToRelative(-2.24f, 5f, -5f, 5f)
                close()
                moveTo(5f, 14f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-6f)
                curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
                verticalLineToRelative(5f)
                lineTo(0f, 24f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -2.76f, 2.24f, -5f, 5f, -5f)
                close()
                moveTo(22.29f, 11.49f)
                lineToRelative(-3.79f, -1.25f)
                lineToRelative(-3.79f, 1.25f)
                curveToRelative(-1.02f, 0.34f, -1.71f, 1.29f, -1.71f, 2.37f)
                verticalLineToRelative(3.53f)
                curveToRelative(0f, 3.61f, 3.87f, 5.83f, 5.05f, 6.42f)
                lineToRelative(0.42f, 0.21f)
                lineToRelative(0.44f, -0.18f)
                curveToRelative(1.19f, -0.48f, 5.08f, -2.36f, 5.08f, -6.46f)
                verticalLineToRelative(-3.53f)
                curveToRelative(0f, -1.08f, -0.69f, -2.03f, -1.71f, -2.37f)
                close()
                moveTo(23f, 17.39f)
                curveToRelative(0f, 3.47f, -3.41f, 5.11f, -4.45f, 5.53f)
                lineToRelative(-0.02f, 0.01f)
                lineToRelative(-0.02f, -0.01f)
                curveToRelative(-1.06f, -0.53f, -4.5f, -2.49f, -4.5f, -5.53f)
                verticalLineToRelative(-3.53f)
                curveToRelative(0f, -0.65f, 0.41f, -1.22f, 1.03f, -1.42f)
                lineToRelative(3.47f, -1.15f)
                lineToRelative(3.47f, 1.15f)
                curveToRelative(0.61f, 0.2f, 1.03f, 0.78f, 1.03f, 1.42f)
                verticalLineToRelative(3.53f)
                close()
            }
        }.also { _UserShield = it}
