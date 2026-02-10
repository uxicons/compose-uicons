package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserHairBuns: ImageVector? = null

val Icons.Rs.UserHairBuns: ImageVector
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
                curveToRelative(-0.42f, 0f, -0.8f, 0.17f, -1.07f, 0.46f)
                curveToRelative(-0.96f, -2.04f, -3.03f, -3.46f, -5.43f, -3.46f)
                reflectiveCurveToRelative(-4.47f, 1.42f, -5.43f, 3.46f)
                curveToRelative(-0.27f, -0.28f, -0.65f, -0.46f, -1.07f, -0.46f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                close()
                moveTo(12f, 10f)
                curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
                curveToRelative(0f, -0.35f, 0.06f, -0.68f, 0.14f, -1f)
                horizontalLineToRelative(1.86f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(1.86f)
                curveToRelative(0.08f, 0.32f, 0.14f, 0.65f, 0.14f, 1f)
                curveToRelative(0f, 2.21f, -1.79f, 4f, -4f, 4f)
                close()
                moveTo(21f, 19f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                horizontalLineToRelative(-8f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -2.76f, 2.24f, -5f, 5f, -5f)
                horizontalLineToRelative(8f)
                curveToRelative(2.76f, 0f, 5f, 2.24f, 5f, 5f)
                close()
            }
        }.also { _UserHairBuns = it}
