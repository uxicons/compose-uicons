package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ScreenShare: ImageVector? = null

val Icons.Rr.ScreenShare: ImageVector
    get() = _ScreenShare ?: UXIcon(name = "ScreenShare") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 15.18f)
                verticalLineToRelative(-7.18f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                lineTo(7f, 3f)
                curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
                verticalLineToRelative(7.18f)
                curveToRelative(-1.16f, 0.41f, -2f, 1.51f, -2f, 2.82f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                lineTo(21f, 21f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                curveToRelative(0f, -1.3f, -0.84f, -2.4f, -2f, -2.82f)
                close()
                moveTo(7f, 5f)
                horizontalLineToRelative(10f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(-4.5f)
                curveToRelative(-0.27f, 0f, -0.52f, 0.1f, -0.71f, 0.29f)
                lineToRelative(-0.71f, 0.71f)
                horizontalLineToRelative(-4.17f)
                lineToRelative(-0.71f, -0.71f)
                curveToRelative(-0.19f, -0.19f, -0.44f, -0.29f, -0.71f, -0.29f)
                lineTo(4f, 15f)
                verticalLineToRelative(-7f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                close()
                moveTo(21f, 19f)
                lineTo(3f, 19f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(5.09f)
                lineToRelative(0.71f, 0.71f)
                curveToRelative(0.19f, 0.19f, 0.44f, 0.29f, 0.71f, 0.29f)
                horizontalLineToRelative(5f)
                curveToRelative(0.27f, 0f, 0.52f, -0.1f, 0.71f, -0.29f)
                lineToRelative(0.71f, -0.71f)
                horizontalLineToRelative(5.09f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
                moveTo(8.34f, 10.75f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0f, -1.41f)
                lineToRelative(2.26f, -2.26f)
                curveToRelative(0.78f, -0.78f, 2.04f, -0.78f, 2.81f, 0f)
                lineToRelative(2.26f, 2.26f)
                curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0f, 1.41f)
                curveToRelative(-0.2f, 0.2f, -0.45f, 0.29f, -0.71f, 0.29f)
                reflectiveCurveToRelative(-0.51f, -0.1f, -0.71f, -0.29f)
                lineToRelative(-1.25f, -1.25f)
                verticalLineToRelative(3.5f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-3.51f)
                lineToRelative(-1.25f, 1.26f)
                curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0f)
                close()
            }
        }.also { _ScreenShare = it}
