package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BowlScoop: ImageVector? = null

val Icons.Bs.BowlScoop: ImageVector
    get() = _BowlScoop ?: UXIcon(name = "BowlScoop") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 13f)
                lineToRelative(-1.36f, 3.5f)
                curveToRelative(-1.49f, 2.48f, -4.03f, 2.55f, -6.84f, 2.52f)
                curveToRelative(-0.29f, -0.0f, -1.35f, -0.01f, -2.3f, -0.01f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(3f)
                horizontalLineTo(7f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(-2.0f)
                curveToRelative(-0.94f, 0.0f, -2.01f, 0.01f, -2.3f, 0.01f)
                curveToRelative(-2.82f, 0.04f, -5.35f, -0.03f, -6.84f, -2.52f)
                lineToRelative(-1.36f, -3.5f)
                horizontalLineToRelative(24f)
                close()
                moveTo(12f, 3f)
                curveToRelative(4.41f, 0f, 8f, 3.59f, 8f, 8f)
                horizontalLineToRelative(3f)
                curveTo(23f, 4.93f, 18.07f, 0f, 12f, 0f)
                reflectiveCurveTo(1f, 4.93f, 1f, 11f)
                horizontalLineToRelative(3f)
                curveToRelative(0f, -4.41f, 3.59f, -8f, 8f, -8f)
                close()
            }
        }.also { _BowlScoop = it}
