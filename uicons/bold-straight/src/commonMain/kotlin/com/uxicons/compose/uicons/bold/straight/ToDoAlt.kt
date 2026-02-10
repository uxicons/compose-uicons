package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ToDoAlt: ImageVector? = null

val Icons.Bs.ToDoAlt: ImageVector
    get() = _ToDoAlt ?: UXIcon(name = "ToDoAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10.5f, 0f)
                horizontalLineToRelative(-3f)
                curveToRelative(-1.39f, 0f, -2.6f, 0.82f, -3.16f, 2f)
                lineTo(0f, 2f)
                verticalLineToRelative(18.5f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(11f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                lineTo(18f, 2f)
                horizontalLineToRelative(-4.34f)
                curveToRelative(-0.56f, -1.18f, -1.77f, -2f, -3.16f, -2f)
                close()
                moveTo(15f, 20.5f)
                curveToRelative(0f, 0.28f, -0.23f, 0.5f, -0.5f, 0.5f)
                lineTo(3.5f, 21f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.23f, -0.5f, -0.5f)
                lineTo(3f, 5f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -0.28f, 0.23f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(3f)
                curveToRelative(0.28f, 0f, 0.5f, 0.23f, 0.5f, 0.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(15.5f)
                close()
                moveTo(24f, 2f)
                verticalLineToRelative(20f)
                lineToRelative(-2f, 2f)
                lineToRelative(-2f, -2f)
                lineTo(20f, 2f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                close()
                moveTo(9.48f, 6.44f)
                lineToRelative(2.12f, 2.12f)
                lineToRelative(-2.83f, 2.83f)
                curveToRelative(-0.41f, 0.41f, -0.94f, 0.61f, -1.48f, 0.61f)
                reflectiveCurveToRelative(-1.07f, -0.2f, -1.48f, -0.61f)
                lineToRelative(-1.65f, -1.65f)
                lineToRelative(2.12f, -2.12f)
                lineToRelative(1.0f, 1.0f)
                lineToRelative(2.18f, -2.18f)
                close()
                moveTo(9.48f, 12.44f)
                lineToRelative(2.12f, 2.12f)
                lineToRelative(-2.83f, 2.83f)
                curveToRelative(-0.41f, 0.41f, -0.94f, 0.61f, -1.48f, 0.61f)
                reflectiveCurveToRelative(-1.07f, -0.2f, -1.48f, -0.61f)
                lineToRelative(-1.65f, -1.65f)
                lineToRelative(2.12f, -2.12f)
                lineToRelative(1.0f, 1.0f)
                lineToRelative(2.18f, -2.18f)
                close()
            }
        }.also { _ToDoAlt = it}
