package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ToDo: ImageVector? = null

val Icons.Sr.ToDo: ImageVector
    get() = _ToDo ?: UXIcon(name = "ToDo") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.5f, 18f)
                curveToRelative(-0.21f, 0f, -0.43f, -0.08f, -0.59f, -0.24f)
                lineToRelative(-0.69f, -0.69f)
                curveToRelative(-0.79f, -0.79f, -1.22f, -1.83f, -1.22f, -2.95f)
                lineTo(19f, 2.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                verticalLineToRelative(11.62f)
                curveToRelative(0f, 1.11f, -0.43f, 2.16f, -1.22f, 2.95f)
                lineToRelative(-0.69f, 0.69f)
                curveToRelative(-0.16f, 0.16f, -0.38f, 0.24f, -0.59f, 0.24f)
                close()
                moveTo(13f, 0f)
                lineTo(4f, 0f)
                curveTo(1.79f, 0f, 0f, 1.79f, 0f, 4f)
                verticalLineToRelative(17.36f)
                curveToRelative(0f, 1.31f, 0.94f, 2.5f, 2.24f, 2.63f)
                curveToRelative(1.5f, 0.15f, 2.76f, -1.02f, 2.76f, -2.49f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0f, -1.66f, 1.34f, -3f, 3f, -3f)
                horizontalLineToRelative(9f)
                lineTo(17f, 4f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                close()
                moveTo(9.73f, 11.21f)
                lineToRelative(-2.18f, 2.18f)
                curveToRelative(-0.41f, 0.41f, -0.95f, 0.61f, -1.48f, 0.61f)
                reflectiveCurveToRelative(-1.07f, -0.2f, -1.48f, -0.61f)
                lineToRelative(-1.29f, -1.29f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0f, -1.41f)
                curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0f)
                lineToRelative(1.29f, 1.29f)
                curveToRelative(0.03f, 0.03f, 0.1f, 0.03f, 0.14f, 0f)
                lineToRelative(2.18f, -2.18f)
                curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0f)
                reflectiveCurveToRelative(0.39f, 1.02f, 0f, 1.41f)
                close()
                moveTo(9.73f, 5.21f)
                lineToRelative(-2.18f, 2.18f)
                curveToRelative(-0.41f, 0.41f, -0.95f, 0.61f, -1.48f, 0.61f)
                reflectiveCurveToRelative(-1.07f, -0.2f, -1.48f, -0.61f)
                lineToRelative(-1.29f, -1.29f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0f, -1.41f)
                curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0f)
                lineToRelative(1.29f, 1.29f)
                curveToRelative(0.03f, 0.03f, 0.1f, 0.03f, 0.14f, 0f)
                lineToRelative(2.18f, -2.18f)
                curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0f)
                reflectiveCurveToRelative(0.39f, 1.02f, 0f, 1.41f)
                close()
                moveTo(17f, 24f)
                lineTo(6.24f, 24f)
                curveToRelative(0.48f, -0.72f, 0.76f, -1.58f, 0.76f, -2.5f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(11f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                curveToRelative(0f, 1.66f, -1.34f, 3f, -3f, 3f)
                close()
            }
        }.also { _ToDo = it}
