package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Shovel: ImageVector? = null

val Icons.Rs.Shovel: ImageVector
    get() = _Shovel ?: UXIcon(name = "Shovel") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.58f, 7.32f)
                lineToRelative(1.41f, -1.41f)
                lineTo(18.09f, 0.01f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(2.24f, 2.24f)
                lineToRelative(-8.95f, 8.95f)
                lineToRelative(-3.46f, -3.46f)
                lineToRelative(-4.31f, 4.31f)
                curveToRelative(-1.42f, 1.42f, -2.2f, 3.31f, -2.2f, 5.32f)
                verticalLineToRelative(5.22f)
                horizontalLineToRelative(5.22f)
                curveToRelative(2.01f, 0f, 3.9f, -0.78f, 5.32f, -2.2f)
                lineToRelative(4.31f, -4.31f)
                lineToRelative(-3.46f, -3.46f)
                lineToRelative(8.95f, -8.95f)
                lineToRelative(2.24f, 2.24f)
                close()
                moveTo(12.02f, 17.49f)
                lineToRelative(-2.89f, 2.89f)
                curveToRelative(-1.04f, 1.04f, -2.43f, 1.62f, -3.91f, 1.62f)
                horizontalLineToRelative(-3.22f)
                verticalLineToRelative(-3.22f)
                curveToRelative(0f, -1.48f, 0.57f, -2.86f, 1.62f, -3.91f)
                lineToRelative(2.89f, -2.89f)
                lineToRelative(2.05f, 2.05f)
                lineToRelative(-2.77f, 2.77f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(2.77f, -2.77f)
                lineToRelative(2.05f, 2.05f)
                close()
            }
        }.also { _Shovel = it}
