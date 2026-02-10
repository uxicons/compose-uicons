package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SignalAlt: ImageVector? = null

val Icons.Ts.SignalAlt: ImageVector
    get() = _SignalAlt ?: UXIcon(name = "SignalAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22f, 0f)
                horizontalLineToRelative(-2f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(22f)
                horizontalLineToRelative(6f)
                lineTo(24f, 2f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                close()
                moveTo(23f, 23f)
                horizontalLineToRelative(-4f)
                lineTo(19f, 2f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(2f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(21f)
                close()
                moveTo(13f, 6f)
                horizontalLineToRelative(-2f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(16f)
                horizontalLineToRelative(6f)
                lineTo(15f, 8f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                close()
                moveTo(14f, 23f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-15f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(2f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(15f)
                close()
                moveTo(6f, 14f)
                verticalLineToRelative(10f)
                lineTo(0f, 24f)
                verticalLineToRelative(-10f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                horizontalLineToRelative(2f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                close()
            }
        }.also { _SignalAlt = it}
