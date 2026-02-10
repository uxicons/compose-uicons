package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SwipeUp: ImageVector? = null

val Icons.Rs.SwipeUp: ImageVector
    get() = _SwipeUp ?: UXIcon(name = "SwipeUp") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15f, 9.2f)
                lineTo(15f, 3.11f)
                curveToRelative(0f, -1.52f, -1.08f, -2.83f, -2.5f, -3.07f)
                curveToRelative(-0.88f, -0.14f, -1.77f, 0.1f, -2.44f, 0.67f)
                curveToRelative(-0.67f, 0.57f, -1.06f, 1.4f, -1.06f, 2.29f)
                verticalLineToRelative(11.56f)
                lineToRelative(-0.95f, -0.76f)
                curveToRelative(-1.21f, -1.13f, -3.11f, -1.06f, -4.24f, 0.14f)
                curveToRelative(-1.13f, 1.21f, -1.07f, 3.11f, 0.13f, 4.23f)
                lineToRelative(6.03f, 5.82f)
                horizontalLineToRelative(14.03f)
                verticalLineToRelative(-12.8f)
                lineToRelative(-9f, -2f)
                close()
                moveTo(22f, 22f)
                horizontalLineToRelative(-11.22f)
                lineToRelative(-5.46f, -5.27f)
                curveToRelative(-0.4f, -0.38f, -0.42f, -1.01f, -0.05f, -1.42f)
                curveToRelative(0.38f, -0.4f, 1.01f, -0.42f, 1.47f, 0.0f)
                lineToRelative(4.26f, 3.39f)
                lineTo(11f, 3f)
                curveToRelative(0f, -0.29f, 0.13f, -0.57f, 0.35f, -0.76f)
                curveToRelative(0.23f, -0.19f, 0.52f, -0.27f, 0.82f, -0.22f)
                curveToRelative(0.46f, 0.07f, 0.82f, 0.56f, 0.82f, 1.09f)
                verticalLineToRelative(7.69f)
                lineToRelative(9f, 2f)
                verticalLineToRelative(9.2f)
                close()
                moveTo(3f, 10f)
                lineTo(3f, 3.11f)
                lineToRelative(-1.57f, 1.57f)
                lineTo(0.01f, 3.27f)
                lineTo(2.77f, 0.51f)
                curveToRelative(0.69f, -0.69f, 1.82f, -0.69f, 2.52f, 0f)
                lineToRelative(2.76f, 2.76f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(-1.64f, -1.64f)
                verticalLineToRelative(6.96f)
                horizontalLineToRelative(-2f)
                close()
            }
        }.also { _SwipeUp = it}
