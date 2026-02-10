package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Scarecrow: ImageVector? = null

val Icons.Bs.Scarecrow: ImageVector
    get() = _Scarecrow ?: UXIcon(name = "Scarecrow") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16.53f, 8f)
                curveToRelative(0.3f, -0.67f, 0.47f, -1.41f, 0.47f, -2.2f)
                verticalLineToRelative(-0.8f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-2.05f)
                curveToRelative(-0.23f, -1.14f, -1.24f, -2f, -2.45f, -2f)
                horizontalLineToRelative(-5f)
                curveToRelative(-1.21f, 0f, -2.22f, 0.86f, -2.45f, 2f)
                horizontalLineToRelative(-2.05f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 0.69f, 0.15f, 1.37f, 0.42f, 2f)
                lineTo(0f, 8f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(5.5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(5.5f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-7.47f)
                close()
                moveTo(10f, 5f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(1.0f)
                curveToRelative(0f, 1.1f, -0.9f, 2.0f, -2.0f, 2f)
                curveToRelative(-1.1f, 0f, -2.0f, -0.9f, -2.0f, -2f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(19f, 13f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(2f)
                close()
            }
        }.also { _Scarecrow = it}
