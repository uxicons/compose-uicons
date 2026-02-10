package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MousePointerClick: ImageVector? = null

val Icons.Ss.MousePointerClick: ImageVector
    get() = _MousePointerClick ?: UXIcon(name = "MousePointerClick") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13f, 5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(2f)
                close()
                moveTo(19.77f, 3.62f)
                lineTo(18.35f, 2.22f)
                lineTo(14.83f, 5.77f)
                lineTo(16.25f, 7.18f)
                close()
                moveTo(9.17f, 5.77f)
                lineTo(5.65f, 2.22f)
                lineTo(4.23f, 3.62f)
                lineTo(7.75f, 7.18f)
                close()
                moveTo(7.0f, 9.01f)
                lineTo(2.0f, 8.99f)
                lineTo(2.0f, 10.99f)
                lineTo(7.0f, 11.01f)
                close()
                moveTo(9.96f, 9.73f)
                curveToRelative(0f, -0.38f, 0.12f, -0.75f, 0.35f, -1.05f)
                curveToRelative(0.57f, -0.74f, 1.65f, -0.92f, 2.41f, -0.34f)
                lineToRelative(11.27f, 8.73f)
                lineToRelative(-6.1f, 0.62f)
                lineToRelative(2.27f, 4.47f)
                lineToRelative(-3.67f, 1.83f)
                lineToRelative(-2.35f, -4.58f)
                lineToRelative(-4.19f, 4.07f)
                verticalLineToRelative(-13.76f)
                close()
            }
        }.also { _MousePointerClick = it}
