package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserMask: ImageVector? = null

val Icons.Rs.UserMask: ImageVector
    get() = _UserMask ?: UXIcon(name = "UserMask") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 20.5f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-9f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0f, -2.48f, 2.02f, -4.5f, 4.5f, -4.5f)
                horizontalLineToRelative(9f)
                curveToRelative(2.48f, 0f, 4.5f, 2.02f, 4.5f, 4.5f)
                close()
                moveTo(6.02f, 10.62f)
                curveToRelative(-0.64f, -1.06f, -1.02f, -2.29f, -1.02f, -3.62f)
                curveToRelative(0f, -3.86f, 3.14f, -7f, 7f, -7f)
                reflectiveCurveToRelative(7f, 3.14f, 7f, 7f)
                curveToRelative(0f, 1.32f, -0.38f, 2.56f, -1.02f, 3.62f)
                curveToRelative(-0.04f, -0.76f, -0.17f, -1.39f, -0.34f, -1.9f)
                curveToRelative(-0.54f, 0.42f, -1.14f, 0.79f, -1.78f, 1.02f)
                curveToRelative(0.08f, 0.35f, 0.14f, 0.77f, 0.14f, 1.26f)
                curveToRelative(-0.12f, 2.14f, -0.53f, 2.29f, -1f, 3.0f)
                horizontalLineToRelative(-6.0f)
                curveToRelative(-0.47f, -0.71f, -0.88f, -0.86f, -1f, -3.0f)
                curveToRelative(0f, -0.49f, 0.06f, -0.91f, 0.14f, -1.26f)
                curveToRelative(-0.65f, -0.23f, -1.25f, -0.61f, -1.78f, -1.02f)
                curveToRelative(-0.17f, 0.52f, -0.3f, 1.15f, -0.34f, 1.9f)
                close()
                moveTo(14f, 11.0f)
                curveToRelative(0f, -0.43f, -0.06f, -0.77f, -0.14f, -1.0f)
                horizontalLineToRelative(-3.73f)
                curveToRelative(-0.07f, 0.23f, -0.13f, 0.56f, -0.13f, 1.0f)
                reflectiveCurveToRelative(0.06f, 0.77f, 0.14f, 1.0f)
                horizontalLineToRelative(3.73f)
                curveToRelative(0.07f, -0.23f, 0.14f, -0.56f, 0.14f, -1.0f)
                close()
                moveTo(7.03f, 6.66f)
                curveToRelative(0.9f, 0.84f, 1.8f, 1.34f, 2.47f, 1.34f)
                horizontalLineToRelative(5f)
                curveToRelative(0.66f, 0f, 1.56f, -0.49f, 2.47f, -1.34f)
                curveToRelative(-0.18f, -2.6f, -2.32f, -4.66f, -4.97f, -4.66f)
                reflectiveCurveToRelative(-4.79f, 2.07f, -4.97f, 4.66f)
                close()
            }
        }.also { _UserMask = it}
