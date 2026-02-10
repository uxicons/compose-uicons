package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SmileBeam: ImageVector? = null

val Icons.Ss.SmileBeam: ImageVector
    get() = _SmileBeam ?: UXIcon(name = "SmileBeam") {
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
                moveTo(12f, 18f)
                arcToRelative(9.45f, 9.45f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5.67f, -2.25f)
                lineToRelative(1.33f, -1.49f)
                arcToRelative(6.36f, 6.36f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.67f, 0f)
                lineToRelative(1.33f, 1.49f)
                arcTo(9.45f, 9.45f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 18f)
                close()
                moveTo(17f, 11f)
                curveToRelative(0f, -1.05f, -0.68f, -2f, -1f, -2f)
                reflectiveCurveToRelative(-1f, 0.95f, -1f, 2f)
                lineTo(13f, 11f)
                curveToRelative(0.25f, -5.29f, 5.75f, -5.28f, 6f, 0f)
                close()
            }
        }.also { _SmileBeam = it}
