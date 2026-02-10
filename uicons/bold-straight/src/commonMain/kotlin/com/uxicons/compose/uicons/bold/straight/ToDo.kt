package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ToDo: ImageVector? = null

val Icons.Bs.ToDo: ImageVector
    get() = _ToDo ?: UXIcon(name = "ToDo") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18f, 3.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                lineTo(3.5f, 0f)
                curveTo(1.57f, 0f, 0f, 1.57f, 0f, 3.5f)
                verticalLineToRelative(16.5f)
                curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                horizontalLineToRelative(13.5f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(-3f)
                lineTo(18f, 3.5f)
                close()
                moveTo(15f, 18f)
                lineTo(5f, 18f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                lineTo(3f, 3.5f)
                curveToRelative(0f, -0.28f, 0.23f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(11f)
                curveToRelative(0.28f, 0f, 0.5f, 0.23f, 0.5f, 0.5f)
                verticalLineToRelative(14.5f)
                close()
                moveTo(24f, 2f)
                verticalLineToRelative(13f)
                lineToRelative(-2f, 2f)
                lineToRelative(-2f, -2f)
                lineTo(20f, 2f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                close()
                moveTo(9.48f, 4.44f)
                lineToRelative(2.12f, 2.12f)
                lineToRelative(-2.83f, 2.83f)
                curveToRelative(-0.41f, 0.41f, -0.94f, 0.61f, -1.48f, 0.61f)
                reflectiveCurveToRelative(-1.07f, -0.2f, -1.48f, -0.61f)
                lineToRelative(-1.65f, -1.65f)
                lineToRelative(2.12f, -2.12f)
                lineToRelative(1.0f, 1.0f)
                lineToRelative(2.18f, -2.18f)
                close()
                moveTo(9.48f, 10.44f)
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
        }.also { _ToDo = it}
