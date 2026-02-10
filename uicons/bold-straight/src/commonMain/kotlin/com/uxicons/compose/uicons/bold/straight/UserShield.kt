package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserShield: ImageVector? = null

val Icons.Bs.UserShield: ImageVector
    get() = _UserShield ?: UXIcon(name = "UserShield") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(8f, 0f)
                curveTo(4.69f, 0f, 2f, 2.69f, 2f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                reflectiveCurveToRelative(6f, -2.69f, 6f, -6f)
                reflectiveCurveTo(11.31f, 0f, 8f, 0f)
                close()
                moveTo(8f, 9f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                reflectiveCurveToRelative(1.35f, -3f, 3f, -3f)
                reflectiveCurveToRelative(3f, 1.35f, 3f, 3f)
                reflectiveCurveToRelative(-1.35f, 3f, -3f, 3f)
                close()
                moveTo(5f, 14f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-6f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(5f)
                lineTo(0f, 24f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -2.76f, 2.24f, -5f, 5f, -5f)
                close()
                moveTo(22.36f, 11.7f)
                lineToRelative(-3.86f, -1.28f)
                lineToRelative(-3.86f, 1.28f)
                curveToRelative(-0.98f, 0.32f, -1.64f, 1.23f, -1.64f, 2.27f)
                verticalLineToRelative(3.48f)
                curveToRelative(0f, 3.52f, 3.56f, 5.58f, 4.65f, 6.12f)
                lineToRelative(0.78f, 0.39f)
                lineToRelative(0.81f, -0.33f)
                curveToRelative(1.11f, -0.45f, 4.75f, -2.22f, 4.75f, -6.19f)
                verticalLineToRelative(-3.48f)
                curveToRelative(0f, -1.03f, -0.66f, -1.94f, -1.64f, -2.27f)
                close()
                moveTo(21f, 17.44f)
                curveToRelative(0f, 1.74f, -1.54f, 2.76f, -2.44f, 3.21f)
                curveToRelative(-0.88f, -0.51f, -2.56f, -1.69f, -2.56f, -3.21f)
                verticalLineToRelative(-3.03f)
                lineToRelative(2.5f, -0.83f)
                lineToRelative(2.5f, 0.83f)
                verticalLineToRelative(3.03f)
                close()
            }
        }.also { _UserShield = it}
