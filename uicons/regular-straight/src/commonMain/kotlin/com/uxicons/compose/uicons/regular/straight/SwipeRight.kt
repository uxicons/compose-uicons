package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SwipeRight: ImageVector? = null

val Icons.Rs.SwipeRight: ImageVector
    get() = _SwipeRight ?: UXIcon(name = "SwipeRight") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 3.11f)
                curveToRelative(0f, -1.52f, -1.08f, -2.83f, -2.5f, -3.07f)
                curveToRelative(-0.88f, -0.14f, -1.77f, 0.1f, -2.44f, 0.67f)
                curveToRelative(-0.67f, 0.57f, -1.06f, 1.4f, -1.06f, 2.29f)
                verticalLineToRelative(11.57f)
                lineToRelative(-0.95f, -0.76f)
                curveToRelative(-1.21f, -1.13f, -3.11f, -1.06f, -4.24f, 0.14f)
                curveToRelative(-1.13f, 1.21f, -1.07f, 3.11f, 0.13f, 4.23f)
                lineToRelative(6.04f, 5.82f)
                horizontalLineToRelative(15.03f)
                verticalLineToRelative(-12.82f)
                lineToRelative(-10f, -2f)
                lineTo(12f, 3.11f)
                close()
                moveTo(20f, 12.82f)
                verticalLineToRelative(9.18f)
                lineTo(7.78f, 22f)
                lineToRelative(-5.46f, -5.27f)
                curveToRelative(-0.4f, -0.38f, -0.42f, -1.01f, -0.05f, -1.42f)
                curveToRelative(0.18f, -0.19f, 0.43f, -0.31f, 0.69f, -0.32f)
                curveToRelative(0.27f, 0.0f, 0.52f, 0.09f, 0.77f, 0.32f)
                lineToRelative(4.26f, 3.39f)
                lineTo(8.0f, 3f)
                curveToRelative(0f, -0.29f, 0.13f, -0.57f, 0.35f, -0.76f)
                curveToRelative(0.23f, -0.19f, 0.52f, -0.27f, 0.82f, -0.22f)
                curveToRelative(0.46f, 0.07f, 0.82f, 0.56f, 0.82f, 1.09f)
                verticalLineToRelative(7.71f)
                lineToRelative(10f, 2f)
                close()
                moveTo(23.49f, 5.23f)
                lineToRelative(-2.76f, 2.76f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(1.57f, -1.57f)
                horizontalLineToRelative(-6.89f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(6.96f)
                lineToRelative(-1.64f, -1.64f)
                lineTo(20.73f, -0.05f)
                lineToRelative(2.76f, 2.76f)
                curveToRelative(0.69f, 0.7f, 0.69f, 1.82f, 0f, 2.52f)
                close()
            }
        }.also { _SwipeRight = it}
