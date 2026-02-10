package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CloudMoon: ImageVector? = null

val Icons.Ss.CloudMoon: ImageVector
    get() = _CloudMoon ?: UXIcon(name = "CloudMoon") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.5f, 24f)
                horizontalLineToRelative(-9f)
                arcToRelative(4.51f, 4.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.45f, -8.27f)
                curveTo(6.26f, 8.64f, 16.23f, 6.35f, 18.65f, 13f)
                curveTo(25.81f, 13.41f, 25.68f, 23.78f, 18.5f, 24f)
                close()
                moveTo(3.35f, 17.39f)
                arcTo(6.44f, 6.44f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 14.81f)
                arcToRelative(8.01f, 8.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.39f, -7.36f)
                horizontalLineToRelative(0f)
                arcToRelative(8.52f, 8.52f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.28f, -4.4f)
                lineToRelative(1.87f, -0.8f)
                lineToRelative(-1.78f, -0.99f)
                curveTo(4.28f, -4.3f, -5.33f, 9.47f, 3.35f, 17.39f)
                close()
            }
        }.also { _CloudMoon = it}
