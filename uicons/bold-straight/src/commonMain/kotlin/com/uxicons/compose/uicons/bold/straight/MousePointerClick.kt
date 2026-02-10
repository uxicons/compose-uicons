package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MousePointerClick: ImageVector? = null

val Icons.Bs.MousePointerClick: ImageVector
    get() = _MousePointerClick ?: UXIcon(name = "MousePointerClick") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13f, 5f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(3f)
                close()
                moveTo(1.88f, 9.52f)
                lineTo(2.36f, 12.48f)
                lineTo(7.29f, 11.69f)
                lineTo(6.82f, 8.73f)
                close()
                moveTo(3.15f, 4.74f)
                lineTo(7.05f, 7.86f)
                lineTo(8.92f, 5.52f)
                lineTo(5.02f, 2.39f)
                close()
                moveTo(19.81f, 4.66f)
                lineTo(17.92f, 2.34f)
                lineTo(14.04f, 5.5f)
                lineTo(15.94f, 7.82f)
                close()
                moveTo(17.94f, 17.83f)
                lineTo(20.16f, 22.19f)
                lineTo(16.53f, 24.0f)
                lineTo(14.23f, 19.53f)
                lineTo(10f, 23.4f)
                verticalLineToRelative(-13.28f)
                curveToRelative(0f, -0.46f, 0.15f, -0.91f, 0.43f, -1.28f)
                curveToRelative(0.69f, -0.92f, 2.03f, -1.12f, 2.92f, -0.44f)
                lineToRelative(10.23f, 8.83f)
                close()
                moveTo(16.38f, 14.98f)
                lineTo(13.0f, 12.06f)
                verticalLineToRelative(4.54f)
                lineToRelative(1.56f, -1.42f)
                lineToRelative(1.82f, -0.19f)
                close()
            }
        }.also { _MousePointerClick = it}
