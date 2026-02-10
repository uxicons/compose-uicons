package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Mountain: ImageVector? = null

val Icons.Bs.Mountain: ImageVector
    get() = _Mountain ?: UXIcon(name = "Mountain") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, -0.1f)
                lineTo(0f, 21.61f)
                verticalLineToRelative(2.39f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-2.39f)
                lineTo(12f, -0.1f)
                close()
                moveTo(3.77f, 21f)
                lineToRelative(4.61f, -8.34f)
                lineToRelative(2.13f, 2.84f)
                lineToRelative(2.5f, -3.5f)
                lineToRelative(1.82f, 2.5f)
                lineToRelative(0.95f, -1.58f)
                lineToRelative(4.46f, 8.08f)
                horizontalLineTo(3.77f)
                close()
            }
        }.also { _Mountain = it}
