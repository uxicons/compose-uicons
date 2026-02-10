package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HandBackPointRibbon: ImageVector? = null

val Icons.Sr.HandBackPointRibbon: ImageVector
    get() = _HandBackPointRibbon ?: UXIcon(name = "HandBackPointRibbon") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 7f)
                lineTo(3.43f, 7f)
                curveToRelative(-0.41f, 0f, -0.56f, -0.37f, -0.27f, -0.66f)
                lineToRelative(1.31f, -0.84f)
                lineToRelative(-1.32f, -0.81f)
                curveToRelative(-0.29f, -0.29f, -0.13f, -0.69f, 0.28f, -0.69f)
                lineTo(12f, 4f)
                verticalLineToRelative(3f)
                close()
                moveTo(12f, 2f)
                horizontalLineToRelative(0f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                horizontalLineToRelative(0f)
                reflectiveCurveToRelative(4f, 0f, 4f, 0f)
                close()
                moveTo(17.98f, 10.38f)
                lineToRelative(-5.98f, -1.38f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(8f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-7f)
                reflectiveCurveToRelative(-2.79f, 3.3f, -2.79f, 3.3f)
                curveToRelative(-1.7f, 1.99f, -1.59f, 4.94f, 0.25f, 6.79f)
                lineToRelative(2.4f, 2.42f)
                curveToRelative(0.94f, 0.94f, 2.22f, 1.48f, 3.55f, 1.48f)
                horizontalLineToRelative(7.59f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                verticalLineToRelative(-3.72f)
                curveToRelative(0f, -2.38f, -1.68f, -4.43f, -4.02f, -4.9f)
                close()
            }
        }.also { _HandBackPointRibbon = it}
