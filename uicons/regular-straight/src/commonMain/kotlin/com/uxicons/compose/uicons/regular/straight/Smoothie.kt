package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Smoothie: ImageVector? = null

val Icons.Rs.Smoothie: ImageVector
    get() = _Smoothie ?: UXIcon(name = "Smoothie") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 8f)
                horizontalLineToRelative(-1.07f)
                curveToRelative(-0.45f, -3.61f, -3.32f, -6.48f, -6.93f, -6.93f)
                verticalLineToRelative(-1.07f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(1.07f)
                curveToRelative(-3.59f, 0.45f, -6.45f, 3.29f, -6.92f, 6.93f)
                horizontalLineToRelative(-1.08f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(1.07f)
                lineToRelative(1f, 14f)
                horizontalLineToRelative(13.86f)
                lineToRelative(1f, -14f)
                horizontalLineToRelative(1.07f)
                close()
                moveTo(17.91f, 8f)
                horizontalLineToRelative(-4.91f)
                verticalLineToRelative(-4.91f)
                curveToRelative(2.51f, 0.42f, 4.49f, 2.4f, 4.91f, 4.91f)
                close()
                moveTo(11f, 3.09f)
                verticalLineToRelative(4.91f)
                horizontalLineToRelative(-4.91f)
                curveToRelative(0.42f, -2.51f, 2.4f, -4.49f, 4.91f, -4.91f)
                close()
                moveTo(11f, 10f)
                verticalLineToRelative(4.11f)
                curveToRelative(-0.37f, -0.06f, -0.77f, -0.11f, -1.24f, -0.11f)
                curveToRelative(-1.34f, 0f, -2.52f, 0.37f, -3.35f, 0.74f)
                lineToRelative(-0.34f, -4.74f)
                close()
                moveTo(6.93f, 22f)
                lineTo(6.57f, 16.89f)
                curveToRelative(0.53f, -0.3f, 1.76f, -0.89f, 3.19f, -0.89f)
                curveToRelative(0.97f, 0f, 1.59f, 0.21f, 2.3f, 0.45f)
                curveToRelative(0.77f, 0.26f, 1.64f, 0.55f, 2.94f, 0.55f)
                curveToRelative(0.86f, 0f, 1.73f, -0.19f, 2.46f, -0.41f)
                lineToRelative(-0.39f, 5.41f)
                close()
                moveTo(17.61f, 14.43f)
                curveToRelative(-0.79f, 0.3f, -1.79f, 0.57f, -2.61f, 0.57f)
                curveToRelative(-0.83f, 0f, -1.41f, -0.15f, -2f, -0.35f)
                verticalLineToRelative(-4.65f)
                horizontalLineToRelative(4.93f)
                lineToRelative(-0.32f, 4.43f)
                close()
            }
        }.also { _Smoothie = it}
