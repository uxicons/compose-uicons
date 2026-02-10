package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Balloon: ImageVector? = null

val Icons.Ss.Balloon: ImageVector
    get() = _Balloon ?: UXIcon(name = "Balloon") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22f, 9.38f)
                curveTo(22f, 4.21f, 17.51f, 0.01f, 12f, 0.01f)
                reflectiveCurveTo(2f, 4.21f, 2f, 9.38f)
                curveToRelative(0f, 5.56f, 3.71f, 11.72f, 8.85f, 12.54f)
                curveToRelative(-0.51f, 0.55f, -0.85f, 1.4f, -0.85f, 2.08f)
                horizontalLineToRelative(4f)
                curveToRelative(0f, -0.69f, -0.34f, -1.53f, -0.85f, -2.08f)
                curveToRelative(5.14f, -0.81f, 8.85f, -6.98f, 8.85f, -12.54f)
                close()
                moveTo(14.67f, 15.5f)
                lineToRelative(-1.42f, -1.28f)
                curveToRelative(0.79f, -0.9f, 1.63f, -2.45f, 1.75f, -4.22f)
                horizontalLineToRelative(1.97f)
                curveToRelative(-0.16f, 2.32f, -1.26f, 4.35f, -2.29f, 5.5f)
                close()
            }
        }.also { _Balloon = it}
