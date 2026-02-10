package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MapPoint: ImageVector? = null

val Icons.Rs.MapPoint: ImageVector
    get() = _MapPoint ?: UXIcon(name = "MapPoint") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 11.99f)
                lineToRelative(3.54f, -3.46f)
                curveToRelative(0.94f, -0.94f, 1.47f, -2.2f, 1.47f, -3.54f)
                reflectiveCurveToRelative(-0.52f, -2.59f, -1.47f, -3.54f)
                curveToRelative(-0.94f, -0.94f, -2.2f, -1.46f, -3.54f, -1.46f)
                reflectiveCurveToRelative(-2.59f, 0.52f, -3.54f, 1.46f)
                curveToRelative(-0.94f, 0.94f, -1.47f, 2.2f, -1.47f, 3.54f)
                reflectiveCurveToRelative(0.52f, 2.6f, 1.48f, 3.55f)
                lineToRelative(3.52f, 3.44f)
                close()
                moveTo(9.88f, 2.88f)
                curveToRelative(0.56f, -0.57f, 1.32f, -0.88f, 2.12f, -0.88f)
                reflectiveCurveToRelative(1.55f, 0.31f, 2.12f, 0.88f)
                curveToRelative(0.57f, 0.57f, 0.88f, 1.32f, 0.88f, 2.12f)
                reflectiveCurveToRelative(-0.31f, 1.55f, -0.87f, 2.11f)
                lineToRelative(-2.13f, 2.08f)
                lineToRelative(-2.11f, -2.07f)
                curveToRelative(-0.57f, -0.57f, -0.89f, -1.33f, -0.89f, -2.13f)
                reflectiveCurveToRelative(0.31f, -1.55f, 0.88f, -2.12f)
                close()
                moveTo(22f, 6f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-3.29f)
                curveToRelative(-0.21f, 0.71f, -0.55f, 1.39f, -0.98f, 2f)
                horizontalLineToRelative(4.27f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(-3.09f)
                lineToRelative(-3.71f, -3.71f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(4.29f, 4.29f)
                horizontalLineToRelative(3.91f)
                verticalLineToRelative(3f)
                lineTo(10f, 21f)
                verticalLineToRelative(-3.41f)
                lineToRelative(-4.59f, -4.59f)
                lineTo(2f, 13f)
                verticalLineToRelative(-4f)
                lineTo(6.27f, 9f)
                curveToRelative(-0.43f, -0.62f, -0.77f, -1.29f, -0.98f, -2f)
                lineTo(2f, 7f)
                verticalLineToRelative(-1f)
                lineTo(0f, 6f)
                lineTo(0f, 24f)
                lineTo(2f, 24f)
                verticalLineToRelative(-1f)
                lineTo(22f, 23f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(2f)
                lineTo(24f, 6f)
                horizontalLineToRelative(-2f)
                close()
                moveTo(2f, 15f)
                horizontalLineToRelative(2.59f)
                lineToRelative(3.41f, 3.41f)
                verticalLineToRelative(2.59f)
                lineTo(2f, 21f)
                verticalLineToRelative(-6f)
                close()
                moveTo(10.5f, 5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                close()
            }
        }.also { _MapPoint = it}
