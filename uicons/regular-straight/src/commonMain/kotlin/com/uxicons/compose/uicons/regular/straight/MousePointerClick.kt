package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MousePointerClick: ImageVector? = null

val Icons.Rs.MousePointerClick: ImageVector
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
                moveTo(4.23f, 3.62f)
                lineTo(7.75f, 7.18f)
                lineTo(9.17f, 5.77f)
                lineTo(5.65f, 2.22f)
                close()
                moveTo(2.0f, 10.99f)
                lineTo(7.0f, 11.01f)
                lineTo(7.0f, 9.01f)
                lineTo(2.0f, 8.99f)
                close()
                moveTo(19.22f, 17.68f)
                lineTo(21.11f, 21.28f)
                lineTo(15.79f, 23.95f)
                lineTo(13.77f, 20.17f)
                lineTo(10.0f, 23.62f)
                verticalLineToRelative(-14.83f)
                curveToRelative(0f, -0.39f, 0.13f, -0.77f, 0.36f, -1.08f)
                curveToRelative(0.58f, -0.77f, 1.7f, -0.95f, 2.44f, -0.39f)
                lineToRelative(11.19f, 9.72f)
                lineToRelative(-4.78f, 0.63f)
                close()
                moveTo(18.39f, 20.41f)
                lineTo(16.08f, 16f)
                lineTo(19.39f, 15.65f)
                lineTo(12f, 9.27f)
                verticalLineToRelative(9.81f)
                lineToRelative(2.33f, -2.12f)
                lineToRelative(2.31f, 4.33f)
                lineToRelative(1.76f, -0.88f)
                close()
            }
        }.also { _MousePointerClick = it}
