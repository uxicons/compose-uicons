package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CraneBuilding: ImageVector? = null

val Icons.Ss.CraneBuilding: ImageVector
    get() = _CraneBuilding ?: UXIcon(name = "CraneBuilding") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 6f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-16.49f)
                lineToRelative(-2f, -2f)
                horizontalLineToRelative(-0.51f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(14f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-14f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(7.3f)
                lineToRelative(-3.27f, 4f)
                horizontalLineToRelative(-2.03f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2.03f)
                lineToRelative(-3.27f, -4f)
                close()
                moveTo(14.61f, 10f)
                lineTo(17f, 7.08f)
                lineTo(19.39f, 10f)
                horizontalLineToRelative(-4.78f)
                close()
                moveTo(10f, 14f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(-10f)
                close()
                moveTo(16f, 21f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(3f)
                close()
                moveTo(21f, 21f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(3f)
                close()
            }
        }.also { _CraneBuilding = it}
