package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChickenBucket: ImageVector? = null

val Icons.Bs.ChickenBucket: ImageVector
    get() = _ChickenBucket ?: UXIcon(name = "ChickenBucket") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(7.1f, 12.4f)
                curveToRelative(-1.46f, -1.46f, -1.46f, -3.84f, 0f, -5.3f)
                reflectiveCurveToRelative(3.84f, -1.46f, 5.3f, 0f)
                curveToRelative(1.18f, 1.18f, 1.5f, 4.31f, 1.57f, 5.46f)
                lineToRelative(1.22f, 1.22f)
                curveToRelative(0.26f, -0.46f, 0.74f, -0.78f, 1.31f, -0.78f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                curveToRelative(-0.24f, 0f, -0.46f, -0.06f, -0.66f, -0.16f)
                curveToRelative(0.1f, 0.2f, 0.16f, 0.42f, 0.16f, 0.66f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                curveToRelative(0f, -0.56f, 0.32f, -1.05f, 0.78f, -1.31f)
                lineToRelative(-1.22f, -1.22f)
                curveToRelative(-1.15f, -0.08f, -4.28f, -0.39f, -5.46f, -1.57f)
                close()
                moveTo(24f, 5f)
                horizontalLineToRelative(-0.67f)
                lineToRelative(-1.64f, 13.91f)
                curveToRelative(-0.21f, 1.76f, -1.7f, 3.09f, -3.48f, 3.09f)
                horizontalLineToRelative(-12.44f)
                curveToRelative(-1.77f, 0f, -3.27f, -1.33f, -3.48f, -3.09f)
                lineToRelative(-1.64f, -13.91f)
                horizontalLineToRelative(-0.67f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(24f)
                close()
                moveTo(20.31f, 5f)
                horizontalLineToRelative(-16.63f)
                lineToRelative(1.59f, 13.56f)
                curveToRelative(0.03f, 0.25f, 0.24f, 0.44f, 0.5f, 0.44f)
                horizontalLineToRelative(12.44f)
                curveToRelative(0.25f, 0f, 0.47f, -0.19f, 0.5f, -0.44f)
                lineToRelative(1.59f, -13.56f)
                close()
            }
        }.also { _ChickenBucket = it}
