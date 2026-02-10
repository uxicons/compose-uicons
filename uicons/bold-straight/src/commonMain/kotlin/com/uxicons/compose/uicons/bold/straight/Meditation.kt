package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Meditation: ImageVector? = null

val Icons.Bs.Meditation: ImageVector
    get() = _Meditation ?: UXIcon(name = "Meditation") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 3f)
                curveToRelative(0f, -1.66f, 1.34f, -3f, 3f, -3f)
                reflectiveCurveToRelative(2.89f, 1.34f, 2.89f, 3f)
                reflectiveCurveToRelative(-1.24f, 3f, -2.89f, 3f)
                reflectiveCurveToRelative(-3f, -1.34f, -3f, -3f)
                close()
                moveTo(16f, 12.95f)
                lineToRelative(1.42f, 2.13f)
                lineToRelative(4.26f, 2.78f)
                lineToRelative(1.64f, -2.51f)
                lineToRelative(-3.74f, -2.45f)
                lineToRelative(-2.24f, -3.35f)
                curveToRelative(-0.65f, -0.98f, -1.74f, -1.56f, -2.91f, -1.56f)
                horizontalLineToRelative(-4.86f)
                curveToRelative(-1.17f, 0f, -2.26f, 0.58f, -2.91f, 1.56f)
                lineToRelative(-2.24f, 3.35f)
                lineTo(0.68f, 15.36f)
                lineToRelative(1.64f, 2.51f)
                lineToRelative(4.26f, -2.78f)
                lineToRelative(1.42f, -2.13f)
                verticalLineToRelative(4.73f)
                lineToRelative(-5.32f, 3.48f)
                lineToRelative(-0.68f, 0.52f)
                verticalLineToRelative(2.31f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-2.73f)
                lineToRelative(3f, -1.96f)
                lineTo(11f, 11f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(8.31f)
                lineToRelative(2.58f, 1.69f)
                horizontalLineToRelative(-5.58f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(10.5f)
                lineToRelative(1.5f, -0.08f)
                verticalLineToRelative(-2.31f)
                lineToRelative(-6f, -3.92f)
                verticalLineToRelative(-4.73f)
                close()
            }
        }.also { _Meditation = it}
