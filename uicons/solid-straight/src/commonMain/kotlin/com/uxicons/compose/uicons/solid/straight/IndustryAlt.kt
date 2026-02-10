package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _IndustryAlt: ImageVector? = null

val Icons.Ss.IndustryAlt: ImageVector
    get() = _IndustryAlt ?: UXIcon(name = "IndustryAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17f, 11.5f)
                verticalLineToRelative(-6.3f)
                lineToRelative(-7f, 5.8f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(-2f)
                lineTo(8f, 2f)
                horizontalLineToRelative(1f)
                lineTo(9f, 0f)
                lineTo(0f, 0f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(19f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(17f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                lineTo(24f, 5.2f)
                lineToRelative(-7f, 6.3f)
                close()
                moveTo(16f, 19f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3f)
                close()
                moveTo(21f, 19f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3f)
                close()
            }
        }.also { _IndustryAlt = it}
