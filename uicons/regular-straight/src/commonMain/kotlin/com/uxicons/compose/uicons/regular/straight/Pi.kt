package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Pi: ImageVector? = null

val Icons.Rs.Pi: ImageVector
    get() = _Pi ?: UXIcon(name = "Pi") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18f, 2f)
                verticalLineToRelative(18f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                horizontalLineToRelative(2f)
                curveToRelative(0f, 2.21f, -1.79f, 4f, -4f, 4f)
                reflectiveCurveToRelative(-4f, -1.79f, -4f, -4f)
                verticalLineTo(2f)
                horizontalLineToRelative(-7f)
                verticalLineToRelative(13.87f)
                curveToRelative(0f, 4.98f, -3.18f, 8.0f, -3.32f, 8.12f)
                lineToRelative(-1.36f, -1.47f)
                curveToRelative(0.02f, -0.02f, 2.68f, -2.57f, 2.68f, -6.66f)
                verticalLineTo(2f)
                horizontalLineToRelative(-0.5f)
                curveToRelative(-1.3f, 0f, -2.3f, 0.37f, -3.05f, 1.12f)
                curveToRelative(-1.44f, 1.45f, -1.45f, 3.85f, -1.45f, 3.88f)
                lineToRelative(-2f, 0.02f)
                curveToRelative(0f, -0.13f, -0.01f, -3.24f, 2.02f, -5.29f)
                curveTo(3.15f, 0.58f, 4.66f, 0f, 6.5f, 0f)
                horizontalLineToRelative(17.5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-6f)
                close()
            }
        }.also { _Pi = it}
