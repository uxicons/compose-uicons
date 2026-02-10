package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserHairBuns: ImageVector? = null

val Icons.Sr.UserHairBuns: ImageVector
    get() = _UserHairBuns ?: UXIcon(name = "UserHairBuns") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20f, 24f)
                horizontalLineToRelative(-16f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                curveToRelative(0f, -4.96f, 4.04f, -9f, 9f, -9f)
                reflectiveCurveToRelative(9f, 4.04f, 9f, 9f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                close()
                moveTo(5.54f, 9.06f)
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
                moveTo(9.54f, 4.06f)
                curveToRelative(0.83f, 0f, 1.51f, -0.6f, 1.95f, -1.23f)
                curveToRelative(0.27f, -0.38f, 0.83f, -0.38f, 1.1f, 0f)
                curveToRelative(0.44f, 0.63f, 1.12f, 1.23f, 1.95f, 1.23f)
                horizontalLineToRelative(2.59f)
                curveToRelative(-0.06f, 0.16f, -0.09f, 0.32f, -0.09f, 0.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-3f)
                curveToRelative(-0.77f, 0f, -1.47f, -0.29f, -2f, -0.77f)
                curveToRelative(-0.53f, 0.48f, -1.23f, 0.77f, -2f, 0.77f)
                horizontalLineToRelative(-3f)
                reflectiveCurveToRelative(-0.04f, -1.84f, -0.09f, -2f)
                horizontalLineToRelative(2.59f)
                close()
            }
        }.also { _UserHairBuns = it}
