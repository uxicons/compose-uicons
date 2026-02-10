package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChickenBucket: ImageVector? = null

val Icons.Rs.ChickenBucket: ImageVector
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
                verticalLineToRelative(-0.43f)
                curveToRelative(-0.02f, -0.67f, -0.19f, -4.07f, -1.59f, -5.47f)
                curveToRelative(-1.58f, -1.58f, -4.14f, -1.58f, -5.72f, 0f)
                curveToRelative(-0.77f, 0.76f, -1.19f, 1.78f, -1.19f, 2.86f)
                reflectiveCurveToRelative(0.42f, 2.1f, 1.19f, 2.86f)
                curveToRelative(1.4f, 1.4f, 4.8f, 1.57f, 5.5f, 1.59f)
                close()
                moveTo(8.6f, 8.6f)
                curveToRelative(0.75f, -0.75f, 2.13f, -0.79f, 2.9f, 0f)
                curveToRelative(0.59f, 0.59f, 0.93f, 2.58f, 1.0f, 3.89f)
                curveToRelative(-1.34f, -0.07f, -3.3f, -0.41f, -3.89f, -1.0f)
                curveToRelative(-0.79f, -0.76f, -0.75f, -2.15f, 0f, -2.9f)
                close()
                moveTo(24f, 2f)
                horizontalLineToRelative(-24f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(1.1f)
                lineToRelative(1.7f, 15.33f)
                curveToRelative(0.17f, 1.52f, 1.45f, 2.67f, 2.98f, 2.67f)
                horizontalLineToRelative(12.42f)
                curveToRelative(1.53f, 0f, 2.81f, -1.15f, 2.98f, -2.67f)
                lineToRelative(1.7f, -15.33f)
                horizontalLineToRelative(1.1f)
                verticalLineToRelative(-2f)
                close()
                moveTo(19.2f, 19.11f)
                curveToRelative(-0.06f, 0.51f, -0.48f, 0.89f, -0.99f, 0.89f)
                horizontalLineToRelative(-12.42f)
                curveToRelative(-0.51f, 0f, -0.94f, -0.38f, -0.99f, -0.89f)
                lineToRelative(-1.68f, -15.11f)
                horizontalLineToRelative(17.77f)
                close()
            }
        }.also { _ChickenBucket = it}
