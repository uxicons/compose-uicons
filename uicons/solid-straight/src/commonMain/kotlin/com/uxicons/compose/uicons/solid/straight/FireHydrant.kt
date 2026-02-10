package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FireHydrant: ImageVector? = null

val Icons.Ss.FireHydrant: ImageVector
    get() = _FireHydrant ?: UXIcon(name = "FireHydrant") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18f, 8f)
                lineTo(6f, 8f)
                curveToRelative(0f, -2.97f, 2.17f, -5.44f, 5f, -5.92f)
                lineTo(11f, 0f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2.08f)
                curveToRelative(2.83f, 0.48f, 5f, 2.95f, 5f, 5.92f)
                close()
                moveTo(18f, 16f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                lineTo(4f, 24f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-2f)
                close()
                moveTo(13.5f, 14.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                close()
            }
        }.also { _FireHydrant = it}
