package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Towel: ImageVector? = null

val Icons.Bs.Towel: ImageVector
    get() = _Towel ?: UXIcon(name = "Towel") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17f, 14f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                horizontalLineToRelative(-12.5f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(15f)
                verticalLineToRelative(-14f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-9f)
                verticalLineToRelative(-2f)
                close()
                moveTo(19f, 19f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-9f)
                verticalLineToRelative(-2f)
                close()
                moveTo(18f, 3f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                close()
                moveTo(5f, 3.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(8.63f)
                curveToRelative(-0.08f, 0.32f, -0.13f, 0.66f, -0.13f, 1f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(-9f)
                close()
            }
        }.also { _Towel = it}
