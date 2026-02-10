package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Sofa: ImageVector? = null

val Icons.Ss.Sofa: ImageVector
    get() = _Sofa ?: UXIcon(name = "Sofa") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(2f, 7f)
                verticalLineToRelative(-1f)
                curveTo(2f, 2.69f, 4.69f, 0f, 8f, 0f)
                horizontalLineToRelative(8f)
                curveToRelative(3.31f, 0f, 6f, 2.69f, 6f, 6f)
                verticalLineToRelative(1f)
                curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
                verticalLineToRelative(2f)
                lineTo(6f, 13f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                close()
                moveTo(22f, 9f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-5f)
                lineTo(6f, 15f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-9f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                lineTo(0f, 9f)
                verticalLineToRelative(13f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-13f)
                horizontalLineToRelative(-2f)
                close()
            }
        }.also { _Sofa = it}
