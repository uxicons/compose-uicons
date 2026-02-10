package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MapMarkerQuestion: ImageVector? = null

val Icons.Tc.MapMarkerQuestion: ImageVector
    get() = _MapMarkerQuestion ?: UXIcon(name = "MapMarkerQuestion") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12.0f, 6.5f)
                curveToRelative(-2.22f, 0.01f, -3.46f, 1.25f, -3.5f, 3.49f)
                curveToRelative(-0.01f, 0.28f, 0.21f, 0.5f, 0.49f, 0.51f)
                curveToRelative(0.29f, 0.02f, 0.5f, -0.21f, 0.51f, -0.49f)
                curveToRelative(0.03f, -1.68f, 0.85f, -2.5f, 2.5f, -2.51f)
                curveToRelative(1.63f, 0.01f, 2.48f, 0.85f, 2.5f, 2.49f)
                curveToRelative(-0.03f, 1.69f, -0.8f, 2.45f, -2.5f, 2.46f)
                curveToRelative(-0.28f, 0.0f, -0.5f, 0.23f, -0.5f, 0.5f)
                verticalLineToRelative(1.55f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                verticalLineToRelative(-1.07f)
                curveToRelative(1.93f, -0.18f, 2.96f, -1.35f, 3f, -3.43f)
                curveToRelative(-0.04f, -2.21f, -1.31f, -3.48f, -3.5f, -3.49f)
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
                curveToRelative(-1.45f, -0.85f, -9f, -5.54f, -9f, -10.92f)
                curveToRelative(0f, -5.23f, 4.75f, -8.94f, 8.99f, -9f)
                curveToRelative(4.26f, 0.06f, 9.01f, 3.77f, 9.01f, 9f)
                curveToRelative(0f, 5.38f, -7.55f, 10.07f, -9f, 10.92f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 17f)
                moveToRelative(-0.75f, 0f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1.5f, 0f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.5f, 0f)
            }
        }.also { _MapMarkerQuestion = it}
