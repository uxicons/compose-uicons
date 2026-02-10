package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HandBackPointRibbon: ImageVector? = null

val Icons.Ss.HandBackPointRibbon: ImageVector
    get() = _HandBackPointRibbon ?: UXIcon(name = "HandBackPointRibbon") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.99f, 2f)
                horizontalLineToRelative(-3.99f)
                curveTo(8f, 0.79f, 9.08f, -0.18f, 10.34f, 0.03f)
                curveToRelative(0.95f, 0.15f, 1.61f, 1.02f, 1.66f, 1.97f)
                close()
                moveTo(22f, 10.87f)
                lineToRelative(-10f, -1.86f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-5.43f)
                lineToRelative(-3.12f, 3.07f)
                curveToRelative(-1.13f, 1.13f, -1.13f, 3.11f, 0f, 4.24f)
                lineToRelative(5.12f, 5.12f)
                horizontalLineToRelative(14f)
                lineTo(22f, 10.87f)
                close()
                moveTo(12f, 7f)
                verticalLineToRelative(-3f)
                lineTo(3f, 4f)
                lineToRelative(2f, 1.5f)
                lineToRelative(-2f, 1.5f)
                lineTo(12f, 7f)
                close()
            }
        }.also { _HandBackPointRibbon = it}
