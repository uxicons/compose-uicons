package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Strikethrough: ImageVector? = null

val Icons.Tr.Strikethrough: ImageVector
    get() = _Strikethrough ?: UXIcon(name = "Strikethrough") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 12f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                lineTo(0.5f, 12.5f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                reflectiveCurveToRelative(0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(7.55f)
                lineToRelative(-1.84f, -0.47f)
                curveToRelative(-2.48f, -0.64f, -4.21f, -2.87f, -4.21f, -5.42f)
                curveTo(2f, 2.51f, 4.51f, 0f, 7.6f, 0f)
                horizontalLineToRelative(8.8f)
                curveToRelative(3.09f, 0f, 5.6f, 2.51f, 5.6f, 5.6f)
                verticalLineToRelative(0.9f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                reflectiveCurveToRelative(-0.5f, -0.22f, -0.5f, -0.5f)
                verticalLineToRelative(-0.9f)
                curveToRelative(0f, -2.54f, -2.06f, -4.6f, -4.6f, -4.6f)
                lineTo(7.6f, 1f)
                curveToRelative(-2.54f, 0f, -4.6f, 2.06f, -4.6f, 4.6f)
                curveToRelative(0f, 2.1f, 1.42f, 3.93f, 3.46f, 4.46f)
                lineToRelative(5.61f, 1.44f)
                horizontalLineToRelative(11.44f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                close()
                moveTo(19.65f, 14.43f)
                curveToRelative(-0.2f, 0.2f, -0.2f, 0.51f, 0f, 0.71f)
                curveToRelative(0.87f, 0.87f, 1.35f, 2.03f, 1.35f, 3.26f)
                curveToRelative(0f, 2.54f, -2.06f, 4.6f, -4.6f, 4.6f)
                lineTo(7.6f, 23.0f)
                curveToRelative(-2.54f, 0f, -4.6f, -2.06f, -4.6f, -4.6f)
                verticalLineToRelative(-0.9f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                reflectiveCurveToRelative(-0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(0.9f)
                curveToRelative(0f, 3.09f, 2.51f, 5.6f, 5.6f, 5.6f)
                horizontalLineToRelative(8.8f)
                curveToRelative(3.09f, 0f, 5.6f, -2.51f, 5.6f, -5.6f)
                curveToRelative(0f, -1.5f, -0.58f, -2.91f, -1.65f, -3.97f)
                curveToRelative(-0.2f, -0.19f, -0.51f, -0.19f, -0.71f, 0f)
                close()
            }
        }.also { _Strikethrough = it}
