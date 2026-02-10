package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MapMarkerEdit: ImageVector? = null

val Icons.Sc.MapMarkerEdit: ImageVector
    get() = _MapMarkerEdit ?: UXIcon(name = "MapMarkerEdit") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13.2f, 8.35f)
                lineToRelative(-3.17f, 3.08f)
                curveToRelative(-0.55f, 0.56f, -0.89f, 1.32f, -0.94f, 2.12f)
                lineToRelative(-0.02f, 0.38f)
                lineToRelative(0.36f, -0.02f)
                curveToRelative(0.78f, -0.05f, 1.51f, -0.39f, 2.08f, -0.97f)
                lineToRelative(3.17f, -3.08f)
                curveToRelative(0.42f, -0.42f, 0.58f, -1.25f, 0.13f, -1.65f)
                curveToRelative(-0.59f, -0.53f, -1.35f, -0.1f, -1.59f, 0.14f)
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
                moveTo(16.08f, 11.28f)
                lineTo(12.91f, 14.36f)
                curveToRelative(-0.89f, 0.91f, -2.09f, 1.46f, -3.36f, 1.54f)
                lineToRelative(-1.49f, 0.1f)
                curveToRelative(-0.02f, 0.0f, -0.04f, 0.0f, -0.06f, 0.0f)
                curveToRelative(-0.26f, 0f, -0.52f, -0.1f, -0.71f, -0.29f)
                curveToRelative(-0.2f, -0.2f, -0.31f, -0.48f, -0.29f, -0.77f)
                lineToRelative(0.09f, -1.51f)
                curveToRelative(0.08f, -1.28f, 0.62f, -2.49f, 1.53f, -3.41f)
                lineToRelative(3.17f, -3.08f)
                curveToRelative(0.6f, -0.61f, 1.46f, -0.97f, 2.33f, -0.98f)
                curveToRelative(0.8f, 0.01f, 1.55f, 0.29f, 2.09f, 0.84f)
                curveToRelative(1.19f, 1.19f, 1.13f, 3.2f, -0.13f, 4.48f)
                close()
            }
        }.also { _MapMarkerEdit = it}
