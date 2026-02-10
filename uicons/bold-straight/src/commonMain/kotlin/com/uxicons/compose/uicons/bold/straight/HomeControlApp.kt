package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HomeControlApp: ImageVector? = null

val Icons.Bs.HomeControlApp: ImageVector
    get() = _HomeControlApp ?: UXIcon(name = "HomeControlApp") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16f, 18f)
                horizontalLineToRelative(-10f)
                verticalLineToRelative(-15f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-9f)
                verticalLineToRelative(21f)
                curveToRelative(0f, 1.66f, 1.34f, 3f, 3f, 3f)
                horizontalLineToRelative(10f)
                curveToRelative(1.66f, 0f, 3f, -1.34f, 3f, -3f)
                verticalLineToRelative(-9f)
                horizontalLineToRelative(-3f)
                close()
                moveTo(13.0f, 22.01f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(4f)
                close()
                moveTo(19f, 10f)
                horizontalLineToRelative(-3f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                verticalLineToRelative(-3f)
                curveToRelative(2.76f, 0f, 5f, 2.24f, 5f, 5f)
                close()
                moveTo(24f, 10f)
                horizontalLineToRelative(-3f)
                curveToRelative(0f, -3.86f, -3.14f, -7f, -7f, -7f)
                verticalLineToRelative(-3f)
                curveToRelative(5.51f, 0f, 10f, 4.49f, 10f, 10f)
                close()
                moveTo(10.18f, 8.28f)
                lineTo(7.51f, 10.37f)
                curveToRelative(-0.32f, 0.25f, -0.51f, 0.64f, -0.51f, 1.05f)
                verticalLineToRelative(4.58f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-4.58f)
                curveToRelative(0f, -0.41f, -0.19f, -0.8f, -0.51f, -1.05f)
                lineToRelative(-2.67f, -2.09f)
                curveToRelative(-0.48f, -0.38f, -1.16f, -0.38f, -1.64f, 0f)
                close()
                moveTo(12f, 14f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                close()
            }
        }.also { _HomeControlApp = it}
