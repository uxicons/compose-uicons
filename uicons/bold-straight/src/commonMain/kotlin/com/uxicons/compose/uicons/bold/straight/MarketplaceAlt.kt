package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MarketplaceAlt: ImageVector? = null

val Icons.Bs.MarketplaceAlt: ImageVector
    get() = _MarketplaceAlt ?: UXIcon(name = "MarketplaceAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19.5f, 11f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(11.74f, 3f)
                horizontalLineToRelative(-1.74f)
                lineTo(10f, 0f)
                horizontalLineToRelative(2.16f)
                curveToRelative(1.19f, 0f, 2.21f, 0.84f, 2.45f, 2f)
                horizontalLineToRelative(9.44f)
                lineToRelative(-2.51f, 8f)
                horizontalLineToRelative(-6.48f)
                curveToRelative(-1.22f, 0f, -2.26f, -0.87f, -2.46f, -2.08f)
                lineToRelative(-0.85f, -4.92f)
                close()
                moveTo(15.13f, 5f)
                lineToRelative(0.35f, 2f)
                horizontalLineToRelative(3.85f)
                lineToRelative(0.63f, -2f)
                horizontalLineToRelative(-4.83f)
                close()
                moveTo(13f, 12.5f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                close()
                moveTo(3f, 5f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-3f)
                lineTo(3f, 2f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(14f)
                horizontalLineToRelative(10.5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(11f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(10.5f)
                verticalLineToRelative(-3f)
                lineTo(3f, 16f)
                lineTo(3f, 5f)
                close()
            }
        }.also { _MarketplaceAlt = it}
