package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MarketplaceAlt: ImageVector? = null

val Icons.Ts.MarketplaceAlt: ImageVector
    get() = _MarketplaceAlt ?: UXIcon(name = "MarketplaceAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15f, 10f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                close()
                moveTo(19f, 11f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                close()
                moveTo(11.23f, 1f)
                horizontalLineToRelative(-1.73f)
                lineTo(9.5f, 0f)
                horizontalLineToRelative(1.73f)
                curveToRelative(0.98f, 0f, 1.81f, 0.7f, 1.97f, 1.67f)
                lineToRelative(0.06f, 0.33f)
                horizontalLineToRelative(10.8f)
                lineToRelative(-2.2f, 7f)
                horizontalLineToRelative(-6.75f)
                curveToRelative(-0.98f, 0f, -1.81f, -0.7f, -1.97f, -1.67f)
                lineToRelative(-0.93f, -5.5f)
                curveToRelative(-0.08f, -0.48f, -0.5f, -0.83f, -0.99f, -0.83f)
                close()
                moveTo(13.43f, 3f)
                lineToRelative(0.7f, 4.17f)
                curveToRelative(0.08f, 0.48f, 0.49f, 0.83f, 0.98f, 0.83f)
                horizontalLineToRelative(6.01f)
                lineToRelative(1.57f, -5f)
                horizontalLineToRelative(-9.27f)
                close()
                moveTo(23.0f, 19f)
                lineTo(1f, 19f)
                lineTo(1f, 5.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(8.06f)
                lineToRelative(-0.17f, -1f)
                lineTo(2.5f, 3f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(14.5f)
                horizontalLineToRelative(11.5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-4.5f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-4.5f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(11.5f)
                verticalLineToRelative(-8f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(7f)
                close()
            }
        }.also { _MarketplaceAlt = it}
