package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SmartGlasses: ImageVector? = null

val Icons.Sr.SmartGlasses: ImageVector
    get() = _SmartGlasses ?: UXIcon(name = "SmartGlasses") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(0.15f, 8f)
                curveToRelative(0.16f, -0.61f, 0.45f, -1.19f, 0.88f, -1.67f)
                curveToRelative(0.76f, -0.84f, 1.84f, -1.33f, 2.98f, -1.33f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                close()
                moveTo(22.98f, 6.33f)
                curveToRelative(-0.76f, -0.84f, -1.84f, -1.33f, -2.98f, -1.33f)
                horizontalLineToRelative(-11f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                horizontalLineToRelative(-5.92f)
                lineToRelative(0.59f, 5.43f)
                curveToRelative(0.22f, 2.04f, 1.93f, 3.57f, 3.98f, 3.57f)
                horizontalLineToRelative(2.04f)
                curveToRelative(1.49f, 0f, 2.84f, -0.82f, 3.54f, -2.13f)
                lineToRelative(1.01f, -1.91f)
                curveToRelative(0.22f, -0.41f, 0.6f, -0.46f, 0.76f, -0.46f)
                reflectiveCurveToRelative(0.54f, 0.04f, 0.76f, 0.46f)
                lineToRelative(1.01f, 1.91f)
                curveToRelative(0.69f, 1.31f, 2.05f, 2.13f, 3.54f, 2.13f)
                horizontalLineToRelative(2.04f)
                curveToRelative(2.05f, 0f, 3.76f, -1.53f, 3.98f, -3.57f)
                lineToRelative(0.65f, -6f)
                curveToRelative(0.12f, -1.13f, -0.24f, -2.26f, -1f, -3.1f)
                close()
            }
        }.also { _SmartGlasses = it}
