package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BowlScoop: ImageVector? = null

val Icons.Ts.BowlScoop: ImageVector
    get() = _BowlScoop ?: UXIcon(name = "BowlScoop") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(3f, 11f)
                horizontalLineToRelative(-1f)
                curveTo(2f, 5.49f, 6.49f, 1f, 12f, 1f)
                reflectiveCurveToRelative(10f, 4.49f, 10f, 10f)
                horizontalLineToRelative(-1f)
                curveToRelative(0f, -4.96f, -4.04f, -9f, -9f, -9f)
                reflectiveCurveTo(3f, 6.04f, 3f, 11f)
                close()
                moveTo(24.04f, 13f)
                lineToRelative(-1.9f, 3.98f)
                curveToRelative(-1.86f, 3.1f, -3.79f, 3.08f, -6.72f, 3.03f)
                curveToRelative(-0.37f, -0.01f, -2.93f, -0.01f, -2.93f, -0.01f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(4.5f)
                verticalLineToRelative(1f)
                lineTo(7f, 24f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(4.5f)
                verticalLineToRelative(-3.0f)
                reflectiveCurveToRelative(-3.45f, 0.0f, -3.75f, 0.0f)
                curveToRelative(-2.42f, 0f, -4.13f, -0.26f, -5.76f, -2.98f)
                lineTo(0.07f, 13f)
                horizontalLineToRelative(23.97f)
                close()
                moveTo(22.46f, 14f)
                lineTo(1.66f, 14f)
                lineToRelative(1.22f, 2.54f)
                curveToRelative(1.51f, 2.52f, 2.94f, 2.51f, 5.8f, 2.46f)
                curveToRelative(0.38f, -0.01f, 6.39f, -0.01f, 6.76f, 0f)
                curveToRelative(2.86f, 0.04f, 4.29f, 0.06f, 5.83f, -2.5f)
                lineToRelative(1.19f, -2.5f)
                close()
            }
        }.also { _BowlScoop = it}
