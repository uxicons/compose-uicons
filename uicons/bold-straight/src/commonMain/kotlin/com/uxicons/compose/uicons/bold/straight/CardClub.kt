package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CardClub: ImageVector? = null

val Icons.Bs.CardClub: ImageVector
    get() = _CardClub ?: UXIcon(name = "CardClub") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17.5f, 0f)
                lineTo(6.5f, 0f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(20.5f)
                horizontalLineToRelative(18f)
                lineTo(21f, 3.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(18f, 21f)
                lineTo(6f, 21f)
                lineTo(6f, 3.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(11f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(17.5f)
                close()
                moveTo(16f, 13f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                curveToRelative(-0.55f, 0f, -1.04f, -0.22f, -1.4f, -0.58f)
                curveToRelative(0.3f, 0.99f, 0.73f, 1.9f, 1.4f, 2.58f)
                horizontalLineToRelative(-4f)
                curveToRelative(0.67f, -0.67f, 1.11f, -1.58f, 1.4f, -2.58f)
                curveToRelative(-0.36f, 0.36f, -0.86f, 0.58f, -1.4f, 0.58f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                curveToRelative(0.1f, 0f, 0.2f, 0.01f, 0.29f, 0.03f)
                curveToRelative(-0.18f, -0.3f, -0.29f, -0.65f, -0.29f, -1.03f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                curveToRelative(0f, 0.38f, -0.11f, 0.73f, -0.29f, 1.03f)
                curveToRelative(0.1f, -0.01f, 0.19f, -0.03f, 0.29f, -0.03f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                close()
            }
        }.also { _CardClub = it}
