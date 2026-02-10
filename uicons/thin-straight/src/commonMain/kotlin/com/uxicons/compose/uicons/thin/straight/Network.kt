package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Network: ImageVector? = null

val Icons.Ts.Network: ImageVector
    get() = _Network ?: UXIcon(name = "Network") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 21f)
                horizontalLineToRelative(-9.55f)
                curveToRelative(-0.2f, -0.98f, -0.97f, -1.75f, -1.95f, -1.95f)
                verticalLineToRelative(-5.05f)
                horizontalLineToRelative(7f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(-1f)
                lineTo(21f, 2.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                lineTo(5.5f, 0f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(6.5f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(2.5f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(5.05f)
                curveToRelative(-0.98f, 0.2f, -1.75f, 0.97f, -1.95f, 1.95f)
                lineTo(0f, 21f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(9.55f)
                curveToRelative(0.23f, 1.14f, 1.24f, 2f, 2.45f, 2f)
                reflectiveCurveToRelative(2.22f, -0.86f, 2.45f, -2f)
                horizontalLineToRelative(9.55f)
                verticalLineToRelative(-1f)
                close()
                moveTo(4f, 2.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(13f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(6.5f)
                horizontalLineToRelative(-5.21f)
                lineToRelative(-1f, 1f)
                horizontalLineToRelative(-3.59f)
                lineToRelative(-1f, -1f)
                horizontalLineToRelative(-5.21f)
                lineTo(4f, 2.5f)
                close()
                moveTo(3f, 11.5f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(5.79f)
                lineToRelative(1f, 1f)
                horizontalLineToRelative(4.41f)
                lineToRelative(1f, -1f)
                horizontalLineToRelative(5.79f)
                verticalLineToRelative(1.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                lineTo(4.5f, 13f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                close()
                moveTo(12f, 23f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }.also { _Network = it}
