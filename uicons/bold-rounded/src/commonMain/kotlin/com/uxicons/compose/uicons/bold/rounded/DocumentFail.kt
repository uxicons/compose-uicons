package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DocumentFail: ImageVector? = null

val Icons.Br.DocumentFail: ImageVector
    get() = _DocumentFail ?: UXIcon(name = "DocumentFail") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(3f, 1f)
            curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
            verticalLineToRelative(19f)
            horizontalLineToRelative(18f)
            verticalLineToRelative(-16.34f)
            lineToRelative(-5.62f, -5.66f)
            close()
            moveTo(11f, 4f)
            verticalLineToRelative(4f)
            horizontalLineToRelative(4f)
            verticalLineToRelative(2.45f)
            lineToRelative(-2.97f, 2.96f)
            lineToRelative(-3.03f, -3.03f)
            lineToRelative(-3.03f, 3.03f)
            lineToRelative(-2.97f, -2.97f)
            verticalLineToRelative(-6.44f)
            close()
            moveTo(3f, 20f)
            verticalLineToRelative(-5.31f)
            lineToRelative(2.96f, 2.96f)
            lineToRelative(3.04f, -3.03f)
            lineToRelative(3.03f, 3.03f)
            lineToRelative(2.97f, -2.96f)
            verticalLineToRelative(5.31f)
            horizontalLineToRelative(-12f)
            close()
            moveTo(24f, 5f)
            verticalLineToRelative(14f)
            lineToRelative(-2f, 2f)
            lineToRelative(-2f, -2f)
            verticalLineToRelative(-14f)
            curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
            reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
            close()
        }
    }.also { _DocumentFail = it }
