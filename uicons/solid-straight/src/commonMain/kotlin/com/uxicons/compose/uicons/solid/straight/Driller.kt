package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Driller: ImageVector? = null

val Icons.Ss.Driller: ImageVector
    get() = _Driller ?: UXIcon(name = "Driller") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13f, 22.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-13f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(8f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                close()
                moveTo(20f, 5f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-2f)
                close()
                moveTo(15f, 10.22f)
                lineTo(12.86f, 12f)
                horizontalLineToRelative(-3.03f)
                lineToRelative(-0.71f, 6f)
                horizontalLineToRelative(-6.4f)
                lineToRelative(0.71f, -6.01f)
                curveToRelative(-1.9f, -0.04f, -3.44f, -1.58f, -3.44f, -3.49f)
                verticalLineToRelative(-4.5f)
                curveToRelative(0f, -2.12f, 1.71f, -4f, 4f, -4f)
                horizontalLineToRelative(8.86f)
                lineToRelative(2.14f, 1.78f)
                verticalLineToRelative(8.44f)
                close()
                moveTo(11f, 7f)
                horizontalLineToRelative(-7f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(7f)
                close()
                moveTo(11f, 3f)
                horizontalLineToRelative(-7f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(7f)
                close()
            }
        }.also { _Driller = it}
