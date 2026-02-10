package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SealExclamation: ImageVector? = null

val Icons.Ts.SealExclamation: ImageVector
    get() = _SealExclamation ?: UXIcon(name = "SealExclamation") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.5f, 14f)
                horizontalLineToRelative(-1f)
                lineTo(11.5f, 6f)
                horizontalLineToRelative(1f)
                lineTo(12.5f, 14f)
                close()
                moveTo(12f, 16f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
                moveTo(15.52f, 20.5f)
                horizontalLineToRelative(4.98f)
                verticalLineToRelative(-4.98f)
                lineToRelative(3.52f, -3.52f)
                lineToRelative(-3.52f, -3.52f)
                lineTo(20.5f, 3.5f)
                horizontalLineToRelative(-4.98f)
                lineTo(12f, -0.01f)
                lineToRelative(-3.52f, 3.52f)
                lineTo(3.5f, 3.51f)
                verticalLineToRelative(4.98f)
                lineTo(-0.01f, 12f)
                lineToRelative(3.52f, 3.52f)
                verticalLineToRelative(4.98f)
                horizontalLineToRelative(4.98f)
                lineToRelative(3.52f, 3.52f)
                lineToRelative(3.52f, -3.52f)
                close()
                moveTo(4.5f, 15.1f)
                lineToRelative(-3.1f, -3.1f)
                lineToRelative(3.1f, -3.1f)
                lineTo(4.5f, 4.5f)
                horizontalLineToRelative(4.39f)
                lineToRelative(3.1f, -3.1f)
                lineToRelative(3.1f, 3.1f)
                horizontalLineToRelative(4.39f)
                verticalLineToRelative(4.39f)
                lineToRelative(3.1f, 3.1f)
                lineToRelative(-3.1f, 3.1f)
                verticalLineToRelative(4.39f)
                horizontalLineToRelative(-4.39f)
                lineToRelative(-3.1f, 3.1f)
                lineToRelative(-3.1f, -3.1f)
                lineTo(4.5f, 19.48f)
                verticalLineToRelative(-4.39f)
                close()
            }
        }.also { _SealExclamation = it}
