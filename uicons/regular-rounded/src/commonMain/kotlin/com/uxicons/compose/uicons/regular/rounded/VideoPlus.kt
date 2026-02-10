package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _VideoPlus: ImageVector? = null

val Icons.Rr.VideoPlus: ImageVector
    get() = _VideoPlus ?: UXIcon(name = "VideoPlus") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.9f, 6.54f)
                curveToRelative(-0.68f, -0.34f, -1.47f, -0.27f, -2.08f, 0.19f)
                curveToRelative(-0.04f, 0.03f, -1.84f, 1.84f, -1.84f, 1.84f)
                curveToRelative(-0.22f, -2.56f, -2.37f, -4.57f, -4.98f, -4.57f)
                lineTo(5f, 4f)
                curveTo(2.24f, 4f, 0f, 6.24f, 0f, 9f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                lineTo(14f, 20f)
                curveToRelative(2.62f, 0f, 4.78f, -2.03f, 4.98f, -4.61f)
                curveToRelative(0f, 0f, 1.8f, 1.8f, 1.84f, 1.82f)
                curveToRelative(0.35f, 0.26f, 0.77f, 0.4f, 1.19f, 0.4f)
                curveToRelative(0.3f, 0f, 0.61f, -0.07f, 0.89f, -0.21f)
                curveToRelative(0.68f, -0.34f, 1.1f, -1.02f, 1.1f, -1.77f)
                verticalLineToRelative(-7.32f)
                curveToRelative(0f, -0.76f, -0.42f, -1.44f, -1.1f, -1.77f)
                close()
                moveTo(17f, 15f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                lineTo(5f, 18f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                lineTo(14f, 6f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(6f)
                close()
                moveTo(19f, 12.58f)
                verticalLineToRelative(-1.19f)
                lineToRelative(3f, -3.03f)
                lineToRelative(0.03f, 7.24f)
                lineToRelative(-3.02f, -3.02f)
                close()
                moveTo(13.5f, 12f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                close()
            }
        }.also { _VideoPlus = it}
