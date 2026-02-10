package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BadgePercent: ImageVector? = null

val Icons.Ss.BadgePercent: ImageVector
    get() = _BadgePercent ?: UXIcon(name = "BadgePercent") {
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
                moveTo(8f, 9f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                close()
                moveTo(10.77f, 16f)
                horizontalLineToRelative(-2.33f)
                lineToRelative(4.8f, -8f)
                horizontalLineToRelative(2.33f)
                lineToRelative(-4.8f, 8f)
                close()
                moveTo(15f, 16f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
            }
        }.also { _BadgePercent = it}
