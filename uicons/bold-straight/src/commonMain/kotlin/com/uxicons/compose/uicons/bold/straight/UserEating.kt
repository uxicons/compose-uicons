package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserEating: ImageVector? = null

val Icons.Bs.UserEating: ImageVector
    get() = _UserEating ?: UXIcon(name = "UserEating") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 0.6f)
                lineTo(24f, 12f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2.75f)
                curveToRelative(-1.14f, -1.41f, -1.53f, -2.83f, -1.5f, -4.12f)
                curveToRelative(0.1f, -2.49f, 1.46f, -4.26f, 2.28f, -4.94f)
                curveToRelative(0.47f, -0.4f, 1.21f, -0.1f, 1.22f, 0.41f)
                close()
                moveTo(2.5f, 7f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(2f)
                lineTo(4.5f, 7f)
                horizontalLineToRelative(0.2f)
                curveToRelative(1.27f, 0f, 2.3f, -1.03f, 2.3f, -2.3f)
                lineTo(7f, 0f)
                horizontalLineToRelative(-1.6f)
                lineTo(5.4f, 4.7f)
                curveToRelative(0f, 0.39f, -0.31f, 0.7f, -0.7f, 0.7f)
                horizontalLineToRelative(-0.4f)
                lineTo(4.3f, 0f)
                horizontalLineToRelative(-1.6f)
                lineTo(2.7f, 5.4f)
                horizontalLineToRelative(-0.4f)
                curveToRelative(-0.39f, 0f, -0.7f, -0.31f, -0.7f, -0.7f)
                lineTo(1.6f, 0f)
                lineTo(0f, 0f)
                lineTo(0f, 4.7f)
                curveToRelative(0f, 1.27f, 1.03f, 2.3f, 2.3f, 2.3f)
                horizontalLineToRelative(0.2f)
                close()
                moveTo(21f, 16.47f)
                lineToRelative(-1.43f, -1.78f)
                curveToRelative(-0.86f, -1.07f, -2.14f, -1.69f, -3.51f, -1.69f)
                horizontalLineToRelative(-6.12f)
                curveToRelative(-1.37f, 0f, -2.64f, 0.61f, -3.5f, 1.67f)
                lineToRelative(-1.43f, 1.77f)
                verticalLineToRelative(-2.45f)
                lineTo(2f, 14f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(2.37f)
                lineToRelative(2.63f, -3.25f)
                verticalLineToRelative(5.25f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-8f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-5.22f)
                lineToRelative(2.58f, 3.22f)
                horizontalLineToRelative(2.42f)
                lineTo(24f, 14f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(2.47f)
                close()
                moveTo(13f, 11f)
                curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
                reflectiveCurveToRelative(-1.79f, -4f, -4f, -4f)
                reflectiveCurveToRelative(-4f, 1.79f, -4f, 4f)
                reflectiveCurveToRelative(1.79f, 4f, 4f, 4f)
                close()
            }
        }.also { _UserEating = it}
