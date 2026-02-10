package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Filter: ImageVector? = null

val Icons.Ts.Filter: ImageVector
    get() = _Filter ?: UXIcon(name = "Filter") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15f, 24.01f)
                lineToRelative(-6f, -3.6f)
                verticalLineToRelative(-6.22f)
                lineTo(1f, 5.19f)
                verticalLineToRelative(-2.69f)
                curveTo(1f, 1.12f, 2.12f, 0f, 3.5f, 0f)
                horizontalLineToRelative(17f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                verticalLineToRelative(2.69f)
                lineToRelative(-8f, 9f)
                verticalLineToRelative(9.82f)
                close()
                moveTo(10f, 19.84f)
                lineToRelative(4f, 2.4f)
                verticalLineToRelative(-8.44f)
                lineToRelative(8f, -9f)
                verticalLineToRelative(-2.31f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                lineTo(3.5f, 1.0f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(2.31f)
                lineToRelative(8f, 9f)
                verticalLineToRelative(6.04f)
                close()
            }
        }.also { _Filter = it}
