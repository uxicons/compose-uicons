package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ToDoAlt: ImageVector? = null

val Icons.Ss.ToDoAlt: ImageVector
    get() = _ToDoAlt ?: UXIcon(name = "ToDoAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.5f, 24f)
                lineToRelative(-2.5f, -2.5f)
                lineTo(19f, 2.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                verticalLineToRelative(19f)
                lineToRelative(-2.5f, 2.5f)
                close()
                moveTo(12.83f, 2f)
                curveToRelative(-0.41f, -1.16f, -1.52f, -2f, -2.83f, -2f)
                horizontalLineToRelative(-3f)
                curveToRelative(-1.3f, 0f, -2.42f, 0.84f, -2.83f, 2f)
                lineTo(0f, 2f)
                verticalLineToRelative(19f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(11f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                lineTo(17f, 2f)
                horizontalLineToRelative(-4.17f)
                close()
                moveTo(7.19f, 16.53f)
                curveToRelative(-0.31f, 0.31f, -0.72f, 0.47f, -1.12f, 0.47f)
                reflectiveCurveToRelative(-0.81f, -0.15f, -1.12f, -0.47f)
                lineToRelative(-1.65f, -1.65f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(1.36f, 1.36f)
                lineToRelative(2.54f, -2.54f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(-2.83f, 2.83f)
                close()
                moveTo(7.19f, 10.53f)
                curveToRelative(-0.31f, 0.31f, -0.72f, 0.47f, -1.12f, 0.47f)
                reflectiveCurveToRelative(-0.81f, -0.15f, -1.12f, -0.47f)
                lineToRelative(-1.65f, -1.65f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(1.36f, 1.36f)
                lineToRelative(2.54f, -2.54f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(-2.83f, 2.83f)
                close()
            }
        }.also { _ToDoAlt = it}
