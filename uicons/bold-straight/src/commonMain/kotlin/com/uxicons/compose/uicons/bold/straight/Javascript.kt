package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Javascript: ImageVector? = null

val Icons.Bs.Javascript: ImageVector
    get() = _Javascript ?: UXIcon(name = "Javascript") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 0f)
                lineTo(3f, 0f)
                curveTo(1.35f, 0f, 0f, 1.35f, 0f, 3f)
                verticalLineToRelative(21f)
                horizontalLineToRelative(17.47f)
                lineToRelative(6.53f, -6.53f)
                lineTo(24f, 3f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(18.25f, 3.03f)
                lineToRelative(1.25f, 6f)
                horizontalLineToRelative(-1.25f)
                lineToRelative(-0.68f, -3.28f)
                lineToRelative(-0.83f, 3.28f)
                horizontalLineToRelative(-1.25f)
                lineToRelative(1.51f, -6f)
                horizontalLineToRelative(1.25f)
                close()
                moveTo(12.75f, 3f)
                lineToRelative(0.83f, 3.28f)
                lineToRelative(0.68f, -3.28f)
                horizontalLineToRelative(1.25f)
                lineToRelative(-1.25f, 6f)
                horizontalLineToRelative(-1.25f)
                lineToRelative(-1.51f, -6f)
                horizontalLineToRelative(1.25f)
                close()
                moveTo(9.01f, 3f)
                horizontalLineToRelative(1.25f)
                lineToRelative(1.25f, 6f)
                horizontalLineToRelative(-1.25f)
                lineToRelative(-0.68f, -3.28f)
                lineToRelative(-0.83f, 3.28f)
                horizontalLineToRelative(-1.25f)
                lineToRelative(1.51f, -6f)
                close()
                moveTo(3f, 7f)
                horizontalLineToRelative(1.25f)
                reflectiveCurveToRelative(-0.01f, 0.05f, -0.01f, 0.08f)
                curveToRelative(0f, 0.39f, 0.34f, 0.73f, 0.75f, 0.73f)
                curveToRelative(0.39f, 0f, 0.75f, -0.3f, 0.75f, -0.75f)
                lineTo(5.75f, 3f)
                horizontalLineToRelative(1.25f)
                verticalLineToRelative(4.08f)
                curveToRelative(0f, 1.09f, -0.89f, 1.99f, -2f, 1.99f)
                horizontalLineToRelative(0f)
                curveToRelative(-1.1f, -0.01f, -2f, -0.9f, -2f, -1.99f)
                verticalLineToRelative(-0.08f)
                close()
                moveTo(21f, 15f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(6f)
                lineTo(3f, 21f)
                verticalLineToRelative(-10f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(4f)
                close()
            }
        }.also { _Javascript = it}
