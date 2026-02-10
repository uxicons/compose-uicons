package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Massage: ImageVector? = null

val Icons.Bs.Massage: ImageVector
    get() = _Massage ?: UXIcon(name = "Massage") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.5f, 8.5f)
                curveToRelative(-1.99f, 0f, -3.87f, 0.49f, -5.52f, 1.35f)
                curveToRelative(-0.41f, -2.98f, -1.77f, -5.76f, -3.92f, -7.91f)
                lineToRelative(-1.06f, -1.06f)
                lineToRelative(-1.06f, 1.06f)
                curveToRelative(-2.15f, 2.15f, -3.51f, 4.93f, -3.92f, 7.91f)
                curveToRelative(-1.65f, -0.86f, -3.53f, -1.35f, -5.52f, -1.35f)
                lineTo(0f, 8.5f)
                verticalLineToRelative(1.5f)
                curveToRelative(0f, 6.11f, 4.59f, 11.17f, 10.5f, 11.91f)
                lineToRelative(1.5f, 0.09f)
                lineToRelative(1.5f, -0.09f)
                curveToRelative(5.91f, -0.74f, 10.5f, -5.8f, 10.5f, -11.91f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(-1.5f)
                close()
                moveTo(12f, 5.29f)
                curveToRelative(1.4f, 1.91f, 2.15f, 4.24f, 2.11f, 6.63f)
                curveToRelative(-0.83f, 0.81f, -1.54f, 1.74f, -2.11f, 2.77f)
                curveToRelative(-0.57f, -1.02f, -1.28f, -1.95f, -2.11f, -2.77f)
                curveToRelative(-0.04f, -2.4f, 0.71f, -4.73f, 2.11f, -6.63f)
                close()
                moveTo(3.15f, 11.65f)
                curveToRelative(3.64f, 0.68f, 6.52f, 3.56f, 7.2f, 7.2f)
                curveToRelative(-3.64f, -0.68f, -6.52f, -3.56f, -7.2f, -7.2f)
                close()
                moveTo(13.65f, 18.85f)
                curveToRelative(0.68f, -3.64f, 3.56f, -6.52f, 7.2f, -7.2f)
                curveToRelative(-0.68f, 3.64f, -3.56f, 6.52f, -7.2f, 7.2f)
                close()
            }
        }.also { _Massage = it}
