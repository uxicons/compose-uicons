package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Moped: ImageVector? = null

val Icons.Bs.Moped: ImageVector
    get() = _Moped ?: UXIcon(name = "Moped") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 19f)
                curveToRelative(0f, 1.66f, -1.34f, 3f, -3f, 3f)
                reflectiveCurveToRelative(-3f, -1.34f, -3f, -3f)
                reflectiveCurveToRelative(1.34f, -3f, 3f, -3f)
                reflectiveCurveToRelative(3f, 1.34f, 3f, 3f)
                close()
                moveTo(24f, 11f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-2.83f)
                curveToRelative(-1.27f, 0f, -2.49f, 0.54f, -3.34f, 1.49f)
                lineToRelative(-3.16f, 3.51f)
                horizontalLineToRelative(-6.67f)
                curveToRelative(0f, 1.66f, -1.34f, 3f, -3f, 3f)
                reflectiveCurveToRelative(-3f, -1.34f, -3f, -3f)
                lineTo(0f, 19f)
                verticalLineToRelative(-6.5f)
                curveToRelative(0f, -2.48f, 2.02f, -4.5f, 4.5f, -4.5f)
                horizontalLineToRelative(3.54f)
                lineToRelative(3f, 8f)
                horizontalLineToRelative(2.29f)
                lineToRelative(2.27f, -2.52f)
                curveToRelative(0.34f, -0.38f, 0.71f, -0.71f, 1.11f, -1.0f)
                lineToRelative(-2.75f, -7.48f)
                horizontalLineToRelative(-2.95f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(5.05f)
                lineToRelative(1.16f, 3.14f)
                curveToRelative(0.32f, -0.67f, 1.0f, -1.14f, 1.8f, -1.14f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-1f)
                curveToRelative(-0.29f, 0f, -0.56f, -0.06f, -0.81f, -0.17f)
                lineToRelative(1.25f, 3.38f)
                curveToRelative(0.56f, -0.13f, 1.14f, -0.21f, 1.73f, -0.21f)
                horizontalLineToRelative(2.83f)
                close()
                moveTo(3f, 16f)
                horizontalLineToRelative(4.84f)
                lineToRelative(-1.88f, -5f)
                horizontalLineToRelative(-1.46f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(3.5f)
                close()
            }
        }.also { _Moped = it}
