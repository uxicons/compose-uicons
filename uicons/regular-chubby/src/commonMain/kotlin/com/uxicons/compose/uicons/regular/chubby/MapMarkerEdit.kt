package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MapMarkerEdit: ImageVector? = null

val Icons.Rc.MapMarkerEdit: ImageVector
    get() = _MapMarkerEdit ?: UXIcon(name = "MapMarkerEdit") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14.01f, 6f)
                curveToRelative(-0.84f, 0f, -1.63f, 0.34f, -2.22f, 0.93f)
                lineToRelative(-3.17f, 3.08f)
                curveToRelative(-0.91f, 0.92f, -1.45f, 2.13f, -1.53f, 3.41f)
                lineToRelative(-0.09f, 1.51f)
                curveToRelative(-0.02f, 0.29f, 0.09f, 0.56f, 0.29f, 0.77f)
                curveToRelative(0.3f, 0.32f, 0.75f, 0.29f, 0.77f, 0.29f)
                lineToRelative(1.49f, -0.1f)
                curveToRelative(1.27f, -0.08f, 2.46f, -0.64f, 3.36f, -1.54f)
                lineToRelative(3.17f, -3.08f)
                curveToRelative(1.21f, -1.23f, 1.23f, -3.19f, 0.06f, -4.39f)
                curveToRelative(-0.56f, -0.57f, -1.32f, -0.89f, -2.13f, -0.89f)
                close()
                moveTo(14.67f, 9.86f)
                lineTo(11.5f, 12.94f)
                curveToRelative(-0.56f, 0.57f, -1.3f, 0.92f, -2.08f, 0.97f)
                lineToRelative(-0.36f, 0.02f)
                lineToRelative(0.02f, -0.38f)
                curveToRelative(0.05f, -0.8f, 0.39f, -1.56f, 0.94f, -2.12f)
                lineToRelative(3.17f, -3.08f)
                curveToRelative(0.22f, -0.23f, 0.94f, -0.61f, 1.51f, -0.06f)
                curveToRelative(0.42f, 0.41f, 0.39f, 1.13f, -0.04f, 1.57f)
                close()
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
        }.also { _MapMarkerEdit = it}
