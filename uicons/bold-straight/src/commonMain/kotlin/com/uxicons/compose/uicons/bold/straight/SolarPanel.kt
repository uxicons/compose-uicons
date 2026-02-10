package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SolarPanel: ImageVector? = null

val Icons.Bs.SolarPanel: ImageVector
    get() = _SolarPanel ?: UXIcon(name = "SolarPanel") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13.5f, 17f)
                horizontalLineToRelative(10.49f)
                lineToRelative(-1.78f, -13.94f)
                curveToRelative(-0.22f, -1.74f, -1.72f, -3.06f, -3.47f, -3.06f)
                lineTo(5.26f, -0f)
                curveToRelative(-1.76f, 0f, -3.25f, 1.31f, -3.47f, 3.06f)
                lineTo(0.01f, 17f)
                horizontalLineToRelative(10.49f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-4.5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-4.5f)
                verticalLineToRelative(-4f)
                close()
                moveTo(13.8f, 10f)
                lineToRelative(0.14f, 4f)
                horizontalLineToRelative(-3.89f)
                lineToRelative(0.14f, -4f)
                horizontalLineToRelative(3.6f)
                close()
                moveTo(10.3f, 7f)
                lineToRelative(0.14f, -4f)
                horizontalLineToRelative(3.1f)
                lineToRelative(0.14f, 4f)
                horizontalLineToRelative(-3.39f)
                close()
                moveTo(16.95f, 14f)
                lineToRelative(-0.14f, -4f)
                horizontalLineToRelative(3.27f)
                lineToRelative(0.51f, 4f)
                horizontalLineToRelative(-3.64f)
                close()
                moveTo(19.24f, 3.44f)
                lineToRelative(0.46f, 3.56f)
                horizontalLineToRelative(-2.99f)
                lineToRelative(-0.14f, -4f)
                horizontalLineToRelative(2.19f)
                curveToRelative(0.25f, 0f, 0.46f, 0.19f, 0.5f, 0.44f)
                close()
                moveTo(5.26f, 3f)
                horizontalLineToRelative(2.19f)
                lineToRelative(-0.14f, 4f)
                horizontalLineToRelative(-2.99f)
                lineToRelative(0.46f, -3.56f)
                curveToRelative(0.03f, -0.25f, 0.24f, -0.44f, 0.5f, -0.44f)
                close()
                moveTo(3.93f, 10f)
                horizontalLineToRelative(3.27f)
                lineToRelative(-0.14f, 4f)
                horizontalLineToRelative(-3.64f)
                lineToRelative(0.51f, -4f)
                close()
            }
        }.also { _SolarPanel = it}
