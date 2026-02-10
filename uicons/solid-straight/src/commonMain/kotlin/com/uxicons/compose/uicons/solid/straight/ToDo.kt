package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ToDo: ImageVector? = null

val Icons.Ss.ToDo: ImageVector
    get() = _ToDo ?: UXIcon(name = "ToDo") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.5f, 18f)
                lineToRelative(-2.5f, -2.5f)
                lineTo(19f, 2.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                verticalLineToRelative(13f)
                lineToRelative(-2.5f, 2.5f)
                close()
                moveTo(14f, 0f)
                lineTo(3f, 0f)
                curveTo(1.34f, 0f, 0f, 1.34f, 0f, 3f)
                verticalLineToRelative(18.36f)
                curveToRelative(0f, 1.31f, 0.94f, 2.5f, 2.24f, 2.63f)
                curveToRelative(1.5f, 0.15f, 2.76f, -1.02f, 2.76f, -2.49f)
                verticalLineToRelative(-3.5f)
                horizontalLineToRelative(12f)
                lineTo(17f, 3f)
                curveToRelative(0f, -1.66f, -1.34f, -3f, -3f, -3f)
                close()
                moveTo(6.77f, 13.53f)
                curveToRelative(-0.31f, 0.31f, -0.72f, 0.47f, -1.12f, 0.47f)
                reflectiveCurveToRelative(-0.81f, -0.15f, -1.12f, -0.47f)
                lineToRelative(-1.65f, -1.65f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(1.36f, 1.36f)
                lineToRelative(2.54f, -2.54f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(-2.83f, 2.83f)
                close()
                moveTo(6.77f, 7.53f)
                curveToRelative(-0.31f, 0.31f, -0.72f, 0.47f, -1.12f, 0.47f)
                reflectiveCurveToRelative(-0.81f, -0.15f, -1.12f, -0.47f)
                lineToRelative(-1.65f, -1.65f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(1.36f, 1.36f)
                lineToRelative(2.54f, -2.54f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(-2.83f, 2.83f)
                close()
                moveTo(20f, 21f)
                verticalLineToRelative(-1f)
                reflectiveCurveToRelative(-13f, 0f, -13f, 0f)
                verticalLineToRelative(1.5f)
                curveToRelative(0f, 0.92f, -0.28f, 1.78f, -0.76f, 2.5f)
                horizontalLineToRelative(10.76f)
                curveToRelative(1.66f, 0f, 3f, -1.34f, 3f, -3f)
                close()
            }
        }.also { _ToDo = it}
