package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MarketplaceAlt: ImageVector? = null

val Icons.Rs.MarketplaceAlt: ImageVector
    get() = _MarketplaceAlt ?: UXIcon(name = "MarketplaceAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14.5f, 10f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(20.5f, 10f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(12.16f, 2f)
                horizontalLineToRelative(-2.16f)
                lineTo(10f, 0f)
                horizontalLineToRelative(2.16f)
                curveToRelative(0.98f, 0f, 1.8f, 0.7f, 1.97f, 1.66f)
                lineToRelative(0.06f, 0.34f)
                horizontalLineToRelative(9.74f)
                lineToRelative(-2.2f, 7f)
                horizontalLineToRelative(-6.68f)
                curveToRelative(-0.98f, 0f, -1.81f, -0.7f, -1.97f, -1.66f)
                lineToRelative(-0.92f, -5.34f)
                close()
                moveTo(14.53f, 4f)
                lineToRelative(0.52f, 3f)
                horizontalLineToRelative(5.21f)
                lineToRelative(0.94f, -3f)
                horizontalLineToRelative(-6.67f)
                close()
                moveTo(23.95f, 12f)
                curveToRelative(-0.17f, 1.18f, -0.92f, 2.16f, -1.95f, 2.65f)
                verticalLineToRelative(3.35f)
                lineTo(2f, 18f)
                lineTo(2f, 5f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-2f)
                lineTo(3f, 2f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(15f)
                horizontalLineToRelative(11f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(11f)
                verticalLineToRelative(-8f)
                horizontalLineToRelative(-0.05f)
                close()
            }
        }.also { _MarketplaceAlt = it}
