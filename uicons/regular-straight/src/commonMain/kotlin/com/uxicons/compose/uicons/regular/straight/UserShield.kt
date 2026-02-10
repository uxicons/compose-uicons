package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserShield: ImageVector? = null

val Icons.Rs.UserShield: ImageVector
    get() = _UserShield ?: UXIcon(name = "UserShield") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(8f, 0f)
                curveTo(4.69f, 0f, 2f, 2.69f, 2f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                reflectiveCurveToRelative(6f, -2.69f, 6f, -6f)
                reflectiveCurveTo(11.31f, 0f, 8f, 0f)
                close()
                moveTo(8f, 10f)
                curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
                reflectiveCurveToRelative(1.79f, -4f, 4f, -4f)
                reflectiveCurveToRelative(4f, 1.79f, 4f, 4f)
                reflectiveCurveToRelative(-1.79f, 4f, -4f, 4f)
                close()
                moveTo(5f, 14f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-6f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(5f)
                lineTo(0f, 24f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -2.76f, 2.24f, -5f, 5f, -5f)
                close()
                moveTo(22.29f, 11.6f)
                lineToRelative(-3.79f, -1.25f)
                lineToRelative(-3.79f, 1.25f)
                curveToRelative(-1.02f, 0.34f, -1.71f, 1.29f, -1.71f, 2.37f)
                verticalLineToRelative(3.43f)
                curveToRelative(0f, 3.57f, 3.71f, 5.7f, 4.85f, 6.27f)
                lineToRelative(0.6f, 0.3f)
                lineToRelative(0.63f, -0.25f)
                curveToRelative(1.15f, -0.46f, 4.92f, -2.29f, 4.92f, -6.32f)
                verticalLineToRelative(-3.43f)
                curveToRelative(0f, -1.08f, -0.69f, -2.03f, -1.71f, -2.37f)
                close()
                moveTo(22f, 17.4f)
                curveToRelative(0f, 2.58f, -2.42f, 3.92f, -3.46f, 4.38f)
                curveToRelative(-0.92f, -0.49f, -3.54f, -2.1f, -3.54f, -4.38f)
                verticalLineToRelative(-3.43f)
                curveToRelative(0f, -0.22f, 0.14f, -0.41f, 0.34f, -0.47f)
                lineToRelative(3.16f, -1.05f)
                lineToRelative(3.16f, 1.05f)
                curveToRelative(0.2f, 0.07f, 0.34f, 0.26f, 0.34f, 0.47f)
                verticalLineToRelative(3.43f)
                close()
            }
        }.also { _UserShield = it}
