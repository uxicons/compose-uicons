package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TrashList: ImageVector? = null

val Icons.Sr.TrashList: ImageVector
    get() = _TrashList ?: UXIcon(name = "TrashList") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23f, 12f)
                horizontalLineToRelative(-6f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(6f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
                moveTo(22f, 16f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-4f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(4f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                close()
                moveTo(20f, 21f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-2f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(2f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                close()
                moveTo(15.66f, 23.67f)
                curveToRelative(-0.56f, 0.21f, -1.16f, 0.33f, -1.79f, 0.33f)
                horizontalLineToRelative(-5.73f)
                curveToRelative(-2.59f, 0f, -4.73f, -1.94f, -4.98f, -4.52f)
                lineTo(1.86f, 6f)
                horizontalLineToRelative(-0.86f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(4.1f)
                curveTo(5.57f, 1.72f, 7.59f, 0f, 10f, 0f)
                horizontalLineToRelative(2f)
                curveToRelative(2.41f, 0f, 4.43f, 1.72f, 4.9f, 4f)
                horizontalLineToRelative(4.1f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-0.89f)
                lineToRelative(-0.19f, 2f)
                horizontalLineToRelative(-2.92f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                curveToRelative(0f, 1.04f, 0.54f, 1.96f, 1.35f, 2.5f)
                curveToRelative(-0.81f, 0.54f, -1.35f, 1.46f, -1.35f, 2.5f)
                reflectiveCurveToRelative(0.54f, 1.96f, 1.35f, 2.5f)
                curveToRelative(-0.81f, 0.54f, -1.35f, 1.46f, -1.35f, 2.5f)
                curveToRelative(0f, 1.17f, 0.68f, 2.17f, 1.66f, 2.67f)
                close()
                moveTo(14.82f, 4f)
                curveToRelative(-0.41f, -1.16f, -1.51f, -2f, -2.82f, -2f)
                horizontalLineToRelative(-2f)
                curveToRelative(-1.3f, 0f, -2.4f, 0.84f, -2.82f, 2f)
                horizontalLineToRelative(7.63f)
                close()
            }
        }.also { _TrashList = it}
