package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ClipFile: ImageVector? = null

val Icons.Sr.ClipFile: ImageVector
    get() = _ClipFile ?: UXIcon(name = "ClipFile") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17.47f, 0.05f)
                curveToRelative(0.33f, 0.58f, 0.53f, 1.24f, 0.53f, 1.95f)
                verticalLineToRelative(8.38f)
                curveToRelative(0f, 1.17f, -0.74f, 2.27f, -1.87f, 2.55f)
                curveToRelative(-1.65f, 0.4f, -3.13f, -0.84f, -3.13f, -2.42f)
                lineTo(13f, 3f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(7.5f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                lineTo(16f, 2.09f)
                curveToRelative(0f, -0.87f, -0.51f, -1.72f, -1.34f, -1.98f)
                curveToRelative(-1.38f, -0.44f, -2.66f, 0.58f, -2.66f, 1.9f)
                verticalLineToRelative(7f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                lineTo(10f, 2f)
                curveToRelative(0f, -0.73f, 0.21f, -1.41f, 0.56f, -2f)
                horizontalLineToRelative(-3.56f)
                curveTo(4.24f, 0f, 2f, 2.24f, 2f, 5f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(10f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                lineTo(22f, 5f)
                curveToRelative(0f, -2.6f, -1.99f, -4.71f, -4.53f, -4.95f)
                close()
                moveTo(7f, 13f)
                horizontalLineToRelative(4f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-4f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                close()
                moveTo(17f, 19f)
                lineTo(7f, 19f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(10f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
            }
        }.also { _ClipFile = it}
