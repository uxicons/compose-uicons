package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Function: ImageVector? = null

val Icons.Ss.Function: ImageVector
    get() = _Function ?: UXIcon(name = "Function") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12.89f, 13f)
                horizontalLineToRelative(-2.52f)
                lineToRelative(-1.03f, 7.54f)
                curveToRelative(-0.27f, 1.97f, -1.97f, 3.46f, -3.96f, 3.46f)
                horizontalLineToRelative(-2.38f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2.38f)
                curveToRelative(0.99f, 0f, 1.85f, -0.74f, 1.98f, -1.73f)
                lineToRelative(0.99f, -7.27f)
                horizontalLineToRelative(-3.03f)
                lineToRelative(0.29f, -2f)
                horizontalLineToRelative(3.02f)
                lineToRelative(1.03f, -7.54f)
                curveToRelative(0.27f, -1.97f, 1.97f, -3.46f, 3.96f, -3.46f)
                horizontalLineToRelative(2.38f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2.38f)
                curveToRelative(-0.99f, 0f, -1.85f, 0.74f, -1.98f, 1.73f)
                lineToRelative(-0.99f, 7.27f)
                horizontalLineToRelative(2.54f)
                lineToRelative(-0.29f, 2f)
                close()
                moveTo(20.89f, 15f)
                horizontalLineToRelative(-2.33f)
                lineToRelative(-1.55f, 2.58f)
                lineToRelative(-1.62f, -2.58f)
                horizontalLineToRelative(-2.33f)
                lineToRelative(2.78f, 4.5f)
                lineToRelative(-2.78f, 4.5f)
                horizontalLineToRelative(2.33f)
                lineToRelative(1.62f, -2.59f)
                lineToRelative(1.56f, 2.59f)
                horizontalLineToRelative(2.33f)
                lineToRelative(-2.71f, -4.5f)
                lineToRelative(2.71f, -4.5f)
                close()
            }
        }.also { _Function = it}
