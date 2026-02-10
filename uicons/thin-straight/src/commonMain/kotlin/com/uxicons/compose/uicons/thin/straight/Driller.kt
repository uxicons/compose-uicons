package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Driller: ImageVector? = null

val Icons.Ts.Driller: ImageVector
    get() = _Driller ?: UXIcon(name = "Driller") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(4f, 4f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-7f)
                close()
                moveTo(4f, 8f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-7f)
                close()
                moveTo(24f, 6.5f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(-4.29f)
                lineToRelative(-3f, 3f)
                horizontalLineToRelative(-3.38f)
                lineToRelative(-0.88f, 7f)
                horizontalLineToRelative(1.05f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(-12f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(0.56f)
                lineToRelative(0.88f, -7f)
                horizontalLineToRelative(-0.43f)
                curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(9.2f)
                lineToRelative(3.07f, 3f)
                horizontalLineToRelative(4.22f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(1f)
                close()
                moveTo(9.5f, 20f)
                horizontalLineToRelative(-7f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(8.32f, 12f)
                horizontalLineToRelative(-3.38f)
                lineToRelative(-0.88f, 7f)
                horizontalLineToRelative(3.38f)
                close()
                moveTo(15f, 8.29f)
                verticalLineToRelative(-4.65f)
                lineToRelative(-2.7f, -2.64f)
                horizontalLineToRelative(-8.8f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(5f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(8.79f)
                close()
                moveTo(19f, 4f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(3f)
                close()
            }
        }.also { _Driller = it}
