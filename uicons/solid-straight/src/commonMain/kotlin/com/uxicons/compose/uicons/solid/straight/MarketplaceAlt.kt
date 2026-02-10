package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MarketplaceAlt: ImageVector? = null

val Icons.Ss.MarketplaceAlt: ImageVector
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
                moveTo(13.08f, 7.34f)
                curveToRelative(0.16f, 0.96f, 0.99f, 1.66f, 1.97f, 1.66f)
                horizontalLineToRelative(6.68f)
                lineToRelative(2.2f, -7f)
                horizontalLineToRelative(-9.74f)
                lineToRelative(-0.06f, -0.34f)
                curveToRelative(-0.17f, -0.96f, -0.99f, -1.66f, -1.97f, -1.66f)
                horizontalLineToRelative(-2.16f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2.16f)
                lineToRelative(0.92f, 5.34f)
                close()
                moveTo(24f, 20f)
                verticalLineToRelative(-8.5f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                curveToRelative(-1.28f, 0f, -2.39f, -0.7f, -3f, -1.73f)
                curveToRelative(-0.61f, 1.03f, -1.72f, 1.73f, -3f, 1.73f)
                curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
                curveToRelative(0f, -0.84f, 0.31f, -1.59f, 0.8f, -2.2f)
                curveToRelative(-0.34f, -0.47f, -0.58f, -1.02f, -0.69f, -1.63f)
                lineToRelative(-0.64f, -3.67f)
                horizontalLineToRelative(-2.48f)
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
                close()
            }
        }.also { _MarketplaceAlt = it}
