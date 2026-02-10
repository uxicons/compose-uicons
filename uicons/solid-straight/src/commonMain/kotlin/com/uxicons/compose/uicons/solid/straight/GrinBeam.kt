package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GrinBeam: ImageVector? = null

val Icons.Ss.GrinBeam: ImageVector
    get() = _GrinBeam ?: UXIcon(name = "GrinBeam") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 12f)
                curveToRelative(0.6f, 15.9f, 23.4f, 15.89f, 24f, 0f)
                arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 0f)
                close()
                moveTo(8f, 7f)
                curveToRelative(1.77f, 0f, 3f, 2.11f, 3f, 4f)
                lineTo(9f, 11f)
                curveToRelative(0f, -1.05f, -0.68f, -2f, -1f, -2f)
                reflectiveCurveToRelative(-1f, 0.95f, -1f, 2f)
                lineTo(5f, 11f)
                curveTo(5f, 9.11f, 6.23f, 7f, 8f, 7f)
                close()
                moveTo(12.01f, 19f)
                curveTo(8.67f, 19f, 6.62f, 16.28f, 6f, 14f)
                arcToRelative(21.84f, 21.84f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 1f)
                arcToRelative(21.92f, 21.92f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.01f, -1f)
                curveTo(17.39f, 16.28f, 15.34f, 19f, 12.01f, 19f)
                close()
                moveTo(17f, 11f)
                curveToRelative(0f, -1.05f, -0.68f, -2f, -1f, -2f)
                reflectiveCurveToRelative(-1f, 0.95f, -1f, 2f)
                lineTo(13f, 11f)
                curveToRelative(0.25f, -5.29f, 5.75f, -5.28f, 6f, 0f)
                close()
            }
        }.also { _GrinBeam = it}
