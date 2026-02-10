package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LampStreet: ImageVector? = null

val Icons.Sr.LampStreet: ImageVector
    get() = _LampStreet ?: UXIcon(name = "LampStreet") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.94f, 13.79f)
                curveToRelative(-0.74f, -3.64f, -3.83f, -6.35f, -7.52f, -6.74f)
                curveTo(15.83f, 3.0f, 12.38f, 0f, 8.25f, 0f)
                curveTo(3.7f, 0f, 0f, 3.7f, 0f, 8.25f)
                lineToRelative(0.04f, 14.75f)
                curveToRelative(0f, 0.55f, 0.45f, 1.0f, 1f, 1.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.55f, 0f, 1.0f, -0.45f, 1.0f, -1.0f)
                lineToRelative(-0.04f, -14.75f)
                curveToRelative(0f, -3.45f, 2.8f, -6.25f, 6.25f, -6.25f)
                curveToRelative(3.04f, 0f, 5.59f, 2.15f, 6.14f, 5.07f)
                curveToRelative(-3.61f, 0.46f, -6.61f, 3.15f, -7.33f, 6.73f)
                curveToRelative(-0.06f, 0.31f, -0.21f, 1.38f, 0.5f, 2.25f)
                curveToRelative(0.35f, 0.43f, 1.04f, 0.95f, 2.33f, 0.95f)
                horizontalLineToRelative(3.11f)
                verticalLineToRelative(0.5f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.12f, 2.5f, -2.5f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(3.11f)
                curveToRelative(1.05f, 0f, 1.84f, -0.32f, 2.35f, -0.94f)
                curveToRelative(0.68f, -0.84f, 0.56f, -1.86f, 0.48f, -2.27f)
                close()
            }
        }.also { _LampStreet = it}
