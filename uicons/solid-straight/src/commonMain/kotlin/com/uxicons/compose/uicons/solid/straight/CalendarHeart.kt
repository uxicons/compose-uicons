package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CalendarHeart: ImageVector? = null

val Icons.Ss.CalendarHeart: ImageVector
    get() = _CalendarHeart ?: UXIcon(name = "CalendarHeart") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(0f, 10f)
                verticalLineToRelative(14f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-14f)
                lineTo(0f, 10f)
                close()
                moveTo(12.54f, 20.84f)
                lineToRelative(-0.54f, 0.35f)
                lineToRelative(-0.54f, -0.35f)
                curveToRelative(-0.46f, -0.29f, -4.46f, -2.95f, -4.46f, -5.68f)
                curveToRelative(0f, -1.74f, 1.35f, -3.16f, 3f, -3.16f)
                curveToRelative(0.78f, 0f, 1.48f, 0.27f, 2f, 0.73f)
                curveToRelative(0.52f, -0.46f, 1.22f, -0.73f, 2f, -0.73f)
                curveToRelative(1.65f, 0f, 3f, 1.42f, 3f, 3.16f)
                curveToRelative(0f, 2.73f, -4.0f, 5.39f, -4.46f, 5.68f)
                close()
                moveTo(0f, 8f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(3f)
                lineTo(6f, 0f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(8f)
                lineTo(16f, 0f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(3f)
                lineTo(0f, 8f)
                close()
                moveTo(15f, 15.16f)
                curveToRelative(0f, 1.04f, -1.61f, 2.62f, -3f, 3.63f)
                curveToRelative(-1.39f, -1.01f, -3f, -2.59f, -3f, -3.63f)
                curveToRelative(0f, -0.64f, 0.45f, -1.16f, 1f, -1.16f)
                curveToRelative(0.5f, 0f, 1f, 0.31f, 1f, 1f)
                horizontalLineToRelative(2f)
                curveToRelative(0f, -0.69f, 0.5f, -1f, 1f, -1f)
                curveToRelative(0.55f, 0f, 1f, 0.52f, 1f, 1.16f)
                close()
            }
        }.also { _CalendarHeart = it}
