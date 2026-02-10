package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TriangleMusic: ImageVector? = null

val Icons.Ts.TriangleMusic: ImageVector
    get() = _TriangleMusic ?: UXIcon(name = "TriangleMusic") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.53f, 22.14f)
                curveToRelative(-0.65f, 1.16f, -1.83f, 1.86f, -3.15f, 1.86f)
                lineTo(3.62f, 24f)
                curveToRelative(-1.33f, 0f, -2.5f, -0.69f, -3.15f, -1.86f)
                curveToRelative(-0.66f, -1.17f, -0.62f, -2.56f, 0.08f, -3.7f)
                lineTo(9.02f, 4.72f)
                curveToRelative(0.58f, -0.94f, 1.47f, -1.53f, 2.48f, -1.68f)
                lineTo(11.5f, 0f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(3.04f)
                curveToRelative(1.02f, 0.15f, 1.91f, 0.75f, 2.48f, 1.68f)
                lineToRelative(1.13f, 1.83f)
                lineToRelative(-0.59f, 0.95f)
                lineToRelative(-1.39f, -2.26f)
                curveToRelative(-0.49f, -0.8f, -1.25f, -1.24f, -2.14f, -1.25f)
                curveToRelative(-0.88f, 0.01f, -1.64f, 0.45f, -2.13f, 1.25f)
                lineTo(1.4f, 18.97f)
                curveToRelative(-0.51f, 0.83f, -0.53f, 1.83f, -0.06f, 2.69f)
                curveToRelative(0.47f, 0.84f, 1.32f, 1.34f, 2.28f, 1.34f)
                horizontalLineToRelative(16.76f)
                curveToRelative(0.96f, 0f, 1.81f, -0.5f, 2.28f, -1.34f)
                curveToRelative(0.47f, -0.85f, 0.45f, -1.86f, -0.06f, -2.69f)
                lineToRelative(-4.14f, -6.71f)
                lineToRelative(0.59f, -0.95f)
                lineToRelative(4.4f, 7.13f)
                curveToRelative(0.71f, 1.14f, 0.74f, 2.52f, 0.08f, 3.7f)
                close()
                moveTo(14.29f, 13.29f)
                lineToRelative(6.46f, -10.4f)
                lineToRelative(0.85f, 0.53f)
                lineToRelative(-6.49f, 10.45f)
                curveToRelative(0.55f, 0.54f, 0.9f, 1.3f, 0.9f, 2.13f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                reflectiveCurveToRelative(-3f, -1.35f, -3f, -3f)
                reflectiveCurveToRelative(1.35f, -3f, 3f, -3f)
                curveToRelative(0.46f, 0f, 0.9f, 0.1f, 1.28f, 0.29f)
                close()
                moveTo(15f, 16f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                close()
            }
        }.also { _TriangleMusic = it}
