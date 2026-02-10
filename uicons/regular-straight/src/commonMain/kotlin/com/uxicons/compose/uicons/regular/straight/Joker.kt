package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Joker: ImageVector? = null

val Icons.Rs.Joker: ImageVector
    get() = _Joker ?: UXIcon(name = "Joker") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 0f)
                lineTo(6f, 0f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                lineTo(3f, 24f)
                lineTo(21f, 24f)
                lineTo(21f, 3f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(19f, 22f)
                lineTo(5f, 22f)
                lineTo(5f, 3f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(12f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                lineTo(19f, 22f)
                close()
                moveTo(18f, 10.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                curveToRelative(-0.33f, 0f, -0.64f, -0.11f, -0.89f, -0.3f)
                curveToRelative(-0.28f, 0.58f, -0.61f, 1.43f, -0.61f, 2.3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -0.86f, -0.33f, -1.72f, -0.61f, -2.3f)
                curveToRelative(-0.25f, 0.18f, -0.55f, 0.3f, -0.89f, 0.3f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                curveToRelative(0f, 0.3f, -0.09f, 0.58f, -0.24f, 0.81f)
                curveToRelative(0.63f, 0.31f, 1.48f, 0.84f, 1.89f, 1.67f)
                curveToRelative(0.27f, -1.08f, 0.81f, -2.34f, 1.12f, -3.01f)
                curveToRelative(-0.72f, -0.11f, -1.27f, -0.73f, -1.27f, -1.48f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                curveToRelative(0f, 0.75f, -0.55f, 1.37f, -1.27f, 1.48f)
                curveToRelative(0.31f, 0.67f, 0.86f, 1.93f, 1.12f, 3.01f)
                curveToRelative(0.41f, -0.83f, 1.26f, -1.37f, 1.89f, -1.67f)
                curveToRelative(-0.15f, -0.23f, -0.24f, -0.51f, -0.24f, -0.81f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                close()
            }
        }.also { _Joker = it}
