package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SkullCow: ImageVector? = null

val Icons.Rs.SkullCow: ImageVector
    get() = _SkullCow ?: UXIcon(name = "SkullCow") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17f, 10.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                close()
                moveTo(8.5f, 9f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(19.44f, 4.98f)
                lineToRelative(2.33f, 6.17f)
                curveToRelative(0.67f, 1.92f, -0.18f, 4.02f, -1.98f, 4.92f)
                lineToRelative(-1.93f, 0.68f)
                lineToRelative(-1.55f, 7.24f)
                lineTo(7.69f, 24.0f)
                lineToRelative(-1.55f, -7.24f)
                lineToRelative(-1.93f, -0.68f)
                curveToRelative(-1.8f, -0.9f, -2.65f, -3.0f, -1.99f, -4.9f)
                lineToRelative(2.34f, -6.2f)
                curveTo(2.01f, 4.76f, 0f, 2.61f, 0f, 0f)
                horizontalLineToRelative(2f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(14f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                horizontalLineToRelative(2f)
                curveToRelative(0f, 2.61f, -2.01f, 4.76f, -4.56f, 4.98f)
                close()
                moveTo(19.89f, 11.84f)
                lineToRelative(-2.58f, -6.84f)
                lineTo(6.69f, 5f)
                lineToRelative(-2.59f, 6.86f)
                curveToRelative(-0.32f, 0.91f, 0.09f, 1.94f, 0.95f, 2.4f)
                lineToRelative(2.81f, 0.98f)
                lineToRelative(1.45f, 6.76f)
                horizontalLineToRelative(5.38f)
                lineToRelative(1.45f, -6.76f)
                lineToRelative(2.81f, -0.98f)
                curveToRelative(0.86f, -0.46f, 1.27f, -1.49f, 0.94f, -2.42f)
                close()
            }
        }.also { _SkullCow = it}
