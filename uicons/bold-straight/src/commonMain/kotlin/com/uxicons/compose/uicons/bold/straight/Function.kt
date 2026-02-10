package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Function: ImageVector? = null

val Icons.Bs.Function: ImageVector
    get() = _Function ?: UXIcon(name = "Function") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12.89f, 13f)
                horizontalLineToRelative(-2.02f)
                lineToRelative(-1.02f, 7.14f)
                curveToRelative(-0.32f, 2.2f, -2.23f, 3.86f, -4.46f, 3.86f)
                horizontalLineToRelative(-2.4f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(2.4f)
                curveToRelative(0.74f, 0f, 1.38f, -0.55f, 1.49f, -1.29f)
                lineToRelative(0.96f, -6.71f)
                horizontalLineToRelative(-2.52f)
                lineToRelative(0.43f, -3f)
                horizontalLineToRelative(2.52f)
                lineToRelative(0.88f, -6.14f)
                curveToRelative(0.32f, -2.2f, 2.23f, -3.86f, 4.46f, -3.86f)
                horizontalLineToRelative(2.4f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-2.4f)
                curveToRelative(-0.74f, 0f, -1.38f, 0.55f, -1.49f, 1.29f)
                lineToRelative(-0.82f, 5.71f)
                horizontalLineToRelative(2.02f)
                lineToRelative(-0.43f, 3f)
                close()
                moveTo(22.62f, 15f)
                horizontalLineToRelative(-3.6f)
                lineToRelative(-1.21f, 1.82f)
                lineToRelative(-1.21f, -1.82f)
                horizontalLineToRelative(-3.6f)
                lineToRelative(3.01f, 4.54f)
                lineToRelative(-2.96f, 4.46f)
                horizontalLineToRelative(3.6f)
                lineToRelative(1.16f, -1.75f)
                lineToRelative(1.16f, 1.75f)
                horizontalLineToRelative(3.6f)
                lineToRelative(-2.96f, -4.46f)
                lineToRelative(3.01f, -4.54f)
                close()
            }
        }.also { _Function = it}
