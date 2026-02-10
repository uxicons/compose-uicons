package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MarketplaceAlt: ImageVector? = null

val Icons.Sr.MarketplaceAlt: ImageVector
    get() = _MarketplaceAlt ?: UXIcon(name = "MarketplaceAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16f, 11.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                close()
                moveTo(19f, 11.5f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                close()
                moveTo(11f, 2f)
                horizontalLineToRelative(0.32f)
                curveToRelative(0.49f, 0f, 0.9f, 0.35f, 0.99f, 0.83f)
                lineToRelative(0.64f, 3.68f)
                curveToRelative(0.25f, 1.44f, 1.49f, 2.49f, 2.96f, 2.49f)
                horizontalLineToRelative(4.43f)
                curveToRelative(1.32f, 0f, 2.47f, -0.84f, 2.86f, -2.1f)
                lineToRelative(0.72f, -2.3f)
                curveToRelative(0.19f, -0.61f, 0.09f, -1.26f, -0.3f, -1.78f)
                curveToRelative(-0.38f, -0.52f, -0.97f, -0.82f, -1.61f, -0.82f)
                horizontalLineToRelative(-7.85f)
                curveToRelative(-0.42f, -1.18f, -1.54f, -2f, -2.83f, -2f)
                horizontalLineToRelative(-0.32f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                close()
                moveTo(20.5f, 15f)
                curveToRelative(-1.28f, 0f, -2.39f, -0.7f, -3f, -1.73f)
                curveToRelative(-0.61f, 1.03f, -1.72f, 1.73f, -3f, 1.73f)
                curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
                curveToRelative(0f, -0.94f, 0.37f, -1.78f, 0.97f, -2.41f)
                curveToRelative(-0.5f, -0.64f, -0.86f, -1.39f, -1.01f, -2.24f)
                lineToRelative(-0.5f, -2.9f)
                curveToRelative(-1.07f, -0.19f, -1.94f, -0.95f, -2.29f, -1.95f)
                horizontalLineToRelative(-3.17f)
                curveTo(2.24f, 2f, 0f, 4.24f, 0f, 7f)
                verticalLineToRelative(8f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-4f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(10f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(6f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                close()
            }
        }.also { _MarketplaceAlt = it}
