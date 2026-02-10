package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserTag: ImageVector? = null

val Icons.Ss.UserTag: ImageVector
    get() = _UserTag ?: UXIcon(name = "UserTag") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(8f, 12f)
                curveToRelative(-3.31f, 0f, -6f, -2.69f, -6f, -6f)
                reflectiveCurveTo(4.69f, 0f, 8f, 0f)
                reflectiveCurveToRelative(6f, 2.69f, 6f, 6f)
                reflectiveCurveToRelative(-2.69f, 6f, -6f, 6f)
                close()
                moveTo(23.17f, 16.11f)
                lineToRelative(-4.75f, -4.76f)
                lineToRelative(-6.44f, 0.85f)
                lineToRelative(-0.5f, 6.27f)
                lineToRelative(4.68f, 4.7f)
                curveToRelative(0.54f, 0.53f, 1.24f, 0.82f, 2.0f, 0.82f)
                curveToRelative(0.0f, 0f, 0.01f, 0f, 0.01f, 0f)
                curveToRelative(0.76f, -0.0f, 1.47f, -0.3f, 2.0f, -0.84f)
                lineToRelative(3.0f, -3.04f)
                curveToRelative(1.09f, -1.1f, 1.08f, -2.9f, -0.01f, -3.99f)
                close()
                moveTo(16f, 17.5f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(9.42f, 19.22f)
                lineToRelative(0.42f, -5.22f)
                horizontalLineToRelative(-5.33f)
                curveToRelative(-2.48f, 0f, -4.5f, 2.02f, -4.5f, 4.5f)
                verticalLineToRelative(5.5f)
                horizontalLineToRelative(14.17f)
                lineToRelative(-4.76f, -4.78f)
                close()
            }
        }.also { _UserTag = it}
