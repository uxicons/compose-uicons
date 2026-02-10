package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Function: ImageVector? = null

val Icons.Ts.Function: ImageVector
    get() = _Function ?: UXIcon(name = "Function") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10.13f, 11f)
                horizontalLineToRelative(3.05f)
                lineToRelative(-0.14f, 1f)
                horizontalLineToRelative(-3.03f)
                lineToRelative(-1.17f, 8.95f)
                curveToRelative(-0.23f, 1.74f, -1.72f, 3.05f, -3.47f, 3.05f)
                horizontalLineToRelative(-2.37f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(2.37f)
                curveToRelative(1.25f, 0f, 2.32f, -0.94f, 2.48f, -2.18f)
                lineToRelative(1.15f, -8.82f)
                horizontalLineToRelative(-3.53f)
                lineToRelative(0.14f, -1f)
                horizontalLineToRelative(3.52f)
                lineToRelative(1.04f, -7.95f)
                curveToRelative(0.23f, -1.74f, 1.72f, -3.05f, 3.47f, -3.05f)
                horizontalLineToRelative(2.37f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-2.37f)
                curveToRelative(-1.25f, 0f, -2.32f, 0.94f, -2.48f, 2.18f)
                lineToRelative(-1.02f, 7.82f)
                close()
                moveTo(20.31f, 15f)
                horizontalLineToRelative(-1.16f)
                lineToRelative(-2.14f, 3.54f)
                lineToRelative(-2.21f, -3.54f)
                horizontalLineToRelative(-1.16f)
                lineToRelative(2.78f, 4.5f)
                lineToRelative(-2.8f, 4.5f)
                horizontalLineToRelative(1.15f)
                lineToRelative(2.24f, -3.54f)
                lineToRelative(2.11f, 3.54f)
                horizontalLineToRelative(1.16f)
                lineToRelative(-2.69f, -4.5f)
                lineToRelative(2.72f, -4.5f)
                close()
            }
        }.also { _Function = it}
