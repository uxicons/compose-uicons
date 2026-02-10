package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FireHydrant: ImageVector? = null

val Icons.Rs.FireHydrant: ImageVector
    get() = _FireHydrant ?: UXIcon(name = "FireHydrant") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13.5f, 13.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                close()
                moveTo(18f, 15f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                lineTo(4f, 24f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -2.97f, 2.17f, -5.44f, 5f, -5.92f)
                lineTo(11f, 0f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2.08f)
                curveToRelative(2.83f, 0.48f, 5f, 2.95f, 5f, 5.92f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-2f)
                close()
                moveTo(8f, 8f)
                horizontalLineToRelative(8f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                reflectiveCurveToRelative(-4f, 1.79f, -4f, 4f)
                close()
                moveTo(16f, 22f)
                verticalLineToRelative(-12f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(8f)
                close()
            }
        }.also { _FireHydrant = it}
