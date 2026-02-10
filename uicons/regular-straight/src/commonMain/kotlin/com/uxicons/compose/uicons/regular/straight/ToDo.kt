package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ToDo: ImageVector? = null

val Icons.Rs.ToDo: ImageVector
    get() = _ToDo ?: UXIcon(name = "ToDo") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16f, 3f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                lineTo(3f, 0f)
                curveTo(1.35f, 0f, 0f, 1.35f, 0f, 3f)
                verticalLineToRelative(17.5f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(12.5f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-3f)
                lineTo(16f, 3f)
                close()
                moveTo(17f, 20f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                lineTo(6.66f, 22f)
                curveToRelative(0.22f, -0.46f, 0.34f, -0.96f, 0.34f, -1.5f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(10f)
                close()
                moveTo(5f, 18f)
                verticalLineToRelative(2.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                lineTo(2f, 3f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(10f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(15f)
                lineTo(5f, 18f)
                close()
                moveTo(21f, 0f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(12.41f)
                lineToRelative(3f, 3f)
                lineToRelative(3f, -3f)
                lineTo(24f, 3f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(22f, 14.59f)
                lineToRelative(-1f, 1f)
                lineToRelative(-1f, -1f)
                lineTo(20f, 3f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(11.59f)
                close()
                moveTo(8.6f, 4.29f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(-2.83f, 2.83f)
                curveToRelative(-0.31f, 0.31f, -0.72f, 0.47f, -1.12f, 0.47f)
                reflectiveCurveToRelative(-0.81f, -0.15f, -1.12f, -0.47f)
                lineToRelative(-1.65f, -1.65f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(1.36f, 1.36f)
                lineToRelative(2.54f, -2.54f)
                close()
                moveTo(8.6f, 10.29f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(-2.83f, 2.83f)
                curveToRelative(-0.31f, 0.31f, -0.72f, 0.47f, -1.12f, 0.47f)
                reflectiveCurveToRelative(-0.81f, -0.15f, -1.12f, -0.47f)
                lineToRelative(-1.65f, -1.65f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(1.36f, 1.36f)
                lineToRelative(2.54f, -2.54f)
                close()
            }
        }.also { _ToDo = it}
