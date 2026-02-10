package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Tombstone: ImageVector? = null

val Icons.Br.Tombstone: ImageVector
    get() = _Tombstone ?: UXIcon(name = "Tombstone") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(22.5f, 21f)
            horizontalLineToRelative(-0.5f)
            verticalLineToRelative(-11f)
            curveTo(22f, 4.49f, 17.51f, 0f, 12f, 0f)
            reflectiveCurveTo(2f, 4.49f, 2f, 10f)
            verticalLineToRelative(11f)
            horizontalLineToRelative(-0.5f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(21f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            close()
            moveTo(5f, 10f)
            curveToRelative(0f, -3.86f, 3.14f, -7f, 7f, -7f)
            reflectiveCurveToRelative(7f, 3.14f, 7f, 7f)
            verticalLineToRelative(11f)
            lineTo(5f, 21f)
            verticalLineToRelative(-11f)
            close()
            moveTo(16f, 10f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-1f)
            verticalLineToRelative(4f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            verticalLineToRelative(-4f)
            horizontalLineToRelative(-1f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
            horizontalLineToRelative(1f)
            verticalLineToRelative(-1f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            verticalLineToRelative(1f)
            horizontalLineToRelative(1f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            close()
        }
    }.also { _Tombstone = it }
