package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserHeadset: ImageVector? = null

val Icons.Ss.UserHeadset: ImageVector
    get() = _UserHeadset ?: UXIcon(name = "UserHeadset") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 21.5f)
                verticalLineToRelative(2.5f)
                lineTo(3f, 24f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0f, -2.48f, 2.02f, -4.5f, 4.5f, -4.5f)
                horizontalLineToRelative(9f)
                curveToRelative(2.48f, 0f, 4.5f, 2.02f, 4.5f, 4.5f)
                close()
                moveTo(6.87f, 4.03f)
                curveToRelative(1.53f, -1.43f, 3.53f, -2.14f, 5.63f, -2.01f)
                curveToRelative(3.92f, 0.25f, 7.0f, 3.67f, 7.0f, 7.77f)
                curveToRelative(0f, 1.77f, -1.44f, 3.21f, -3.21f, 3.21f)
                horizontalLineToRelative(-2.41f)
                curveToRelative(-0.24f, -0.83f, -1.0f, -1.44f, -1.91f, -1.44f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                curveToRelative(0.54f, 0f, 1.02f, -0.21f, 1.38f, -0.56f)
                horizontalLineToRelative(2.93f)
                curveToRelative(2.87f, 0f, 5.21f, -2.34f, 5.21f, -5.21f)
                curveTo(21.5f, 4.63f, 17.6f, 0.34f, 12.63f, 0.02f)
                curveToRelative(-2.66f, -0.17f, -5.19f, 0.73f, -7.13f, 2.55f)
                curveToRelative(-1.79f, 1.68f, -2.86f, 4.0f, -2.99f, 6.43f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.12f, -1.9f, 0.95f, -3.65f, 2.35f, -4.97f)
                close()
                moveTo(15.1f, 11f)
                horizontalLineToRelative(1.37f)
                curveToRelative(0.5f, 0f, 0.94f, -0.37f, 1.0f, -0.87f)
                curveToRelative(0.07f, -0.59f, 0.04f, -1.2f, -0.09f, -1.83f)
                curveToRelative(-0.44f, -2.08f, -2.13f, -3.76f, -4.21f, -4.18f)
                curveToRelative(-3.54f, -0.73f, -6.66f, 1.97f, -6.66f, 5.38f)
                curveToRelative(0f, 1.47f, 0.58f, 2.81f, 1.52f, 3.79f)
                curveToRelative(0f, 0f, 0f, 0f, 0f, 0f)
                curveToRelative(0.11f, -2.11f, 1.84f, -3.79f, 3.98f, -3.79f)
                curveToRelative(1.26f, 0f, 2.37f, 0.59f, 3.1f, 1.5f)
                close()
            }
        }.also { _UserHeadset = it}
