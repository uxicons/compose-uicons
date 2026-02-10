package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Loveseat: ImageVector? = null

val Icons.Bs.Loveseat: ImageVector
    get() = _Loveseat ?: UXIcon(name = "Loveseat") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 7f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0f, -3.03f, -2.47f, -5.5f, -5.5f, -5.5f)
                lineTo(7.5f, 1f)
                curveToRelative(-3.03f, 0f, -5.5f, 2.47f, -5.5f, 5.5f)
                verticalLineToRelative(0.5f)
                lineTo(0f, 7f)
                verticalLineToRelative(14f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                lineTo(24f, 7f)
                close()
                moveTo(10.5f, 18f)
                lineTo(3f, 18f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(6f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(1.5f)
                close()
                moveTo(9f, 12f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-5.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(9f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                verticalLineToRelative(5.5f)
                horizontalLineToRelative(-4f)
                curveToRelative(-1.15f, 0f, -2.2f, 0.43f, -3f, 1.15f)
                curveToRelative(-0.8f, -0.71f, -1.85f, -1.15f, -3f, -1.15f)
                close()
                moveTo(13.5f, 16.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-7.5f)
                verticalLineToRelative(-1.5f)
                close()
            }
        }.also { _Loveseat = it}
