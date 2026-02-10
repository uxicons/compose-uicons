package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CraneBuilding: ImageVector? = null

val Icons.Bs.CraneBuilding: ImageVector
    get() = _CraneBuilding ?: UXIcon(name = "CraneBuilding") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 6f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-17f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(15f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-15f)
                horizontalLineToRelative(9.71f)
                lineToRelative(-3.27f, 4f)
                horizontalLineToRelative(-1.44f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-1.44f)
                lineToRelative(-3.27f, -4f)
                close()
                moveTo(16.02f, 10f)
                lineTo(18f, 7.58f)
                lineTo(19.98f, 10f)
                horizontalLineToRelative(-3.96f)
                close()
                moveTo(12f, 24f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(-9f)
                horizontalLineToRelative(-12f)
                close()
                moveTo(19f, 18f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-3f)
                close()
                moveTo(14f, 18f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-3f)
                close()
            }
        }.also { _CraneBuilding = it}
