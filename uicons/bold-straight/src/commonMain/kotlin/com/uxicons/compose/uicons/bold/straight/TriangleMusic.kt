package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TriangleMusic: ImageVector? = null

val Icons.Bs.TriangleMusic: ImageVector
    get() = _TriangleMusic ?: UXIcon(name = "TriangleMusic") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.47f, 21.78f)
                curveToRelative(-0.77f, 1.39f, -2.19f, 2.22f, -3.78f, 2.22f)
                lineTo(4.35f, 24f)
                curveToRelative(-1.59f, 0f, -3.0f, -0.83f, -3.78f, -2.22f)
                curveToRelative(-0.77f, -1.39f, -0.73f, -3.03f, 0.11f, -4.38f)
                lineToRelative(7.67f, -12.35f)
                curveToRelative(0.52f, -0.83f, 1.27f, -1.44f, 2.15f, -1.77f)
                lineTo(10.5f, 0f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3.28f)
                curveToRelative(0.89f, 0.32f, 1.67f, 0.93f, 2.19f, 1.76f)
                lineToRelative(-1.77f, 2.84f)
                lineToRelative(-0.78f, -1.25f)
                curveToRelative(-0.35f, -0.56f, -0.9f, -0.63f, -1.12f, -0.63f)
                horizontalLineToRelative(-0.01f)
                curveToRelative(-0.22f, 0f, -0.77f, 0.07f, -1.12f, 0.63f)
                lineToRelative(-7.67f, 12.35f)
                curveToRelative(-0.37f, 0.6f, -0.15f, 1.14f, -0.03f, 1.34f)
                reflectiveCurveToRelative(0.46f, 0.68f, 1.16f, 0.68f)
                horizontalLineToRelative(15.34f)
                curveToRelative(0.7f, 0f, 1.04f, -0.48f, 1.16f, -0.68f)
                curveToRelative(0.11f, -0.2f, 0.34f, -0.74f, -0.03f, -1.34f)
                lineToRelative(-2.77f, -4.46f)
                lineToRelative(1.77f, -2.84f)
                lineToRelative(3.55f, 5.72f)
                curveToRelative(0.84f, 1.35f, 0.88f, 2.99f, 0.11f, 4.38f)
                close()
                moveTo(13f, 13f)
                curveToRelative(-1.66f, 0f, -3f, 1.34f, -3f, 3f)
                reflectiveCurveToRelative(1.34f, 3f, 3f, 3f)
                reflectiveCurveToRelative(3f, -1.34f, 3f, -3f)
                curveToRelative(0f, -0.51f, -0.13f, -0.99f, -0.35f, -1.42f)
                lineToRelative(6.3f, -10.14f)
                lineToRelative(-2.55f, -1.58f)
                lineToRelative(-6.3f, 10.14f)
                curveToRelative(-0.03f, -0.0f, -0.06f, -0.0f, -0.1f, -0.0f)
                close()
            }
        }.also { _TriangleMusic = it}
