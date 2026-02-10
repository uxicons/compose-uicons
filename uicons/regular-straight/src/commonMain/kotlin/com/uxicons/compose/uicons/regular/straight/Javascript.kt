package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Javascript: ImageVector? = null

val Icons.Rs.Javascript: ImageVector
    get() = _Javascript ?: UXIcon(name = "Javascript") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 0f)
                lineTo(3f, 0f)
                curveTo(1.35f, 0f, 0f, 1.35f, 0f, 3f)
                verticalLineToRelative(21f)
                horizontalLineToRelative(18.41f)
                lineToRelative(5.59f, -5.59f)
                lineTo(24f, 3f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(18f, 21.59f)
                verticalLineToRelative(-3.59f)
                horizontalLineToRelative(3.59f)
                lineToRelative(-3.59f, 3.59f)
                close()
                moveTo(22f, 16f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(6f)
                lineTo(2f, 22f)
                lineTo(2f, 3f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(18f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(13f)
                close()
                moveTo(6.25f, 5f)
                horizontalLineToRelative(1.25f)
                verticalLineToRelative(4.08f)
                curveToRelative(0f, 1.09f, -0.89f, 1.99f, -2f, 1.99f)
                horizontalLineToRelative(0f)
                curveToRelative(-1.1f, -0.01f, -2f, -0.9f, -2f, -1.99f)
                verticalLineToRelative(-0.08f)
                horizontalLineToRelative(1.25f)
                reflectiveCurveToRelative(-0.01f, 0.05f, -0.01f, 0.08f)
                curveToRelative(0f, 0.39f, 0.34f, 0.73f, 0.75f, 0.73f)
                curveToRelative(0.39f, 0f, 0.75f, -0.3f, 0.75f, -0.75f)
                verticalLineToRelative(-4.07f)
                close()
                moveTo(18.75f, 5.03f)
                lineToRelative(1.25f, 6f)
                horizontalLineToRelative(-1.25f)
                lineToRelative(-0.68f, -3.28f)
                lineToRelative(-0.83f, 3.28f)
                horizontalLineToRelative(-1.25f)
                lineToRelative(1.51f, -6f)
                horizontalLineToRelative(1.25f)
                close()
                moveTo(10.76f, 5f)
                lineToRelative(1.25f, 6f)
                horizontalLineToRelative(-1.25f)
                lineToRelative(-0.68f, -3.28f)
                lineToRelative(-0.83f, 3.28f)
                horizontalLineToRelative(-1.25f)
                lineToRelative(1.51f, -6f)
                horizontalLineToRelative(1.25f)
                close()
                moveTo(16.01f, 5f)
                lineToRelative(-1.25f, 6f)
                horizontalLineToRelative(-1.25f)
                lineToRelative(-1.51f, -6f)
                horizontalLineToRelative(1.25f)
                lineToRelative(0.83f, 3.28f)
                lineToRelative(0.68f, -3.28f)
                horizontalLineToRelative(1.25f)
                close()
            }
        }.also { _Javascript = it}
