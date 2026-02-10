package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _VideoSlash: ImageVector? = null

val Icons.Rr.VideoSlash: ImageVector
    get() = _VideoSlash ?: UXIcon(name = "VideoSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 19f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                lineTo(5f, 20f)
                curveTo(2.24f, 20f, 0f, 17.76f, 0f, 15f)
                verticalLineToRelative(-6f)
                curveTo(0f, 8.15f, 0.22f, 7.31f, 0.62f, 6.58f)
                curveToRelative(0.27f, -0.48f, 0.88f, -0.66f, 1.36f, -0.39f)
                curveToRelative(0.48f, 0.27f, 0.66f, 0.88f, 0.39f, 1.36f)
                curveToRelative(-0.24f, 0.44f, -0.37f, 0.94f, -0.37f, 1.45f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                lineTo(14f, 18f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                close()
                moveTo(18.64f, 16.88f)
                curveToRelative(-0.03f, 0.08f, -0.08f, 0.15f, -0.13f, 0.22f)
                lineToRelative(5.2f, 5.2f)
                curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0f, 1.41f)
                curveToRelative(-0.2f, 0.2f, -0.45f, 0.29f, -0.71f, 0.29f)
                reflectiveCurveToRelative(-0.51f, -0.1f, -0.71f, -0.29f)
                lineTo(4.29f, 5.71f)
                horizontalLineToRelative(0f)
                lineTo(0.29f, 1.71f)
                curveTo(-0.1f, 1.32f, -0.1f, 0.68f, 0.29f, 0.29f)
                reflectiveCurveTo(1.32f, -0.1f, 1.71f, 0.29f)
                lineToRelative(3.71f, 3.71f)
                lineTo(14f, 4f)
                curveToRelative(2.62f, 0f, 4.75f, 2.03f, 4.96f, 4.59f)
                lineToRelative(1.76f, -1.77f)
                curveToRelative(0.03f, -0.03f, 0.07f, -0.07f, 0.11f, -0.1f)
                curveToRelative(0.6f, -0.45f, 1.4f, -0.53f, 2.08f, -0.19f)
                curveToRelative(0.68f, 0.34f, 1.1f, 1.02f, 1.1f, 1.77f)
                verticalLineToRelative(7.32f)
                curveToRelative(0f, 0.76f, -0.42f, 1.44f, -1.1f, 1.77f)
                curveToRelative(-0.28f, 0.14f, -0.59f, 0.21f, -0.89f, 0.21f)
                curveToRelative(-0.42f, 0f, -0.84f, -0.14f, -1.19f, -0.4f)
                curveToRelative(-0.04f, -0.03f, -0.07f, -0.06f, -0.11f, -0.09f)
                lineToRelative(-1.75f, -1.75f)
                curveToRelative(-0.04f, 0.52f, -0.13f, 1.02f, -0.33f, 1.5f)
                close()
                moveTo(19f, 12.58f)
                lineToRelative(3.03f, 3.02f)
                lineToRelative(-0.03f, -7.24f)
                lineToRelative(-3f, 3.03f)
                verticalLineToRelative(1.19f)
                close()
                moveTo(17f, 9f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                lineTo(7.41f, 6f)
                lineToRelative(9.54f, 9.54f)
                curveToRelative(0.03f, -0.17f, 0.05f, -0.35f, 0.05f, -0.54f)
                verticalLineToRelative(-6f)
                close()
            }
        }.also { _VideoSlash = it}
