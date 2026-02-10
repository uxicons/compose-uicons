package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Javascript: ImageVector? = null

val Icons.Ss.Javascript: ImageVector
    get() = _Javascript ?: UXIcon(name = "Javascript") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19f, 19f)
                horizontalLineToRelative(4.41f)
                lineToRelative(-4.41f, 4.41f)
                verticalLineToRelative(-4.41f)
                close()
                moveTo(24f, 3f)
                verticalLineToRelative(14f)
                horizontalLineToRelative(-7f)
                verticalLineToRelative(7f)
                lineTo(0f, 24f)
                lineTo(0f, 3f)
                curveTo(0f, 1.35f, 1.35f, 0f, 3f, 0f)
                horizontalLineToRelative(18f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
                moveTo(7.5f, 5f)
                horizontalLineToRelative(-1.25f)
                verticalLineToRelative(4.07f)
                curveToRelative(-0.0f, 0.45f, -0.36f, 0.75f, -0.75f, 0.75f)
                curveToRelative(-0.41f, -0.01f, -0.75f, -0.34f, -0.75f, -0.73f)
                curveToRelative(0f, -0.03f, 0.01f, -0.08f, 0.01f, -0.08f)
                horizontalLineToRelative(-1.25f)
                verticalLineToRelative(0.08f)
                curveToRelative(0f, 1.09f, 0.9f, 1.98f, 2f, 1.98f)
                horizontalLineToRelative(0f)
                curveToRelative(1.11f, 0.0f, 2f, -0.89f, 2f, -1.98f)
                verticalLineToRelative(-4.08f)
                close()
                moveTo(12.01f, 11f)
                lineToRelative(-1.25f, -6f)
                horizontalLineToRelative(-1.25f)
                lineToRelative(-1.51f, 6f)
                horizontalLineToRelative(1.25f)
                lineToRelative(0.83f, -3.28f)
                lineToRelative(0.68f, 3.28f)
                horizontalLineToRelative(1.25f)
                close()
                moveTo(14.76f, 11f)
                lineToRelative(1.25f, -6f)
                horizontalLineToRelative(-1.25f)
                lineToRelative(-0.68f, 3.28f)
                lineToRelative(-0.83f, -3.28f)
                horizontalLineToRelative(-1.25f)
                lineToRelative(1.51f, 6f)
                horizontalLineToRelative(1.25f)
                close()
                moveTo(20.0f, 11.03f)
                lineToRelative(-1.25f, -6f)
                horizontalLineToRelative(-1.25f)
                lineToRelative(-1.51f, 6f)
                horizontalLineToRelative(1.25f)
                lineToRelative(0.83f, -3.28f)
                lineToRelative(0.68f, 3.28f)
                horizontalLineToRelative(1.25f)
                close()
            }
        }.also { _Javascript = it}
