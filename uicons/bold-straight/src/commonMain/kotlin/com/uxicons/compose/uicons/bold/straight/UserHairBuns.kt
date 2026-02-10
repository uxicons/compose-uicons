package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserHairBuns: ImageVector? = null

val Icons.Bs.UserHairBuns: ImageVector
    get() = _UserHairBuns ?: UXIcon(name = "UserHairBuns") {
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
                moveTo(4f, 7.5f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                curveToRelative(0.42f, 0f, 0.8f, 0.17f, 1.07f, 0.46f)
                curveToRelative(0.96f, -2.04f, 3.03f, -3.46f, 5.43f, -3.46f)
                reflectiveCurveToRelative(4.47f, 1.42f, 5.43f, 3.46f)
                curveToRelative(0.27f, -0.28f, 0.65f, -0.46f, 1.07f, -0.46f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                curveToRelative(-0.42f, 0f, -0.8f, -0.17f, -1.07f, -0.46f)
                curveToRelative(-0.96f, 2.04f, -3.03f, 3.46f, -5.43f, 3.46f)
                reflectiveCurveToRelative(-4.47f, -1.42f, -5.43f, -3.46f)
                curveToRelative(-0.27f, 0.28f, -0.65f, 0.46f, -1.07f, 0.46f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                close()
                moveTo(15f, 6f)
                curveToRelative(0f, -0.35f, -0.07f, -0.69f, -0.18f, -1f)
                horizontalLineToRelative(-0.82f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                horizontalLineToRelative(-0.82f)
                curveToRelative(-0.11f, 0.31f, -0.18f, 0.65f, -0.18f, 1f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                reflectiveCurveToRelative(3f, -1.35f, 3f, -3f)
                close()
            }
        }.also { _UserHairBuns = it}
