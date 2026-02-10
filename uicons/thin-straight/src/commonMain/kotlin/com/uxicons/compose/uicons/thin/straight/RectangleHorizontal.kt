package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RectangleHorizontal: ImageVector? = null

val Icons.Ts.RectangleHorizontal: ImageVector
    get() = _RectangleHorizontal ?: UXIcon(name = "RectangleHorizontal") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 21f)
                lineTo(0f, 21f)
                lineTo(0f, 3f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(18f)
                close()
                moveTo(1f, 20f)
                horizontalLineToRelative(22f)
                lineTo(23f, 4f)
                lineTo(1f, 4f)
                verticalLineToRelative(16f)
                close()
            }
        }.also { _RectangleHorizontal = it}
