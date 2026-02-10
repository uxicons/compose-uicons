package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DocumentLink: ImageVector? = null

val Icons.Ss.DocumentLink: ImageVector
    get() = _DocumentLink ?: UXIcon(name = "DocumentLink") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15f, 0.6f)
                verticalLineToRelative(4.4f)
                horizontalLineToRelative(4.4f)
                close()
                moveTo(20f, 7f)
                verticalLineToRelative(2f)
                curveToRelative(-1.5f, 0f, -3.1f, 0.6f, -4.3f, 1.8f)
                lineToRelative(-0.2f, 0.2f)
                horizontalLineToRelative(-11.5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(9.5f)
                lineToRelative(-2f, 2f)
                horizontalLineToRelative(-7.5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(5.8f)
                curveToRelative(-1.3f, 2.2f, -1f, 5f, 0.7f, 7f)
                horizontalLineToRelative(-10.5f)
                verticalLineToRelative(-21f)
                curveToRelative(0f, -1.7f, 1.3f, -3f, 3f, -3f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(7f)
                close()
                moveTo(15.8f, 21.8f)
                curveToRelative(0.8f, 0.4f, 1.6f, 0.6f, 2.4f, 0.6f)
                lineToRelative(-0.4f, 0.4f)
                curveToRelative(-1.6f, 1.6f, -4.1f, 1.6f, -5.7f, 0f)
                curveToRelative(-1.6f, -1.6f, -1.6f, -4.1f, 0f, -5.7f)
                lineToRelative(1.4f, -1.4f)
                curveToRelative(1.6f, -1.6f, 4.1f, -1.6f, 5.7f, 0f)
                lineToRelative(-1.4f, 1.4f)
                curveToRelative(-0.8f, -0.8f, -2.1f, -0.8f, -2.8f, 0f)
                lineToRelative(-1.4f, 1.4f)
                curveToRelative(-0.8f, 0.8f, -0.8f, 2.1f, 0f, 2.8f)
                curveToRelative(0.6f, 0.6f, 1.5f, 0.7f, 2.2f, 0.4f)
                close()
                moveTo(21.4f, 19.3f)
                curveToRelative(-0.8f, 0.8f, -1.8f, 1.2f, -2.8f, 1.2f)
                reflectiveCurveToRelative(-2.1f, -0.4f, -2.8f, -1.2f)
                lineToRelative(1.4f, -1.4f)
                curveToRelative(0.8f, 0.8f, 2.1f, 0.8f, 2.8f, 0f)
                lineToRelative(1.4f, -1.4f)
                curveToRelative(0.8f, -0.8f, 0.8f, -2.1f, 0f, -2.8f)
                curveToRelative(-0.6f, -0.6f, -1.5f, -0.7f, -2.2f, -0.4f)
                curveToRelative(-0.8f, -0.4f, -1.6f, -0.6f, -2.4f, -0.6f)
                lineToRelative(0.4f, -0.4f)
                curveToRelative(1.6f, -1.6f, 4.1f, -1.6f, 5.7f, 0f)
                curveToRelative(1.5f, 1.6f, 1.4f, 4f, 0f, 5.6f)
                lineToRelative(-1.4f, 1.4f)
                close()
            }
        }.also { _DocumentLink = it}
