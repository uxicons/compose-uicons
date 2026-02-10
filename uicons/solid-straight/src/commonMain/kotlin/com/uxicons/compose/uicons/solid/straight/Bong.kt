package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Bong: ImageVector? = null

val Icons.Ss.Bong: ImageVector
    get() = _Bong ?: UXIcon(name = "Bong") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.14f, 8.41f)
                lineToRelative(1.06f, 0.87f)
                lineToRelative(1.27f, -1.55f)
                lineToRelative(-3.67f, -3f)
                lineToRelative(-1.27f, 1.55f)
                lineToRelative(1.06f, 0.87f)
                lineToRelative(-1.43f, 1.74f)
                curveToRelative(-0.67f, -0.45f, -1.39f, -0.83f, -2.17f, -1.13f)
                lineTo(16f, 2f)
                horizontalLineToRelative(1f)
                lineTo(17f, 0f)
                lineTo(7f, 0f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(5.75f)
                curveToRelative(-4.22f, 1.64f, -7f, 5.67f, -7f, 10.25f)
                curveToRelative(0f, 1.13f, 0.17f, 2.24f, 0.51f, 3.31f)
                curveToRelative(0.51f, 1.61f, 2.03f, 2.69f, 3.78f, 2.69f)
                horizontalLineToRelative(13.41f)
                curveToRelative(1.75f, 0f, 3.27f, -1.08f, 3.78f, -2.69f)
                curveToRelative(0.34f, -1.07f, 0.51f, -2.18f, 0.51f, -3.31f)
                curveToRelative(0f, -3.04f, -1.23f, -5.83f, -3.29f, -7.85f)
                lineToRelative(1.43f, -1.74f)
                close()
                moveTo(20.07f, 14f)
                curveToRelative(0.31f, 0.63f, 0.55f, 1.3f, 0.71f, 2f)
                lineTo(3.23f, 16f)
                curveToRelative(0.16f, -0.7f, 0.4f, -1.37f, 0.71f, -2f)
                horizontalLineToRelative(16.13f)
                close()
            }
        }.also { _Bong = it}
