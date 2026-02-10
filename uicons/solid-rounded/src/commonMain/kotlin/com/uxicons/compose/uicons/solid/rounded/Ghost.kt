package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Ghost: ImageVector? = null

val Icons.Sr.Ghost: ImageVector
    get() = _Ghost ?: UXIcon(name = "Ghost") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 0f)
                curveTo(6.49f, 0f, 2f, 4.49f, 2f, 10f)
                verticalLineToRelative(13f)
                curveToRelative(0f, 0.49f, 0.35f, 0.9f, 0.83f, 0.99f)
                curveToRelative(0.48f, 0.08f, 0.95f, -0.19f, 1.11f, -0.65f)
                curveToRelative(0.26f, -0.75f, 1.17f, -1.33f, 2.06f, -1.33f)
                reflectiveCurveToRelative(1.79f, 0.58f, 2.06f, 1.33f)
                curveToRelative(0.14f, 0.4f, 0.52f, 0.67f, 0.94f, 0.67f)
                reflectiveCurveToRelative(0.8f, -0.27f, 0.94f, -0.67f)
                curveToRelative(0.26f, -0.75f, 1.17f, -1.33f, 2.06f, -1.33f)
                reflectiveCurveToRelative(1.79f, 0.58f, 2.06f, 1.33f)
                curveToRelative(0.14f, 0.4f, 0.52f, 0.67f, 0.94f, 0.67f)
                reflectiveCurveToRelative(0.8f, -0.27f, 0.94f, -0.67f)
                curveToRelative(0.26f, -0.75f, 1.17f, -1.33f, 2.06f, -1.33f)
                reflectiveCurveToRelative(1.79f, 0.58f, 2.06f, 1.33f)
                curveToRelative(0.14f, 0.41f, 0.53f, 0.67f, 0.94f, 0.67f)
                curveToRelative(0.06f, 0f, 0.11f, -0.0f, 0.17f, -0.01f)
                curveToRelative(0.48f, -0.08f, 0.83f, -0.5f, 0.83f, -0.99f)
                verticalLineToRelative(-13f)
                curveTo(22f, 4.49f, 17.51f, 0f, 12f, 0f)
                close()
                moveTo(8.5f, 12f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(15.5f, 12f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }.also { _Ghost = it}
