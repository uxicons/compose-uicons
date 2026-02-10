package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Mountain: ImageVector? = null

val Icons.Rs.Mountain: ImageVector
    get() = _Mountain ?: UXIcon(name = "Mountain") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 0.01f)
                lineTo(0f, 22.08f)
                verticalLineToRelative(1.92f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-1.92f)
                lineTo(12f, 0.01f)
                close()
                moveTo(15.7f, 11.0f)
                lineToRelative(-0.78f, 1.49f)
                lineToRelative(-1.89f, -2.85f)
                lineToRelative(-2.58f, 4.07f)
                lineToRelative(-2.05f, -2.89f)
                lineToRelative(3.6f, -6.61f)
                lineToRelative(3.7f, 6.81f)
                close()
                moveTo(2.32f, 22f)
                lineToRelative(5.02f, -9.23f)
                lineToRelative(3.21f, 4.53f)
                lineToRelative(2.52f, -3.98f)
                lineToRelative(2.06f, 3.1f)
                lineToRelative(1.73f, -3.29f)
                lineToRelative(4.83f, 8.88f)
                lineTo(2.32f, 22.0f)
                close()
            }
        }.also { _Mountain = it}
