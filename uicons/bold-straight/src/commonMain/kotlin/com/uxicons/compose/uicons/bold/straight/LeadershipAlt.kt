package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LeadershipAlt: ImageVector? = null

val Icons.Bs.LeadershipAlt: ImageVector
    get() = _LeadershipAlt ?: UXIcon(name = "LeadershipAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(4f, 12f)
                curveToRelative(1.66f, 0f, 3f, 1.34f, 3f, 3f)
                reflectiveCurveToRelative(-1.34f, 3f, -3f, 3f)
                reflectiveCurveToRelative(-3f, -1.34f, -3f, -3f)
                reflectiveCurveToRelative(1.34f, -3f, 3f, -3f)
                close()
                moveTo(9f, 15f)
                curveToRelative(0f, 1.66f, 1.34f, 3f, 3f, 3f)
                reflectiveCurveToRelative(3f, -1.34f, 3f, -3f)
                reflectiveCurveToRelative(-1.34f, -3f, -3f, -3f)
                reflectiveCurveToRelative(-3f, 1.34f, -3f, 3f)
                close()
                moveTo(12.13f, 6f)
                curveToRelative(1.66f, 0f, 3f, -1.34f, 3f, -3f)
                reflectiveCurveToRelative(-1.34f, -3f, -3f, -3f)
                reflectiveCurveToRelative(-3f, 1.34f, -3f, 3f)
                reflectiveCurveToRelative(1.34f, 3f, 3f, 3f)
                close()
                moveTo(21.5f, 20f)
                horizontalLineToRelative(-3f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-3f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-3f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(17f, 15f)
                curveToRelative(0f, 1.66f, 1.34f, 3f, 3f, 3f)
                reflectiveCurveToRelative(3f, -1.34f, 3f, -3f)
                reflectiveCurveToRelative(-1.34f, -3f, -3f, -3f)
                reflectiveCurveToRelative(-3f, 1.34f, -3f, 3f)
                close()
                moveTo(8f, 10f)
                verticalLineToRelative(2.03f)
                curveToRelative(0.91f, -1.22f, 2.36f, -2.03f, 4f, -2.03f)
                reflectiveCurveToRelative(3.09f, 0.8f, 4f, 2.03f)
                verticalLineToRelative(-2.03f)
                horizontalLineToRelative(0.06f)
                lineToRelative(7.42f, -6.36f)
                lineToRelative(-1.95f, -2.28f)
                lineToRelative(-6.58f, 5.64f)
                horizontalLineToRelative(-5.89f)
                lineTo(2.48f, 1.36f)
                lineTo(0.52f, 3.64f)
                lineToRelative(7.42f, 6.36f)
                horizontalLineToRelative(0.06f)
                close()
            }
        }.also { _LeadershipAlt = it}
