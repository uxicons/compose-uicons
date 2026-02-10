package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserHairMullet: ImageVector? = null

val Icons.Bs.UserHairMullet: ImageVector
    get() = _UserHairMullet ?: UXIcon(name = "UserHairMullet") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 19.5f)
                verticalLineToRelative(4.5f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-4.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-7f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(4.5f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-4.5f)
                curveToRelative(0f, -3.03f, 2.47f, -5.5f, 5.5f, -5.5f)
                horizontalLineToRelative(7f)
                curveToRelative(3.03f, 0f, 5.5f, 2.47f, 5.5f, 5.5f)
                close()
                moveTo(6.82f, 9.02f)
                curveToRelative(-0.52f, -0.89f, -0.82f, -1.92f, -0.82f, -3.02f)
                curveToRelative(0f, -3.31f, 2.69f, -6f, 6f, -6f)
                reflectiveCurveToRelative(6f, 2.69f, 6f, 6f)
                curveToRelative(0f, 1.09f, -0.3f, 2.11f, -0.81f, 2.99f)
                curveToRelative(0.42f, 0.55f, 1.0f, 1.01f, 1.81f, 1.01f)
                curveToRelative(0f, 0f, -1f, 2f, -3f, 2f)
                curveToRelative(-0.8f, 0f, -1.46f, -0.14f, -1.99f, -0.35f)
                curveToRelative(-0.63f, 0.22f, -1.3f, 0.35f, -2.01f, 0.35f)
                reflectiveCurveToRelative(-1.38f, -0.13f, -2.01f, -0.35f)
                curveToRelative(-0.53f, 0.21f, -1.19f, 0.35f, -1.99f, 0.35f)
                curveToRelative(-2f, 0f, -3f, -2f, -3f, -2f)
                curveToRelative(0.81f, 0f, 1.4f, -0.45f, 1.82f, -0.98f)
                close()
                moveTo(15f, 6f)
                curveToRelative(0f, -1.0f, -0.5f, -1.89f, -1.26f, -2.43f)
                curveToRelative(-0.87f, 1.45f, -2.45f, 2.43f, -4.26f, 2.43f)
                curveToRelative(-0.16f, 0f, -0.32f, -0.03f, -0.47f, -0.05f)
                curveToRelative(0f, 0.02f, -0.01f, 0.03f, -0.01f, 0.05f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                reflectiveCurveToRelative(3f, -1.35f, 3f, -3f)
                close()
            }
        }.also { _UserHairMullet = it}
