package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Longboard: ImageVector? = null

val Icons.Rs.Longboard: ImageVector
    get() = _Longboard ?: UXIcon(name = "Longboard") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 3.17f)
                curveToRelative(0f, -1.8f, -1.36f, -3.17f, -3.17f, -3.17f)
                curveToRelative(-2.23f, 0f, -4.48f, 0.2f, -7.24f, 2.09f)
                lineToRelative(-1.3f, -1.3f)
                lineToRelative(-3f, 3f)
                lineToRelative(1.09f, 1.09f)
                curveToRelative(-1.67f, 1.7f, -3.21f, 3.47f, -4.65f, 5.35f)
                lineToRelative(-0.94f, -0.94f)
                lineToRelative(-3f, 3f)
                lineToRelative(1.44f, 1.44f)
                curveToRelative(-1.06f, 1.61f, -2.09f, 3.33f, -3.02f, 5.07f)
                lineToRelative(4.98f, 4.99f)
                curveToRelative(1.74f, -0.94f, 3.46f, -1.96f, 5.07f, -3.03f)
                lineToRelative(1.45f, 1.45f)
                lineToRelative(3f, -3f)
                lineToRelative(-0.94f, -0.94f)
                curveToRelative(1.88f, -1.44f, 3.65f, -2.99f, 5.35f, -4.65f)
                lineToRelative(1.09f, 1.09f)
                lineToRelative(3f, -3f)
                lineToRelative(-1.3f, -1.3f)
                curveToRelative(1.89f, -2.76f, 2.09f, -5.01f, 2.09f, -7.24f)
                close()
                moveTo(18.1f, 11.83f)
                curveToRelative(-3.71f, 3.71f, -7.82f, 6.82f, -12.55f, 9.48f)
                lineToRelative(-2.86f, -2.86f)
                curveToRelative(2.66f, -4.73f, 5.77f, -8.84f, 9.48f, -12.55f)
                curveToRelative(3.61f, -3.61f, 6.06f, -3.9f, 8.66f, -3.9f)
                curveToRelative(0.7f, 0f, 1.17f, 0.47f, 1.17f, 1.17f)
                curveToRelative(0f, 2.6f, -0.29f, 5.05f, -3.9f, 8.66f)
                close()
            }
        }.also { _Longboard = it}
