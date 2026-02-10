package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MapMarkerQuestion: ImageVector? = null

val Icons.Rc.MapMarkerQuestion: ImageVector
    get() = _MapMarkerQuestion ?: UXIcon(name = "MapMarkerQuestion") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(11.99f, 6f)
                curveToRelative(-2.46f, 0.02f, -3.95f, 1.5f, -3.99f, 3.98f)
                curveToRelative(-0.01f, 0.55f, 0.43f, 1.01f, 0.98f, 1.02f)
                curveToRelative(0.55f, 0.01f, 1.01f, -0.43f, 1.02f, -0.98f)
                curveToRelative(0.02f, -1.41f, 0.62f, -2.01f, 1.99f, -2.02f)
                curveToRelative(1.36f, 0.01f, 1.98f, 0.63f, 2.01f, 1.98f)
                curveToRelative(-0.03f, 1.43f, -0.57f, 1.96f, -2.01f, 1.97f)
                curveToRelative(-0.55f, 0.0f, -0.99f, 0.45f, -0.99f, 1f)
                verticalLineToRelative(1.05f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-0.14f)
                curveToRelative(1.91f, -0.34f, 2.96f, -1.68f, 3f, -3.88f)
                curveToRelative(-0.04f, -2.48f, -1.53f, -3.97f, -4.01f, -3.98f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 17f)
                moveToRelative(-1f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -2f, 0f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 1f)
                curveToRelative(-5.33f, 0f, -10f, 4.67f, -10f, 10f)
                curveToRelative(0f, 6.51f, 9.13f, 11.66f, 9.51f, 11.87f)
                curveToRelative(0.15f, 0.08f, 0.32f, 0.13f, 0.49f, 0.13f)
                reflectiveCurveToRelative(0.33f, -0.04f, 0.49f, -0.13f)
                curveToRelative(0.39f, -0.22f, 9.51f, -5.36f, 9.51f, -11.87f)
                curveToRelative(0f, -5.33f, -4.67f, -10f, -10f, -10f)
                close()
                moveTo(12f, 20.84f)
                curveToRelative(-1.8f, -1.11f, -8f, -5.25f, -8f, -9.84f)
                reflectiveCurveToRelative(4.22f, -8f, 8f, -8f)
                reflectiveCurveToRelative(8f, 3.42f, 8f, 8f)
                reflectiveCurveToRelative(-6.2f, 8.73f, -8f, 9.84f)
                close()
            }
        }.also { _MapMarkerQuestion = it}
