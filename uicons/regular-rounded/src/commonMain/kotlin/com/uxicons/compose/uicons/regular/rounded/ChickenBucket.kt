package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChickenBucket: ImageVector? = null

val Icons.Rr.ChickenBucket: ImageVector
    get() = _ChickenBucket ?: UXIcon(name = "ChickenBucket") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12.69f, 14.5f)
                horizontalLineToRelative(0.4f)
                lineToRelative(0.69f, 0.69f)
                curveToRelative(-0.46f, 0.26f, -0.78f, 0.74f, -0.78f, 1.31f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                curveToRelative(0f, -0.24f, -0.06f, -0.46f, -0.16f, -0.66f)
                curveToRelative(0.2f, 0.1f, 0.42f, 0.16f, 0.66f, 0.16f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                curveToRelative(-0.56f, 0f, -1.05f, 0.32f, -1.31f, 0.78f)
                lineToRelative(-0.69f, -0.69f)
                curveToRelative(-0.03f, -1.06f, -0.05f, -4.19f, -1.59f, -5.9f)
                curveToRelative(-1.58f, -1.58f, -4.14f, -1.58f, -5.72f, 0f)
                curveToRelative(-1.57f, 1.51f, -1.57f, 4.22f, 0f, 5.72f)
                curveToRelative(1.4f, 1.4f, 4.8f, 1.57f, 5.5f, 1.59f)
                close()
                moveTo(8.6f, 8.6f)
                curveToRelative(0.76f, -0.79f, 2.13f, -0.79f, 2.9f, 0f)
                curveToRelative(0.59f, 0.59f, 0.93f, 2.58f, 1.0f, 3.89f)
                curveToRelative(-1.34f, -0.07f, -3.3f, -0.41f, -3.89f, -1.0f)
                curveToRelative(-0.79f, -0.76f, -0.79f, -2.13f, 0f, -2.9f)
                close()
                moveTo(23f, 2f)
                horizontalLineToRelative(-22f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(0.58f)
                lineToRelative(1.12f, 13.41f)
                curveToRelative(0.21f, 2.57f, 2.4f, 4.58f, 4.98f, 4.58f)
                horizontalLineToRelative(8.64f)
                curveToRelative(2.58f, 0f, 4.77f, -2.01f, 4.98f, -4.58f)
                lineToRelative(1.12f, -13.41f)
                horizontalLineToRelative(0.58f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
                moveTo(19.31f, 17.25f)
                curveToRelative(-0.13f, 1.54f, -1.44f, 2.75f, -2.99f, 2.75f)
                horizontalLineToRelative(-8.64f)
                curveToRelative(-1.55f, 0f, -2.86f, -1.21f, -2.99f, -2.75f)
                lineToRelative(-1.1f, -13.25f)
                horizontalLineToRelative(16.83f)
                close()
            }
        }.also { _ChickenBucket = it}
