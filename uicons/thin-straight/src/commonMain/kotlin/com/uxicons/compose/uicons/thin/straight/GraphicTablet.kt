package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GraphicTablet: ImageVector? = null

val Icons.Ts.GraphicTablet: ImageVector
    get() = _GraphicTablet ?: UXIcon(name = "GraphicTablet") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.5f, 4f)
                lineTo(2f, 4f)
                verticalLineToRelative(7.5f)
                lineTo(0f, 11.5f)
                verticalLineToRelative(1f)
                lineTo(2f, 12.5f)
                verticalLineToRelative(7.5f)
                lineTo(21.5f, 20f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                lineTo(24f, 6.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(7f, 19f)
                lineTo(3f, 19f)
                verticalLineToRelative(-6.5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-1f)
                lineTo(3f, 11.5f)
                lineTo(3f, 5f)
                lineTo(7f, 5f)
                verticalLineToRelative(14f)
                close()
                moveTo(23f, 17.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                lineTo(8f, 19f)
                lineTo(8f, 5f)
                horizontalLineToRelative(13.5f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(11f)
                close()
            }
        }.also { _GraphicTablet = it}
