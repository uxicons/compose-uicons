package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PenSwirl: ImageVector? = null

val Icons.Tr.PenSwirl: ImageVector
    get() = _PenSwirl ?: UXIcon(name = "PenSwirl") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(8.06f, 23.74f)
                curveToRelative(-0.09f, 0.16f, -0.26f, 0.26f, -0.44f, 0.26f)
                curveToRelative(-0.08f, 0f, -0.17f, -0.02f, -0.24f, -0.06f)
                curveTo(2.69f, 21.33f, 0f, 16.98f, 0f, 12f)
                curveTo(0f, 5.38f, 5.38f, 0f, 12f, 0f)
                curveToRelative(1.25f, 0f, 2.47f, 0.19f, 3.65f, 0.56f)
                curveToRelative(0.26f, 0.08f, 0.41f, 0.36f, 0.33f, 0.63f)
                curveToRelative(-0.08f, 0.26f, -0.36f, 0.41f, -0.63f, 0.33f)
                curveToRelative(-1.08f, -0.34f, -2.21f, -0.52f, -3.35f, -0.52f)
                curveTo(5.93f, 1f, 1f, 5.93f, 1f, 12f)
                curveToRelative(0f, 4.61f, 2.5f, 8.64f, 6.86f, 11.06f)
                curveToRelative(0.24f, 0.14f, 0.33f, 0.44f, 0.19f, 0.68f)
                close()
                moveTo(23.43f, 8.35f)
                curveToRelative(-0.08f, -0.26f, -0.36f, -0.41f, -0.63f, -0.32f)
                curveToRelative(-0.26f, 0.08f, -0.41f, 0.36f, -0.32f, 0.63f)
                curveToRelative(0.34f, 1.08f, 0.52f, 2.2f, 0.52f, 3.35f)
                curveToRelative(0f, 3.86f, -3.14f, 7f, -7f, 7f)
                reflectiveCurveToRelative(-7f, -3.14f, -7f, -7f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                reflectiveCurveToRelative(-0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(0.5f)
                curveToRelative(0f, 4.41f, 3.59f, 8f, 8f, 8f)
                reflectiveCurveToRelative(8f, -3.59f, 8f, -8f)
                curveToRelative(0f, -1.25f, -0.19f, -2.48f, -0.57f, -3.65f)
                close()
                moveTo(13.03f, 7.44f)
                lineTo(19.73f, 0.73f)
                curveToRelative(0.94f, -0.94f, 2.59f, -0.94f, 3.54f, 0f)
                curveToRelative(0.97f, 0.97f, 0.97f, 2.56f, 0f, 3.54f)
                lineToRelative(-6.71f, 6.71f)
                curveToRelative(-0.65f, 0.65f, -1.55f, 1.02f, -2.48f, 1.02f)
                horizontalLineToRelative(-1.59f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                verticalLineToRelative(-1.59f)
                curveToRelative(0f, -0.94f, 0.36f, -1.81f, 1.02f, -2.48f)
                close()
                moveTo(13.73f, 8.15f)
                curveToRelative(-0.47f, 0.47f, -0.73f, 1.1f, -0.73f, 1.77f)
                verticalLineToRelative(1.09f)
                horizontalLineToRelative(1.09f)
                curveToRelative(0.66f, 0f, 1.3f, -0.27f, 1.77f, -0.73f)
                lineToRelative(6.71f, -6.71f)
                curveToRelative(0.58f, -0.58f, 0.58f, -1.54f, 0f, -2.12f)
                curveToRelative(-0.57f, -0.57f, -1.55f, -0.57f, -2.12f, 0f)
                lineToRelative(-6.71f, 6.71f)
                close()
            }
        }.also { _PenSwirl = it}
