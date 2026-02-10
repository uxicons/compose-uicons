package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Mountain: ImageVector? = null

val Icons.Ss.Mountain: ImageVector
    get() = _Mountain ?: UXIcon(name = "Mountain") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(7.1f, 9.02f)
                lineTo(12f, 0.01f)
                lineToRelative(4.86f, 8.93f)
                lineToRelative(-1.92f, 3.57f)
                lineToRelative(-1.91f, -2.87f)
                lineToRelative(-2.58f, 4.07f)
                lineToRelative(-3.35f, -4.69f)
                close()
                moveTo(18.0f, 11.04f)
                lineToRelative(-2.89f, 5.36f)
                lineToRelative(-2.04f, -3.08f)
                lineToRelative(-2.52f, 3.98f)
                lineToRelative(-4.51f, -6.32f)
                lineTo(0f, 22.08f)
                verticalLineToRelative(1.92f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-1.92f)
                lineToRelative(-6.0f, -11.04f)
                close()
            }
        }.also { _Mountain = it}
