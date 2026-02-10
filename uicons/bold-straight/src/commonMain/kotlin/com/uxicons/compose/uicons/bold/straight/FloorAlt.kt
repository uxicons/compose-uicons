package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FloorAlt: ImageVector? = null

val Icons.Bs.FloorAlt: ImageVector
    get() = _FloorAlt ?: UXIcon(name = "FloorAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.5f, 5f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                lineTo(3.5f, 0f)
                curveTo(1.57f, 0f, 0f, 1.57f, 0f, 3.5f)
                verticalLineToRelative(15.5f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(19f)
                verticalLineToRelative(-15.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(3f, 10.41f)
                lineToRelative(4.5f, -4.5f)
                lineToRelative(2.09f, 2.09f)
                lineToRelative(-6.59f, 6.59f)
                verticalLineToRelative(-4.17f)
                close()
                moveTo(16f, 8.59f)
                lineToRelative(-4.75f, 4.75f)
                lineToRelative(-2.09f, -2.09f)
                lineToRelative(6.84f, -6.84f)
                verticalLineToRelative(4.17f)
                close()
                moveTo(11f, 6.59f)
                lineToRelative(-2.09f, -2.09f)
                lineToRelative(1.5f, -1.5f)
                horizontalLineToRelative(4.17f)
                lineToRelative(-3.59f, 3.59f)
                close()
                moveTo(7.75f, 12.66f)
                lineToRelative(2.09f, 2.09f)
                lineToRelative(-1.25f, 1.25f)
                horizontalLineToRelative(-4.17f)
                lineToRelative(3.34f, -3.34f)
                close()
                moveTo(16f, 11.41f)
                verticalLineToRelative(4.59f)
                horizontalLineToRelative(-4.59f)
                lineToRelative(4.59f, -4.59f)
                close()
                moveTo(3.5f, 3f)
                horizontalLineToRelative(4.09f)
                lineTo(3f, 7.59f)
                lineTo(3f, 3.5f)
                curveToRelative(0f, -0.28f, 0.23f, -0.5f, 0.5f, -0.5f)
                close()
                moveTo(21f, 21f)
                horizontalLineToRelative(-13f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(11f)
                verticalLineToRelative(-11f)
                horizontalLineToRelative(1.5f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(12.5f)
                close()
            }
        }.also { _FloorAlt = it}
