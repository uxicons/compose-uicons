package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HeadSideMedical: ImageVector? = null

val Icons.Sc.HeadSideMedical: ImageVector
    get() = _HeadSideMedical ?: UXIcon(name = "HeadSideMedical") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.95f, 10.93f)
                curveToRelative(-0.53f, -0.77f, -1.2f, -1.72f, -1.2f, -2.4f)
                curveToRelative(0f, -0.68f, -0.19f, -1.65f, -0.36f, -2.23f)
                curveToRelative(-1.04f, -3.4f, -4.22f, -5.29f, -8.97f, -5.31f)
                curveTo(4.92f, 1.04f, 1.12f, 4.76f, 1f, 11.25f)
                curveToRelative(0.07f, 4.04f, 2.15f, 6.21f, 3.72f, 7.48f)
                curveToRelative(0.52f, 0.43f, 0.85f, 0.97f, 0.92f, 1.53f)
                curveToRelative(0.13f, 1.1f, 0.3f, 1.56f, 0.35f, 1.67f)
                curveToRelative(0.13f, 0.3f, 0.4f, 0.52f, 0.72f, 0.59f)
                curveToRelative(0.09f, 0.02f, 2.31f, 0.47f, 4.45f, 0.47f)
                curveToRelative(2.09f, 0f, 4.3f, -0.45f, 4.39f, -0.47f)
                curveToRelative(0.18f, -0.04f, 0.35f, -0.13f, 0.49f, -0.26f)
                curveToRelative(0.24f, -0.23f, 0.52f, -0.72f, 0.67f, -1.78f)
                curveToRelative(1.83f, -0.08f, 4.7f, -0.56f, 4.7f, -3.55f)
                verticalLineToRelative(-1.62f)
                curveToRelative(0.51f, -0.34f, 1.22f, -0.92f, 1.51f, -1.63f)
                curveToRelative(0.35f, -0.88f, -0.25f, -1.75f, -0.94f, -2.75f)
                close()
                moveTo(14f, 12f)
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
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
            }
        }.also { _HeadSideMedical = it}
