package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MaskFace: ImageVector? = null

val Icons.Ss.MaskFace: ImageVector
    get() = _MaskFace ?: UXIcon(name = "MaskFace") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.18f, 0.92f)
                curveToRelative(-1.16f, -0.87f, -2.62f, -1.14f, -4.01f, -0.74f)
                lineToRelative(-8.88f, 2.57f)
                curveToRelative(-0.42f, 0.12f, -0.86f, 0.21f, -1.3f, 0.25f)
                curveToRelative(-1.01f, 0.1f, -2.84f, 0.39f, -3.71f, 1.27f)
                reflectiveCurveToRelative(-1.17f, 2.7f, -1.27f, 3.71f)
                curveToRelative(-0.04f, 0.44f, -0.13f, 0.88f, -0.25f, 1.3f)
                lineTo(0.18f, 18.16f)
                curveToRelative(-0.4f, 1.39f, -0.14f, 2.86f, 0.74f, 4.02f)
                reflectiveCurveToRelative(2.2f, 1.82f, 3.65f, 1.82f)
                horizontalLineToRelative(6.41f)
                curveToRelative(0.18f, 0f, 4.47f, -0.05f, 8.72f, -4.3f)
                reflectiveCurveToRelative(4.3f, -8.54f, 4.3f, -8.72f)
                verticalLineToRelative(-6.41f)
                curveToRelative(0f, -1.45f, -0.67f, -2.78f, -1.82f, -3.65f)
                close()
                moveTo(18.72f, 2.11f)
                curveToRelative(0.24f, -0.07f, 0.48f, -0.1f, 0.72f, -0.1f)
                curveToRelative(0.55f, 0f, 1.08f, 0.18f, 1.53f, 0.52f)
                curveToRelative(0.65f, 0.49f, 1.02f, 1.24f, 1.02f, 2.05f)
                verticalLineToRelative(5.0f)
                lineToRelative(-6.52f, -6.52f)
                lineToRelative(3.24f, -0.94f)
                close()
                moveTo(2.52f, 20.97f)
                curveToRelative(-0.49f, -0.65f, -0.64f, -1.47f, -0.41f, -2.26f)
                lineToRelative(0.94f, -3.24f)
                lineToRelative(6.52f, 6.52f)
                horizontalLineToRelative(-5.0f)
                curveToRelative(-0.81f, 0f, -1.56f, -0.37f, -2.05f, -1.02f)
                close()
                moveTo(15.12f, 8.95f)
                lineToRelative(-6.16f, 6.17f)
                lineToRelative(-1.42f, -1.42f)
                lineToRelative(6.16f, -6.17f)
                lineToRelative(1.42f, 1.42f)
                close()
                moveTo(16.53f, 10.37f)
                lineToRelative(1.42f, 1.42f)
                lineToRelative(-6.16f, 6.16f)
                lineToRelative(-1.42f, -1.42f)
                lineToRelative(6.16f, -6.16f)
                close()
            }
        }.also { _MaskFace = it}
