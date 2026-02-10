package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChickenBucket: ImageVector? = null

val Icons.Br.ChickenBucket: ImageVector
    get() = _ChickenBucket ?: UXIcon(name = "ChickenBucket") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(18f, 14.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            curveToRelative(-0.24f, 0f, -0.46f, -0.06f, -0.66f, -0.16f)
            curveToRelative(0.1f, 0.2f, 0.16f, 0.42f, 0.16f, 0.66f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            curveToRelative(0f, -0.56f, 0.32f, -1.05f, 0.78f, -1.31f)
            lineToRelative(-1.22f, -1.22f)
            curveToRelative(-1.15f, -0.08f, -4.28f, -0.39f, -5.46f, -1.57f)
            curveToRelative(-1.46f, -1.46f, -1.46f, -3.84f, 0f, -5.3f)
            reflectiveCurveToRelative(3.84f, -1.46f, 5.3f, 0f)
            curveToRelative(1.18f, 1.18f, 1.5f, 4.31f, 1.57f, 5.46f)
            lineToRelative(1.22f, 1.22f)
            curveToRelative(0.26f, -0.46f, 0.74f, -0.78f, 1.31f, -0.78f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            close()
            moveTo(22.88f, 4.95f)
            lineTo(21.82f, 16.98f)
            curveToRelative(-0.25f, 2.86f, -2.61f, 5.02f, -5.48f, 5.02f)
            horizontalLineToRelative(-8.67f)
            curveToRelative(-2.87f, 0f, -5.23f, -2.16f, -5.48f, -5.02f)
            lineToRelative(-1.06f, -12.04f)
            curveToRelative(-0.64f, -0.17f, -1.12f, -0.75f, -1.12f, -1.45f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            horizontalLineToRelative(21f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            curveToRelative(0f, 0.7f, -0.48f, 1.28f, -1.12f, 1.45f)
            close()
            moveTo(18.83f, 16.72f)
            lineTo(19.86f, 5f)
            horizontalLineToRelative(-15.72f)
            lineToRelative(1.03f, 11.72f)
            curveToRelative(0.12f, 1.3f, 1.19f, 2.28f, 2.49f, 2.28f)
            horizontalLineToRelative(8.68f)
            curveToRelative(1.3f, 0f, 2.38f, -0.98f, 2.49f, -2.28f)
            close()
        }
    }.also { _ChickenBucket = it }
