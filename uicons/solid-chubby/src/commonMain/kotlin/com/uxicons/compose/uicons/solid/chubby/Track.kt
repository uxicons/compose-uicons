package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Track: ImageVector? = null

val Icons.Sc.Track: ImageVector
    get() = _Track ?: UXIcon(name = "Track") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(5f, 21f)
                curveToRelative(0f, 1.43f, -0.57f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.57f, -2f, -2f)
                reflectiveCurveToRelative(0.57f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.57f, 2f, 2f)
                close()
                moveTo(17.84f, 11.85f)
                curveToRelative(0.19f, 0.17f, 0.43f, 0.25f, 0.66f, 0.25f)
                reflectiveCurveToRelative(0.47f, -0.08f, 0.66f, -0.25f)
                curveToRelative(0.39f, -0.35f, 3.84f, -3.48f, 3.84f, -6.35f)
                curveToRelative(0f, -3.07f, -1.43f, -4.5f, -4.5f, -4.5f)
                reflectiveCurveToRelative(-4.5f, 1.43f, -4.5f, 4.5f)
                curveToRelative(0f, 2.87f, 3.44f, 6.0f, 3.84f, 6.35f)
                close()
                moveTo(12f, 14f)
                curveToRelative(-1.43f, 0f, -2f, 0.57f, -2f, 2f)
                reflectiveCurveToRelative(0.57f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.57f, 2f, -2f)
                reflectiveCurveToRelative(-0.57f, -2f, -2f, -2f)
                close()
                moveTo(19.0f, 14.5f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-0.83f, 0.0f, -1.5f, 0.67f, -1.5f, 1.5f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(1.5f)
                curveToRelative(0.95f, -0.0f, 1f, 0.04f, 1f, 1.0f)
                reflectiveCurveToRelative(-0.05f, 1.0f, -1f, 1.0f)
                horizontalLineToRelative(-11f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(11f)
                curveToRelative(2.62f, 0f, 4f, -1.38f, 4f, -4.0f)
                reflectiveCurveToRelative(-1.38f, -4f, -4.0f, -4f)
                close()
                moveTo(8f, 16.0f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-0.95f, 0.0f, -1f, -0.04f, -1f, -1.0f)
                reflectiveCurveToRelative(0.05f, -1.0f, 1f, -1.0f)
                horizontalLineToRelative(7.5f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-7.5f)
                curveToRelative(-2.62f, 0f, -4f, 1.38f, -4f, 4.0f)
                reflectiveCurveToRelative(1.38f, 4f, 4.0f, 4f)
                horizontalLineToRelative(1.5f)
                curveToRelative(0.83f, -0.0f, 1.5f, -0.67f, 1.5f, -1.5f)
                close()
            }
        }.also { _Track = it}
