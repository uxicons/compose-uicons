package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Driller: ImageVector? = null

val Icons.Rs.Driller: ImageVector
    get() = _Driller ?: UXIcon(name = "Driller") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(4f, 4f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-7f)
                close()
                moveTo(4f, 9f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-7f)
                close()
                moveTo(24f, 7.5f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(-3.54f)
                lineToRelative(-3.6f, 3f)
                horizontalLineToRelative(-3.15f)
                lineToRelative(-0.59f, 5f)
                horizontalLineToRelative(0.88f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-13f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -1.56f, 1.2f, -2.83f, 2.73f, -2.97f)
                lineToRelative(0.6f, -5.1f)
                curveToRelative(-1.88f, -0.32f, -3.33f, -1.96f, -3.33f, -3.93f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -2.12f, 1.71f, -4f, 4f, -4f)
                horizontalLineToRelative(8.86f)
                lineToRelative(3.6f, 3f)
                horizontalLineToRelative(3.54f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(4f)
                close()
                moveTo(10f, 20f)
                horizontalLineToRelative(-7f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                close()
                moveTo(7.7f, 13f)
                horizontalLineToRelative(-2.37f)
                lineToRelative(-0.59f, 5f)
                horizontalLineToRelative(2.37f)
                close()
                moveTo(14f, 9.45f)
                verticalLineToRelative(-5.9f)
                lineToRelative(-1.86f, -1.55f)
                horizontalLineToRelative(-8.14f)
                curveToRelative(-1.08f, 0f, -2f, 0.88f, -2f, 2f)
                verticalLineToRelative(5f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(8.14f)
                close()
                moveTo(18f, 5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(2f)
                close()
            }
        }.also { _Driller = it}
