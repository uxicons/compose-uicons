package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ConfirmedUser: ImageVector? = null

val Icons.Ss.ConfirmedUser: ImageVector
    get() = _ConfirmedUser ?: UXIcon(name = "ConfirmedUser") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10.5f, 9f)
                curveToRelative(0.43f, 0f, 0.82f, 0.19f, 1.09f, 0.48f)
                curveToRelative(-0.52f, 0.9f, -1.48f, 1.52f, -2.59f, 1.52f)
                reflectiveCurveToRelative(-2.08f, -0.62f, -2.59f, -1.52f)
                curveToRelative(0.27f, -0.29f, 0.66f, -0.48f, 1.09f, -0.48f)
                close()
                moveTo(9f, 8f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                close()
                moveTo(24f, 18f)
                curveToRelative(0f, 3.31f, -2.69f, 6f, -6f, 6f)
                reflectiveCurveToRelative(-6f, -2.69f, -6f, -6f)
                reflectiveCurveToRelative(2.69f, -6f, 6f, -6f)
                reflectiveCurveToRelative(6f, 2.69f, 6f, 6f)
                close()
                moveTo(22.23f, 16.8f)
                lineTo(20.82f, 15.38f)
                lineTo(17.21f, 19f)
                lineTo(15.19f, 16.99f)
                lineTo(13.78f, 18.4f)
                lineTo(15.79f, 20.41f)
                curveToRelative(0.38f, 0.38f, 0.88f, 0.59f, 1.41f, 0.59f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.53f, 0f, 1.04f, -0.21f, 1.41f, -0.59f)
                close()
                moveTo(12.72f, 24f)
                horizontalLineToRelative(-12.72f)
                verticalLineToRelative(-21f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(12f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(7f)
                curveToRelative(-3.73f, 0f, -6.85f, 2.55f, -7.74f, 6f)
                horizontalLineToRelative(-6.26f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(6f)
                curveToRelative(0f, 2.39f, 1.06f, 4.53f, 2.72f, 6f)
                close()
                moveTo(4f, 8f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                reflectiveCurveToRelative(5f, -2.24f, 5f, -5f)
                reflectiveCurveToRelative(-2.24f, -5f, -5f, -5f)
                reflectiveCurveToRelative(-5f, 2.24f, -5f, 5f)
                close()
            }
        }.also { _ConfirmedUser = it}
