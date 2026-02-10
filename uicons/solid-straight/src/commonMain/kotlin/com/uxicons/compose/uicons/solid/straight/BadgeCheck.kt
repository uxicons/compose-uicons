package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BadgeCheck: ImageVector? = null

val Icons.Ss.BadgeCheck: ImageVector
    get() = _BadgeCheck ?: UXIcon(name = "BadgeCheck") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 12f)
                curveToRelative(0f, -1.7f, -0.86f, -3.19f, -2.17f, -4.07f)
                curveToRelative(0.3f, -1.55f, -0.15f, -3.21f, -1.35f, -4.41f)
                curveToRelative(-1.2f, -1.2f, -2.86f, -1.65f, -4.41f, -1.35f)
                curveToRelative(-0.88f, -1.31f, -2.38f, -2.17f, -4.07f, -2.17f)
                reflectiveCurveToRelative(-3.19f, 0.86f, -4.07f, 2.17f)
                curveToRelative(-1.55f, -0.3f, -3.21f, 0.15f, -4.41f, 1.35f)
                curveToRelative(-1.2f, 1.2f, -1.65f, 2.86f, -1.35f, 4.41f)
                curveToRelative(-1.31f, 0.88f, -2.17f, 2.38f, -2.17f, 4.07f)
                reflectiveCurveToRelative(0.86f, 3.19f, 2.17f, 4.07f)
                curveToRelative(-0.3f, 1.55f, 0.15f, 3.21f, 1.35f, 4.41f)
                curveToRelative(1.2f, 1.2f, 2.86f, 1.65f, 4.41f, 1.35f)
                curveToRelative(0.88f, 1.31f, 2.38f, 2.17f, 4.07f, 2.17f)
                reflectiveCurveToRelative(3.19f, -0.86f, 4.07f, -2.17f)
                curveToRelative(1.55f, 0.3f, 3.21f, -0.15f, 4.41f, -1.35f)
                curveToRelative(1.2f, -1.2f, 1.65f, -2.86f, 1.35f, -4.41f)
                curveToRelative(1.31f, -0.88f, 2.17f, -2.38f, 2.17f, -4.07f)
                close()
                moveTo(11.91f, 15.42f)
                curveToRelative(-0.39f, 0.39f, -0.9f, 0.58f, -1.41f, 0.58f)
                reflectiveCurveToRelative(-1.02f, -0.2f, -1.42f, -0.58f)
                lineToRelative(-2.78f, -2.7f)
                lineToRelative(1.39f, -1.44f)
                lineToRelative(2.79f, 2.71f)
                lineToRelative(5.81f, -5.7f)
                lineToRelative(1.4f, 1.43f)
                lineToRelative(-5.79f, 5.71f)
                close()
            }
        }.also { _BadgeCheck = it}
