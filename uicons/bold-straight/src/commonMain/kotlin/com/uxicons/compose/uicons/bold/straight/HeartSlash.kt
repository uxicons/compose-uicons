package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HeartSlash: ImageVector? = null

val Icons.Bs.HeartSlash: ImageVector
    get() = _HeartSlash ?: UXIcon(name = "HeartSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.46f, 18.41f)
                lineToRelative(2.14f, 2.14f)
                curveToRelative(-1.34f, 1.13f, -2.41f, 1.9f, -2.73f, 2.13f)
                lineToRelative(-0.87f, 0.61f)
                lineToRelative(-0.87f, -0.61f)
                curveTo(9.99f, 21.88f, 0f, 14.62f, 0f, 7.98f)
                curveToRelative(0f, -0.92f, 0.17f, -1.78f, 0.46f, -2.57f)
                lineToRelative(2.54f, 2.54f)
                curveToRelative(0f, 0.01f, -0.0f, 0.02f, -0.0f, 0.03f)
                curveToRelative(0f, 3.92f, 5.86f, 9.21f, 9f, 11.61f)
                curveToRelative(0.44f, -0.34f, 0.94f, -0.74f, 1.46f, -1.18f)
                close()
                moveTo(19.25f, 17.13f)
                lineToRelative(4.71f, 4.71f)
                lineToRelative(-2.12f, 2.12f)
                lineTo(0.04f, 2.16f)
                lineTo(2.16f, 0.04f)
                lineToRelative(1.66f, 1.66f)
                curveToRelative(0.91f, -0.44f, 1.91f, -0.69f, 2.94f, -0.69f)
                curveToRelative(2.12f, 0f, 4.01f, 1.02f, 5.25f, 2.61f)
                curveToRelative(1.24f, -1.59f, 3.13f, -2.61f, 5.25f, -2.61f)
                curveToRelative(3.72f, 0f, 6.75f, 3.03f, 6.75f, 6.75f)
                curveToRelative(0f, 2.82f, -1.6f, 5.97f, -4.75f, 9.38f)
                close()
                moveTo(6.17f, 4.05f)
                lineToRelative(10.96f, 10.96f)
                curveToRelative(2.51f, -2.74f, 3.87f, -5.28f, 3.87f, -7.26f)
                curveToRelative(0f, -2.07f, -1.68f, -3.75f, -3.75f, -3.75f)
                reflectiveCurveToRelative(-3.75f, 1.79f, -3.75f, 4f)
                horizontalLineToRelative(-3f)
                curveToRelative(0f, -2.21f, -1.68f, -4f, -3.75f, -4f)
                curveToRelative(-0.2f, 0f, -0.39f, 0.02f, -0.58f, 0.05f)
                close()
            }
        }.also { _HeartSlash = it}
