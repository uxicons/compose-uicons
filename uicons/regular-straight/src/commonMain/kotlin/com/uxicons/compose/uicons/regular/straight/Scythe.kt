package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Scythe: ImageVector? = null

val Icons.Rs.Scythe: ImageVector
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
                moveTo(9.18f, 6f)
                curveToRelative(-1.52f, 0f, -2.97f, 0.17f, -4.35f, 0.49f)
                curveToRelative(1.83f, -1.99f, 5.25f, -4.5f, 10.85f, -4.5f)
                horizontalLineToRelative(5.47f)
                lineToRelative(-1.21f, 4f)
                horizontalLineToRelative(-10.76f)
                close()
            }
        }.also { _Scythe = it}
