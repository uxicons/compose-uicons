package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RoadSignLeft: ImageVector? = null

val Icons.Tr.RoadSignLeft: ImageVector
    get() = _RoadSignLeft ?: UXIcon(name = "RoadSignLeft") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.69f, 8.84f)
                lineTo(15.16f, 1.3f)
                curveTo(14.32f, 0.46f, 13.2f, 0f, 12.0f, 0f)
                reflectiveCurveToRelative(-2.32f, 0.46f, -3.16f, 1.3f)
                lineTo(1.31f, 8.84f)
                curveTo(0.47f, 9.68f, 0f, 10.8f, 0f, 12.0f)
                reflectiveCurveToRelative(0.47f, 2.31f, 1.31f, 3.16f)
                lineToRelative(7.53f, 7.53f)
                curveToRelative(0.87f, 0.87f, 2.02f, 1.31f, 3.16f, 1.31f)
                reflectiveCurveToRelative(2.29f, -0.44f, 3.16f, -1.31f)
                lineToRelative(7.53f, -7.53f)
                curveToRelative(1.74f, -1.74f, 1.74f, -4.58f, 0f, -6.32f)
                close()
                moveTo(21.99f, 14.45f)
                lineToRelative(-7.53f, 7.53f)
                curveToRelative(-1.35f, 1.35f, -3.55f, 1.35f, -4.91f, 0f)
                lineToRelative(-7.53f, -7.53f)
                curveToRelative(-1.35f, -1.35f, -1.35f, -3.55f, 0f, -4.91f)
                lineToRelative(7.53f, -7.53f)
                curveToRelative(1.35f, -1.35f, 3.55f, -1.35f, 4.91f, 0f)
                lineToRelative(7.53f, 7.53f)
                curveToRelative(1.35f, 1.35f, 1.35f, 3.55f, 0f, 4.91f)
                close()
                moveTo(16f, 13.5f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                reflectiveCurveToRelative(-0.5f, -0.22f, -0.5f, -0.5f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-5.29f)
                lineToRelative(3.15f, 3.15f)
                curveToRelative(0.2f, 0.2f, 0.2f, 0.51f, 0f, 0.71f)
                curveToRelative(-0.1f, 0.1f, -0.23f, 0.15f, -0.35f, 0.15f)
                reflectiveCurveToRelative(-0.26f, -0.05f, -0.35f, -0.15f)
                lineToRelative(-3.3f, -3.3f)
                curveToRelative(-0.58f, -0.58f, -0.58f, -1.52f, 0f, -2.1f)
                lineToRelative(3.3f, -3.3f)
                curveToRelative(0.2f, -0.2f, 0.51f, -0.2f, 0.71f, 0f)
                reflectiveCurveToRelative(0.2f, 0.51f, 0f, 0.71f)
                lineToRelative(-3.15f, 3.15f)
                horizontalLineToRelative(5.29f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                close()
            }
        }.also { _RoadSignLeft = it}
