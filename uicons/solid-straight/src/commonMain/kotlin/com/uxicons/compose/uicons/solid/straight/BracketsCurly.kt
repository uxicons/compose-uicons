package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BracketsCurly: ImageVector? = null

val Icons.Ss.BracketsCurly: ImageVector
    get() = _BracketsCurly ?: UXIcon(name = "BracketsCurly") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 24f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(3f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-6.41f)
                lineToRelative(2.59f, -2.59f)
                lineToRelative(-2.59f, -2.59f)
                lineTo(18f, 3f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-3f)
                lineTo(14f, 0f)
                horizontalLineToRelative(3f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(5.59f)
                lineToRelative(3.41f, 3.41f)
                lineToRelative(-3.41f, 3.41f)
                verticalLineToRelative(5.59f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                close()
                moveTo(10f, 22f)
                horizontalLineToRelative(-3f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-6.41f)
                lineToRelative(-2.59f, -2.59f)
                lineToRelative(2.59f, -2.59f)
                lineTo(6f, 3f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(3f)
                lineTo(10f, 0f)
                horizontalLineToRelative(-3f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(5.59f)
                lineTo(0.59f, 12f)
                lineToRelative(3.41f, 3.41f)
                verticalLineToRelative(5.59f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-2f)
                close()
            }
        }.also { _BracketsCurly = it}
