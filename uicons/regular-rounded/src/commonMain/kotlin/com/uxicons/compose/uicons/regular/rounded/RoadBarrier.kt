package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RoadBarrier: ImageVector? = null

val Icons.Rr.RoadBarrier: ImageVector
    get() = _RoadBarrier ?: UXIcon(name = "RoadBarrier") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23f, 2f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(1f)
                lineTo(2f, 4f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                lineTo(0f, 21f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-6f)
                lineTo(22f, 15f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                lineTo(24f, 3f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                close()
                moveTo(9.91f, 13f)
                lineToRelative(7f, -7f)
                horizontalLineToRelative(4.17f)
                lineToRelative(-7f, 7f)
                horizontalLineToRelative(-4.17f)
                close()
                moveTo(2.91f, 13f)
                lineToRelative(7f, -7f)
                horizontalLineToRelative(4.17f)
                lineToRelative(-7f, 7f)
                lineTo(2.91f, 13f)
                close()
                moveTo(7.09f, 6f)
                lineTo(2f, 11.09f)
                lineTo(2f, 6f)
                lineTo(7.09f, 6f)
                close()
                moveTo(16.91f, 13f)
                lineToRelative(5.09f, -5.09f)
                verticalLineToRelative(5.09f)
                horizontalLineToRelative(-5.09f)
                close()
            }
        }.also { _RoadBarrier = it}
