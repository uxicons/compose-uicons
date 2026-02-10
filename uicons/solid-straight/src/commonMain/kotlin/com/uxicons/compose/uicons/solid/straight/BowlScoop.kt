package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BowlScoop: ImageVector? = null

val Icons.Ss.BowlScoop: ImageVector
    get() = _BowlScoop ?: UXIcon(name = "BowlScoop") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(0f, 13f)
                lineToRelative(1.41f, 3.58f)
                curveToRelative(1.56f, 2.49f, 4.35f, 2.46f, 6.79f, 2.43f)
                curveToRelative(0.34f, -0.01f, 1.77f, -0.01f, 2.79f, -0.01f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-3.0f)
                curveToRelative(1.02f, 0.0f, 3.35f, -0.0f, 3.63f, -0.0f)
                curveToRelative(2.23f, 0f, 4.58f, -0.2f, 5.96f, -2.42f)
                lineToRelative(1.41f, -3.58f)
                lineTo(0f, 13.0f)
                close()
                moveTo(1f, 11f)
                curveTo(1f, 4.93f, 5.93f, 0f, 12f, 0f)
                reflectiveCurveToRelative(11f, 4.93f, 11f, 11f)
                lineTo(1f, 11f)
                close()
            }
        }.also { _BowlScoop = it}
