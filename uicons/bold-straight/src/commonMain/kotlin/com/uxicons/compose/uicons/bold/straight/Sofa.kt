package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Sofa: ImageVector? = null

val Icons.Bs.Sofa: ImageVector
    get() = _Sofa ?: UXIcon(name = "Sofa") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23f, 8f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0f, -3.03f, -2.47f, -5.5f, -5.5f, -5.5f)
                horizontalLineToRelative(-7f)
                curveTo(5.47f, 0f, 3f, 2.47f, 3f, 5.5f)
                verticalLineToRelative(2.5f)
                lineTo(1f, 8f)
                verticalLineToRelative(13f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-13f)
                close()
                moveTo(20f, 18f)
                lineTo(4f, 18f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(2f)
                close()
                moveTo(6f, 5.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(7f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                verticalLineToRelative(7.5f)
                lineTo(6f, 13f)
                verticalLineToRelative(-7.5f)
                close()
            }
        }.also { _Sofa = it}
