package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PlateEmpty: ImageVector? = null

val Icons.Bs.PlateEmpty: ImageVector
    get() = _PlateEmpty ?: UXIcon(name = "PlateEmpty") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.16f, 19f)
                lineTo(7.84f, 19f)
                lineToRelative(-0.3f, -0.14f)
                curveTo(3.58f, 16.99f, 0.78f, 13.29f, 0.05f, 8.96f)
                curveToRelative(-0.17f, -0.98f, 0.11f, -1.98f, 0.76f, -2.75f)
                curveToRelative(0.65f, -0.77f, 1.6f, -1.22f, 2.62f, -1.22f)
                lineTo(20.58f, 5f)
                curveToRelative(1.01f, 0f, 1.96f, 0.44f, 2.62f, 1.22f)
                curveToRelative(0.65f, 0.77f, 0.92f, 1.77f, 0.76f, 2.75f)
                curveToRelative(-0.73f, 4.33f, -3.53f, 8.02f, -7.49f, 9.89f)
                lineToRelative(-0.3f, 0.14f)
                close()
                moveTo(8.53f, 16f)
                horizontalLineToRelative(6.94f)
                curveToRelative(2.92f, -1.49f, 4.97f, -4.29f, 5.52f, -7.54f)
                curveToRelative(0.02f, -0.14f, -0.04f, -0.25f, -0.09f, -0.31f)
                curveToRelative(-0.05f, -0.06f, -0.15f, -0.15f, -0.32f, -0.15f)
                lineTo(3.42f, 8f)
                curveToRelative(-0.17f, 0f, -0.28f, 0.1f, -0.32f, 0.15f)
                curveToRelative(-0.05f, 0.06f, -0.11f, 0.17f, -0.09f, 0.31f)
                curveToRelative(0.55f, 3.25f, 2.6f, 6.05f, 5.52f, 7.54f)
                close()
            }
        }.also { _PlateEmpty = it}
