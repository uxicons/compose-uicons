package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserHairBuns: ImageVector? = null

val Icons.Ss.UserHairBuns: ImageVector
    get() = _UserHairBuns ?: UXIcon(name = "UserHairBuns") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(5.5f, 9f)
                curveToRelative(0.42f, 0f, 0.8f, -0.17f, 1.07f, -0.46f)
                curveToRelative(0.96f, 2.04f, 3.03f, 3.46f, 5.43f, 3.46f)
                reflectiveCurveToRelative(4.47f, -1.42f, 5.43f, -3.46f)
                curveToRelative(0.27f, 0.28f, 0.65f, 0.46f, 1.07f, 0.46f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                curveToRelative(-0.43f, 0f, -0.81f, 0.18f, -1.09f, 0.47f)
                curveToRelative(-0.96f, -2.04f, -3.01f, -3.47f, -5.41f, -3.47f)
                reflectiveCurveToRelative(-4.46f, 1.43f, -5.41f, 3.47f)
                curveToRelative(-0.27f, -0.29f, -0.66f, -0.47f, -1.09f, -0.47f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                close()
                moveTo(9.5f, 4f)
                curveToRelative(1.5f, 0f, 2.5f, -1.95f, 2.5f, -2.5f)
                curveToRelative(0f, 0.55f, 1f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(2.59f)
                curveToRelative(-0.06f, 0.16f, -0.09f, 0.32f, -0.09f, 0.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-3f)
                curveToRelative(-0.77f, 0f, -1.47f, -0.29f, -2f, -0.77f)
                curveToRelative(-0.53f, 0.48f, -1.23f, 0.77f, -2f, 0.77f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -0.18f, -0.04f, -0.34f, -0.09f, -0.5f)
                close()
                moveTo(21f, 19f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-18f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -2.76f, 2.24f, -5f, 5f, -5f)
                horizontalLineToRelative(8f)
                curveToRelative(2.76f, 0f, 5f, 2.24f, 5f, 5f)
                close()
            }
        }.also { _UserHairBuns = it}
