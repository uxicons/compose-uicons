package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Catalog: ImageVector? = null

val Icons.Bs.Catalog: ImageVector
    get() = _Catalog ?: UXIcon(name = "Catalog") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.5f, 6f)
                horizontalLineToRelative(-1.5f)
                lineTo(19f, 0f)
                lineTo(3.5f, 0f)
                curveTo(1.57f, 0f, 0f, 1.57f, 0f, 3.5f)
                verticalLineToRelative(14.5f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(19f)
                verticalLineToRelative(-14.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(12.38f, 6f)
                lineToRelative(3.62f, -1.97f)
                verticalLineToRelative(1.97f)
                horizontalLineToRelative(-3.62f)
                close()
                moveTo(3f, 15f)
                lineTo(3f, 3.5f)
                curveToRelative(0f, -0.28f, 0.23f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(8.12f)
                lineToRelative(-6.62f, 3.61f)
                verticalLineToRelative(8.39f)
                horizontalLineToRelative(-2f)
                close()
                moveTo(21f, 21f)
                horizontalLineToRelative(-13f)
                verticalLineToRelative(-12f)
                horizontalLineToRelative(12.5f)
                curveToRelative(0.28f, 0f, 0.5f, 0.23f, 0.5f, 0.5f)
                verticalLineToRelative(11.5f)
                close()
                moveTo(15f, 16f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-3f)
                close()
                moveTo(10f, 16f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-3f)
                close()
                moveTo(15f, 11f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-3f)
                close()
                moveTo(10f, 11f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-3f)
                close()
            }
        }.also { _Catalog = it}
