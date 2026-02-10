package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BracketsCurly: ImageVector? = null

val Icons.Rs.BracketsCurly: ImageVector
    get() = _BracketsCurly ?: UXIcon(name = "BracketsCurly") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.41f, 12f)
                lineToRelative(-3.41f, 3.41f)
                verticalLineToRelative(5.59f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(3f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-6.41f)
                lineToRelative(2.59f, -2.59f)
                lineToRelative(-2.59f, -2.59f)
                verticalLineTo(3f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-3f)
                verticalLineTo(0f)
                horizontalLineToRelative(3f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(5.59f)
                lineToRelative(3.41f, 3.41f)
                close()
                moveTo(4f, 3f)
                verticalLineToRelative(5.59f)
                lineTo(0.59f, 12f)
                lineToRelative(3.41f, 3.41f)
                verticalLineToRelative(5.59f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-3f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-6.41f)
                lineToRelative(-2.59f, -2.59f)
                lineToRelative(2.59f, -2.59f)
                verticalLineTo(3f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(3f)
                verticalLineTo(0f)
                horizontalLineToRelative(-3f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                close()
            }
        }.also { _BracketsCurly = it}
