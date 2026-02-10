package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserCowboy: ImageVector? = null

val Icons.Sc.UserCowboy: ImageVector
    get() = _UserCowboy ?: UXIcon(name = "UserCowboy") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19.99f, 21.85f)
                curveToRelative(0.04f, 0.29f, -0.04f, 0.58f, -0.23f, 0.8f)
                curveToRelative(-0.19f, 0.22f, -0.47f, 0.35f, -0.77f, 0.35f)
                horizontalLineToRelative(-13.97f)
                curveToRelative(-0.29f, 0f, -0.57f, -0.13f, -0.77f, -0.35f)
                curveToRelative(-0.19f, -0.22f, -0.28f, -0.51f, -0.23f, -0.8f)
                curveToRelative(0.59f, -4.0f, 3.13f, -5.86f, 7.99f, -5.86f)
                reflectiveCurveToRelative(7.4f, 1.86f, 7.99f, 5.85f)
                close()
                moveTo(22.88f, 3.92f)
                curveToRelative(-0.32f, -0.76f, -1.19f, -1.13f, -1.96f, -0.81f)
                curveToRelative(-0.03f, 0.01f, -1.98f, 0.81f, -4.54f, 1.36f)
                curveToRelative(-0.63f, -1.77f, -1.62f, -3.48f, -2.44f, -3.48f)
                curveToRelative(-0.52f, 0f, -1.15f, 0.09f, -1.94f, 0.68f)
                curveToRelative(-0.79f, -0.58f, -1.42f, -0.68f, -1.94f, -0.68f)
                curveToRelative(-0.82f, 0f, -1.81f, 1.71f, -2.44f, 3.48f)
                curveToRelative(-2.56f, -0.55f, -4.51f, -1.35f, -4.54f, -1.36f)
                curveToRelative(-0.77f, -0.32f, -1.64f, 0.05f, -1.96f, 0.81f)
                reflectiveCurveToRelative(0.04f, 1.64f, 0.81f, 1.96f)
                curveToRelative(0.21f, 0.09f, 5.14f, 2.12f, 10.08f, 2.12f)
                reflectiveCurveToRelative(9.87f, -2.03f, 10.08f, -2.12f)
                curveToRelative(0.77f, -0.32f, 1.13f, -1.2f, 0.81f, -1.96f)
                close()
                moveTo(16.97f, 9.5f)
                curveToRelative(-1.55f, 0.29f, -3.26f, 0.5f, -4.97f, 0.5f)
                reflectiveCurveToRelative(-3.42f, -0.21f, -4.97f, -0.5f)
                curveToRelative(0.16f, 3.05f, 1.74f, 4.5f, 4.97f, 4.5f)
                reflectiveCurveToRelative(4.81f, -1.45f, 4.97f, -4.5f)
                close()
            }
        }.also { _UserCowboy = it}
