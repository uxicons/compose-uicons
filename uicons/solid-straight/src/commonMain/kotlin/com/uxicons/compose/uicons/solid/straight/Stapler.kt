package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Stapler: ImageVector? = null

val Icons.Ss.Stapler: ImageVector
    get() = _Stapler ?: UXIcon(name = "Stapler") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.86f, 7.49f)
                lineToRelative(-16.3f, -4.47f)
                curveToRelative(-1.61f, -0.43f, -3.38f, 0.64f, -3.74f, 2.27f)
                lineToRelative(-0.82f, 3.37f)
                lineToRelative(17f, 4.8f)
                verticalLineToRelative(4.54f)
                horizontalLineToRelative(-17f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-8.48f)
                curveToRelative(0f, -1.9f, -1.29f, -3.55f, -3.14f, -4.01f)
                close()
                moveTo(20.5f, 17f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(15f, 15f)
                horizontalLineToRelative(-13f)
                verticalLineToRelative(-3.79f)
                close()
            }
        }.also { _Stapler = it}
