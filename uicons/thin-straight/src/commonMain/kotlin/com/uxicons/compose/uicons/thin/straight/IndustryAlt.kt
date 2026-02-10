package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _IndustryAlt: ImageVector? = null

val Icons.Ts.IndustryAlt: ImageVector
    get() = _IndustryAlt ?: UXIcon(name = "IndustryAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(11f, 20f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(4f)
                close()
                moveTo(12f, 17f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                close()
                moveTo(21f, 16f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-4f)
                close()
                moveTo(20f, 19f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                close()
                moveTo(16f, 11.1f)
                verticalLineToRelative(-5f)
                lineToRelative(-8f, 5.0f)
                lineTo(8f, 1f)
                horizontalLineToRelative(1f)
                lineTo(9f, 0f)
                lineTo(0f, 0f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(20.5f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(18f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                lineTo(24f, 6.1f)
                lineToRelative(-8f, 5f)
                close()
                moveTo(23f, 21.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                lineTo(3.5f, 23f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                lineTo(2f, 1f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(19f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-7.72f)
                lineToRelative(7f, -4.37f)
                verticalLineToRelative(5f)
                lineToRelative(8f, -5f)
                verticalLineToRelative(13.6f)
                close()
            }
        }.also { _IndustryAlt = it}
