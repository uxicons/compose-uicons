package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Mountain: ImageVector? = null

val Icons.Ts.Mountain: ImageVector
    get() = _Mountain ?: UXIcon(name = "Mountain") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, -0.07f)
                lineTo(0f, 22.66f)
                verticalLineToRelative(1.34f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-1.34f)
                lineTo(12f, -0.07f)
                close()
                moveTo(16.49f, 10.58f)
                lineToRelative(-1.38f, 2.72f)
                lineToRelative(-2.02f, -3.14f)
                lineToRelative(-2.68f, 4.36f)
                lineToRelative(-2.81f, -4.09f)
                lineTo(12f, 2.07f)
                lineToRelative(4.49f, 8.51f)
                close()
                moveTo(23f, 23.0f)
                lineTo(1f, 23.0f)
                verticalLineToRelative(-0.09f)
                lineToRelative(6.07f, -11.49f)
                lineToRelative(3.39f, 4.93f)
                lineToRelative(2.65f, -4.31f)
                lineToRelative(2.11f, 3.27f)
                lineToRelative(1.85f, -3.64f)
                lineToRelative(5.94f, 11.24f)
                verticalLineToRelative(0.09f)
                close()
            }
        }.also { _Mountain = it}
