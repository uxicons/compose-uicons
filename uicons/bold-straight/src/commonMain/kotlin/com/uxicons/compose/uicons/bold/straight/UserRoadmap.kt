package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserRoadmap: ImageVector? = null

val Icons.Bs.UserRoadmap: ImageVector
    get() = _UserRoadmap ?: UXIcon(name = "UserRoadmap") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7f, 21.5f)
                verticalLineToRelative(2.5f)
                lineTo(0f, 24f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                lineTo(5.5f, 20f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                close()
                moveTo(3.5f, 19f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.12f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.12f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
                close()
                moveTo(20f, 5f)
                lineToRelative(4f, -2.5f)
                lineTo(20f, 0f)
                horizontalLineToRelative(-3f)
                lineTo(17f, 10f)
                horizontalLineToRelative(3f)
                lineTo(20f, 5f)
                close()
                moveTo(19.5f, 14f)
                horizontalLineToRelative(-7.5f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-3f)
                curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
                reflectiveCurveToRelative(2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(7.5f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                lineTo(8.65f, 20f)
                curveToRelative(0.22f, 0.46f, 0.35f, 0.96f, 0.35f, 1.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(10.31f)
                curveToRelative(2.35f, 0f, 4.45f, -1.72f, 4.67f, -4.06f)
                curveToRelative(0.26f, -2.68f, -1.85f, -4.94f, -4.48f, -4.94f)
                close()
            }
        }.also { _UserRoadmap = it}
