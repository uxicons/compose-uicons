package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _IndustryAlt: ImageVector? = null

val Icons.Bs.IndustryAlt: ImageVector
    get() = _IndustryAlt ?: UXIcon(name = "IndustryAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17f, 8.59f)
                lineTo(17f, 3.79f)
                lineToRelative(-8f, 5f)
                lineTo(9f, 3f)
                horizontalLineToRelative(1f)
                lineTo(10f, 0f)
                lineTo(0f, 0f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(17.5f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(16f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                lineTo(24f, 3.58f)
                lineToRelative(-7f, 5f)
                close()
                moveTo(21f, 20.5f)
                curveToRelative(0f, 0.28f, -0.23f, 0.5f, -0.5f, 0.5f)
                lineTo(4.5f, 21f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                lineTo(4f, 3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(16f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-6.67f)
                lineToRelative(5f, -3.12f)
                verticalLineToRelative(5.21f)
                lineToRelative(7f, -5f)
                verticalLineToRelative(11.09f)
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
