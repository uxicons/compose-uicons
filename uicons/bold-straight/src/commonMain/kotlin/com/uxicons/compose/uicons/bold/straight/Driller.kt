package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Driller: ImageVector? = null

val Icons.Bs.Driller: ImageVector
    get() = _Driller ?: UXIcon(name = "Driller") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 5f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-3.62f)
                lineToRelative(-3.3f, -3f)
                horizontalLineToRelative(-8.58f)
                curveToRelative(-2.48f, 0f, -4.5f, 2.02f, -4.5f, 4.5f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 1.9f, 1.19f, 3.52f, 2.85f, 4.18f)
                lineToRelative(-0.74f, 6.32f)
                curveToRelative(-1.11f, 0f, -2.11f, 0.5f, -2.11f, 2f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(13f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                horizontalLineToRelative(-0.87f)
                lineToRelative(0.71f, -6f)
                horizontalLineToRelative(2.25f)
                lineToRelative(3.3f, -3f)
                horizontalLineToRelative(3.62f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(4f)
                close()
                moveTo(7.11f, 19f)
                horizontalLineToRelative(-1.98f)
                lineToRelative(0.71f, -6f)
                horizontalLineToRelative(1.98f)
                close()
                moveTo(4.5f, 10f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(7.42f)
                lineToRelative(2.08f, 2f)
                verticalLineToRelative(3f)
                lineToRelative(-2.08f, 2f)
                close()
                moveTo(11f, 8f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(6f)
                close()
            }
        }.also { _Driller = it}
