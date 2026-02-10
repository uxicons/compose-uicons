package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Boot: ImageVector? = null

val Icons.Rs.Boot: ImageVector
    get() = _Boot ?: UXIcon(name = "Boot") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19.05f, 11.39f)
                lineToRelative(-4.05f, -1.12f)
                verticalLineToRelative(-4.27f)
                horizontalLineToRelative(2f)
                lineTo(17f, 2f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                lineTo(2f, 0f)
                curveTo(0.9f, 0f, 0f, 0.9f, 0f, 2f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(18f)
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
                verticalLineToRelative(-6.5f)
                curveToRelative(0f, -2.97f, -2.11f, -5.55f, -4.95f, -6.11f)
                close()
                moveTo(2f, 2f)
                horizontalLineToRelative(13f)
                verticalLineToRelative(2f)
                lineTo(2f, 4f)
                verticalLineToRelative(-2f)
                close()
                moveTo(4f, 20f)
                lineTo(4f, 6f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(4.03f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(4.87f)
                lineToRelative(4.72f, 1.3f)
                curveToRelative(1.98f, 0.4f, 3.42f, 2.15f, 3.42f, 4.17f)
                verticalLineToRelative(2.5f)
                lineTo(4f, 20f)
                close()
            }
        }.also { _Boot = it}
