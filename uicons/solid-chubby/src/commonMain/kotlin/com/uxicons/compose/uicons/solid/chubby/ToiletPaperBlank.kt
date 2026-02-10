package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ToiletPaperBlank: ImageVector? = null

val Icons.Sc.ToiletPaperBlank: ImageVector
    get() = _ToiletPaperBlank ?: UXIcon(name = "ToiletPaperBlank") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 8.76f)
                curveToRelative(0f, -2.53f, 0.85f, -4.75f, 2.21f, -6.26f)
                horizontalLineToRelative(-6.21f)
                curveToRelative(-1.99f, 0f, -4f, 1.55f, -4f, 5.01f)
                curveToRelative(0f, 10.31f, -2.46f, 12.1f, -2.45f, 12.1f)
                curveToRelative(-0.41f, 0.21f, -0.63f, 0.67f, -0.53f, 1.12f)
                curveToRelative(0.11f, 0.45f, 0.51f, 0.77f, 0.97f, 0.77f)
                horizontalLineToRelative(9.08f)
                curveToRelative(2.74f, 0f, 4.63f, -1.57f, 5.18f, -4.3f)
                curveToRelative(0.04f, -0.19f, 0.07f, -0.41f, 0.1f, -0.64f)
                curveToRelative(-2.56f, -1.1f, -4.35f, -4.13f, -4.35f, -7.8f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18.5f, 2.5f)
                curveToRelative(-2.52f, 0f, -4.5f, 2.75f, -4.5f, 6.26f)
                reflectiveCurveToRelative(1.98f, 6.24f, 4.5f, 6.24f)
                reflectiveCurveToRelative(4.5f, -2.74f, 4.5f, -6.24f)
                reflectiveCurveToRelative(-1.98f, -6.26f, -4.5f, -6.26f)
                close()
                moveTo(18.5f, 10.5f)
                curveToRelative(-0.55f, 0f, -1f, -0.78f, -1f, -1.75f)
                reflectiveCurveToRelative(0.45f, -1.75f, 1f, -1.75f)
                reflectiveCurveToRelative(1f, 0.78f, 1f, 1.75f)
                reflectiveCurveToRelative(-0.45f, 1.75f, -1f, 1.75f)
                close()
            }
        }.also { _ToiletPaperBlank = it}
