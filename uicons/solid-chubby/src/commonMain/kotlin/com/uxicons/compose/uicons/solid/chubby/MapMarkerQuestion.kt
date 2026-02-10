package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MapMarkerQuestion: ImageVector? = null

val Icons.Sc.MapMarkerQuestion: ImageVector
    get() = _MapMarkerQuestion ?: UXIcon(name = "MapMarkerQuestion") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 1f)
                curveToRelative(-5.33f, 0f, -10f, 4.67f, -10f, 10f)
                curveToRelative(0f, 6.51f, 9.13f, 11.66f, 9.51f, 11.87f)
                curveToRelative(0.15f, 0.08f, 0.32f, 0.13f, 0.49f, 0.13f)
                reflectiveCurveToRelative(0.33f, -0.04f, 0.49f, -0.13f)
                curveToRelative(0.39f, -0.22f, 9.51f, -5.36f, 9.51f, -11.87f)
                curveToRelative(0f, -5.33f, -4.67f, -10f, -10f, -10f)
                close()
                moveTo(12f, 19f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(13f, 12.36f)
                verticalLineToRelative(1.14f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-2.05f)
                curveToRelative(0f, -0.55f, 0.44f, -1.0f, 0.99f, -1f)
                curveToRelative(1.44f, -0.01f, 1.98f, -0.54f, 2.01f, -1.97f)
                curveToRelative(-0.02f, -1.35f, -0.64f, -1.97f, -2.01f, -1.98f)
                curveToRelative(-1.37f, 0.01f, -1.97f, 0.61f, -1.99f, 2.02f)
                curveToRelative(-0.01f, 0.55f, -0.47f, 0.99f, -1.02f, 0.98f)
                curveToRelative(-0.55f, -0.01f, -0.99f, -0.47f, -0.98f, -1.02f)
                curveToRelative(0.04f, -2.48f, 1.54f, -3.97f, 3.99f, -3.98f)
                curveToRelative(2.47f, 0.02f, 3.96f, 1.5f, 4.01f, 3.98f)
                curveToRelative(-0.04f, 2.2f, -1.09f, 3.54f, -3f, 3.88f)
                close()
            }
        }.also { _MapMarkerQuestion = it}
