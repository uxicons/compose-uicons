package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowUpLeftFromCircle: ImageVector? = null

val Icons.Sr.ArrowUpLeftFromCircle: ImageVector
    get() = _ArrowUpLeftFromCircle ?: UXIcon(name = "ArrowUpLeftFromCircle") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 3.41f)
                verticalLineToRelative(6.59f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineTo(3f)
                curveTo(0f, 1.35f, 1.35f, 0f, 3f, 0f)
                horizontalLineToRelative(7f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                horizontalLineTo(3.41f)
                lineTo(15.71f, 14.29f)
                curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0f, 1.41f)
                curveToRelative(-0.2f, 0.2f, -0.45f, 0.29f, -0.71f, 0.29f)
                reflectiveCurveToRelative(-0.51f, -0.1f, -0.71f, -0.29f)
                lineTo(2f, 3.41f)
                close()
                moveTo(23.95f, 13.0f)
                curveToRelative(-0.45f, -4.63f, -4.19f, -8.42f, -8.81f, -8.93f)
                curveToRelative(-1.54f, -0.17f, -3.05f, 0.0f, -4.48f, 0.51f)
                curveToRelative(-0.32f, 0.11f, -0.57f, 0.39f, -0.64f, 0.72f)
                curveToRelative(-0.08f, 0.34f, 0.03f, 0.69f, 0.27f, 0.93f)
                lineToRelative(6.87f, 6.87f)
                curveToRelative(1.12f, 1.12f, 1.12f, 2.95f, 0f, 4.07f)
                curveToRelative(-1.12f, 1.12f, -2.95f, 1.12f, -4.07f, 0f)
                lineToRelative(-6.87f, -6.87f)
                curveToRelative(-0.24f, -0.24f, -0.59f, -0.34f, -0.93f, -0.27f)
                curveToRelative(-0.33f, 0.08f, -0.61f, 0.32f, -0.72f, 0.64f)
                curveToRelative(-0.5f, 1.42f, -0.68f, 2.94f, -0.51f, 4.48f)
                curveToRelative(0.51f, 4.62f, 4.3f, 8.35f, 8.93f, 8.81f)
                curveToRelative(6.3f, 0.62f, 11.57f, -4.65f, 10.96f, -10.95f)
                close()
            }
        }.also { _ArrowUpLeftFromCircle = it}
