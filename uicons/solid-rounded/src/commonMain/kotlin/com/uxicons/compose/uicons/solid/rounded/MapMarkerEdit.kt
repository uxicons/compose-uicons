package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MapMarkerEdit: ImageVector? = null

val Icons.Sr.MapMarkerEdit: ImageVector
    get() = _MapMarkerEdit ?: UXIcon(name = "MapMarkerEdit") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.78f, 3.22f)
                curveTo(17.7f, 1.14f, 14.94f, 0f, 12f, 0f)
                reflectiveCurveTo(6.3f, 1.15f, 4.22f, 3.22f)
                curveToRelative(-2.08f, 2.08f, -3.22f, 4.84f, -3.22f, 7.78f)
                reflectiveCurveToRelative(1.14f, 5.7f, 3.25f, 7.8f)
                lineToRelative(3.94f, 3.64f)
                curveToRelative(1.02f, 1.0f, 2.38f, 1.55f, 3.81f, 1.55f)
                reflectiveCurveToRelative(2.78f, -0.55f, 3.79f, -1.53f)
                lineToRelative(3.99f, -3.69f)
                curveToRelative(2.08f, -2.08f, 3.22f, -4.84f, 3.22f, -7.78f)
                reflectiveCurveToRelative(-1.14f, -5.7f, -3.22f, -7.78f)
                close()
                moveTo(16.12f, 11.12f)
                lineToRelative(-3.41f, 3.41f)
                curveToRelative(-0.94f, 0.94f, -2.2f, 1.46f, -3.54f, 1.46f)
                horizontalLineToRelative(-1.17f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-1.17f)
                curveToRelative(0f, -1.33f, 0.52f, -2.59f, 1.47f, -3.54f)
                lineToRelative(3.41f, -3.41f)
                curveToRelative(1.17f, -1.17f, 3.07f, -1.17f, 4.24f, 0f)
                curveToRelative(0.57f, 0.57f, 0.88f, 1.32f, 0.88f, 2.12f)
                reflectiveCurveToRelative(-0.31f, 1.55f, -0.88f, 2.12f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.29f, 8.29f)
                lineToRelative(-3.41f, 3.41f)
                curveToRelative(-0.57f, 0.57f, -0.88f, 1.32f, -0.88f, 2.12f)
                verticalLineToRelative(0.17f)
                horizontalLineToRelative(0.17f)
                curveToRelative(0.79f, 0f, 1.56f, -0.32f, 2.12f, -0.88f)
                lineToRelative(3.41f, -3.42f)
                curveToRelative(0.19f, -0.19f, 0.29f, -0.44f, 0.29f, -0.71f)
                reflectiveCurveToRelative(-0.1f, -0.52f, -0.29f, -0.71f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0f)
                close()
            }
        }.also { _MapMarkerEdit = it}
