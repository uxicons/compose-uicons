package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SearchLocation: ImageVector? = null

val Icons.Tr.SearchLocation: ImageVector
    get() = _SearchLocation ?: UXIcon(name = "SearchLocation") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.85f, 23.15f)
                lineToRelative(-6.43f, -6.43f)
                curveToRelative(1.61f, -1.77f, 2.6f, -4.12f, 2.6f, -6.7f)
                curveTo(20.02f, 4.51f, 15.54f, 0.02f, 10.02f, 0.02f)
                reflectiveCurveTo(0.02f, 4.51f, 0.02f, 10.02f)
                reflectiveCurveToRelative(4.49f, 10f, 10f, 10f)
                curveToRelative(2.58f, 0f, 4.92f, -0.99f, 6.7f, -2.6f)
                lineToRelative(6.43f, 6.43f)
                curveToRelative(0.1f, 0.1f, 0.23f, 0.15f, 0.35f, 0.15f)
                reflectiveCurveToRelative(0.26f, -0.05f, 0.35f, -0.15f)
                curveToRelative(0.2f, -0.2f, 0.2f, -0.51f, 0f, -0.71f)
                close()
                moveTo(1.02f, 10.02f)
                curveTo(1.02f, 5.06f, 5.06f, 1.02f, 10.02f, 1.02f)
                reflectiveCurveToRelative(9f, 4.04f, 9f, 9f)
                reflectiveCurveToRelative(-4.04f, 9f, -9f, 9f)
                reflectiveCurveTo(1.02f, 14.98f, 1.02f, 10.02f)
                close()
                moveTo(10f, 4.01f)
                curveToRelative(-1.33f, 0f, -2.59f, 0.51f, -3.53f, 1.44f)
                curveToRelative(-0.95f, 0.93f, -1.47f, 2.17f, -1.47f, 3.49f)
                reflectiveCurveToRelative(0.52f, 2.56f, 1.47f, 3.5f)
                lineToRelative(2.04f, 1.97f)
                curveToRelative(0.42f, 0.4f, 0.95f, 0.6f, 1.49f, 0.6f)
                reflectiveCurveToRelative(1.07f, -0.2f, 1.49f, -0.6f)
                lineToRelative(2.04f, -1.97f)
                curveToRelative(0.95f, -0.93f, 1.47f, -2.17f, 1.47f, -3.5f)
                reflectiveCurveToRelative(-0.52f, -2.56f, -1.47f, -3.49f)
                curveToRelative(-0.94f, -0.93f, -2.2f, -1.44f, -3.53f, -1.44f)
                close()
                moveTo(12.84f, 11.72f)
                lineToRelative(-2.04f, 1.97f)
                curveToRelative(-0.44f, 0.42f, -1.15f, 0.42f, -1.59f, 0f)
                lineToRelative(-2.04f, -1.96f)
                curveToRelative(-0.75f, -0.74f, -1.17f, -1.73f, -1.17f, -2.78f)
                reflectiveCurveToRelative(0.41f, -2.04f, 1.17f, -2.78f)
                curveToRelative(0.76f, -0.74f, 1.76f, -1.16f, 2.83f, -1.16f)
                reflectiveCurveToRelative(2.07f, 0.41f, 2.83f, 1.16f)
                curveToRelative(0.75f, 0.74f, 1.17f, 1.73f, 1.17f, 2.78f)
                reflectiveCurveToRelative(-0.41f, 2.04f, -1.17f, 2.78f)
                close()
                moveTo(11f, 8.99f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                close()
            }
        }.also { _SearchLocation = it}
