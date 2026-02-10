package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Sofa: ImageVector? = null

val Icons.Ts.Sofa: ImageVector
    get() = _Sofa ?: UXIcon(name = "Sofa") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 8f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0f, -3.03f, -2.47f, -5.5f, -5.5f, -5.5f)
                lineTo(7.5f, 0f)
                curveTo(4.47f, 0f, 2f, 2.47f, 2f, 5.5f)
                verticalLineToRelative(2.5f)
                lineTo(0f, 8f)
                verticalLineToRelative(14f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-14f)
                close()
                moveTo(4f, 21f)
                lineTo(1f, 21f)
                verticalLineToRelative(-12f)
                horizontalLineToRelative(1.5f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(10.5f)
                close()
                moveTo(5f, 21f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(7f)
                lineTo(5f, 21f)
                close()
                moveTo(19f, 10.5f)
                verticalLineToRelative(2.5f)
                lineTo(5f, 13f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0f, -1.21f, -0.86f, -2.22f, -2f, -2.45f)
                verticalLineToRelative(-2.55f)
                curveTo(3f, 3.02f, 5.02f, 1f, 7.5f, 1f)
                horizontalLineToRelative(9f)
                curveToRelative(2.48f, 0f, 4.5f, 2.02f, 4.5f, 4.5f)
                verticalLineToRelative(2.55f)
                curveToRelative(-1.14f, 0.23f, -2f, 1.24f, -2f, 2.45f)
                close()
                moveTo(23f, 21f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-10.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(12f)
                close()
            }
        }.also { _Sofa = it}
