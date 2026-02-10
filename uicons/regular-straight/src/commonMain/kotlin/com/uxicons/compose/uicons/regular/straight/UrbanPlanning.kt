package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UrbanPlanning: ImageVector? = null

val Icons.Rs.UrbanPlanning: ImageVector
    get() = _UrbanPlanning ?: UXIcon(name = "UrbanPlanning") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10f, 15f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(0.93f)
                lineToRelative(1.91f, -1.91f)
                curveToRelative(-0.2f, -0.59f, -0.76f, -1.02f, -1.41f, -1.02f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-3f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(8.5f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-0.07f)
                lineToRelative(1.93f, -1.93f)
                horizontalLineToRelative(-0.93f)
                verticalLineToRelative(-2f)
                close()
                moveTo(8f, 17f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                close()
                moveTo(8f, 13f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                close()
                moveTo(2f, 3f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(1.03f)
                curveToRelative(0.61f, -0.46f, 1.29f, -0.78f, 2f, -0.92f)
                verticalLineToRelative(-1.52f)
                lineToRelative(-7.59f, -7.58f)
                horizontalLineToRelative(-9.41f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(21f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-7f)
                close()
                moveTo(13f, 3.41f)
                lineTo(16.59f, 7f)
                horizontalLineToRelative(-3.59f)
                close()
                moveTo(23.12f, 11.88f)
                curveToRelative(-1.17f, -1.17f, -3.07f, -1.17f, -4.24f, 0f)
                lineToRelative(-7.88f, 7.88f)
                verticalLineToRelative(4.24f)
                horizontalLineToRelative(4.24f)
                lineToRelative(7.88f, -7.88f)
                curveToRelative(1.17f, -1.17f, 1.17f, -3.07f, 0f, -4.24f)
                close()
                moveTo(21.71f, 14.71f)
                lineTo(14.41f, 22f)
                horizontalLineToRelative(-1.41f)
                verticalLineToRelative(-1.41f)
                lineToRelative(7.29f, -7.29f)
                curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0f)
                reflectiveCurveToRelative(0.39f, 1.02f, 0f, 1.41f)
                close()
            }
        }.also { _UrbanPlanning = it}
