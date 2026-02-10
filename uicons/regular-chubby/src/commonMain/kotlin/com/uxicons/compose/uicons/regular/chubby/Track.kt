package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Track: ImageVector? = null

val Icons.Rc.Track: ImageVector
    get() = _Track ?: UXIcon(name = "Track") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(5f, 21f)
                curveToRelative(0f, 1.43f, -0.57f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.57f, -2f, -2f)
                reflectiveCurveToRelative(0.57f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.57f, 2f, 2f)
                close()
                moveTo(14f, 5.5f)
                curveToRelative(0f, -3.07f, 1.43f, -4.5f, 4.5f, -4.5f)
                reflectiveCurveToRelative(4.5f, 1.43f, 4.5f, 4.5f)
                curveToRelative(0f, 2.87f, -3.44f, 6.0f, -3.84f, 6.35f)
                curveToRelative(-0.19f, 0.17f, -0.43f, 0.25f, -0.66f, 0.25f)
                reflectiveCurveToRelative(-0.47f, -0.08f, -0.66f, -0.25f)
                curveToRelative(-0.39f, -0.35f, -3.84f, -3.48f, -3.84f, -6.35f)
                close()
                moveTo(16f, 5.5f)
                curveToRelative(0f, 1.24f, 1.34f, 3.02f, 2.5f, 4.21f)
                curveToRelative(1.16f, -1.19f, 2.5f, -2.98f, 2.5f, -4.21f)
                curveToRelative(0f, -1.94f, -0.56f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 0.56f, -2.5f, 2.5f)
                close()
                moveTo(19.5f, 15.0f)
                horizontalLineToRelative(-2.5f)
                reflectiveCurveToRelative(0f, -0.0f, 0f, -0.0f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(2.5f)
                curveToRelative(1.23f, 0.0f, 1.5f, 0.27f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.27f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-11.5f)
                curveToRelative(-0.55f, -0.0f, -1f, 0.45f, -1f, 1.0f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(11.5f)
                curveToRelative(2.32f, 0.0f, 3.5f, -1.18f, 3.5f, -3.5f)
                reflectiveCurveToRelative(-1.18f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(8f, 17.0f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-2.5f)
                curveToRelative(-1.23f, -0.0f, -1.5f, -0.27f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.27f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(7.5f)
                curveToRelative(0.55f, 0.0f, 1f, -0.45f, 1f, -1.0f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-7.5f)
                curveToRelative(-2.32f, -0.0f, -3.5f, 1.18f, -3.5f, 3.5f)
                reflectiveCurveToRelative(1.18f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(2.5f)
                reflectiveCurveToRelative(0f, 0.0f, 0f, 0.0f)
                close()
                moveTo(10.5f, 16f)
                curveToRelative(0f, 1.43f, 0.57f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.57f, 2f, -2f)
                reflectiveCurveToRelative(-0.57f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.57f, -2f, 2f)
                close()
            }
        }.also { _Track = it}
