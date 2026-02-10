package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BuildAlt: ImageVector? = null

val Icons.Sr.BuildAlt: ImageVector
    get() = _BuildAlt ?: UXIcon(name = "BuildAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22f, 6f)
                horizontalLineToRelative(-7f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                horizontalLineToRelative(5f)
                curveToRelative(2.21f, 0f, 4f, 1.79f, 4f, 4f)
                horizontalLineToRelative(0f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                close()
                moveTo(7f, 8f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                horizontalLineToRelative(-1f)
                curveTo(1.79f, 2f, 0f, 3.79f, 0f, 6f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(7f)
                close()
                moveTo(8f, 24f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(6f)
                close()
                moveTo(18f, 18f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(2f)
                curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-6f)
                close()
                moveTo(6f, 18f)
                lineTo(0f, 18f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-6f)
                close()
                moveTo(11f, 10f)
                lineTo(0f, 10f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(11f)
                verticalLineToRelative(-6f)
                close()
                moveTo(13f, 10f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(11f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                horizontalLineToRelative(-9f)
                close()
            }
        }.also { _BuildAlt = it}
