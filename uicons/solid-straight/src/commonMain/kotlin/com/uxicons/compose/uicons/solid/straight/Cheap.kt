package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Cheap: ImageVector? = null

val Icons.Ss.Cheap: ImageVector
    get() = _Cheap ?: UXIcon(name = "Cheap") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14f, 15.17f)
                lineToRelative(1f, 1f)
                lineTo(15f, 1.35f)
                curveToRelative(-1.47f, -0.85f, -3.18f, -1.35f, -5f, -1.35f)
                curveTo(4.49f, 0f, 0f, 4.49f, 0f, 10f)
                reflectiveCurveToRelative(4.49f, 10f, 10f, 10f)
                curveToRelative(0.11f, 0f, 0.21f, -0.02f, 0.32f, -0.02f)
                lineToRelative(-0.56f, -0.56f)
                lineToRelative(4.24f, -4.24f)
                close()
                moveTo(3f, 10f)
                curveToRelative(0f, -3.86f, 3.14f, -7f, 7f, -7f)
                verticalLineToRelative(2f)
                curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
                curveToRelative(0f, 2.71f, 2.17f, 4.91f, 4.86f, 4.99f)
                lineToRelative(-1.75f, 1.75f)
                curveToRelative(-2.94f, -0.83f, -5.11f, -3.53f, -5.11f, -6.73f)
                close()
                moveTo(23.38f, 19.43f)
                lineToRelative(-3.99f, 3.99f)
                curveToRelative(-0.39f, 0.39f, -0.9f, 0.58f, -1.4f, 0.58f)
                curveToRelative(-0.51f, 0f, -1.03f, -0.2f, -1.42f, -0.59f)
                lineToRelative(-4f, -4f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(3.0f, 3.0f)
                lineTo(17f, -0.0f)
                lineToRelative(2f, 0.0f)
                lineToRelative(-0.02f, 21.02f)
                lineToRelative(3.0f, -3.02f)
                lineToRelative(1.4f, 1.43f)
                close()
            }
        }.also { _Cheap = it}
