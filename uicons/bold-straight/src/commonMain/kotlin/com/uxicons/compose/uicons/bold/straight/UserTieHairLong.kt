package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserTieHairLong: ImageVector? = null

val Icons.Bs.UserTieHairLong: ImageVector
    get() = _UserTieHairLong ?: UXIcon(name = "UserTieHairLong") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 19.5f)
                verticalLineToRelative(4.5f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-4.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-1.49f)
                lineToRelative(-1.23f, 1.84f)
                lineToRelative(1.22f, 5.16f)
                horizontalLineToRelative(-4f)
                lineToRelative(1.22f, -5.16f)
                lineToRelative(-1.23f, -1.84f)
                horizontalLineToRelative(-1.49f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(4.5f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-4.5f)
                curveToRelative(0f, -3.03f, 2.47f, -5.5f, 5.5f, -5.5f)
                horizontalLineToRelative(7f)
                curveToRelative(3.03f, 0f, 5.5f, 2.47f, 5.5f, 5.5f)
                close()
                moveTo(12f, 12f)
                curveToRelative(0.84f, 0f, 1.63f, -0.18f, 2.35f, -0.49f)
                lineToRelative(-0.53f, -3.08f)
                curveToRelative(-0.5f, 0.4f, -1.26f, 0.58f, -1.83f, 0.58f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                curveToRelative(3f, 0f, 4f, -1.5f, 4.85f, -2.42f)
                curveToRelative(0.86f, 0.58f, 1.51f, 1.53f, 1.67f, 2.63f)
                lineToRelative(0.98f, 5.79f)
                horizontalLineToRelative(0.49f)
                curveToRelative(0.97f, 0f, 1.89f, 0.2f, 2.72f, 0.55f)
                lineToRelative(-1.24f, -6.82f)
                reflectiveCurveToRelative(0f, 0f, 0f, 0f)
                curveToRelative(-0.5f, -3.27f, -3.27f, -5.73f, -6.48f, -5.73f)
                reflectiveCurveToRelative(-5.98f, 2.46f, -6.47f, 5.73f)
                lineToRelative(-1.24f, 6.82f)
                curveToRelative(0.83f, -0.35f, 1.73f, -0.55f, 2.68f, -0.55f)
                curveToRelative(0f, 0f, 3.39f, -0.0f, 5.03f, -0.0f)
                close()
            }
        }.also { _UserTieHairLong = it}
