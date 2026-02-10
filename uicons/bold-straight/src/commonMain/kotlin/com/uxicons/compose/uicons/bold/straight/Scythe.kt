package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Scythe: ImageVector? = null

val Icons.Bs.Scythe: ImageVector
    get() = _Scythe ?: UXIcon(name = "Scythe") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16.59f, 0f)
                curveTo(6.14f, 0f, 2.19f, 7.45f, 1.77f, 8.29f)
                lineTo(-0.09f, 12.09f)
                lineToRelative(3.84f, -1.77f)
                curveToRelative(1.89f, -0.87f, 4.02f, -1.32f, 6.35f, -1.32f)
                horizontalLineToRelative(8.0f)
                lineToRelative(-1.21f, 4f)
                horizontalLineToRelative(-5.88f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(4.97f)
                lineToRelative(-2.15f, 7.11f)
                lineToRelative(2.87f, 0.87f)
                lineTo(23.94f, 0f)
                horizontalLineToRelative(-7.35f)
                close()
                moveTo(10.09f, 6f)
                curveToRelative(-0.96f, 0f, -1.89f, 0.06f, -2.79f, 0.19f)
                curveToRelative(1.92f, -1.61f, 4.91f, -3.19f, 9.29f, -3.19f)
                horizontalLineToRelative(3.31f)
                lineToRelative(-0.91f, 3f)
                horizontalLineToRelative(-8.9f)
                close()
            }
        }.also { _Scythe = it}
