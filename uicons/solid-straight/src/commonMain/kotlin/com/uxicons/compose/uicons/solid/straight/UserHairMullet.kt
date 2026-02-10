package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserHairMullet: ImageVector? = null

val Icons.Ss.UserHairMullet: ImageVector
    get() = _UserHairMullet ?: UXIcon(name = "UserHairMullet") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(6.35f, 8.02f)
                curveToRelative(-0.23f, -0.63f, -0.35f, -1.31f, -0.35f, -2.02f)
                horizontalLineToRelative(2.5f)
                curveToRelative(2.41f, 0f, 4.57f, -1.29f, 5.78f, -3.28f)
                curveToRelative(-0.56f, -0.39f, -1.23f, -0.62f, -1.94f, -0.69f)
                curveToRelative(-0.88f, 1.2f, -2.28f, 1.97f, -3.84f, 1.97f)
                horizontalLineToRelative(-2.15f)
                curveToRelative(0.95f, -2.69f, 3.76f, -4.5f, 6.88f, -3.88f)
                curveToRelative(2.19f, 0.44f, 4.0f, 2.13f, 4.56f, 4.29f)
                curveToRelative(0.33f, 1.25f, 0.25f, 2.45f, -0.11f, 3.51f)
                curveToRelative(-0.33f, 0.96f, 0.26f, 2.06f, 1.28f, 2.07f)
                horizontalLineToRelative(0.04f)
                reflectiveCurveToRelative(-1f, 2f, -3f, 2f)
                curveToRelative(-0.81f, 0f, -1.46f, -0.14f, -1.99f, -0.35f)
                curveToRelative(-0.63f, 0.22f, -1.3f, 0.35f, -2.01f, 0.35f)
                reflectiveCurveToRelative(-1.38f, -0.13f, -2.01f, -0.35f)
                curveToRelative(-0.53f, 0.21f, -1.19f, 0.35f, -1.99f, 0.35f)
                curveToRelative(-2f, 0f, -3f, -2f, -3f, -2f)
                horizontalLineToRelative(0.04f)
                curveToRelative(0.98f, -0.02f, 1.65f, -1.06f, 1.32f, -1.98f)
                close()
                moveTo(16f, 14f)
                horizontalLineToRelative(-8f)
                curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                close()
            }
        }.also { _UserHairMullet = it}
