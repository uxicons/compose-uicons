package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Scythe: ImageVector? = null

val Icons.Ss.Scythe: ImageVector
    get() = _Scythe ?: UXIcon(name = "Scythe") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15.68f, 0f)
                curveTo(5.53f, 0f, 1.71f, 7.2f, 1.31f, 8.02f)
                lineTo(0.07f, 10.55f)
                lineToRelative(2.56f, -1.18f)
                curveToRelative(1.95f, -0.9f, 4.16f, -1.36f, 6.56f, -1.36f)
                horizontalLineToRelative(10.16f)
                lineToRelative(-1.51f, 5f)
                horizontalLineToRelative(-6.83f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(6.22f)
                lineToRelative(-2.54f, 8.39f)
                lineToRelative(1.91f, 0.58f)
                lineTo(23.85f, 0f)
                horizontalLineToRelative(-8.16f)
                close()
            }
        }.also { _Scythe = it}
