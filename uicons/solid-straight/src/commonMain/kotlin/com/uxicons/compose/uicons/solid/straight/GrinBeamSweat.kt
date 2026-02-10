package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GrinBeamSweat: ImageVector? = null

val Icons.Ss.GrinBeamSweat: ImageVector
    get() = _GrinBeamSweat ?: UXIcon(name = "GrinBeamSweat") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.5f, 0f)
                reflectiveCurveTo(24f, 2.46f, 24f, 4.5f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5f, 0f)
                curveTo(19f, 2.51f, 21.5f, 0f, 21.5f, 0f)
                close()
                moveTo(23.48f, 8.52f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0f, 12f)
                curveTo(-0.18f, 2.99f, 10.16f, -3.01f, 17.87f, 1.54f)
                curveTo(15.27f, 5.52f, 19.0f, 10.61f, 23.48f, 8.52f)
                close()
                moveTo(5f, 11f)
                lineTo(7f, 11f)
                curveToRelative(0f, -1.05f, 0.68f, -2f, 1f, -2f)
                reflectiveCurveToRelative(1f, 0.95f, 1f, 2f)
                horizontalLineToRelative(2f)
                curveTo(10.75f, 5.71f, 5.25f, 5.72f, 5f, 11f)
                close()
                moveTo(18.01f, 14f)
                arcTo(21.92f, 21.92f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 15f)
                arcToRelative(21.84f, 21.84f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6f, -1f)
                curveToRelative(0.61f, 2.28f, 2.67f, 5f, 6.01f, 5f)
                reflectiveCurveTo(17.39f, 16.28f, 18.01f, 14f)
                close()
                moveTo(19f, 11f)
                curveToRelative(-0.25f, -5.29f, -5.75f, -5.28f, -6f, 0f)
                horizontalLineToRelative(2f)
                curveToRelative(0f, -1.05f, 0.68f, -2f, 1f, -2f)
                reflectiveCurveToRelative(1f, 0.95f, 1f, 2f)
                close()
            }
        }.also { _GrinBeamSweat = it}
