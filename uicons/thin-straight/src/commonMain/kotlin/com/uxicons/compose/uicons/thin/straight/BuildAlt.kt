package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BuildAlt: ImageVector? = null

val Icons.Ts.BuildAlt: ImageVector
    get() = _BuildAlt ?: UXIcon(name = "BuildAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.5f, 0f)
                horizontalLineToRelative(-8.5f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(11f)
                lineTo(24f, 2.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(23f, 6f)
                horizontalLineToRelative(-9f)
                lineTo(14f, 1f)
                horizontalLineToRelative(7.5f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(3.5f)
                close()
                moveTo(8f, 5f)
                lineTo(2.5f, 5f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(16.5f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-13f)
                lineTo(8f, 11f)
                verticalLineToRelative(-6f)
                close()
                moveTo(1f, 7.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(4.5f)
                verticalLineToRelative(5f)
                lineTo(1f, 11f)
                verticalLineToRelative(-3.5f)
                close()
                moveTo(1f, 18f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(5f)
                lineTo(1f, 23f)
                verticalLineToRelative(-5f)
                close()
                moveTo(16f, 18f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(8f)
                close()
                moveTo(17f, 23f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-6f)
                close()
                moveTo(23f, 17f)
                horizontalLineToRelative(-10.5f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(10.5f)
                verticalLineToRelative(5f)
                close()
                moveTo(11.5f, 12f)
                verticalLineToRelative(5f)
                lineTo(1f, 17f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(10.5f)
                close()
            }
        }.also { _BuildAlt = it}
