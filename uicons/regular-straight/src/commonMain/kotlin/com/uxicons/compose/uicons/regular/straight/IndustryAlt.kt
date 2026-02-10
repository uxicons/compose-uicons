package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _IndustryAlt: ImageVector? = null

val Icons.Rs.IndustryAlt: ImageVector
    get() = _IndustryAlt ?: UXIcon(name = "IndustryAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16f, 10.2f)
                verticalLineToRelative(-5f)
                lineToRelative(-8f, 5f)
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
                lineToRelative(-8f, 5f)
                close()
                moveTo(22f, 21f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                lineTo(4f, 22f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                lineTo(3f, 2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(17f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-6.45f)
                lineToRelative(6f, -3.75f)
                verticalLineToRelative(5f)
                lineToRelative(8f, -5f)
                verticalLineToRelative(12.2f)
                close()
                moveTo(11f, 16f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-3f)
                close()
                moveTo(19f, 19f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3f)
                close()
            }
        }.also { _IndustryAlt = it}
