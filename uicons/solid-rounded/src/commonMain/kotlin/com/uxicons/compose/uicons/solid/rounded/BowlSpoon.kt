package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BowlSpoon: ImageVector? = null

val Icons.Sr.BowlSpoon: ImageVector
    get() = _BowlSpoon ?: UXIcon(name = "BowlSpoon") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(6.29f, 8f)
                curveToRelative(1.97f, 0f, 3.62f, -1.28f, 4.1f, -3f)
                horizontalLineToRelative(12.61f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-12.61f)
                curveToRelative(-0.47f, -1.72f, -2.12f, -3f, -4.1f, -3f)
                curveTo(4.13f, 0f, 0f, 1.56f, 0f, 4f)
                reflectiveCurveToRelative(4.13f, 4f, 6.29f, 4f)
                close()
                moveTo(23.33f, 12.5f)
                curveToRelative(-0.71f, -0.95f, -1.81f, -1.5f, -3.0f, -1.5f)
                lineTo(3.67f, 11f)
                curveToRelative(-1.19f, 0f, -2.28f, 0.55f, -3.0f, 1.5f)
                curveToRelative(-0.72f, 0.96f, -0.94f, 2.17f, -0.6f, 3.33f)
                curveToRelative(0.65f, 2.23f, 1.83f, 4.25f, 3.42f, 5.83f)
                curveToRelative(1.5f, 1.49f, 3.61f, 2.35f, 5.8f, 2.35f)
                horizontalLineToRelative(5.41f)
                curveToRelative(2.19f, 0f, 4.31f, -0.85f, 5.8f, -2.35f)
                curveToRelative(1.58f, -1.58f, 2.77f, -3.59f, 3.42f, -5.83f)
                curveToRelative(0.34f, -1.16f, 0.12f, -2.37f, -0.6f, -3.33f)
                close()
            }
        }.also { _BowlSpoon = it}
