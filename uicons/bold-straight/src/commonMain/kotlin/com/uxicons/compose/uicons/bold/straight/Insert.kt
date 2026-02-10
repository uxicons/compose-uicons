package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Insert: ImageVector? = null

val Icons.Bs.Insert: ImageVector
    get() = _Insert ?: UXIcon(name = "Insert") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10.23f, 17.27f)
                lineToRelative(-4.78f, -4.7f)
                lineToRelative(2.1f, -2.14f)
                lineToRelative(2.95f, 2.9f)
                lineTo(10.5f, 0f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(13.33f)
                lineToRelative(2.95f, -2.9f)
                lineToRelative(2.1f, 2.14f)
                lineToRelative(-4.79f, 4.71f)
                curveToRelative(-0.48f, 0.48f, -1.12f, 0.72f, -1.75f, 0.72f)
                curveToRelative(-0.64f, 0f, -1.28f, -0.24f, -1.77f, -0.73f)
                close()
                moveTo(19f, 15f)
                verticalLineToRelative(5.5f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                lineTo(5.5f, 21f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                verticalLineToRelative(-5.5f)
                lineTo(0f, 15f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2.5f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(13f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-5f)
                close()
            }
        }.also { _Insert = it}
