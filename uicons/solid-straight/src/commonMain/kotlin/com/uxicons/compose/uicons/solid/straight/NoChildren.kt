package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _NoChildren: ImageVector? = null

val Icons.Ss.NoChildren: ImageVector
    get() = _NoChildren ?: UXIcon(name = "NoChildren") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17f, 7.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                close()
                moveTo(24f, 12f)
                curveToRelative(0f, 6.62f, -5.38f, 12f, -12f, 12f)
                reflectiveCurveToRelative(-12f, -5.38f, -12f, -12f)
                reflectiveCurveToRelative(5.38f, -12f, 12f, -12f)
                reflectiveCurveToRelative(12f, 5.38f, 12f, 12f)
                close()
                moveTo(18.32f, 19.74f)
                lineTo(4.26f, 5.68f)
                curveToRelative(-1.41f, 1.73f, -2.26f, 3.93f, -2.26f, 6.32f)
                curveToRelative(0f, 5.51f, 4.49f, 10f, 10f, 10f)
                curveToRelative(2.4f, 0f, 4.6f, -0.85f, 6.32f, -2.26f)
                close()
                moveTo(22f, 12f)
                curveToRelative(0f, -5.51f, -4.49f, -10f, -10f, -10f)
                curveToRelative(-2.4f, 0f, -4.6f, 0.85f, -6.33f, 2.26f)
                lineToRelative(1.99f, 1.99f)
                curveToRelative(0.24f, -0.16f, 0.53f, -0.25f, 0.83f, -0.25f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                curveToRelative(0f, 0.31f, -0.09f, 0.59f, -0.25f, 0.83f)
                lineToRelative(3.28f, 3.28f)
                curveToRelative(0.17f, -0.93f, 1.01f, -1.62f, 1.96f, -1.61f)
                horizontalLineToRelative(1.02f)
                curveToRelative(0.88f, 0f, 1.66f, 0.58f, 1.92f, 1.43f)
                lineToRelative(1.07f, 4.58f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(0.59f)
                lineToRelative(1.74f, 1.74f)
                curveToRelative(1.41f, -1.73f, 2.26f, -3.93f, 2.26f, -6.32f)
                close()
                moveTo(5.14f, 13.84f)
                lineTo(6.0f, 13.12f)
                horizontalLineToRelative(0.0f)
                verticalLineToRelative(3.88f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-1.77f)
                lineToRelative(-4.84f, -4.84f)
                lineToRelative(-2.3f, 1.93f)
                lineToRelative(1.29f, 1.53f)
                close()
            }
        }.also { _NoChildren = it}
