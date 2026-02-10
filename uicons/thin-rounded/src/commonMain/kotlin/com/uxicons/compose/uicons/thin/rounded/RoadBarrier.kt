package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RoadBarrier: ImageVector? = null

val Icons.Tr.RoadBarrier: ImageVector
    get() = _RoadBarrier ?: UXIcon(name = "RoadBarrier") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.5f, 2f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(1.5f)
                lineTo(1f, 4f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                reflectiveCurveToRelative(-0.5f, 0.22f, -0.5f, 0.5f)
                lineTo(0f, 21.5f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                verticalLineToRelative(-7.5f)
                lineTo(23f, 14f)
                verticalLineToRelative(7.5f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                lineTo(24f, 2.5f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                close()
                moveTo(23f, 6.29f)
                lineToRelative(-6.71f, 6.71f)
                horizontalLineToRelative(-4.59f)
                lineTo(19.71f, 5f)
                horizontalLineToRelative(3.29f)
                verticalLineToRelative(1.29f)
                close()
                moveTo(5.71f, 13f)
                lineTo(13.71f, 5f)
                horizontalLineToRelative(4.59f)
                lineTo(10.29f, 13f)
                lineTo(5.71f, 13f)
                close()
                moveTo(6.29f, 5f)
                lineTo(1f, 10.29f)
                lineTo(1f, 5f)
                lineTo(6.29f, 5f)
                close()
                moveTo(1f, 11.71f)
                lineTo(7.71f, 5f)
                horizontalLineToRelative(4.59f)
                lineTo(4.29f, 13f)
                lineTo(1f, 13f)
                verticalLineToRelative(-1.29f)
                close()
                moveTo(17.71f, 13f)
                lineToRelative(5.29f, -5.29f)
                verticalLineToRelative(5.29f)
                horizontalLineToRelative(-5.29f)
                close()
            }
        }.also { _RoadBarrier = it}
