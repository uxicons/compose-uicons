package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RoadCheck: ImageVector? = null

val Icons.Bs.RoadCheck: ImageVector
    get() = _RoadCheck ?: UXIcon(name = "RoadCheck") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10.49f, 10f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(1.4f)
                curveToRelative(-0.98f, 0.68f, -1.81f, 1.57f, -2.41f, 2.6f)
                horizontalLineToRelative(-0.59f)
                close()
                moveTo(10.59f, 21f)
                horizontalLineToRelative(-7.06f)
                lineToRelative(2.96f, -17.59f)
                curveToRelative(0.04f, -0.24f, 0.25f, -0.41f, 0.49f, -0.41f)
                horizontalLineToRelative(10.0f)
                curveToRelative(0.24f, 0f, 0.45f, 0.17f, 0.49f, 0.4f)
                lineToRelative(1.12f, 6.63f)
                curveToRelative(1.15f, 0.09f, 2.24f, 0.41f, 3.2f, 0.93f)
                lineToRelative(-1.37f, -8.07f)
                curveToRelative(-0.29f, -1.68f, -1.74f, -2.89f, -3.45f, -2.89f)
                horizontalLineToRelative(-10.01f)
                curveToRelative(-1.7f, 0f, -3.15f, 1.22f, -3.45f, 2.91f)
                lineToRelative(-3.56f, 21.09f)
                horizontalLineToRelative(12.74f)
                curveToRelative(-0.93f, -0.81f, -1.66f, -1.84f, -2.13f, -3f)
                close()
                moveTo(13.49f, 4f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(3f)
                close()
                moveTo(24f, 18f)
                curveToRelative(0f, 3.31f, -2.69f, 6f, -6f, 6f)
                reflectiveCurveToRelative(-6f, -2.69f, -6f, -6f)
                reflectiveCurveToRelative(2.69f, -6f, 6f, -6f)
                reflectiveCurveToRelative(6f, 2.69f, 6f, 6f)
                close()
                moveTo(22.36f, 16.74f)
                lineTo(20.96f, 15.31f)
                lineTo(17.35f, 19.02f)
                lineTo(15.13f, 16.72f)
                lineTo(13.74f, 18.16f)
                lineTo(15.93f, 20.43f)
                curveToRelative(0.77f, 0.77f, 2.08f, 0.76f, 2.82f, 0.02f)
                lineToRelative(0.0f, -0.0f)
                lineToRelative(3.61f, -3.7f)
                close()
            }
        }.also { _RoadCheck = it}
