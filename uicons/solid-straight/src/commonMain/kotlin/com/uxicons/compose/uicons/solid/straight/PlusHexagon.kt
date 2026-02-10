package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PlusHexagon: ImageVector? = null

val Icons.Ss.PlusHexagon: ImageVector
    get() = _PlusHexagon ?: UXIcon(name = "PlusHexagon") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.64f, 10.55f)
                lineToRelative(-4.25f, -7.96f)
                curveToRelative(-0.52f, -0.98f, -1.54f, -1.59f, -2.65f, -1.59f)
                lineTo(7.28f, 1.0f)
                curveToRelative(-1.11f, 0f, -2.12f, 0.61f, -2.64f, 1.58f)
                lineTo(0.37f, 10.55f)
                curveToRelative(-0.49f, 0.91f, -0.49f, 2f, 0f, 2.91f)
                lineToRelative(4.27f, 7.96f)
                curveToRelative(0.52f, 0.97f, 1.54f, 1.58f, 2.64f, 1.58f)
                horizontalLineToRelative(9.46f)
                curveToRelative(1.11f, 0f, 2.12f, -0.61f, 2.65f, -1.59f)
                lineToRelative(4.25f, -7.96f)
                curveToRelative(0.48f, -0.91f, 0.48f, -1.99f, 0f, -2.9f)
                close()
                moveTo(17f, 13f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(2f)
                close()
            }
        }.also { _PlusHexagon = it}
