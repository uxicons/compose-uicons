package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HairConditioner: ImageVector? = null

val Icons.Sr.HairConditioner: ImageVector
    get() = _HairConditioner ?: UXIcon(name = "HairConditioner") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(2.0f, 19f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 1.66f, -1.34f, 3f, -3f, 3f)
                horizontalLineToRelative(-4f)
                curveToRelative(-1.66f, 0f, -3f, -1.34f, -3f, -3f)
                close()
                moveTo(12.2f, 17f)
                curveToRelative(0.44f, -2.44f, 1.42f, -8.18f, 1.79f, -12.67f)
                curveToRelative(0.09f, -1.12f, -0.29f, -2.23f, -1.05f, -3.05f)
                curveToRelative(-0.75f, -0.82f, -1.82f, -1.28f, -2.94f, -1.28f)
                horizontalLineToRelative(-6f)
                curveToRelative(-1.11f, 0f, -2.18f, 0.47f, -2.94f, 1.29f)
                curveToRelative(-0.76f, 0.82f, -1.14f, 1.93f, -1.05f, 3.05f)
                curveToRelative(0.36f, 4.49f, 1.34f, 10.23f, 1.78f, 12.67f)
                close()
                moveTo(14.83f, 13f)
                curveToRelative(-0.23f, 1.58f, -0.45f, 2.97f, -0.62f, 4f)
                horizontalLineToRelative(3.79f)
                curveToRelative(1.63f, 0f, 3f, -1.34f, 3f, -2.93f)
                curveToRelative(0f, -1.07f, -0.3f, -1.52f, -0.9f, -2.32f)
                lineToRelative(-0.59f, -0.79f)
                curveToRelative(-0.34f, -0.46f, -1.04f, -0.44f, -1.35f, 0.05f)
                lineToRelative(-0.27f, 0.43f)
                curveToRelative(-0.16f, 0.26f, -0.88f, 1.56f, -2.38f, 1.56f)
                close()
                moveTo(21.5f, 19f)
                horizontalLineToRelative(-7.5f)
                verticalLineToRelative(2.5f)
                curveToRelative(0f, 0.93f, -0.28f, 1.78f, -0.76f, 2.5f)
                horizontalLineToRelative(8.26f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.12f, -2.5f, -2.5f, -2.5f)
                close()
            }
        }.also { _HairConditioner = it}
