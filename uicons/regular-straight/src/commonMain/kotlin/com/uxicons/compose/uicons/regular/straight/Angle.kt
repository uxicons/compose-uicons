package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Angle: ImageVector? = null

val Icons.Rs.Angle: ImageVector
    get() = _Angle ?: UXIcon(name = "Angle") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17.0f, 10.38f)
                lineToRelative(1.52f, -1.3f)
                curveToRelative(0.94f, 1.33f, 1.71f, 2.79f, 2.28f, 4.35f)
                lineToRelative(-1.88f, 0.69f)
                curveToRelative(-0.49f, -1.33f, -1.14f, -2.58f, -1.93f, -3.73f)
                close()
                moveTo(15.76f, 8.8f)
                lineToRelative(1.52f, -1.3f)
                curveToRelative(-1.08f, -1.24f, -2.31f, -2.34f, -3.68f, -3.27f)
                lineToRelative(-0.96f, 1.77f)
                curveToRelative(1.15f, 0.8f, 2.2f, 1.74f, 3.12f, 2.79f)
                close()
                moveTo(20f, 20f)
                horizontalLineToRelative(2f)
                curveToRelative(0f, -1.61f, -0.22f, -3.17f, -0.6f, -4.67f)
                lineToRelative(-1.89f, 0.69f)
                curveToRelative(0.31f, 1.28f, 0.49f, 2.6f, 0.49f, 3.98f)
                close()
                moveTo(2.53f, 22f)
                curveToRelative(-0.27f, 0f, -0.4f, -0.18f, -0.45f, -0.26f)
                curveToRelative(-0.05f, -0.08f, -0.14f, -0.28f, -0.01f, -0.52f)
                lineTo(13.07f, 1.03f)
                lineToRelative(-1.76f, -0.96f)
                lineTo(0.32f, 20.27f)
                curveToRelative(-0.43f, 0.79f, -0.41f, 1.72f, 0.05f, 2.49f)
                curveToRelative(0.46f, 0.77f, 1.27f, 1.23f, 2.17f, 1.23f)
                horizontalLineToRelative(21.47f)
                verticalLineToRelative(-2f)
                lineTo(2.53f, 22.0f)
                close()
            }
        }.also { _Angle = it}
