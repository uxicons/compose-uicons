package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SortAlt: ImageVector? = null

val Icons.Sc.SortAlt: ImageVector
    get() = _SortAlt ?: UXIcon(name = "SortAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.9f, 7.43f)
                curveToRelative(0.74f, 0.38f, 1.64f, 0.08f, 2.02f, -0.66f)
                curveToRelative(0.18f, -0.35f, 0.36f, -0.66f, 0.55f, -0.94f)
                verticalLineToRelative(15.66f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineTo(5.84f)
                curveToRelative(0.18f, 0.28f, 0.37f, 0.59f, 0.55f, 0.94f)
                curveToRelative(0.38f, 0.74f, 1.28f, 1.03f, 2.02f, 0.66f)
                curveToRelative(0.74f, -0.38f, 1.03f, -1.28f, 0.66f, -2.02f)
                curveToRelative(-1.67f, -3.29f, -3.94f, -4.22f, -4.19f, -4.32f)
                curveToRelative(-0.48f, -0.17f, -0.89f, -0.07f, -1.06f, 0f)
                curveToRelative(-0.25f, 0.1f, -2.52f, 1.03f, -4.19f, 4.32f)
                curveToRelative(-0.38f, 0.74f, -0.08f, 1.64f, 0.66f, 2.02f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.1f, 16.57f)
                curveToRelative(-0.74f, -0.38f, -1.64f, -0.08f, -2.02f, 0.66f)
                curveToRelative(-0.18f, 0.35f, -0.36f, 0.66f, -0.55f, 0.94f)
                verticalLineTo(2.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(15.66f)
                curveToRelative(-0.18f, -0.28f, -0.37f, -0.59f, -0.55f, -0.94f)
                curveToRelative(-0.38f, -0.74f, -1.28f, -1.03f, -2.02f, -0.66f)
                curveToRelative(-0.74f, 0.38f, -1.03f, 1.28f, -0.66f, 2.02f)
                curveToRelative(1.67f, 3.29f, 3.94f, 4.22f, 4.19f, 4.32f)
                curveToRelative(0.48f, 0.17f, 0.89f, 0.07f, 1.06f, 0f)
                curveToRelative(0.25f, -0.1f, 2.52f, -1.03f, 4.19f, -4.32f)
                curveToRelative(0.38f, -0.74f, 0.08f, -1.64f, -0.66f, -2.02f)
                close()
            }
        }.also { _SortAlt = it}
