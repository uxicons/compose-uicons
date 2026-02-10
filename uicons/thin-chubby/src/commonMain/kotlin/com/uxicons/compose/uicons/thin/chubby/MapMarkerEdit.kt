package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MapMarkerEdit: ImageVector? = null

val Icons.Tc.MapMarkerEdit: ImageVector
    get() = _MapMarkerEdit ?: UXIcon(name = "MapMarkerEdit") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12.14f, 7.29f)
                lineToRelative(-3.16f, 3.07f)
                curveToRelative(-0.82f, 0.83f, -1.31f, 1.93f, -1.38f, 3.09f)
                lineToRelative(-0.09f, 1.51f)
                curveToRelative(-0.01f, 0.14f, 0.04f, 0.28f, 0.15f, 0.39f)
                curveToRelative(0.09f, 0.09f, 0.22f, 0.15f, 0.35f, 0.15f)
                horizontalLineToRelative(0.03f)
                lineToRelative(1.49f, -0.1f)
                curveToRelative(1.14f, -0.07f, 2.23f, -0.57f, 3.04f, -1.4f)
                lineToRelative(3.16f, -3.07f)
                curveToRelative(0.53f, -0.53f, 0.83f, -1.32f, 0.82f, -2.09f)
                curveToRelative(-0.01f, -0.68f, -0.26f, -1.28f, -0.69f, -1.69f)
                curveToRelative(-1.01f, -0.96f, -2.68f, -0.89f, -3.71f, 0.15f)
                close()
                moveTo(15.01f, 10.22f)
                lineTo(11.86f, 13.29f)
                curveToRelative(-0.65f, 0.66f, -1.5f, 1.06f, -2.4f, 1.11f)
                lineToRelative(-0.92f, 0.06f)
                lineToRelative(0.06f, -0.95f)
                curveToRelative(0.06f, -0.92f, 0.45f, -1.79f, 1.09f, -2.44f)
                lineToRelative(3.16f, -3.07f)
                curveToRelative(0.35f, -0.35f, 0.82f, -0.54f, 1.27f, -0.54f)
                curveToRelative(0.39f, 0f, 0.76f, 0.13f, 1.04f, 0.4f)
                curveToRelative(0.24f, 0.23f, 0.38f, 0.58f, 0.38f, 0.99f)
                curveToRelative(0.01f, 0.52f, -0.19f, 1.03f, -0.52f, 1.37f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(11.99f, 1f)
                curveToRelative(-5.32f, 0.07f, -9.99f, 4.74f, -9.99f, 10f)
                curveToRelative(0f, 6.52f, 9.36f, 11.72f, 9.76f, 11.94f)
                curveToRelative(0.07f, 0.04f, 0.16f, 0.06f, 0.24f, 0.06f)
                reflectiveCurveToRelative(0.17f, -0.02f, 0.24f, -0.06f)
                curveToRelative(0.4f, -0.22f, 9.76f, -5.42f, 9.76f, -11.94f)
                curveToRelative(0f, -5.26f, -4.67f, -9.93f, -10.01f, -10f)
                close()
                moveTo(12f, 21.92f)
                curveToRelative(-1.46f, -0.85f, -9f, -5.54f, -9f, -10.92f)
                curveToRelative(0f, -5.23f, 4.75f, -8.94f, 8.99f, -9f)
                curveToRelative(4.26f, 0.06f, 9.01f, 3.77f, 9.01f, 9f)
                curveToRelative(0f, 5.38f, -7.55f, 10.07f, -9f, 10.92f)
                close()
            }
        }.also { _MapMarkerEdit = it}
