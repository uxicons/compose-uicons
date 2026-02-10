package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SnowmanAlt: ImageVector? = null

val Icons.Ss.SnowmanAlt: ImageVector
    get() = _SnowmanAlt ?: UXIcon(name = "SnowmanAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 9f)
                horizontalLineToRelative(-2.66f)
                lineToRelative(-3.87f, 3.01f)
                curveToRelative(-0.26f, 2.8f, -2.62f, 4.99f, -5.48f, 4.99f)
                reflectiveCurveToRelative(-5.22f, -2.2f, -5.48f, -4.99f)
                lineToRelative(-3.87f, -3.01f)
                lineTo(0f, 9f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2.51f)
                lineToRelative(2.8f, 2.18f)
                curveToRelative(0.2f, -0.56f, 0.48f, -1.09f, 0.85f, -1.56f)
                curveToRelative(1.09f, 1.15f, 2.64f, 1.87f, 4.35f, 1.87f)
                reflectiveCurveToRelative(3.25f, -0.72f, 4.35f, -1.87f)
                curveToRelative(0.37f, 0.47f, 0.65f, 1.0f, 0.85f, 1.56f)
                lineToRelative(2.8f, -2.18f)
                verticalLineToRelative(-2.51f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                close()
                moveTo(12f, 19f)
                curveToRelative(-2.91f, 0f, -5.44f, -1.67f, -6.68f, -4.09f)
                curveToRelative(-0.21f, 0.67f, -0.32f, 1.38f, -0.32f, 2.09f)
                curveToRelative(0f, 3.86f, 3.14f, 7f, 7f, 7f)
                reflectiveCurveToRelative(7f, -3.14f, 7f, -7f)
                curveToRelative(0f, -0.71f, -0.11f, -1.42f, -0.32f, -2.09f)
                curveToRelative(-1.24f, 2.43f, -3.77f, 4.09f, -6.68f, 4.09f)
                close()
                moveTo(12f, 8f)
                curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
                reflectiveCurveTo(14.21f, 0f, 12f, 0f)
                reflectiveCurveToRelative(-4f, 1.79f, -4f, 4f)
                reflectiveCurveToRelative(1.79f, 4f, 4f, 4f)
                close()
            }
        }.also { _SnowmanAlt = it}
