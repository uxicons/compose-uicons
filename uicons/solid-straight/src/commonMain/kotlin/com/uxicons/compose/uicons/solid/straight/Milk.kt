package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Milk: ImageVector? = null

val Icons.Ss.Milk: ImageVector
    get() = _Milk ?: UXIcon(name = "Milk") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19f, 4f)
                lineTo(4f, 4f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                horizontalLineToRelative(11f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                verticalLineToRelative(2f)
                close()
                moveTo(13f, 12f)
                lineTo(1f, 12f)
                verticalLineToRelative(9f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(10.03f)
                curveToRelative(-0.64f, -0.84f, -1.03f, -1.87f, -1.03f, -3f)
                verticalLineToRelative(-9f)
                close()
                moveTo(16.32f, 6f)
                lineTo(3.71f, 6f)
                lineToRelative(-2.59f, 4f)
                horizontalLineToRelative(11.98f)
                lineToRelative(3.22f, -4f)
                close()
                moveTo(19f, 6f)
                lineToRelative(-4f, 4.88f)
                verticalLineToRelative(10.12f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(2f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                verticalLineToRelative(-10.49f)
                lineToRelative(-4f, -4.51f)
                close()
            }
        }.also { _Milk = it}
