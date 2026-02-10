package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CaretRight: ImageVector? = null

val Icons.Ts.CaretRight: ImageVector
    get() = _CaretRight ?: UXIcon(name = "CaretRight") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9f, 19.3f)
                lineTo(9f, 4.75f)
                lineToRelative(6.34f, 5.8f)
                curveToRelative(0.41f, 0.37f, 0.65f, 0.89f, 0.66f, 1.44f)
                curveToRelative(0.01f, 0.57f, -0.23f, 1.13f, -0.66f, 1.51f)
                lineToRelative(-6.34f, 5.8f)
                close()
                moveTo(10f, 7.02f)
                verticalLineToRelative(10.02f)
                lineToRelative(4.67f, -4.27f)
                curveToRelative(0.22f, -0.19f, 0.34f, -0.47f, 0.33f, -0.75f)
                curveToRelative(-0.01f, -0.28f, -0.12f, -0.53f, -0.33f, -0.71f)
                lineToRelative(-0.0f, -0.0f)
                lineToRelative(-4.67f, -4.27f)
                close()
            }
        }.also { _CaretRight = it}
