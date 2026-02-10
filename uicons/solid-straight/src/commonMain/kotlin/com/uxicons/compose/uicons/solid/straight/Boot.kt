package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Boot: ImageVector? = null

val Icons.Ss.Boot: ImageVector
    get() = _Boot ?: UXIcon(name = "Boot") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17f, 5f)
                lineTo(0f, 5f)
                lineTo(0f, 0f)
                horizontalLineToRelative(17f)
                verticalLineToRelative(5f)
                close()
                moveTo(19.05f, 12.15f)
                lineToRelative(-4.05f, -1.12f)
                verticalLineToRelative(-0.01f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-2.03f)
                lineTo(2f, 7f)
                verticalLineToRelative(17f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-5.73f)
                curveToRelative(0f, -2.97f, -2.11f, -5.55f, -4.95f, -6.11f)
                close()
            }
        }.also { _Boot = it}
