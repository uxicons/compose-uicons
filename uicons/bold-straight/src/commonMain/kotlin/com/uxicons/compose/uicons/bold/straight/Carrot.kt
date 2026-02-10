package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Carrot: ImageVector? = null

val Icons.Bs.Carrot: ImageVector
    get() = _Carrot ?: UXIcon(name = "Carrot") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24.06f, 2.06f)
                lineTo(21.94f, -0.06f)
                lineTo(19f, 2.88f)
                lineTo(19f, 0f)
                lineTo(16f, 0f)
                lineTo(16f, 3.06f)
                curveToRelative(-1.79f, -1.23f, -3.91f, -1.76f, -6.14f, 0.47f)
                curveToRelative(-2.44f, 2.44f, -7.51f, 14.72f, -8.5f, 17.16f)
                lineTo(0.02f, 23.98f)
                lineToRelative(3.3f, -1.34f)
                curveToRelative(2.44f, -0.99f, 14.72f, -6.06f, 17.16f, -8.5f)
                curveToRelative(2.23f, -2.23f, 1.7f, -4.35f, 0.47f, -6.14f)
                lineTo(24f, 8f)
                lineTo(24f, 5f)
                lineTo(21.12f, 5f)
                close()
                moveTo(18.35f, 12.02f)
                arcToRelative(10.25f, 10.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.92f, 1.29f)
                lineToRelative(-2.37f, -2.37f)
                lineToRelative(-2.12f, 2.12f)
                lineToRelative(1.71f, 1.71f)
                curveToRelative(-2.43f, 1.2f, -5.41f, 2.54f, -8.1f, 3.69f)
                curveTo(6.01f, 17.37f, 6.5f, 16.25f, 7f, 15.12f)
                lineToRelative(0.94f, 0.94f)
                lineToRelative(2.12f, -2.12f)
                lineTo(8.34f, 12.22f)
                curveToRelative(0.67f, -1.43f, 1.33f, -2.75f, 1.91f, -3.85f)
                lineToRelative(1.69f, 1.69f)
                lineToRelative(2.12f, -2.12f)
                lineTo(11.88f, 5.76f)
                curveToRelative(1.55f, -1.59f, 2.25f, -0.47f, 4.63f, 1.73f)
                curveTo(19.38f, 10.36f, 19.42f, 10.95f, 18.35f, 12.02f)
                close()
            }
        }.also { _Carrot = it}
