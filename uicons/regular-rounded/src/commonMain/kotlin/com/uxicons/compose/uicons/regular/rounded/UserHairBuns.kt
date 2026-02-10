package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserHairBuns: ImageVector? = null

val Icons.Rr.UserHairBuns: ImageVector
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
                moveTo(21f, 23f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                curveToRelative(0f, -3.86f, -3.14f, -7f, -7f, -7f)
                reflectiveCurveToRelative(-7f, 3.14f, -7f, 7f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                curveToRelative(0f, -4.96f, 4.04f, -9f, 9f, -9f)
                reflectiveCurveToRelative(9f, 4.04f, 9f, 9f)
                close()
            }
        }.also { _UserHairBuns = it}
