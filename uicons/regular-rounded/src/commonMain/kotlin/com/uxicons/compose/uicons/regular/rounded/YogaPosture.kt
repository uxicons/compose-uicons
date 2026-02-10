package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _YogaPosture: ImageVector? = null

val Icons.Rr.YogaPosture: ImageVector
    get() = _YogaPosture ?: UXIcon(name = "YogaPosture") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.0f, 15.5f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                close()
                moveTo(18f, 14.56f)
                lineToRelative(-0.02f, 7.44f)
                curveToRelative(0f, 0.55f, -0.45f, 1.0f, -1f, 1.0f)
                horizontalLineToRelative(-0.0f)
                curveToRelative(-0.55f, 0f, -1.0f, -0.45f, -1.0f, -1.0f)
                lineToRelative(0.03f, -11.09f)
                curveToRelative(0f, -2.04f, -1.52f, -3.67f, -3.54f, -3.89f)
                curveToRelative(-0.48f, 0.62f, -1.37f, 1.52f, -2.83f, 1.85f)
                curveToRelative(-0.37f, 0.62f, -0.57f, 1.31f, -0.57f, 2.04f)
                lineToRelative(-0.03f, 11.09f)
                curveToRelative(-0.0f, 0.55f, -0.45f, 1.0f, -1f, 1.0f)
                horizontalLineToRelative(-0.0f)
                curveToRelative(-0.55f, 0f, -1.0f, -0.45f, -1.0f, -1.0f)
                lineToRelative(0.03f, -11.09f)
                curveToRelative(0f, -0.79f, 0.17f, -1.54f, 0.46f, -2.26f)
                lineToRelative(-1.99f, -0.84f)
                curveToRelative(-0.32f, 0.96f, -0.5f, 2.03f, -0.5f, 3.19f)
                verticalLineToRelative(11f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                lineTo(3.03f, 11f)
                curveTo(3.03f, 5.11f, 6.72f, 1f, 12.0f, 1f)
                curveToRelative(4.56f, 0f, 9.36f, 2.98f, 9.5f, 7.97f)
                curveToRelative(0.08f, 2.94f, -2.38f, 4.87f, -3.5f, 5.59f)
                close()
                moveTo(19.5f, 9.03f)
                curveToRelative(-0.1f, -3.77f, -3.89f, -6.03f, -7.5f, -6.03f)
                curveToRelative(-2.4f, 0f, -4.37f, 1.13f, -5.6f, 3.01f)
                lineToRelative(2.32f, 0.98f)
                curveToRelative(1.38f, -0.08f, 2.03f, -1f, 2.32f, -1.4f)
                curveToRelative(0.15f, -0.21f, 0.42f, -0.59f, 0.96f, -0.59f)
                curveToRelative(3.31f, 0f, 6.01f, 2.65f, 6.01f, 5.91f)
                lineToRelative(-0.0f, 1.12f)
                curveToRelative(0.76f, -0.71f, 1.53f, -1.75f, 1.49f, -3.0f)
                close()
            }
        }.also { _YogaPosture = it}
